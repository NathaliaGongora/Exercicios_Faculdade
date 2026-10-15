// Exercício 10 — Carrinho De Compras
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página com:
// Uma lista de 4 produtos (nome + preço), cada um com um botão "Adicionar ao carrinho"
// Uma lista do carrinho (inicialmente vazia)
// Um total exibido em uma <div>
// Ao clicar em "Adicionar ao carrinho":
// O produto é adicionado à lista do carrinho (com createElement + appendChild)
// O total é recalculado e atualizado na tela
// Se o mesmo produto for adicionado duas vezes, pode aparecer duplicado (não precisa tratar quantidade)
// Dica para o aluno: armazene os produtos em um array de objetos { nome, preco } e use data-preco no botão para recuperar o valor no evento.
const produtos = [
    { nome: "Caderno", preco: 15.90 },
    { nome: "Caneta", preco: 3.50 },
    { nome: "Lápis", preco: 2.00 },
    { nome: "Borracha", preco: 1.50 }
];
let totalCentavos = 0;
function moeda(valor) {
    return valor.toLocaleString("pt-BR", { style: "currency", currency: "BRL" });
}
for (const produto of produtos) {
    const item = document.createElement("li");
    const descricao = document.createElement("span");
    descricao.textContent = produto.nome + " — " + moeda(produto.preco);
    const botao = document.createElement("button");
    botao.textContent = "Adicionar ao carrinho";
    botao.dataset.preco = produto.preco;
    botao.addEventListener("click", function () {
        const preco = Number(botao.dataset.preco);
        const compra = document.createElement("li");
        compra.textContent = produto.nome + " — " + moeda(preco);
        document.getElementById("carrinho").appendChild(compra);
        // Somar centavos inteiros evita acumular pequenas diferenças decimais.
        totalCentavos += Math.round(preco * 100);
        document.getElementById("total").textContent = "Total: " + moeda(totalCentavos / 100);
    });
    item.appendChild(descricao);
    item.appendChild(botao);
    document.getElementById("produtos").appendChild(item);
}
