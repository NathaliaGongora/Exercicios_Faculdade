// Leia o parâmetro curso da URL e preencha um input. Trate sua ausência.
const parametros = new URLSearchParams(window.location.search);
const curso = parametros.get("curso");
document.getElementById("curso").value = curso || "";
document.getElementById("mensagem").textContent = curso ? "Curso recebido pela URL." : "Nenhum curso informado. Use o link de teste.";
