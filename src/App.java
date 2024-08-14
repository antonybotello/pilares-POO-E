import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String opcion = "";

        while (!opcion.equals("0")) {
            System.out.println("##################  MENÚ  ##################");
            System.out.println("#### 1. Crear Carro                     ####");
            System.out.println("#### 2. Crear Moto                      ####");
            System.out.println("#### 0. Salir                           ####");
            System.out.println("############################################");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    Carro miCarro = new Carro();
                    miCarro.setAnio("2022");
                    miCarro.setColor("rojo");
                    miCarro.setNumPuertas("4");
                    miCarro.arrancar();
                    miCarro.activarAire();
                    miCarro.moverse();
                    miCarro.detenerse();

                    System.out.println("El carro es del año " + miCarro.getAnio() +
                            " de color " + miCarro.getColor() +
                            " y tiene " + miCarro.getNumPuertas()+" llantas");
                    break;
                case "2":
                    System.out.println("Digite el número de llantas de la moto");
                    String numLlantas = teclado.nextLine();
                    System.out.println("Digite el color de la moto");
                    String color = teclado.nextLine();
                    System.out.println("Digite la marca de la moto");
                    String marca = teclado.nextLine();
                    System.out.println("Digite el año de la moto");
                    String anio = teclado.nextLine();
                    System.out.println("Digite el modelo de la moto");
                    String modelo = teclado.nextLine();
                    System.out.println("Digite el tipo de manillar de la moto");
                    String tipoManillar=teclado.nextLine();
                    System.out.println("Digite el estilo de posa pies de la moto");
                    String posaPies=teclado.nextLine();

                    Moto miMoto= new Moto(numLlantas, color, marca, anio, modelo, tipoManillar, posaPies);

                    miMoto.arrancar();
                    miMoto.moverse();
                    miMoto.hacerCaballito();
                    miMoto.moverse();
                    miMoto.detenerse();

                    System.out.println(miMoto);
                    break;
                default:
                    break;
            }
        }

    }
}
