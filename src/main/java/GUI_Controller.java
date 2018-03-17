import Animals.Animal;
import Animals.Gender;
import Animals.Reservor;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

public class GUI_Controller implements Initializable{

    public Button btn_AddAnimal;
    public TextField txt_BadHabits;
    public RadioButton rb_Male;
    public RadioButton rb_Female;
    public TextField txt_InputName;
    public ComboBox cb_Species;
    public ListView lv_Info;
    public TextField txt_DisplayName;
    public Button btn_ReserveAnimal;

    Reservation reservation = new Reservation();

    public GUI_Controller() {
        reservation.addObserver(new Observer() {
            public void update(Observable o, Object arg) {
            lv_Info.getItems().clear();
                for (Animal animal : reservation.GetAnimals())
                {
                    lv_Info.getItems().add(animal.getName());
                }
            }
        });
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    private void RefreshControls()
    {
        lv_Info.getItems().clear();
        for (Animal animal : reservation.Animals)
        {
            lv_Info.getItems().add(animal);
        }
        //btn_ReserveAnimal.setDisable(lv_Info.getItems() != null);
    }

    public void Add(ActionEvent actionEvent) {

        Gender gender = rb_Male.isSelected() ? Gender.Male : Gender.Female;

        if (cb_Species.getValue().equals("Cat"))
        {
            reservation.NewCat(txt_InputName.textProperty().get(), gender, txt_BadHabits.getText());
        }
        else if (cb_Species.getValue().equals("Dog"))
        {
            reservation.NewDog(txt_InputName.getText(), gender);
        }
        RefreshControls();
    }

    public void Changed(ActionEvent actionEvent) {
        txt_BadHabits.setDisable(cb_Species.getValue().equals("Dog"));
    }

    public void Reserve(ActionEvent actionEvent) {
        Animal animal = (Animal)lv_Info.getSelectionModel().getSelectedItem();

        if (animal != null)
        {
            animal.ReservedBy = new Reservor(txt_DisplayName.getText(), new Date());
            this.RefreshControls();
        }
    }
}