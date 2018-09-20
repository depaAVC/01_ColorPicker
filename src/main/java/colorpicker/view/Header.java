package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;


/**
 * Created by Degonas on 29.04.2017.
 */
public class Header extends ToolBar implements ViewMixin{



    private final RootPM pm;

    public Header(RootPM pm){
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
    public void addEventHandlers() {

    }

    @Override
    public void addValueChangedListeners() {

    }
}
