package colegio;

class Deberes {
    private String materia;
    private Boolean asignado;
    private int gradoEscolar;

    public Deberes(String materia, Boolean asignado, int gradoEscolar) {
        this.materia = materia;
        this.asignado = asignado;
        this.gradoEscolar = gradoEscolar;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Boolean getAsignado() {
        return asignado;
    }

    public void setAsignado(Boolean asignado) {
        this.asignado = asignado;
    }

    public int getGradoEscolar() {
        return gradoEscolar;
    }

    public void setGradoEscolar(int gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }
    
    
}
