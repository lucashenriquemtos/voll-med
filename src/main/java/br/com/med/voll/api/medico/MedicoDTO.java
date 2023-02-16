package br.com.med.voll.api.medico;

import br.com.med.voll.api.endereco.Endereco;

public record MedicoDTO(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
}
