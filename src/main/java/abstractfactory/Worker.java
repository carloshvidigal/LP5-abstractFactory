package abstractfactory;

public class Worker {

    private Contract contract;
    private Wage wage;

    public Worker (AbstractFactory factory) {
        this.contract = factory.createContract();
        this.wage = factory.createWage();
    }

    public String getContract(){
        return this.contract.get();
    }

    public String getWage() {
        return this.wage.get();
    }
}
