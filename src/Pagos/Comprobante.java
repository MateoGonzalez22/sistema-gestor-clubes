package Pagos;

import java.time.LocalDate;

public class Comprobante {

    private int numero;
    private TipoComprobante tipoComprobante;
    private float importe;
    private LocalDate fechaRegistro;
    private boolean estado;
    private Vencimiento vencimiento;



    public Comprobante(int numero, TipoComprobante tipoComprobante, float importe, LocalDate fechaRegistro, boolean estado, Vencimiento vencimiento) {
        this.numero = numero;
        this.tipoComprobante = tipoComprobante;
        this.importe = importe;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.vencimiento = vencimiento;
    }

    public int getNumero() {
        return numero;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public float getImporte() {
        return importe;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public Vencimiento getVencimiento() {
        return vencimiento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setVencimiento(Vencimiento vencimiento) {
        this.vencimiento = vencimiento;
    }
}
