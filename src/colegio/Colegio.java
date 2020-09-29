

package colegio;


public class Colegio {
    private String dueno;
    private String nombre;
    private Boolean privado;
    private Boolean calendarioB;
    private date fechaDeFundacion;
    private int numeroEstudiantes;
    private int numeroDeSalones;
    private int numeroDeMaterias;
    private int numeroDeProfesores;

    public Colegio(
            String dueno, 
            String nombre, 
            Boolean privado, 
            Boolean calendarioB, 
            date fechaDeFundacion,
            int numeroEstudiantes, 
            int numeroDeSalones, 
            int numeroDeMaterias, 
            int numeroDeProfesores) {
        this.dueno = dueno;
        this.nombre = nombre;
        this.privado = privado;
        this.calendarioB = calendarioB;
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroDeSalones = numeroDeSalones;
        this.numeroDeMaterias = numeroDeMaterias;
        this.numeroDeProfesores = numeroDeProfesores;
    }
            
    
    
   

    public void infoColegio(){
    this.numeroEstudiantes += 3;
    this.privado = false;
    this.calendarioB = true;
    }
    
    public String getDueno (){
    return dueno;
    }
    public void setDueno(String dueno){
    this.dueno = dueno;
    }
    public String getNombre (){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public Boolean getPrivado (){
    return privado;
    }
    public void setPrivado(Boolean privado){
    this.privado = privado;
    }
    public Boolean getCalendarioB (){
    return privado;
    }
    public void setCalendarioB(Boolean calendarioB){
    this.privado = privado;
    }
    public date getFechaDeFundacion(){
    return fechaDeFundacion;
    }
    public void  setFechaDeFundacion( date fechaDeFundacion){
    this.fechaDeFundacion = fechaDeFundacion;
    }
    public int getNumeroEstudiantes (){
    return numeroEstudiantes;
    }
    public void setNumeroEstudiantes(int numeroEstudiantes){
    this.numeroEstudiantes = numeroEstudiantes;
    }
    public int getNumeroDeSalones (){
    return numeroDeSalones;
    }
    public void setNumeroDeSalones(int numeroDeSalones){
    this.numeroDeSalones = numeroDeSalones;
    }
    public int getNumeroDeMaterias (){
    return numeroDeMaterias;
    }
    public void setNumeroDeMaterias(int numeroDeMaterias){
    this.numeroDeMaterias = numeroDeMaterias;
    }
    public int getNumeroDeProfesores (){
    return numeroDeProfesores;
    }
    public void setNumeroDeProfesores(int numeroDeProfesores){
    this.numeroDeProfesores = numeroDeProfesores;
    }
    public static void main (String[] args){
        Colegio colegio1 = new Colegio("Claudia", 
                "Colegio Tecnico Maria Elvinia", 
                true,
                false,
                new date(),
                368, 
                22, 
                13, 
                24); 
        System.out.println("La dueña del Colegio es " + colegio1.getDueno());
        System.out.println("el nombre del colegio es " + colegio1.getNombre());
        System.out.println("Hay " + colegio1.getNumeroEstudiantes() + " estudiantes en el colegio");
        System.out.println("Hay una cantidad de " + colegio1.getNumeroDeSalones() + " salones en el colegio");
        System.out.println("Se enseñan  " + colegio1.getNumeroDeMaterias() + " materias en el colegio");
        System.out.println("Colegio privado:  " + colegio1.getPrivado());
        System.out.println("El colegio es calendario A:  " + colegio1.getPrivado());
        
        colegio1.infoColegio();
        
        System.out.println("Hay " + colegio1.getNumeroEstudiantes() + " estudiantes en el colegio");
        System.out.println("Colegio privado:  " + colegio1.getPrivado());
        System.out.println("El colegio es calendario A:  " + colegio1.getPrivado());

    }
}

  
  
