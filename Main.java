public class Main {

    public static void main(String[] args) {
        Specialist one = new Specialist();
        one.setFio("Alex");
        one.setAge(34);
        one.setSalary(100000);
        one.setLevels(1);

        Specialist two = new Specialist();
        two.setFio("bill");
        two.setAge(32);
        two.setSalary(800000);
        two.setLevels(2);

        Specialist tre = new Specialist("Anna", 24, 1222200, 4);

        Developer one1 = new Developer("Alexis", 26, 300000, "Midl");
        Developer one2 = new Developer("Alexi1", 24, 980000, "jun");
        Developer one3 = new Developer("Alex3", 27, 230000, "Midl");
        Developer one4 = new Developer("Alexis6", 86, 560000, "sin");

        Manager onert = new Manager("niko", 54, 32232000, true);
        Manager oneewrdsr = new Manager("nikol", 45, 77232000, false);

        CEO rwefs=new CEO("ilon",41,99999999,true,true);

        one.info();
        two.info();
        tre.info();
        one1.info();
        one2.info();
        one3.info();
        one4.info();
        onert.info();
        oneewrdsr.info();
        System.out.println(rwefs);

       one1.goToDayOff("я болею");



    }
}
