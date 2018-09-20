package colorpicker.view;

import colorpicker.view.util.ViewMixin;
import javafx.scene.layout.BorderPane;

import colorpicker.presentationmodel.RootPM;

public class RootPane extends BorderPane implements ViewMixin{
    private final RootPM pm;

    private Header menuBar;             // ToolBar
    private Left colorPreview;
    private Center radioSelector;
    private Right buttons;
    private Footer colorChooser;

    public RootPane(RootPM model) {
        this.pm = model;
        init();
    }

    @Override
    public void initializeSelf() {

    }

    @Override
    public void initializeParts() {
        menuBar = new Header(pm);           // pm übergeben, damit Binding möglich wird
        colorPreview = new Left(pm);
        radioSelector = new Center(pm);    // pm übergeben, damit Binding möglich wird
        buttons = new Right(pm);
        colorChooser = new Footer(pm);    // == table = new TableView();
    }

    @Override
    public void layoutParts() {
        setTop(menuBar);
        setLeft(colorPreview);
        setCenter(radioSelector);
        setRight(buttons);
        setBottom(colorChooser);
    }
}
