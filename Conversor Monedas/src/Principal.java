

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("""
                    ------------------------------------
                    \
                    Bienvenidos Al Conversor De Monedas
                    ------------------------------------
                    \
                    Ingresa la conversion que deseas realizar

                    1.---> Dólar Estadounidense a Real Brasileño.
                    2.---> Real Brasileño a Dólar Estadounidense.
                    3.---> Dólar Estadounidense a Peso Chileno.
                    4.---> Peso Chileno a Dólar Estadounidense.
                    5.---> Dólar Estadounidense a Peso Colombiano.
                    6.---> Peso Colombiano a Dólar Estadounidense.
                    7.---> Convertir Otra Moneda.
                    8.---> Salir...""");
            System.out.print("Ingrese una opción: ");


            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    ConvertirMoneda.convertidor("USD", "BRL", consulta, scanner);
                    break;
                case 2:
                    ConvertirMoneda.convertidor("BRL", "USD", consulta, scanner);
                    break;
                case 3:
                    ConvertirMoneda.convertidor("USD", "CLP", consulta, scanner);
                    break;
                case 4:
                    ConvertirMoneda.convertidor("CLP", "USD", consulta, scanner);
                    break;
                case 5:
                    ConvertirMoneda.convertidor("USD", "COP", consulta, scanner);
                    break;
                case 6:
                    ConvertirMoneda.convertidor("COP", "USD", consulta, scanner);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,scanner);
                    break;

                case 8:
                    System.out.println("Saliendo.....");
                    break;

                default:
                    System.out.println("Error Opción No Valida");
                    break;
            }



        }


      }

}
