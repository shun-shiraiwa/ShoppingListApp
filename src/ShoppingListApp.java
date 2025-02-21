import constants.MainUIConstants;
import javafx.application.Application;
import javafx.stage.Stage;

public class ShoppingListApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// ウィンドウの初期設定
		primaryStage.setTitle(MainUIConstants.APP_TITLE);
		primaryStage.setHeight(MainUIConstants.WINDOW_HEIGHT);
		primaryStage.setWidth(MainUIConstants.WINDOW_WIDTH);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
