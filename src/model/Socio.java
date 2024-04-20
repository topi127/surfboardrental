package model;
public class Socio extends Cliente{
    private int nSocio;
    public Socio() {
    }
    public Socio(String nif, String morada, String bi, String nome, int idCliente,int nSocio) {
        super(nif, morada, bi, nome, idCliente);
        this.nSocio = nSocio;
    }
    public int getnSocio() {
        return nSocio;
    }
    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "nSocio=" + nSocio +
                '}';
    }
}