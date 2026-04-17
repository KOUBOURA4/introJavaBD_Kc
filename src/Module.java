public class Module {
    private int id;
    private String libelle;
    private int VH;
    private String frequense;

    public Module() {
    }

    public Module(int id, String libelle, int VH, String frequense) {
        this.id = id;
        this.libelle = libelle;
        this.VH = VH;
        this.frequense = frequense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getVH() {
        return VH;
    }

    public void setVH(int VH) {
        this.VH = VH;
    }

    public String getFrequense() {
        return frequense;
    }

    public void setFrequense(String frequense) {
        this.frequense = frequense;
    }
}
