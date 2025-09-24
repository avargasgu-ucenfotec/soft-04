//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cliente cliente1 = new Cliente(
                "Arianna",
                "Cooper",
                "966721734",
                'M',
                "Alajuela, Costa Rica"
        );

        Cliente cliente2 = new Cliente(
                "John",
                "Silva",
                "233556944",
                "Cartago, Costa Rica"
        );

        Cliente cliente3 = new Cliente();

        Suscripcion suscripcion1 = new Suscripcion(
                "Gratis",
                0.0f,
                (byte)3
        );

        Suscripcion suscripcion2 = new Suscripcion(
                "Plus",
                10.5f,
                (byte)1
        );

        Suscripcion suscripcion3 = new Suscripcion(
                "Ultra",
                100.0f,
                (byte)12
        );

        //Procesar suscripción
        String transaccion = cliente1.suscribirse(suscripcion1);
        System.out.println(transaccion);

        //Pasar argumento de forma anónima.
        System.out.println(cliente2.suscribirse(suscripcion2));

        //Comparar clientes.
        System.out.println(cliente1.equals(cliente2));

        //Comparar suscripciones.
        System.out.println(suscripcion1.equals(suscripcion2));

        //Imprimir información del objeto cliente.
        System.out.println(cliente1);

        //Imprimir información del objeto suscripción.
        System.out.println(suscripcion1);
    }
}