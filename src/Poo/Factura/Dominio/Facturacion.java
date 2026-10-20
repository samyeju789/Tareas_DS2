package Poo.Factura.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Facturacion {

    private List<Factura> facturasConDescuento = new ArrayList<>();

    // 2. CONSTRUCTOR (Si tienes uno)
    public Facturacion() {
        // Constructor por defecto
    }

    // 3. MÉTODOS DE LA CLASE
    public void mostrarTotal() {
        long totalGeneral = 0;
        if (facturasConDescuento != null) {
            for (Factura f : facturasConDescuento) {
                totalGeneral += f.calcularTotal();
            }
        }
        System.out.println("El total de la facturación es: $" + totalGeneral);
    }

    // 4. GETTERS Y SETTERS (Al final)
    public List<Factura> getFacturasConDescuento() {
        return facturasConDescuento;
    }

    public void setFacturasConDescuento(List<Factura> facturasConDescuento) {
        this.facturasConDescuento = facturasConDescuento;
    }
}