// Exercício 02 — Informacoes Do Navegador
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página HTML que exiba, dentro de uma <div>, as seguintes informações do ambiente do navegador:
// Nome/identificação do navegador (navigator.userAgent)
// Idioma do navegador (navigator.language)
// URL atual da página (location.href)
document.getElementById("navegador").textContent = navigator.userAgent;
document.getElementById("idioma").textContent = navigator.language;
document.getElementById("url").textContent = location.href;
