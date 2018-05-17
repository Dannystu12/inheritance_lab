import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;


    @Before
    public void before(){
        developer = new Developer("Dave", "JWC 12 32 54", 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dave",developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JWC 12 32 54",developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(10.00,developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(02.00);
        assertEquals(12.00,developer.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        double bonus = developer.payBonus();
        assertEquals(0.10, bonus, 0.01);
    }

}
