/* Exercicio 10: mover o mesmo cartão entre duas caixas usando os eventos da aula. */
const cartao = document.getElementById("cartao")
const caixas = [document.getElementById("caixa1"), document.getElementById("caixa2")]
const moverCartao = caixa => {
    caixa.appendChild(cartao)
    document.getElementById("movimento").textContent = `Cartão movido para ${caixa.id === "caixa1" ? "caixa 1" : "caixa 2"}.`
}
cartao.addEventListener("dragstart", event => {
    event.dataTransfer.setData("text/plain", cartao.id)
})
for (const caixa of caixas) {
    caixa.addEventListener("dragover", event => event.preventDefault())
    caixa.addEventListener("drop", event => {
        event.preventDefault()
        if (event.dataTransfer.getData("text/plain") === cartao.id) {
            moverCartao(event.currentTarget)
        }
    })
}
document.getElementById("mover1").addEventListener("click", () => moverCartao(caixas[0]))
document.getElementById("mover2").addEventListener("click", () => moverCartao(caixas[1]))
