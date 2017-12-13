package notePad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    private final Object sync = new Object();

    private Event event;

    public Event getEvent() {
        if(event == null)
            synchronized (sync) {
            if(event == null)
                return event = new Event();
            }
        return event;
    }

    @FXML
    public Button button;
    public TextField inputFileName;
    public ListView<String> listView;

    public void openFileButton(ActionEvent actionEvent) {
        event = getEvent();
        event.setFileName(inputFileName.getText());

        event.getFileContains().clear();

        event.eventMain();

        ObservableList<String> items = FXCollections.observableArrayList(event.getFileContains());
        listView.setItems(items);

    }

    public void getFileName(ActionEvent actionEvent) {

    }
}
