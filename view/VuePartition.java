package arezzo.view;

import arezzo.model.Arezzo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;


public class VuePartition implements Observateur{

    private Arezzo arezzo;

    @FXML
    private ImageView box;

    @FXML
    private Button button;


    public VuePartition(Arezzo arezzo){
        this.arezzo = arezzo;
        this.arezzo.ajouterObservateur(this);
        this.box = new ImageView();

    }

    public void setImageBox(){
        this.box.setImage(this.arezzo.getImage());
    }


    @Override
    public void reagir() {
        this.setImageBox();
    }
}
