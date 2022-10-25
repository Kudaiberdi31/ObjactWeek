public class Manager  extends Employee{
    private boolean hasStocks;

    public Manager() {
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Акции: " + isHasStocks() + "\n" + "Я разрабатываю процедуры!" + "\n================");
    }

    @Override
    public void goToDayOff( String week) {
        System.out.println("Мне нужен выходной для " + week);

    }


}
