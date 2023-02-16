package br.com.med.voll.api.medico;

import br.com.med.voll.api.endereco.EnderecoDTO;

public record MedicoDTO(String nome, String email, String crm, Especialidade especialidade, EnderecoDTO enderecoDTO) {
}
