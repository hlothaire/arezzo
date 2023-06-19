package arezzo.view;

import arezzo.model.Arezzo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class VuepanneauControle implements Observateur{

    private Arezzo arezzo;

    @FXML
    private Slider volume;

    @FXML
    private Slider tempo;

    @FXML
    private Button play;

    @FXML
    private boolean piano = true;

    @FXML
    private boolean guitare = false;

    @FXML
    private boolean saxophone = false;

    @FXML
    private boolean trompette = false;

    public VuepanneauControle(Arezzo arezzo){
        this.arezzo =arezzo;
        this.arezzo.ajouterObservateur(this);
        this.volume = new Slider();
        this.tempo = new Slider();
        this.arezzo.setVolume(this.getVolume());


    }
    public void reagir(){
    }

    public double getVolume() {
        return this.volume.getValue();
    }

    public int getTempo(){
        return (int) this.tempo.getValue();
    }

    public void VolumeController(){
        this.arezzo.setVolume(this.getVolume());
    }

    public void TempoController(){
        this.arezzo.setTempo(this.getTempo());
    }


    public void jouermelodie(){
        this.arezzo.play();
    }

    public void estpiano(){
        this.piano = !piano;
        this.changerinstrument();
    }

    public void estguitare(){
        this.guitare = !guitare;
        this.changerinstrument();
    }

    public void estsaxo(){
        this.saxophone = !saxophone;
        this.changerinstrument();
    }

    public void esttrompette(){
        this.trompette = !trompette;
        this.changerinstrument();
    }

    public void changerinstrument() {
        if (piano) this.arezzo.setInstruments("Piano");
        if (guitare) this.arezzo.setInstruments("Guitare");
        if (saxophone) this.arezzo.setInstruments("Saxophone");
        if (trompette) this.arezzo.setInstruments("Trompette");
    }
}
