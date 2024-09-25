import java.time.LocalDate;

public class Registro_pagos{
    private LocalDate fecha_pago;
    private int monto;
    private Tipo_moneda tipo_moneda;

    public Registro_pagos(int monto, Tipo_moneda tipo_moneda){
        this.monto = monto;
        this.tipo_moneda = tipo_moneda;
        this.fecha_pago = LocalDate.now();
    }

}