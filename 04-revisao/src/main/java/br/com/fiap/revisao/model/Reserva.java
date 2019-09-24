package br.com.fiap.revisao.model;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="reserva", sequenceName = "SQ_T_RESERVA", allocationSize = 1)
public class Reserva {

    @Id
    @GeneratedValue(generator="reserva", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private double valorTotal;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    @ManyToOne
    private Quarto quarto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}
