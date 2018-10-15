import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DrawLinesViewController implements Initializable {

    @FXML
    private Canvas canvas;

    @FXML
    private ImageView lPatternImageView;

    @FXML
    private ImageView footballPatternImageView;

    @FXML
    private ImageView threeQuartersImageView;

    @FXML
    private ImageView fullImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lPatternImageView.setImage(new Image("L-pattern.png"));
        footballPatternImageView.setImage(new Image("footballPattern.png"));
        threeQuartersImageView.setImage(new Image("3Quarters.png"));
        fullImageView.setImage(new Image("full.png"));
    }

    @FXML
    public void drawXButtonPressed()
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();

        //draw line from top corner to bottom corner
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

        //draw line from bottom left corner to upper right corner
        gc.strokeLine(0, canvas.getHeight(), canvas.getWidth(), 0);
    }

    @FXML
    public void drawLPatternButtonPressed()
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
    }

    @FXML
    public void footballPatternButtonPressed()
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
    }

    @FXML
    public void threeQuartersPatternButtonPressed()
    {
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
    }

    @FXML
    public void fullPatternButtonPressed()
    {
        //get the GraphicsContent, which is used to draw on the canvas
        GraphicsContext gc = clearCanvasAndGetGraphicsContext();
    }

    public GraphicsContext clearCanvasAndGetGraphicsContext()
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //clear the canvas
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        return gc;
    }
}
