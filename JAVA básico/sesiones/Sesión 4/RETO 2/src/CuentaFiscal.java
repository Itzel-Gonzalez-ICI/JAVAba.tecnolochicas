import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoActual;

    public CuentaFiscal(String rfc, double saldoDisponible){
        if (saldoDisponible < 0){
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.rfc = rfc;
        this.saldoActual = saldoDisponible;
    }

    //    Getters para ambos atributos
    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoActual;
    }



    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
