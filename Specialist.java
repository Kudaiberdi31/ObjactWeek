public class Specialist extends Employee {
    private int levels;

    public Specialist() {
    }

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    void info() {
        super.info();
        System.out.println("level: " + getLevels() + "\n" + "Я рабатаю с клиентами!" + "\n================");


    }

    @Override
    public void goToDayOff(String week) {
        System.out.println("Мне нужен выходной для " + week);
    }
}