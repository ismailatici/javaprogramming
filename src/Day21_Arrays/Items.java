package Day21_Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items={"Shoes","Jacket","Gloves","AirPods","iPad","iPhone 12 case"};
        double []prices={99.99, 150.0,9.99,250.0,439.5,399.99};
        int [] itemIDs ={12345,12345,12347,12348,12349,12350};

        for (int i=0;i< items.length;i++){
            String item =items[i];
            double price=prices[i];
            int id=itemIDs[i];
            System.out.println(item+"-"+id+"-$"+price);

        }














    }
}
