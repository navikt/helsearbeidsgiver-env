package no.nav.helsearbeidsgiver.env;

import java.lang.reflect.Field;

public class Environment {

    public Environment() {
        this.injectIt();
    }

    private void injectIt() {
        for (Field f : this.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            if (f.isAnnotationPresent(EnvironmentValue.class)){
                String name = f.getAnnotation(EnvironmentValue.class).name();
                String value = System.getenv(name);
                if (f.getType() == String.class) {
                    try {
                        f.set(this, value);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
