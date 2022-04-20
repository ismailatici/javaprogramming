package TurkceOop1;

public class MainBook {
    public static void main(String[] args) {


        Book b1 = new Book("harypotter", "aliye", "zeki", 400);
        b1.getNumberOfPage();
        b1.setNumberOfPage(500);
        System.out.println(b1.getNumberOfPage());

        Book b2=new Book("vayyy","DEli","ismail",900);
        b2.setName("isodan");
        System.out.println(b2.getAutor());



    }
}
