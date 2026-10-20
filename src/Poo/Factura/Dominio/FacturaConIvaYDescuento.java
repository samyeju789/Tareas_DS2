package Poo.Factura.Dominio;

import java.time.LocalDateTime;

public class FacturaConIvaYDescuento extends FacturaConIva{

    private int descuento;

    public FacturaConIvaYDescuento(int numero, long valor, LocalDateTime fecha, int iva, int descuento) {
        super(numero, valor, fecha, iva);
        this.descuento = descuento;
    }

    public long calcularTotal() {
        long valorConIva = super.calcularTotal();
        return valorConIva - (valorConIva * descuento / 100);
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
