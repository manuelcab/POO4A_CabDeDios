package clases;

public class Estudiante extends Persona{
    
    //ATRIBUTOS//
    private String matricula;
    private String facultad;
    private String carrera;
    private String semestre;
    private String promedio;
    private String grupo;

    //CONSTRUCTOR//
    public Estudiante() {
        
    }

    //GETTERS//
    public String getMatricula() {
        return matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getPromedio() {
        return promedio;
    }

    public String getGrupo() {
        return grupo;
    }

    //SETTERS//
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}