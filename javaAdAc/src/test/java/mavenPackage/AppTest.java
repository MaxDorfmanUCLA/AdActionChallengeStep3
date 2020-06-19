package mavenPackage;

import mavenPackage.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for App.
 */
class AppTest {
    @Test
    void testApp() {
        int result[] = App.outputRange(1,20);
        int expected[] = {4,3,1,2,10};
        assertArrayEquals( expected, result );
    }
}
