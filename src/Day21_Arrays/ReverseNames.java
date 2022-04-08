package Day21_Arrays;

public class ReverseNames {
    public static void main(String[] args) {
        String[] name = {"Anna conn", "Zuhal bonn", "Ahmet kaann", "Maria salo", "Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : name) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

}
}

