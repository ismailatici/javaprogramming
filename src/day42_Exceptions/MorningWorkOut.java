package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("Push up started");
        System.out.println("Push up 1");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\r push up"+i);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("\n ------Push up  completed-----");

        System.out.println("----------------Pull up started----------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\r push up" + i);
           // sleep(1.5); same funcktion

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }











    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long) seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
