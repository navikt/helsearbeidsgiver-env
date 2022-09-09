package nav.helsearbeidsgiver.env;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EnvironmentValue {
    String name();
}