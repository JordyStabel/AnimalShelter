import Animals.Gender;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Button btn_AddAnimal;
    public TextField txt_BadHabits;
    public TextField txt_InputName;
    public RadioButton rb_Male;
    public RadioButton rb_Female;
    public ComboBox cb_Species;
    public ListView lv_Info;
    public TextField txt_DisplayName;
    public Button btn_ReserveAnimal;

    public Reservation reservation = new Reservation();

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Add(ActionEvent actionEvent) {

        int i = 0;

        if (rb_Female.isSelected()) { i = 1; }

        reservation.NewDog(txt_InputName.toString(), Gender.values()[i]);
    }
}