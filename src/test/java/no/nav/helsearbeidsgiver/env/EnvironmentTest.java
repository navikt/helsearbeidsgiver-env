package no.nav.helsearbeidsgiver.env;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EnvironmentTest {

    @Test
    public void readConstructor() {
        DemoSettings object = new DemoSettings();
        assertNotNull(object.javaHome);
    }

}