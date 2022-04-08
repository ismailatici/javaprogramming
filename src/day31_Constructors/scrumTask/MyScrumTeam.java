package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1=new Tester("Layan",11,"SDET",23000);
        Tester tester2=new Tester("Layana",11,"SDET",23000);
        Tester tester3=new Tester("Layani",11,"SDET",23000);
        Tester tester4=new Tester("Layanü",11,"SDET",23000);
        Tester[] testers={tester3,tester2,tester4};
        Developer developer1=new Developer("olga",22,"QA",123456);
        Developer developer2=new Developer("Yolga",22,"QA",123456);
        Developer developer3=new Developer("Zolga",22,"QA",123456);
        Developer developer4=new Developer("Solga",22,"QA",123456);
        Developer[] developers={developer3,developer2,developer4};

        ScrumTeam scrum=new ScrumTeam("Niagara","ali","neria",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        System.out.println(scrum);

        System.out.println("===============================================");

        for (Tester eachTester:scrum.testersList) {
            System.out.println(eachTester.name+":"+eachTester.salary);

        }
        System.out.println(" ============================== ");

        for (Developer eachDeveloper :scrum.devopsList){
            System.out.println(eachDeveloper.name +":"+ eachDeveloper.salary);
        }
        System.out.println(" =.................... ");

        scrum.removeDeveloper(22);
        scrum.removeTester(23);
        System.out.println(scrum);



    }
}
