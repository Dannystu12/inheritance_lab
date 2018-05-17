
import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void before(){
        director = new Director("Dave", "JWC 12 32 54", 10.00, "Nike", 100);
    }

    @Test
    public void hasBudget(){
        assertEquals(100,director.getBudget(), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("Dave",director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JWC 12 32 54",director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(10.00,director.getSalary(),0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Nike",director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(02.00);
        assertEquals(12.00,director.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        double bonus = director.payBonus();
        assertEquals(0.10, bonus, 0.01);
    }

}
