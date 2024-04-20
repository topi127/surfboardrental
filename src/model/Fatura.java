package model;
public class Fatura{
    private int nFatura;
    public Fatura() {
    }
    public Fatura(int nFatura) {
        this.nFatura = nFatura;
    }
    public int getnFatura() {
        return nFatura;
    }
    public void setnFatura(int nFatura) {
        this.nFatura = nFatura;
    }
    @Override
    public String toString() {
        return "Fatura{" +
                "nFatura=" + nFatura +
                '}';
    }
}