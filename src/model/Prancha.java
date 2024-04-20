package model;
public class Prancha{
    private int nPrancha;
    private boolean disponivel;
    private double precoPorDia;
    private String marcaPrancha;
    public Prancha() {}
    public Prancha(int nPrancha, boolean disponivel, double precoPorDia, String marcaPrancha) {
        this.nPrancha = nPrancha;
        this.disponivel = disponivel;
        this.precoPorDia = precoPorDia;
        this.marcaPrancha = marcaPrancha;
    }
    public int getnPrancha() {
        return nPrancha;
    }
    public void setnPrancha(int nPrancha) {
        this.nPrancha = nPrancha;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public String getMarcaPrancha() {
        return marcaPrancha;
    }
    public void setMarcaPrancha(String marcaPrancha) {
        this.marcaPrancha = marcaPrancha;
    }
    @Override
    public String toString() {
        return "Prancha{" +
                "nPrancha=" + nPrancha +
                ", disponivel=" + disponivel +
                ", precoPorDia=" + precoPorDia +
                ", marcaPrancha='" + marcaPrancha + '\'' +
                '}';
    }
}