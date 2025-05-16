public class Main {
    public static void main(String[] args) {
        // Crear declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("SWFT891213MDFTSR05", 1989.13);

        // Crear cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("SWFT891213MDFTSR05", 2989.13);

        // Mostrar información
        System.out.println("**Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());

        System.out.println("**Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar RFC
        boolean valido = cuenta.validarRFC(declaracion);
        System.out.println((valido ? "✅" : "❌") + " ¿RFC válido para esta cuenta?: " + valido);
    }
}