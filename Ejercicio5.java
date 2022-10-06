public class Ejercicio5 {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String azul_claro = "\033[36m";
        String blanco = "\033[37m";

        System.out.println(azul + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println(blanco + "------\t------\t------\t------\t-------");
        System.out.println(verde + "Progr.\tProgr." + rojo + "\tE.D." + verde + "\tProgr." + blanco + "\tFOL");
        System.out.println(verde + "Progr.\tProgr." + rojo + "\tE.D." + verde + "\tProgr." + blanco + "\tFOL");
        System.out.println(azul_claro + "L.Marc" + rojo + "\tE.D." + verde + "\tProgr." + azul_claro + "\tL.Marc" + blanco + "\tFOL");
        System.out.println(azul_claro + "L.Marc" + morado + "\tS.Info" + verde + "\tProgr." + azul_claro + "\tL.Marc" + morado + "\tS.Info");
        System.out.println(naranja + "BBDD" + morado + "\tS.Info" + naranja + "\tBBDD" + naranja + "\tBBDD" + morado + "\tS.Info");
        System.out.println(naranja + "BBDD" + morado + "\tS.Info" + naranja + "\tBBDD" + naranja + "\tBBDD" + morado + "\tS.Info");
    }
}
