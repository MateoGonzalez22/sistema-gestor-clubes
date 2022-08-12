package Pagos;

import java.time.LocalDate;

public class Vencimiento {

    private int numero;
    private int tipo;
    private LocalDate fechaVenc1;
    private LocalDate fechaVenc2;
    private float importe1;
    private float importe2;
    private boolean estado;
    private float cuota;


    public Vencimiento(int numero, int tipo, LocalDate fechaVenc1, LocalDate fechaVenc2, float importe1, float importe2, boolean estado, float cuota) {
        this.numero = numero;
        this.tipo = tipo;
        this.fechaVenc1 = fechaVenc1;
        this.fechaVenc2 = fechaVenc2;
        this.importe1 = importe1;
        this.importe2 = importe2;
        this.estado = estado;
        this.cuota = cuota;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaVenc1() {
        return fechaVenc1;
    }

    public void setFechaVenc1(LocalDate fechaVenc1) {
        this.fechaVenc1 = fechaVenc1;
    }

    public LocalDate getFechaVenc2() {
        return fechaVenc2;
    }

    public void setFechaVenc2(LocalDate fechaVenc2) {
        this.fechaVenc2 = fechaVenc2;
    }

    public float getImporte1() {
        return importe1;
    }

    public void setImporte1(float importe1) {
        this.importe1 = importe1;
    }

    public float getImporte2() {
        return importe2;
    }

    public void setImporte2(float importe2) {
        this.importe2 = importe2;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }
}
