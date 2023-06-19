package arezzo.view;

import arezzo.model.Arezzo;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;


public class VueClavier implements Observateur{
    private Arezzo arezzo;
    private boolean medium = true;
    private boolean grave = false;
    private boolean aigu = false;
    private boolean croche = false;
    private boolean ronde = false;
    private boolean blanche = false;
    private boolean noire = true;

    public VueClavier(Arezzo arezzo){
        this.arezzo = arezzo;
        this.arezzo.ajouterObservateur(this);


    }

    public void toucheDo(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("C,");
        if(medium) sb.append("C");
        if(aigu) sb.append("c");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }


    public void toucheRe(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("D,");
        if(medium) sb.append("D");
        if(aigu) sb.append("d");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }

    public void toucheMi(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("E,");
        if(medium) sb.append("E");
        if(aigu) sb.append("e");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }

    public void toucheFa(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("F,");
        if(medium) sb.append("F");
        if(aigu) sb.append("f");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }

    public void toucheSol(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("G,");
        if(medium) sb.append("G");
        if(aigu) sb.append("g");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }
    public void toucheLa(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("A,");
        if(medium) sb.append("A");
        if(aigu) sb.append("a");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }

    public void toucheSi(){
        StringBuilder sb = new StringBuilder();
        if(grave)sb.append("B,");
        if(medium) sb.append("B");
        if(aigu) sb.append("b");
        if(croche) sb.append("/");
        if(blanche) sb.append("2");
        if(ronde) sb.append("4 |");
        sb.append(" ");
        this.arezzo.ajoutmelodie(sb.toString());
    }

    public void toucheDodiese(){
        this.arezzo.ajoutmelodie("^C ");
    }

    public void toucheRediese(){
        this.arezzo.ajoutmelodie("^D ");
    }

    public void toucheFadiese(){
        this.arezzo.ajoutmelodie("^F ");
    }

    public void toucheSoldiese(){
        this.arezzo.ajoutmelodie("^G ");
    }

    public void toucheLadiese(){
        this.arezzo.ajoutmelodie("^A ");
    }
    public void reagir(){

    }

    public void estmedium(){
        this.medium = !medium;

    }

    public void estgrave(){
        this.grave = !grave;

    }

    public void estaigu(){
        this.aigu = !aigu;

    }

    public void estronde(){
        this.ronde = !ronde;

    }

    public void estcroche(){
        this.croche = !croche;

    }

    public void estblanche(){
        this.blanche = !blanche;

    }

    public void estnoire(){
        this.noire = !noire;

    }

}
