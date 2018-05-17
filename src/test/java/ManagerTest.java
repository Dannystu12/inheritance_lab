import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void before(){
        manager = new Manager("Dave", "JWC 12 32 54", 10.00, "Nike");
    }

    @Test
    public void hasName(){
        assertEquals("Dave",manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JWC 12 32 54",manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(10.00,manager.getSalary(),0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Nike",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(02.00);
        assertEquals(12.00,manager.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        double bonus = manager.payBonus();
        assertEquals(0.10, bonus, 0.01);
    }



}
