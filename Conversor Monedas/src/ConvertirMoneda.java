import java.util.Locale;
import java.util.Scanner;

public class ConvertirMoneda {



    public static void convertidor(String monedaBase, String monedaDestino, ConsultaMoneda consulta, Scanner lectura){
        double cantidad;
        double CantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase,monedaDestino);
        System.out.println("La tasa de conversion del dia de hoy \n1 "+monedaBase+ " = " +monedas.conversion_rate()+" "+monedaDestino);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        CantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = " + CantidadConvertida+ " "+monedas.target_code());

    }

    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base :");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el cogigo de la moneda destino :");
        String monedaDestino = lectura.nextLine().toUpperCase();
        convertidor(monedaBase,monedaDestino,consulta,lectura);

    }



}