package nav.helsearbeidsgiver.env;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EnvironmentTest {

    @Test
    public void shouldRead() {
        DemoSettings object = Environment.read(DemoSettings.class);
        assertNotNull(object.javaHome);
    }

}