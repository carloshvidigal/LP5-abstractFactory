package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void shouldGetManagerContract() {
        AbstractFactory factory = new ManagerFactory();
        Worker worker = new Worker(factory);
        assertEquals("Contrato para gerente",worker.getContract());
    }

    @Test
    void shouldGetSalesmanContract() {
        AbstractFactory factory = new SalesmanFactory();
        Worker worker = new Worker(factory);
        assertEquals("Contrato para vendedor",worker.getContract());
    }

    @Test
    void shouldGetManagerWage() {
        AbstractFactory factory = new ManagerFactory();
        Worker worker = new Worker(factory);
        assertEquals("Salário de gerente", worker.getWage());
    }

    @Test
    void shouldGetSalesmanWage() {
        AbstractFactory factory = new SalesmanFactory();
        Worker worker = new Worker(factory);
        assertEquals("Salário de vendedor", worker.getWage());
    }

}
