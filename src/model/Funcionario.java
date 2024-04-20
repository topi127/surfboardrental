package model;
public class Funcionario{
    private String nif;
    private int nFuncionario;
    private String morada;
    private String bi;
    private String nome;
    public Funcionario() {}
    public Funcionario(String nif, int nFuncionario, String morada, String bi, String nome) {
        this.nif = nif;
        this.nFuncionario = nFuncionario;
        this.morada = morada;
        this.bi = bi;
        this.nome = nome;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public int getnFuncionario() {
        return nFuncionario;
    }
    public void setnFuncionario(int nFuncionario) {
        this.nFuncionario = nFuncionario;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getBi() {
        return bi;
    }
    public void setBi(String bi) {
        this.bi = bi;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nif='" + nif + '\'' +
                ", nFuncionario=" + nFuncionario +
                ", morada='" + morada + '\'' +
                ", bi='" + bi + '\'' +
                '}';
    }
}