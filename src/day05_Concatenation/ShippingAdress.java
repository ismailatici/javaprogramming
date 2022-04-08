package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "James King ",
                buildingNumber = "111119b",
                streetName = "James Bond ",
                city ="Saarbrucken",
                state = "Saarland ",
                zipCode = "66117";
                String adress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode );
        System.out.println(adress);



    }
}
