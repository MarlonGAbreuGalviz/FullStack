package cl.trabajo.Persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.trabajo.Persona.dto.PersonaDTO;
import cl.trabajo.Persona.service.IPersonaService;

@RequestMapping("/api/crud/persona")
@RestController
public class PersonaController {
    @Autowired
    IPersonaService personaService;

    @PostMapping
    public PersonaDTO insertPersonaDTO(@RequestBody PersonaDTO persona) {

        PersonaDTO aux = personaService.insertPersonaDTO(persona);
        return aux;
    }

    @PutMapping("/{rut}")
    public PersonaDTO updatePersonaDTO(@PathVariable int rut, @RequestBody PersonaDTO persona) {
        PersonaDTO aux = personaService.updatePersonaDTO(rut, persona);
        return aux;
    }

    @DeleteMapping("/{rut}")
    public PersonaDTO deletePersonaDTO(@PathVariable int rut) {
        PersonaDTO aux = personaService.deletePersonaDTO(rut);
        return aux;
    }

    @GetMapping
    public List<PersonaDTO> getAll() {
        return personaService.getAll();
    }

    @GetMapping("/{rut}")
    public PersonaDTO getByrut(@PathVariable int rut) {
        return personaService.getByRut(rut);
    }

}
