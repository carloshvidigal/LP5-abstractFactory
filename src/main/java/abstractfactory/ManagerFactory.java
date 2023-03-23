package abstractfactory;

public class ManagerFactory implements AbstractFactory{

    @Override
    public Contract createContract() {
        return new ManagerContract();
    }

    @Override
    public Wage createWage() {
        return new ManagerWage();
    }
}
