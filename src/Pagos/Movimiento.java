package Pagos;

import java.time.LocalDate;

public class Movimiento {

    private int numero;
    private int tipoDeuda;
    private int numeroDeuda;
    private String tipoPago;
    private int numeroPago;
    private Vencimiento vencimientoDeuda;
    private Vencimiento vencimientoPago;
    private float cuota;
    private float importeAplicado;
    private float importeCobrado;
    private LocalDate fechaRegistro;


    public Movimiento(int numero, int tipoDeuda, int numeroDeuda, String tipoPago, int numeroPago, Vencimiento vencimientoDeuda, Vencimiento vencimientoPago, float cuota, float importeAplicado, float importeCobrado, LocalDate fechaRegistro) {
        this.numero = numero;
        this.tipoDeuda = tipoDeuda;
        this.numeroDeuda = numeroDeuda;
        this.tipoPago = tipoPago;
        this.numeroPago = numeroPago;
        this.vencimientoDeuda = vencimientoDeuda;
        this.vencimientoPago = vencimientoPago;
        this.cuota = cuota;
        this.importeAplicado = importeAplicado;
        this.importeCobrado = importeCobrado;
        this.fechaRegistro = fechaRegistro;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipoDeuda() {
        return tipoDeuda;
    }

    public void setTipoDeuda(int tipoDeuda) {
        this.tipoDeuda = tipoDeuda;
    }

    public int getNumeroDeuda() {
        return numeroDeuda;
    }

    public void setNumeroDeuda(int numeroDeuda) {
        this.numeroDeuda = numeroDeuda;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Vencimiento getVencimientoDeuda() {
        return vencimientoDeuda;
    }

    public void setVencimientoDeuda(Vencimiento vencimientoDeuda) {
        this.vencimientoDeuda = vencimientoDeuda;
    }

    public Vencimiento getVencimientoPago() {
        return vencimientoPago;
    }

    public void setVencimientoPago(Vencimiento vencimientoPago) {
        this.vencimientoPago = vencimientoPago;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public float getImporteAplicado() {
        return importeAplicado;
    }

    public void setImporteAplicado(float importeAplicado) {
        this.importeAplicado = importeAplicado;
    }

    public float getImporteCobrado() {
        return importeCobrado;
    }

    public void setImporteCobrado(float importeCobrado) {
        this.importeCobrado = importeCobrado;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
