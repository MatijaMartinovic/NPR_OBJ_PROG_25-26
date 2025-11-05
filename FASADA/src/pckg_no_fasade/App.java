package pckg_no_fasade;

public class App {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        Player player = new Player();
        HomeTheatre homeTheatre = new HomeTheatre(amp, player, lights, screen, projector);
        homeTheatre.projectorOn();
        homeTheatre.turnOnPlayer();
        homeTheatre.turnOnAmplifier();
        homeTheatre.pullDownScreen();
        homeTheatre.turnLightsOff();
        // some time after
        homeTheatre.turnLightsOn();
        homeTheatre.projectorOff();
        homeTheatre.turnOffPlayer();
        homeTheatre.turnOffAmplifier();
        homeTheatre.pullUpScreen();
    }
}
