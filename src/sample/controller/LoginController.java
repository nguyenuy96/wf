package sample.controller;

import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import sample.dao.JdbcDao;

public class LoginController {
    @FXML
    public TextField userName;
    @FXML
    public PasswordField password;
    @FXML
    public Button loginButton;

    JdbcDao jdbcDao = new JdbcDao();

    @FXML
    public void onClickLogin(ActionEvent event) throws IOException, SQLException {
//        jdbcDao.getConnection();
//        Window owner = loginButton.getScene().getWindow();
//        if (userName.getText().isEmpty()) {
//            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter your name");
//            return;
//        }
//
//        if (password.getText().isEmpty()) {
//            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter your password");
//            return;
//        }


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxml/main-screen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("ABC");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}
