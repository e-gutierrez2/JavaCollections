package Vista;

public class Vista {
     static void Mensaje(String msg){
         System.out.println(msg);
    }

    public static void MenuPrincipal(){
        System.out.println("BENVINGUT AL SAPAMERCAT");
        System.out.println("-------------");
        System.out.println("--  INICI  --");
        System.out.println("-------------");
        System.out.println("1) Introudir Producte");
        System.out.println("2) Passar per Caixa");
        System.out.println("3) Mostrar carret de Compra");
        System.out.println("0) Acabar");
    }

    public static void MenuProducte(){
        System.out.println("----------------");
        System.out.println("--  PRODUCTE  --");
        System.out.println("----------------");
        System.out.println("1) Alimentació");
        System.out.println("2) Tèxtil");
        System.out.println("3) Electronica");
        System.out.println("0) Tornar");
    }
}
