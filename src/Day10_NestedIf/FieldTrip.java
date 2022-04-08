package Day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2,
                groupNumber = 0;
        String location = "",
                teacher = "";

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Mr. Asel";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. demir";

            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Mr. limi";
            }


        } else {
            System.out.println("invalid Grade");
        }
        System.out.println("location -" + location + "\nnumber of the group-" + groupNumber+"\nteacher in charge -" + teacher);
    }
}
