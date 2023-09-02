package uce.edu.efinal2_api_pa.repository;

import uce.edu.efinal2_api_pa.model.Estudiante;

public interface IEstudianteRepo {
    public void insertarEstudiante(Estudiante e);
    public Estudiante buscarPorCedula(String cedula);
}
