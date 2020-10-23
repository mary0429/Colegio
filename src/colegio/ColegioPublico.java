package colegio;

public class ColegioPublico extends Colegio{
    private Boolean paroEscolar;
    private String horarioDeClase;
    private Boolean utilesGobierno;

    public ColegioPublico(Boolean paroEscolar, 
            String horarioDeClase, 
            Boolean utilesGobierno, 
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
        
        this.paroEscolar = paroEscolar;
        this.horarioDeClase = horarioDeClase;
        this.utilesGobierno = utilesGobierno;
    }

    public Boolean getParoEscolar() {
        return paroEscolar;
    }

    public void setParoEscolar(Boolean paroEscolar) {
        this.paroEscolar = paroEscolar;
    }

    public String getHorarioDeClase() {
        return horarioDeClase;
    }

    public void setHorarioDeClase(String horarioDeClase) {
        this.horarioDeClase = horarioDeClase;
    }

    public Boolean getUtilesGobierno() {
        return utilesGobierno;
    }

    public void setUtilesGobierno(Boolean utilesGobierno) {
        this.utilesGobierno = utilesGobierno;
    }
}
