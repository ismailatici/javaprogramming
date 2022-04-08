package day17_While;

public class BranchingStatetments2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                break;//continue
            }
            System.out.println(i);//A B // A B D E
        }

        System.out.println("----------------------");

        for (int i =1; i<11;i++){
            if (i%2 ==0){  //i%2 !==0 ==>2 4 6..
                continue;
            }
            System.out.print(i);
        }











    }
}