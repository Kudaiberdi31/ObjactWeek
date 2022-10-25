public class CEO extends Manager{
    private boolean hasCompanyCar;

    public CEO() {
    }

    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public String toString() {
        return "name: " + getFio() + "\n" +
                "age: " + getAge() + "\n" +
                "salary: " + getSalary() + "\n" + "Акции: " + isHasStocks() + "Company car: " + isHasCompanyCar() + "\n" + "Я работаю над IPO";
    }


}
