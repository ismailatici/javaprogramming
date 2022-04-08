package LiveReview;

public class VendingNestedif {
    public static void main(String[] args) {
        String selection ="Drink";
        String drinkItem = "coffe",
                snackItem="chips";
        if (selection== "drink"){
            System.out.println("drink option is selected");
            if (drinkItem== "tea"){
                System.out.println("Tea item is selected");
            }else if (drinkItem=="coffe"){
                System.out.println("coffe item is selected");
            }
        }else if (selection== "snack"){
            System.out.println("Snack optionen is selected");
            if (snackItem=="chips"){

            }

        }else {
            System.err.println("invalidd entry");
        }








    }
}
