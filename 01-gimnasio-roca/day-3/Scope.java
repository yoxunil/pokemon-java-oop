public class Scope {
    public static void main (String [] args){
    {
        int nvlCharmander = 8;
        String type = "Dragon";

        System.out.println("El nivel de charmander es de: " + nvlCharmander + "  el tipo de pokemon que es Charmander es: " +type);

        {
             System.out.println("El nivel de charmander es de: " + nvlCharmander + "  el tipo de pokemon que es Charmander es: " +type);
        }
    }
         // esta fuera de rango : System.out.println("El nivel de charmander es de: " + nvlCharmander + "  el tipo de pokemon que es Charmander es: " +type);
    }
}
