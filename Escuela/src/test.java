public class test {

    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Manuel");
        estudiante.setApellido("Cab");
        estudiante.setEdad("23");
        estudiante.setGenero("Masculino");
        estudiante.setDireccion("Calle 123");
        estudiante.setTelefono("1234567890");
        estudiante.setCorreo("manuelcab@gmail.com");
        estudiante.setMatricula("123456");
        estudiante.setFacultad("Facultad de Ingeniería");
        estudiante.setCarrera("Ingeniería en Tecnología de Software");
        estudiante.setSemestre("8vo");
        estudiante.setPromedio("9.5");
        estudiante.setGrupo("A");


        Operaciones operacion = new Operaciones();

        String[] valores = {estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getGenero(), estudiante.getDireccion(), estudiante.getTelefono(), estudiante.getCorreo(), estudiante.getMatricula(), estudiante.getFacultad(), estudiante.getCarrera(), estudiante.getSemestre(), estudiante.getPromedio(), estudiante.getGrupo()};

        operacion.insertarEstudiante(valores);

    }
    
}