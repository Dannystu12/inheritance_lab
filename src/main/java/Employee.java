public abstract class Employee{

    private String name;
    private String NI;
    private double salary;
    private static final double BONUS = 0.01;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        this.salary += increment;
    }

    public double payBonus(){
        return salary * BONUS;
    }

}
