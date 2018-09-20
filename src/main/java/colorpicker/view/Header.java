package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;


/**
 * Created by Degonas on 29.04.2017.
 */
public class Header extends ToolBar implements ViewMixin{

    private Button file;
    private Button attributes;

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
        file = new Button("File");
        attributes = new Button("Attributes");
    }

    @Override
    public void layoutParts() {
        getItems().addAll(file, attributes);
    }

    @Override
    public void addEventHandlers() {

    }

    @Override
    public void addValueChangedListeners() {

    }
}
