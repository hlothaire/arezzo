package arezzo.model;

import arezzo.view.Observateur;
import javafx.scene.image.Image;
import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;


public class Arezzo {

    private Partition partition;

    private StringBuilder melodie;


    private ArrayList<Observateur> obs = new ArrayList<>(10);

    public Arezzo() throws MidiUnavailableException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        partition = new Partition(synthesizer);
        melodie = new StringBuilder();

    }

    public void close() {
        partition.close();
    }

    public Image getImage() {
        return partition.getImage();
    }

    public void play() {
        partition.play();
    }

    public void setInstruments(String instruments) {
        partition.setInstrument(instruments);
    }

    public void setMelodie(String m) {
        partition.setMelodie(m);
    }

    public void setMelodieNotationAbcComplete(String m) {
        partition.setMelodieNotationAbcComplete(m);
    }

    public void setPreferedMaxWidth(int w) {
        partition.setPreferedMaxWidth(w);
    }

    public void setTempo(int t) {
        partition.setTempo(t);
    }

    public void setTitre(String t) {
        partition.setTitre(t);
    }

    public void setVolume(double volume) {
        partition.setVolume(volume);
    }

    public void ajouterObservateur(Observateur o) {
        this.obs.add(o);
    }

    public void notifierObservateurs() {
        for (Observateur o : this.obs) o.reagir();
    }

    public void ajoutmelodie(String m) {
        this.melodie.append(m);
        this.setMelodie(melodie.toString());
        this.notifierObservateurs();
    }
}

