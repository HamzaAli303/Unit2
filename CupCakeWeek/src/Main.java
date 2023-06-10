import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       class cupCake {
           public double price;
           public double getPrice(){
               return price;
           }
           public void setPrice(double price){
               this.price = price;
           }
           public void type(){
               System.out.println("A basic, generic cupcake, with vanilla frosting");
           }

       }
       class redVelvet extends cupCake{
           public void type(){
               System.out.println("A red velvet cupcake, with cream cheese frosting");
           }
       }
        class Chocolate  extends cupCake{
            public void type(){
                System.out.println("A chocolate based cupcake, with chocolate frosting");
            }
        }

        class Drink {
           public double price;

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public void type(){

            }
        }

        class Soda extends Drink{
            public void type(){
                System.out.println("A bottle of soda");
            }
        }

        class Milk extends Drink{
            public void type(){
                System.out.println("A bottle of milk");
            }
        }


        ArrayList<cupCake> cupCakeMenu = new ArrayList<cupCake>();
        cupCake cupCake= new cupCake();
        redVelvet redVelvet = new redVelvet();
        Chocolate Chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupCake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupCake.setPrice(price);

        System.out.println("We are deciding on the price for our standard Red velvet. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our standard Chocolate. Here is the description:");
        Chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        Chocolate.setPrice(price);

        cupCakeMenu.add(Chocolate);
        cupCakeMenu.add(redVelvet);
        cupCakeMenu.add(Chocolate);

        System.out.println(cupCakeMenu);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are deciding on the price for our water. Here is the description:");
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        System.out.println(drinkMenu);
    }
}