package clases;

public class Docente extends Persona{
    
    //ATRIBUTOS//
    private String numeroEmpleado;
    private String materia;
    private String horas;
	private String gradoAcademico;
	private String certificaciones;
	private String idiomas;
	private String salario;

    //CONSTRUCTOR//
    public Docente() {

    }

    //GETTERS//
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getMateria() {
        return materia;
    }

    public String getHoras() {
        return horas;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getSalario() {
        return salario;
    }

    //SETTERS//

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}