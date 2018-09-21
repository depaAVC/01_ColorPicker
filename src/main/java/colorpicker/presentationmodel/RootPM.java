package colorpicker.presentationmodel;

import javafx.beans.property.*;
import javafx.scene.paint.Color;

/**
 * Created by degonas on 20.09.2018.
 */
public class RootPM {
    private final StringProperty applicationTitle = new SimpleStringProperty("Color Picker");




    private final IntegerProperty red = new SimpleIntegerProperty(155);
    private final IntegerProperty green = new SimpleIntegerProperty(211);
    private final IntegerProperty blue = new SimpleIntegerProperty(0);

    private final ObjectProperty<Color> color = new SimpleObjectProperty<>( Color.rgb(getRed(), getGreen(), getBlue()) );


    /************************** Constructors **************************/

    public RootPM() {
        addValueChangeListener();
    }

    private void addValueChangeListener() {
        redProperty().addListener( (observable, oldValue, newValue) -> {
            setColor( Color.rgb(getRed(), getGreen(), getBlue()) );
        });

        greenProperty().addListener( (observable, oldValue, newValue) -> {
            setColor( Color.rgb(getRed(), getGreen(), getBlue()) );
        });

        blueProperty().addListener( (observable, oldValue, newValue) -> {
            setColor( Color.rgb(getRed(), getGreen(), getBlue()) );
        });
    }


    /********************* getters and setters ***********************/

    public StringProperty applicationTitleProperty() {
        return applicationTitle;
    }

    public int getRed() {
        return red.get();
    }

    public IntegerProperty redProperty() {
        return red;
    }

    public void setRed(int red) {
        this.red.set(red);
    }

    public int getGreen() {
        return green.get();
    }

    public IntegerProperty greenProperty() {
        return green;
    }

    public void setGreen(int green) {
        this.green.set(green);
    }

    public int getBlue() {
        return blue.get();
    }

    public IntegerProperty blueProperty() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue.set(blue);
    }

    public Color getColor() {
        return color.get();
    }

    public ObjectProperty<Color> colorProperty() {
        return color;
    }

    public void setColor(Color color) {
        this.color.set(color);
    }
}
