package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by degonas on 20.09.2018.
 */
public class Left extends VBox implements ViewMixin {

    private RootPM pm;
    Rectangle colorPreview;

    public Left(RootPM pm){
        this.pm = pm;
        init();         //<--- do NOT forget this!
    }

    @Override
    public void initializeSelf() {
        setPadding(new Insets(5));
    }

    @Override
    public void initializeParts() {
        colorPreview = new Rectangle(250, 250);
        colorPreview.setFill( pm.getColor() );
    }

    @Override
    public void layoutParts() {
        getChildren().addAll(colorPreview);
    }

    @Override
    public void setupBindings() {
        colorPreview.fillProperty().bind( pm.colorProperty() );
    }
}
