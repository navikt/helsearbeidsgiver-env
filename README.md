# Environment

Et mikro API for å hente ut miljøvariabler til bruk for
innstillinger istedenfor store dependency injection APIer.


## Konfigurasjon 
Slik setter konfigurerer du klassen med dine innstillinger som
peker til miljøvariabler:

    public class Settings {
    
        @EnvironmentValue(name ="JAVA_HOME")
        String javaHome;
    
    }

## Hente

Slik henter du ut utfylte verdier fra miljø

    DemoSettings object = Environment.read(DemoSettings.class);