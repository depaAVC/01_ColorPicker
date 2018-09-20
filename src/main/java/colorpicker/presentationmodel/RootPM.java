package colorpicker.presentationmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by degonas on 20.09.2018.
 */
public class RootPM {
    private final StringProperty applicationTitle = new SimpleStringProperty("Color Picker");



    /********************* getters and setters ***********************/

    public StringProperty applicationTitleProperty() {
        return applicationTitle;
    }
}
