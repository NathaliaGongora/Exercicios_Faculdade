// Exercício 05 — Calculadora De IMC
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página com dois campos (peso e altura) e um botão "Calcular IMC". Ao clicar, exiba em uma <div>:
// O valor do IMC (peso / altura²)
// A classificação:
// IMC < 18,5 → "Abaixo do peso"
// 18,5 ≤ IMC < 25 → "Peso normal"
// 25 ≤ IMC < 30 → "Sobrepeso"
// IMC ≥ 30 → "Obesidade"
// Valide se os dois campos foram preenchidos; caso contrário, exiba alert("Preencha todos os campos!").
document.getElementById("calcular").addEventListener("click", function () {
    const campoPeso = document.getElementById("peso");
    const campoAltura = document.getElementById("altura");
    const saida = document.getElementById("resultado");
    saida.textContent = "";
    if (campoPeso.value.trim() === "" || campoAltura.value.trim() === "") {
        alert("Preencha todos os campos!");
        return;
    }
    const peso = Number(campoPeso.value);
    const altura = Number(campoAltura.value);
    if (!Number.isFinite(peso) || !Number.isFinite(altura) || peso <= 0 || altura <= 0) {
        saida.textContent = "Informe peso e altura positivos e válidos.";
        return;
    }
    const imc = peso / (altura * altura);
    if (!Number.isFinite(imc)) {
        saida.textContent = "Não foi possível calcular com esses valores.";
        return;
    }
    let classificacao;
    if (imc < 18.5) classificacao = "Abaixo do peso";
    else if (imc < 25) classificacao = "Peso normal";
    else if (imc < 30) classificacao = "Sobrepeso";
    else classificacao = "Obesidade";
    saida.textContent = "IMC: " + imc.toFixed(2) + " — " + classificacao;
});
