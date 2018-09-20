package colorpicker.view;

import colorpicker.view.util.ViewMixin;
import javafx.scene.layout.BorderPane;

import colorpicker.presentationmodel.RootPM;

public class RootPane extends BorderPane implements ViewMixin{
    private final RootPM pm;

    private Header menuBar;             // ToolBar
    private Content mainSplitPane;      // Ist die SplitPane :)
    private Footer continentsInfo;      // TableView

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
        mainSplitPane = new Content(pm);    // pm übergeben, damit Binding möglich wird
        continentsInfo = new Footer(pm);    // == table = new TableView();
    }

    @Override
    public void layoutParts() {
        setTop(menuBar);
        setCenter(mainSplitPane);
        setBottom(continentsInfo);
    }
}
