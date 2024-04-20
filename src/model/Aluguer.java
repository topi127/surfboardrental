package model;
import java.time.LocalDate;
import java.util.ArrayList;
public class Aluguer{
    private double valorTotal;
    private double valorDesconto;
    private int nDiasAluguer;
    private ArrayList pranchas;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int idCliente;
    public Aluguer() {}
    public Aluguer(double valorTotal, double valorDesconto, int nDiasAluguer, ArrayList pranchas, LocalDate dataInicio, LocalDate dataFim, int idCliente) {
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.nDiasAluguer = nDiasAluguer;
        this.pranchas = pranchas;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idCliente = idCliente;
    }
    public ArrayList getPranchas() {
        return pranchas;
    }
    public void setPranchas(ArrayList pranchas) {
        this.pranchas = pranchas;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public int getnDiasAluguer() {
        return nDiasAluguer;
    }
    public void setnDiasAluguer(int nDiasAluguer) {
        this.nDiasAluguer = nDiasAluguer;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    @Override
    public String toString() {
        return "Aluguer{" +
                "valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", nDiasAluguer=" + nDiasAluguer +
                ", pranchas=" + pranchas +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", idCliente=" + idCliente +
                '}';
    }
}