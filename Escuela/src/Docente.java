public class Docente extends Persona{
    
    //ATRIBUTOS//
    private String numeroEmpleado;
    private String materias;
    private String horas;
	private String gradoAcademico;
	private String certificaciones;
	private String idiomas;
	private String salario;

    //CONSTRUCTOR//
    public Docente(String nombre, String apellido, String edad, String genero, String direccion, String telefono, String correo, String numeroEmpleado, String materias, String horas, String gradoAcademico, String certificaciones, String idiomas, String salario) {
        super(nombre, apellido, edad, genero, direccion, telefono, correo);
        this.numeroEmpleado = numeroEmpleado;
        this.materias = materias;
        this.horas = horas;
        this.gradoAcademico = gradoAcademico;
        this.certificaciones = certificaciones;
        this.idiomas = idiomas;
        this.salario = salario;
    }

    //GETTERS//
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getMaterias() {
        return materias;
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

    public void setMaterias(String materias) {
        this.materias = materias;
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