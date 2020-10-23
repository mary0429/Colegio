package colegio;

public class ColiseoDeportivo extends Colegio{
    private String deportes;
    private Boolean AsisteciaAEntreno;
    private Boolean lesiones;

    public ColiseoDeportivo(String deportes, 
            Boolean AsisteciaAEntreno, 
            Boolean lesiones, 
            String dueno, 
            String nombre, 
            Boolean privado, 
            Boolean calendarioB, 
            date fechaDeFundacion, 
            int numeroEstudiantes, 
            int numeroDeSalones, 
            int numeroDeMaterias, 
            int numeroDeProfesores) {
        super(dueno, 
                nombre, 
                privado, 
                calendarioB, 
                fechaDeFundacion, 
                numeroEstudiantes, 
                numeroDeSalones, 
                numeroDeMaterias, 
                numeroDeProfesores);
        
        this.deportes = deportes;
        this.AsisteciaAEntreno = AsisteciaAEntreno;
        this.lesiones = lesiones;
    }

    public String getDeportes() {
        return deportes;
    }

    public void setDeportes(String deportes) {
        this.deportes = deportes;
    }

    public Boolean getAsisteciaAEntreno() {
        return AsisteciaAEntreno;
    }

    public void setAsisteciaAEntreno(Boolean AsisteciaAEntreno) {
        this.AsisteciaAEntreno = AsisteciaAEntreno;
    }

    public Boolean getLesiones() {
        return lesiones;
    }

    public void setLesiones(Boolean lesiones) {
        this.lesiones = lesiones;
    }
    
    
    
}
