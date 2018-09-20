package colorpicker;

import colorpicker.presentationmodel.RootPM;
import colorpicker.view.RootPane;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		RootPM pm = new RootPM();

		Parent rootPanel = new RootPane(pm);

		Scene scene = new Scene(rootPanel);

		primaryStage.titleProperty().bind(pm.applicationTitleProperty());
		primaryStage.setScene(scene);
		primaryStage.setWidth(1600);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
