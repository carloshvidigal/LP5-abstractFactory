package abstractfactory;

public class Worker {

    private Contract contract;
    private Instructions instructions;

    public Worker (Abstractfactory factory) {
        this.contract = factory.createContract();
        this.instructions = factory.createInstructions();
    }

    public String getContract(){
        return this.contract.get();
    }

    public String getInsctructions() {
        return this.instructions.get();
    }
}
