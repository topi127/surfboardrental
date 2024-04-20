package model;
public class Cliente{
    private String nif;
    private String morada;
    private String bi;
    private String nome;
    private int idCliente;
    public Cliente() {}
    public Cliente(String nif,String morada, String bi, String nome, int idCliente) {
        this.nif = nif;
        this.morada = morada;
        this.bi = bi;
        this.nome = nome;
        this.idCliente = idCliente;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNif() {
        return nif;
    }
    public String getMorada() {
        return morada;
    }
    public String getBi() {
        return bi;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public void setBi(String bi) {
        this.bi = bi;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", morada='" + morada + '\'' +
                ", bi='" + bi + '\'' +
                '}';
    }
}