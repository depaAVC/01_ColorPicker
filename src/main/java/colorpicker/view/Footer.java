package colorpicker.view;


import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.scene.layout.VBox;

/**
 * Created by Degonas on 29.04.2017.
 */
public class Footer extends VBox implements ViewMixin {

    private final RootPM pm;

    public Footer(RootPM pm){
        this.pm = pm;
        init();
    }

    @Override
    public void initializeSelf() {

    }

    @Override
    public void initializeParts() {

    }

    @Override
    public void layoutParts() {

    }

    @Override
    public void setupBindings() {

    }
}
