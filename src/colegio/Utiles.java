package colegio;

class Utiles {
    private String material;
    private Boolean accequible;

    public Utiles(String material, Boolean accequible) {
        this.material = material;
        this.accequible = accequible;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getAccequible() {
        return accequible;
    }

    public void setAccequible(Boolean accequible) {
        this.accequible = accequible;
    }
}
