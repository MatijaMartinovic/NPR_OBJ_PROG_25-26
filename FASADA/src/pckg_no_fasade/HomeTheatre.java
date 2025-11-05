package pckg_no_fasade;

public class HomeTheatre {

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;


    public HomeTheatre(Amplifier amp, Player player, Lights lights, Screen scr, Projector pro){
        this.amplifier = amp;
        this.lights = lights;
        this.player = player;
        this.screen = scr;
        this.projector = pro;
    }

    public void turnLightsOn(){
        lights.turnOnLights();
    }

    public void turnLightsOff(){
        lights.turnOffLights();
    }

    public void turnOnPlayer(){
        player.turnOnPlayer();
    }

    public void turnOffPlayer(){
        player.turnOffPlayer();
    }

    public void turnOnAmplifier(){
        amplifier.turnOnAmp();
    }

    public void turnOffAmplifier(){
        amplifier.turnOffAmp();
    }

    public void pullUpScreen(){
        screen.pullUpScreen();
    }

    public void pullDownScreen(){
        screen.pullDownSceen();
    }

    public void projectorOn(){
        projector.turnOnProjector();
    }

    public void projectorOff(){
        projector.turnOffProjector();
    }
}
