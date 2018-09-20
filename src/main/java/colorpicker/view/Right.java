package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;


/**
 * Created by degonas on 20.09.2018.
 */
public class Right extends VBox implements ViewMixin {

    private RootPM pm;

    private Button darker;
    private Button brighter;

    public Right(RootPM pm){
        this.pm = pm;
        init();         //<--- do NOT forget this!
    }

    @Override
    public void initializeParts() {
        darker = new Button("Darker");
        brighter = new Button("Brighter");
    }

    @Override
    public void layoutParts() {
        getChildren().addAll(darker, brighter);
    }
}
