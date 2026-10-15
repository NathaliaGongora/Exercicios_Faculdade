// Crie uma página HTML que possui 2 campos e 4 botões (Somar, Subtrair, Dividir e Multiplicar), ao colocar os números e clicar em um dos botões devem realizar a operação escolhida. Valide se os números foram digitados. Ao dividir por zero, mostre o alert “Impossível dividir por zero”.
const botoes = document.querySelectorAll("[data-operacao]");
for (const botao of botoes) {
    botao.addEventListener("click", function () {
        const campo1 = document.getElementById("numero1");
        const campo2 = document.getElementById("numero2");
        const saida = document.getElementById("resultado");
        if (campo1.value.trim() === "" || campo2.value.trim() === "") {
            saida.textContent = "Digite os dois números."; return;
        }
        const a = Number(campo1.value);
        const b = Number(campo2.value);
        if (!Number.isFinite(a) || !Number.isFinite(b)) { saida.textContent = "Digite números válidos."; return; }
        const operacao = botao.dataset.operacao;
        if (operacao === "dividir" && b === 0) {
            saida.textContent = "";
            alert("Impossível dividir por zero"); return;
        }
        let resultado;
        if (operacao === "somar") resultado = a + b;
        if (operacao === "subtrair") resultado = a - b;
        if (operacao === "dividir") resultado = a / b;
        if (operacao === "multiplicar") resultado = a * b;
        saida.textContent = Number.isFinite(resultado) ? "Resultado: " + resultado : "Resultado fora do limite numérico.";
    });
}
