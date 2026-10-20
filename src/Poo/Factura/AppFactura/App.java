package Poo.Factura.AppFactura;

import Poo.Factura.Dominio.*;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();
        LocalDateTime fecha = LocalDateTime.now();

        // 1. 5 Facturas Sin IVA
        facturacion.getFacturasConDescuento().add(new FacturaSinIva(1, 50000, fecha));
        facturacion.getFacturasConDescuento().add(new FacturaSinIva(2, 60000, fecha));
        facturacion.getFacturasConDescuento().add(new FacturaSinIva(3, 70000, fecha));
        facturacion.getFacturasConDescuento().add(new FacturaSinIva(4, 80000, fecha));
        facturacion.getFacturasConDescuento().add(new FacturaSinIva(5, 90000, fecha));

        // 2. 5 Facturas Con IVA
        facturacion.getFacturasConDescuento().add(new FacturaConIva(6, 100000, fecha, 19));
        facturacion.getFacturasConDescuento().add(new FacturaConIva(7, 120000, fecha, 19));
        facturacion.getFacturasConDescuento().add(new FacturaConIva(8, 150000, fecha, 19));
        facturacion.getFacturasConDescuento().add(new FacturaConIva(9, 180000, fecha, 19));
        facturacion.getFacturasConDescuento().add(new FacturaConIva(10, 200000, fecha, 19));

        // 3. 5 Facturas Con Descuento
        facturacion.getFacturasConDescuento().add(new FacturaConDescuento(11, 50000, fecha, 10));
        facturacion.getFacturasConDescuento().add(new FacturaConDescuento(12, 60000, fecha, 10));
        facturacion.getFacturasConDescuento().add(new FacturaConDescuento(13, 70000, fecha, 10));
        facturacion.getFacturasConDescuento().add(new FacturaConDescuento(14, 80000, fecha, 10));
        facturacion.getFacturasConDescuento().add(new FacturaConDescuento(15, 90000, fecha, 10));

        // 4. 5 Facturas Con IVA y Descuento
        facturacion.getFacturasConDescuento().add(new FacturaConIvaYDescuento(16, 100000, fecha, 19, 5));
        facturacion.getFacturasConDescuento().add(new FacturaConIvaYDescuento(17, 120000, fecha, 19, 5));
        facturacion.getFacturasConDescuento().add(new FacturaConIvaYDescuento(18, 140000, fecha, 19, 5));
        facturacion.getFacturasConDescuento().add(new FacturaConIvaYDescuento(19, 160000, fecha, 19, 5));
        facturacion.getFacturasConDescuento().add(new FacturaConIvaYDescuento(20, 180000, fecha, 19, 5));

        // 5. 5 Facturas Con IVA 12%
        facturacion.getFacturasConDescuento().add(new FacturaConIva12(21, 50000, fecha, 12));
        facturacion.getFacturasConDescuento().add(new FacturaConIva12(22, 60000, fecha, 12));
        facturacion.getFacturasConDescuento().add(new FacturaConIva12(23, 70000, fecha, 12));
        facturacion.getFacturasConDescuento().add(new FacturaConIva12(24, 80000, fecha, 12));
        facturacion.getFacturasConDescuento().add(new FacturaConIva12(25, 90000, fecha, 12));

        // Ejecutar facturación
        for (Factura f : facturacion.getFacturasConDescuento()) {
            System.out.println("Factura #" + f.getNumero() + " - Valor base: $" + f.getValor() + " - Total: $" + f.calcularTotal());
        }
    }
}

