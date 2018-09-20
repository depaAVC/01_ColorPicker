package colorpicker.view;


import colorpicker.presentationmodel.RootPM;
import colorpicker.view.util.ViewMixin;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by Degonas on 29.04.2017.
 */
public class Footer extends VBox implements ViewMixin {

    private final RootPM pm;

    //intermediate panes
    private HBox row1;
    private HBox row2;
    private HBox row3;

    //sliders
    private ScrollBar redSlider;
    private ScrollBar greenSlider;
    private ScrollBar blueSlider;

    //textfields

    public Footer(RootPM pm){
        this.pm = pm;
        init();
    }

    @Override
    public void initializeSelf() {
        setPadding(new Insets(5));
    }

    @Override
    public void initializeParts() {
        row1 = new HBox();
        row2 = new HBox();
        row3 = new HBox();

        redSlider = new ScrollBar();
        redSlider.setMin(0);
        redSlider.setMax(255);
        redSlider.setUnitIncrement(25);
        redSlider.setStyle("-fx-background-color: red;");
        redSlider.setPrefWidth(250);

        greenSlider = new ScrollBar();
        greenSlider.setMin(0);
        greenSlider.setMax(255);
        greenSlider.setUnitIncrement(25);
        greenSlider.setStyle("-fx-background-color: green;");
        greenSlider.setPrefWidth(250);

        blueSlider = new ScrollBar();
        blueSlider.setMin(0);
        blueSlider.setMax(255);
        blueSlider.setUnitIncrement(25);
        blueSlider.setStyle("-fx-background-color: blue;");
        blueSlider.setPrefWidth(250);
    }

    @Override
    public void layoutParts() {
        getChildren().addAll(row1, row2, row3);

        row1.getChildren().addAll(redSlider);
        row2.getChildren().addAll(greenSlider);
        row3.getChildren().addAll(blueSlider);
    }

    @Override
    public void setupBindings() {

    }
}
