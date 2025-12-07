package principal;

public class InterfazU {

    public void inicio(){

        String inicio = """
                
                ****************************************************
                
                BIENVENIDO/A AL CONVERSOR DE DIVISAS Ò SALIR
                
                INTRODUCE UN CODIGO DE DIVISA QUE DESEES CONVERTIR
                
                1:  (USD) DOLAR ESTADOUNIDENSE
                2:  (MXN) PESO MEXICANO
                3:  (EUR) EURO
                4:  (ARS) PESO ARGENTINO
                5:  (BRL) REAL BRASILEÑO
                6:  (CLP) PESO CHILENO
                7:  (COU) UNIDAD DE VALOR REAL
                8:  (PEN) NUEVO SOL
                9:  (JPY) YEN
                10: (CNY) RENMINBI
                11: SALIR
                
                ****************************************************
                
                """;
        System.out.println(inicio);

    }

    public void objetivo(){

        String objetivo = """
                
                ****************************************************
                
                SELECCIONA UNA DIVISA OBJETIVO Ò SALIR
                
                1:  (USD) DOLAR ESTADOUNIDENSE
                2:  (MXN) PESO MEXICANO
                3:  (EUR) EURO
                4:  (ARS) PESO ARGENTINO
                5:  (BRL) REAL BRASILEÑO
                6:  (CLP) PESO CHILENO
                7:  (COU) UNIDAD DE VALOR REAL
                8:  (PEN) NUEVO SOL
                9:  (JPY) YEN
                10: (CNY) RENMINBI
                11: SALIR
                
                ****************************************************
                
                """;
        System.out.println(objetivo);

    }

    public void cantidad(){

        String cantidad = """
                
                ****************************************************
                
                INTRODUCE LA CANTIDAD QUE DESEAS CONVERTIR Ò SALIR
                
                ****************************************************
                
                """;
        System.out.println(cantidad);

    }

}
