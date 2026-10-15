/* Atividades de demonstração: interceptar o envio sem transmitir ou salvar dados. */
const formularios = document.querySelectorAll("form[data-demonstracao]")
for (const formulario of formularios) {
    formulario.addEventListener("submit", event => {
        event.preventDefault()
        const status = document.getElementById(formulario.dataset.status)
        const semValidacao = formulario.noValidate || (event.submitter && event.submitter.formNoValidate)
        status.textContent = semValidacao
            ? "Demonstração sem validação nativa. Nenhum dado foi salvo."
            : "Formulário validado pelo navegador. Nenhum dado foi salvo."
    })
}
