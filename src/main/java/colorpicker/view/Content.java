package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.geometry.Orientation;
import javafx.scene.control.SplitPane;


public class Content extends SplitPane implements ViewMixin{

    private RootPM pm;


    public Content(RootPM pm){
        this.pm = pm;
        init();         //<--- do NOT forget this!
    }

    @Override
    public void initializeSelf() {
        this.setOrientation(Orientation.HORIZONTAL);
        this.setDividerPositions(0.3);
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
