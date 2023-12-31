package uce.edu.efinal2_api_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.efinal2_api_pa.model.Estudiante;
import uce.edu.efinal2_api_pa.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

    @Autowired
    private IEstudianteRepo estudianteRepo;

    @Override
    public void insertarEstudiante(Estudiante e) {
        this.estudianteRepo.insertarEstudiante(e);
    }


    @Override
    public Estudiante buscarEstudiante(String cedula) {
        // TODO Auto-generated method stub
     return this.estudianteRepo.buscarPorCedula(cedula);
    }

}
