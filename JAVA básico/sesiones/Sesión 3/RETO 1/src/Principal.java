public class Principal {
    public static void main(String[] args) {
        //pasajero y vuelo creado
        Pasajero pasajero1 = new Pasajero("Travis Kelce", "14589");
        Vuelo vuelo1 = new Vuelo("TS873", "New York", "13:00");
        //reservar asiento
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito para pasajero: " + pasajero1.nombre);
        } else {
            System.out.println("No fue posible realizar la reserva");
        }
        //mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());
        //cancelar reserva
        vuelo1.cancelarReserva();
        System.out.println("\n❌ Cancelando reserva...");
        //mostrar itinerario de nuevo
        System.out.println(vuelo1.obtenerItinerario());
        //reservar asiento para nuevo pasajero
        vuelo1.reservarAsiento("Meredith Swift", "17889");
        //mostrar itinerario final
        System.out.println(vuelo1.obtenerItinerario());
    }
}
