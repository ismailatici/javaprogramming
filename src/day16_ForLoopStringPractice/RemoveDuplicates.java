package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str ="Wood Spoon";
        //index      0123456789
        String result ="";
        //noopS nedooW
        /*
        result+= str.charAt(11);//n
        result+= str.charAt(10);//o
        result+= str.charAt(9);//0
        result+= str.charAt(8);//p
        result+= str.charAt(7);//S
        result+= str.charAt(6);//''
        result+= str.charAt(5);
        result+= str.charAt(4);
        result+= str.charAt(3);
        result+= str.charAt(2);
        result+= str.charAt(1);
        result+= str.charAt(0);

         */
        for (int i=str.length()-1;i>=0;i--){// i: index number of str(starting last index to index 0)
            result+=str.charAt(i);


        }
        System.out.println("Hello World");

        //
        System.out.println(result);



    }
}
