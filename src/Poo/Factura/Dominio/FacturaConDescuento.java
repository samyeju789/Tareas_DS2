package Poo.Factura.Dominio;

import java.time.LocalDateTime;

public class FacturaConDescuento extends FacturaSinIva{

    private int descuento;

    public FacturaConDescuento(int numero, long valor, LocalDateTime fecha, int descuento) {
        super(numero, valor, fecha);
        this.descuento = descuento;
    }

    public long calcularTotal() {
        return getValor() - (getValor() * descuento / 100);
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
