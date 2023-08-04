package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Formulageneral d;

    @BeforeAll public static void setUp() {
        d = new Formulageneral();
    }

    @Test public void testraiz1() {
        assertTrue(d.raiz1(1,-4,3)==3);
    }

    @Test public void testraiz2() {
        assertTrue(d.raiz2(1,-4,3)==1);
    }

}