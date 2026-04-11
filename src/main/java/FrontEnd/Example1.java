

package FrontEnd;

import BackEnd.Amenities.*;
import BackEnd.Catalog;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.time.LocalDateTime;


public class Example1 extends Application {
    /**
     * Giving a random integer
     *
     * @param min min value you wish to have
     * @param max Max value you wish to have
     * @return a random integer given a range of min and max
     */
    public int randomNum(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is larger than max");
        }

        Random random = new Random();
        return random.nextInt(min, max);
    }


    /**
     * Gives the stay duration time
     *
     * @param month Month you wish to stay until
     * @param day   Day you wish to stay until
     * @return Gives the time for 2026
     */
    public LocalDateTime dateTime(int month, int day) {
        LocalDate currentDate = LocalDate.of(2026, month, day);
        LocalTime endTime = LocalTime.of(6, 0);

        return LocalDateTime.of(currentDate, endTime);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Catalog catalog = new Catalog();
        catalog.populateCatalog();



        //creating a list of amenities that customers can buy from
        Dinning dinner = new Dinning(
                "Dinning",
                true,
                19.99,
                "A delicious meal fit for a king.",
                "Dinner",
                false);

        Hiking hikingLakeSuperior = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        Hiking hikingGrandPortageTrail = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along the Grand Portage Trail.",
                "inland",
                "Grand Portage Trail",
                2);

        Kayaking kayakingLakeSuperior = new Kayaking(
                "Kayaking",
                true,
                49.99,
                "You get tour guide to show you the best views along the Lake Superior.",
                "Lake Superior",
                "Medium",
                false
        );

        Kayaking kayakingSaintLouisRiver = new Kayaking(
                "Kayaking",
                true,
                49.99,
                "You get tour guide to show you the best views along the Saint Louis River.",
                "Saint Louis River",
                "Hard",
                false
        );
        Skiing skiingSpiritMountain = new Skiing(
                "Skiing",
                true,
                49.99,
                "You go on a skiing on Spirit Mountain.",
                "Spirit Mountain",
                "Medium",
                false
        );

        Movie yourName = new Movie(
                "Movie",
                true,
                4.99,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min"
        );

        Movie avengersEndGame = new Movie(
                "Movie",
                true,
                4.99,
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                "Avengers End Game",
                "3 hours 1 min"
        );

        //creating a viewable list for the panel
        ListView<Amenity> listViewLeft = new ListView<>();
        ObservableList<Amenity> items = listViewLeft.getItems();

        //adding items to the viewable list
        items.add(dinner);
        items.add(hikingLakeSuperior);
        items.add(hikingGrandPortageTrail);
        items.add(kayakingLakeSuperior);
        items.add(kayakingSaintLouisRiver);
        items.add(skiingSpiritMountain);
        items.add(yourName);
        items.add(avengersEndGame);




        listViewLeft.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Item Selected: " + newValue);
            int selectedIndex = listViewLeft.getSelectionModel().getSelectedIndex();
            System.out.println("Index of the Item Selected: " + selectedIndex);
        });

        ListView<Amenity> listViewRight = new ListView<>();

        ObservableList<Amenity> cart = listViewRight.getItems();


        listViewRight.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Item Selected: " + newValue);
            int selectedIndex = listViewRight.getSelectionModel().getSelectedIndex();
            System.out.println("Index of the Item Selected: " + selectedIndex);
        });



        //Creating variables that will be used
        int TextSize = 16;


        //Creating the borderPane
        BorderPane borderPane = new BorderPane();

        //Creating a group for all the children of pane
        Group group = new Group();

        //Canvas of the UI
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();


        //Drawing a rectangle on the canvas
        graphicsContext.setFill(Color.BEIGE);
        graphicsContext.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());


        //Creating pane of vbox
        VBox vBoxCenter = new VBox(10);
        VBox vBoxCatalog = new VBox(10);
        VBox vBoxCart = new VBox(10);

        //Creating pane of Hbox
        HBox hBox = new HBox(25);


        //title pane information
        Label programInformation = new Label("Welcome to the North Shore Hotel Reservation System");
        Label nameFieldTip = new Label("Enter your name in the textbox below.");
        Label dayFieldTip = new Label("Enter the day you wish to start your below (Number between 1-31, changes based on month)");
        Label amenityListInformation = new Label("This is a list of amenities you can purchase.");
        Label cartListInformation = new Label("This is your shopping cart or list of items you wish to purcahse.");


        //Text field pane information
        TextField userNameField = new TextField();
        userNameField.setPromptText("Enter your Name Here");

        NumericTextField userDayField = new NumericTextField();
        userDayField.setPromptText("Enter Day Here");

        NumericTextField userMonthField = new NumericTextField();
        userMonthField.setPromptText("Enter Month Here");


        //Button submit info
        Button buttonOne = new Button("Submit");
        buttonOne.setOnAction(event -> {
            //Clearing the Canvas
            graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            graphicsContext.setFill(Color.BEIGE);
            graphicsContext.fillRect(0, 0, canvas.getWidth(), TextSize);

            //Creating the Information unto the Canvas
            String clientsName = userNameField.getText();
            graphicsContext.setFont(new Font("Times New Romans", TextSize));
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillText(clientsName + " You have been assigned to room num: " + randomNum(0, 100) +
                            "\nYour stay starts: " + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + " Military Time" +
                            "\n And ends on: " + dateTime(userMonthField.getIntValue(), userDayField.getIntValue()) + " Military Time"
                    , 0, TextSize);
        });

        //Clear button info
        Button buttonTwo = new Button("Clear");
        buttonTwo.setOnAction(event -> {
            //Clearing the Name Field
            userNameField.clear();
            userMonthField.clear();
            userDayField.clear();
            //Clearing the Canvas
            graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            graphicsContext.setFill(Color.BEIGE);
            graphicsContext.fillRect(0, 0, canvas.getWidth(), TextSize);
        });

        //Close Application button info
        Button buttonThree = new Button("Close Application");
        buttonThree.setOnAction(event ->{stage.close();
        });


        //adding objects to Hbox
        hBox.getChildren().add(buttonOne);
        hBox.getChildren().add(buttonTwo);
        hBox.getChildren().add(buttonThree);


        //adding objects to vbox
        vBoxCenter.getChildren().add(programInformation);
        vBoxCenter.getChildren().add(nameFieldTip);
        vBoxCenter.getChildren().add(userNameField);
        vBoxCenter.getChildren().add(dayFieldTip);
        vBoxCenter.getChildren().add(userDayField);

        //adding object to vBox catalog
        vBoxCatalog.getChildren().add(amenityListInformation);
        vBoxCatalog.getChildren().add(listViewLeft);

        //adding object to vbox cart
        vBoxCart.getChildren().add(cartListInformation);
        vBoxCart.getChildren().add(listViewRight);

        //Adding objects to the BorderPane
        borderPane.setTop(vBoxCenter);
        borderPane.setBottom(canvas);
        borderPane.setCenter(hBox);
        borderPane.setLeft(vBoxCatalog);
        borderPane.setRight(vBoxCart);



        //Adding objects to the group
        group.getChildren().add(borderPane);


        //Setting scene
        Scene scene = new Scene(group, 800, 600);
        scene.setFill(Color.BEIGE);







        //setting stage
        stage.setScene(scene);
        stage.setTitle("Bedroom Assigner");

        //Showing stage
        stage.show();

    }

}
