package colorpicker.view;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.geometry.Orientation;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;


public class Center extends VBox implements ViewMixin{

    private RootPM pm;

    private final ToggleGroup tg = new ToggleGroup();
    private RadioButton red;
    private RadioButton blue;
    private RadioButton green;
    private RadioButton yellow;
    private RadioButton cyan;
    private RadioButton orange;
    private RadioButton black;

    public Center(RootPM pm){
        this.pm = pm;
        init();         //<--- do NOT forget this!
    }

    @Override
    public void initializeSelf() {

    }

    @Override
    public void initializeParts() {
        red = new RadioButton("red");
        red.setToggleGroup(tg);

        blue = new RadioButton("blue");
        blue.setToggleGroup(tg);

        green = new RadioButton("green");
        green.setToggleGroup(tg);

        yellow = new RadioButton("yellow");
        yellow.setToggleGroup(tg);

        cyan = new RadioButton("cyan");
        cyan.setToggleGroup(tg);

        orange = new RadioButton("orange");
        orange.setToggleGroup(tg);

        black = new RadioButton("black");
        black.setToggleGroup(tg);
    }

    @Override
    public void layoutParts() {
        getChildren().addAll(red, blue, green, yellow, cyan, orange, black);
    }

    @Override
    public void setupBindings() {

    }

}
