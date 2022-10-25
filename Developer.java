public class Developer  extends Employee {
    private String grades;

    public Developer() {
    }

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    void info() {
        super.info();
        System.out.println("grade: " + getGrades() + "\n" + "Я пишу код !" + "\n================");
    }

    @Override
    public void goToDayOff(String week) {
        System.out.println("Мне нужен выходной для " + week);
    }
}