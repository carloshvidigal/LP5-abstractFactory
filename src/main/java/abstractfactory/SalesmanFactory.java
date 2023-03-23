package abstractfactory;

public class SalesmanFactory implements AbstractFactory{

    @Override
    public Contract createContract() {
        return new SalesmanContract();
    }

    @Override
    public Wage createWage() {
        return new SalesmanWage();
    }
}
