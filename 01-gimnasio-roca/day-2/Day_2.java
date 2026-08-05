public class Day_2 {
    public static void main(String [] args){
    int atack = 52;
    int defense = 43;
    int damage;
    int nvl = 8;

    damage= ((2* nvl/5 +2)*40*(atack/defense)/50+2);
    System.out.println("The damage of charmander is: " + damage);
    }
}
