package br.com.med.voll.api.controller;

import br.com.med.voll.api.medico.Medico;
import br.com.med.voll.api.medico.MedicoDTO;
import br.com.med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void cadastrar(@RequestBody MedicoDTO medico){
        medicoRepository.save(new Medico(medico));

    }
}
