package uce.edu.efinal2_api_pa.service;

import uce.edu.efinal2_api_pa.model.Estudiante;

public interface IEstudianteService {
    public void insertarEstudiante(Estudiante e);
    public Estudiante buscarEstudiante(String cedula);

}
