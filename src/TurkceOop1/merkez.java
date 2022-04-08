package TurkceOop1;

public class merkez {
    public static void main(String[] args) {
        hesapmakinasi makina1=new hesapmakinasi(10,20,"mavi");
        makina1.sayi2=2;
        System.out.println(makina1.sayi1);

        System.out.println(makina1.bolme());
        System.out.println(makina1.carpma());
        hesapmakinasi makina2=new hesapmakinasi(30,40,"beyaz");
        System.out.println(makina2.carpma());


    }
}
