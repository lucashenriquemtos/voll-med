package br.com.med.voll.api.controller;

import br.com.med.voll.api.medico.MedicoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody MedicoDTO medicoDTO){
        System.out.println(medicoDTO);

    }
}
