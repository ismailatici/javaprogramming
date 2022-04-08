package Day21_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words={"Java Programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};
        for (String each:words){
            int count=0;
            for (String element :words){
                if (element.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
