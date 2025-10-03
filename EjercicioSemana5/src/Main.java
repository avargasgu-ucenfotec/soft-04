//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ejercicio, semana 5\n");

        //Construya dos personas
        Persona pasajero1;
        Persona pasajero2;
        pasajero1 = new Persona("Andrés", "Vargas Guevara");
        pasajero2 = new Persona("Romario", "Salas Cerdas");

        //Construya una mascota
        Mascota mascota1;
        mascota1 = new Mascota("Firulais", "Golden retriever", (byte)2);

        //Construya una máquina de soldar
        MaquinaSoldar maquina1;
        maquina1 = new MaquinaSoldar("YesWelder", "MIG-205DS PRO", (byte)5);

        //Haga que las personas tomen vuelos, con distinto resultado en cada caso
        pasajero1.sacarPasaporte(
                "B00001",
                "costarricense",
                "01/01/2020",
                "01/01/2022",
                false
        );
        pasajero2.sacarPasaporte(
                "B00002",
                "costarricense",
                "01/01/2010",
                "01/01/2030",
                true
        );
        pasajero1.tomarVuelo("Brasil");
        pasajero2.tomarVuelo("España");

        //Haga que ambas personas tengan la misma mascota
        pasajero1.adoptarMascota(mascota1);
        pasajero2.adoptarMascota(mascota1);

        pasajero1.jugar();
        pasajero2.jugar();

        //Haga que una persona intente soldar dos veces, con distinto resultado en cada caso
        pasajero1.soldar(maquina1, "aluminio");
        pasajero1.soldar(maquina1,"titanio");
    }
}