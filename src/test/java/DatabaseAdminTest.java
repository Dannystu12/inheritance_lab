import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;


    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dave", "JWC 12 32 54", 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dave",databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JWC 12 32 54",databaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(10.00,databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(02.00);
        assertEquals(12.00,databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        double bonus = databaseAdmin.payBonus();
        assertEquals(0.10, bonus, 0.01);
    }

}