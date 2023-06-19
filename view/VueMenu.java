package arezzo.view;

import arezzo.model.Arezzo;
import com.sun.media.jfxmediaimpl.platform.Platform;

public class VueMenu implements Observateur{

    private Arezzo arezzo;

    public VueMenu(Arezzo arezzo){
        this.arezzo = arezzo;
        this.arezzo.ajouterObservateur(this);
    }
    public void reagir(){}

    public void quitter(){
        System.exit(0);
    }

    public void nouveau(){
        this.arezzo.setMelodie("");
        this.arezzo.notifierObservateurs();
    }
}
