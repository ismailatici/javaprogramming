package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon","SDET",11000,true,true,true);

        Offer offer2=new Offer();
        offer1.setInfo("VAYY","Amazoni","ISDET",21000,true,true,true);

        Offer offer3=new Offer();
        offer1.setInfo("VAss","ZAmazon","ASDET",41000,true,true,false);

        Offer offer4=new Offer();
        offer1.setInfo("cadVA","LaLoon","QA",60000,true,true,true);

        Offer offer5=new Offer();
        offer1.setInfo("ÜVA","SAmazon","SDET",81000,true,true,true);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf((p->!p.Location.equals("VA")||p.location.equals("CA")));
        System.out.println(localOffers.size());

        for (Offer localOffer:localOffers){
            System.out.println(localOffer.companyName+":"+localOffer.salary);
        }

    }
}
