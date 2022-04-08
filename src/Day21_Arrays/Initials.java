package Day21_Arrays;

public class Initials {
    public static void main(String[] args) {
        String[] name={"Anna conn","Zuhal bonn","Ahmet kaann","Maria salo","Java Programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};

        for (String each:name) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf("")+1);
            System.out.println(initial);
        }












    }
}
