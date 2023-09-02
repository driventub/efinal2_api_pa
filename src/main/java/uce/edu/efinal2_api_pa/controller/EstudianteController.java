package uce.edu.efinal2_api_pa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uce.edu.efinal2_api_pa.model.Estudiante;
import uce.edu.efinal2_api_pa.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteController {

    @Autowired
    private IEstudianteService estuService;

    @PostMapping
    public void insertarEstudiante(@RequestBody Estudiante estu){
        this.estuService.insertarEstudiante(estu);
    }

    @GetMapping(path = "/{cedula}")
    public Integer buscarEstudiante(@PathVariable String cedula){
        return this.estuService.buscarEstudiante(cedula).getId();
    }

}
