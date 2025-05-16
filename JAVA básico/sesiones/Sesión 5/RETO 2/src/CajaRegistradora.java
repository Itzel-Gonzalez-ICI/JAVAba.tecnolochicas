public class CajaRegistradora {
    public static void main (String [] args){
        MetodoPago[] pagos = new MetodoPago[]{
                new PagoEfectivo(130.0),
                new PagoTarjeta(75.0,500.0),
                new PagoTransferencia(181.0,false)
        };

        for(MetodoPago pago:pagos){
            if (pago instanceof Autenticable){
                Autenticable metodo = (Autenticable) pago;
                if (metodo.autenticar()){
                    System.out.println("--AUTENTICACIÓN EXITOSA--");
                    pago.procesarPago();
                    pago.mostrarResumen();
                }else{
                    System.out.println("--FALLO DE AUNTENTICACIÓN-- " + System.lineSeparator()+ pago.getClass().getSimpleName()+" no válido");
                }
                System.out.println();
            }
        }
    }
}
