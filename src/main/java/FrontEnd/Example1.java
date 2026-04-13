

package FrontEnd;

import BackEnd.Amenities.*;
import BackEnd.Interfaces.Pricable;
import BackEnd.Rooms.*;
import BackEnd.ShoppingCart;
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
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
                "Kayaking Lake Superior",
                true,
                49.99,
                "You get tour guide to show you the best views along the Lake Superior.",
                "Lake Superior",
                "Medium",
                false
        );

        Kayaking kayakingSaintLouisRiver = new Kayaking(
                "Kayaking SaintLouis River",
                true,
                49.99,
                "You get tour guide to show you the best views along the Saint Louis River.",
                "Saint Louis River",
                "Hard",
                false
        );
        Skiing skiingSpiritMountain = new Skiing(
                "Skiing Spirit Mountain",
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

        //creating a list of all Rooms
        ArrayList<Room> listOfRooms = new ArrayList<>();

        //Creating the Room's that Exist in the Hotel
        //Junior Rooms
        for(int i = 1; i <= 25; i++ ) {
            listOfRooms.add(new JuniorSuite(
                    "Junior Suite",
                    100 + i,
                    149.99,
                    false,
                    false,
                    (int) Math.ceil((double) i /10)
            ));
        }
        //Executive Rooms
        for(int i = 1; i <= 10; i++ ) {
            boolean status = false;
            if (i % 2 == 0) {
                status = true;
            }
            listOfRooms.add(new ExecutiveSuite(
                    "Executive Suite",
                    200 + i,
                    449.99,
                    false,
                    false,
                    status,
                    (int) Math.ceil((double) i /5)
            ));
        }
        //Penthouse Rooms
        listOfRooms.add(new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2)
        );
        listOfRooms.add(new PenthouseSuite(
                "Penthouse Suite",
                302,
                749.99,
                false,
                false,
                false,
                true,
                2)
        );
        listOfRooms.add(new PenthouseSuite(
                "Penthouse Suite",
                303,
                749.99,
                false,
                false,
                true,
                false,
                3)
        );
        listOfRooms.add(new PenthouseSuite(
                "Penthouse Suite",
                304,
                749.99,
                false,
                false,
                false,
                true,
                3)
        );
        listOfRooms.add(new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                true,
                3)
        );
        //Conference Rooms
        for(int i = 6; i <= 10; i++ ) {
            boolean status = false;
            if (i % 2 == 0) {
                status = true;
            }
            listOfRooms.add(new ConferenceRoom(
                    "Conference Room",
                    300 + i,
                    74.99,
                    false,
                    false,
                    status
            ));
        }







        //creating a viewable list of amenities a customer can buy
        ListView<Amenity> listViewLeft = new ListView<>();
        ObservableList<Amenity> observableCatalog = listViewLeft.getItems();

        //Creating an observable shopping cart
        ListView<Pricable> listViewRight = new ListView<>();
        ObservableList<Pricable> observableCart = listViewRight.getItems();

        //Creating an observable List of Rooms a customer can select from
        ListView<Room> listViewRoom = new ListView<>();
        ObservableList<Room> observableRooms = listViewRoom.getItems();


        //adding items to the  Observable Catalog
        observableCatalog.add(dinner);
        observableCatalog.add(hikingLakeSuperior);
        observableCatalog.add(hikingGrandPortageTrail);
        observableCatalog.add(kayakingLakeSuperior);
        observableCatalog.add(kayakingSaintLouisRiver);
        observableCatalog.add(skiingSpiritMountain);
        observableCatalog.add(yourName);
        observableCatalog.add(avengersEndGame);

        //adding Items to the Observable List of Rooms
        observableRooms.addAll(listOfRooms);







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





        //title pane information
        Label programInformation = new Label("Welcome to the North Shore Hotel Reservation System");
        Label nameFieldTip = new Label("Enter your name in the textbox below.");
        Label dayFieldTip = new Label("Enter the number of Days you wish to stay");
        Label amenityListInformation = new Label("This is a list of amenities you can purchase.");
        Label cartListInformation = new Label("This is your shopping cart or list of items you wish to purchase.");
        Label emailFieldTip = new Label("Enter your Email in the textbox below.");
        Label phoneNumFieldTip = new Label("Enter your phone number in the textbox below.");


        //Text field pane information
        TextField userNameField = new TextField();
        userNameField.setPromptText("Enter your Name Here");

        TextField userEmailField = new TextField();
        userEmailField.setPromptText("Enter your Email Here");

        TextField userPhoneNumField = new TextField();
        userPhoneNumField.setPromptText("Enter your Phone Number Here");

        NumericTextField userDayField = new NumericTextField();
        userDayField.setPromptText("Enter Days Here");





//        //Button submit info
//        Button buttonOne = new Button("Submit");
//        buttonOne.setOnAction(event -> {
//            //Clearing the Canvas
//            graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
//            graphicsContext.setFill(Color.BEIGE);
//            graphicsContext.fillRect(0, 0, canvas.getWidth(), TextSize);
//
//            //Creating the Information unto the Canvas
//            String clientsName = userNameField.getText();
//            graphicsContext.setFont(new Font("Times New Romans", TextSize));
//            graphicsContext.setFill(Color.BLACK);
//            graphicsContext.fillText(clientsName + " You have been assigned to room num: " + randomNum(0, 100) +
//                            "\nYour stay starts: " + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + " Military Time" +
//                            "\n And ends on: " + dateTime(userMonthField.getIntValue(), userDayField.getIntValue()) + " Military Time"
//                    , 0, TextSize);
//        });

        //Clear button info
        Button clearCanvas = new Button("Clear");
        clearCanvas.setOnAction(event -> {
            //Clearing the Name Field
            userNameField.clear();
            userDayField.clear();
            //Clearing the Canvas
            graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            graphicsContext.setFill(Color.BEIGE);
            graphicsContext.fillRect(0, 0, canvas.getWidth(), TextSize);
        });

        //Close Application button info
        Button closeApplication = new Button("Close Application");
        closeApplication.setOnAction(event ->{stage.close();
        });

        //Add Item to Cart Button Info
        Button addToCartButtonAmenity = new Button("Add Selected Amenity to Cart");
        addToCartButtonAmenity.setOnAction(event -> {
            Amenity amenity = listViewLeft.getSelectionModel().getSelectedItem();
            if (amenity instanceof Pricable) {
                observableCart.add((Pricable) amenity);
            } else {
                System.out.println("Not a Pricable");
            }

        });

        //Add Item to Cart Button Info
        Button addToCartButtonRoom = new Button("Add Selected Room to Cart");
        addToCartButtonRoom.setOnAction(event -> {
            Room room = listViewRoom.getSelectionModel().getSelectedItem();
            if (room instanceof Pricable) {
                observableCart.add((Pricable) room);
            } else {
                System.out.println("Not a Pricable");
            }
        });

        //Remove Items from cart Button
        Button removeItemFromCart = new Button("Remove Selected Item");
        removeItemFromCart.setOnAction(actionEvent -> {
            int amenity = listViewRight.getSelectionModel().getSelectedIndex();
            observableCart.remove(amenity);
        });


        //Get total cost of Items in the viewable shopping cart button
        Button getCost = new Button ("Get Total");
        getCost.setOnAction(actionEvent -> {
            ShoppingCart cart = new ShoppingCart();
            for (Pricable itemsInCart: observableCart){
                cart.addItemToCart(itemsInCart);
            }
            System.out.println(cart.getTotalCostOfItems());
        });






        //adding objects to hBox center buttons
        HBox hBoxCenterButtons = new HBox(25);
//      hBox.getChildren().add(buttonOne);
        hBoxCenterButtons.getChildren().add(clearCanvas);
        hBoxCenterButtons.getChildren().add(getCost);
        hBoxCenterButtons.getChildren().add(closeApplication);


        //adding objects to center vbox
        VBox vBoxCenter = new VBox(10);
        vBoxCenter.getChildren().add(programInformation);

        vBoxCenter.getChildren().add(nameFieldTip);
        vBoxCenter.getChildren().add(userNameField);

        vBoxCenter.getChildren().add(emailFieldTip);
        vBoxCenter.getChildren().add(userEmailField);

        vBoxCenter.getChildren().add(phoneNumFieldTip);
        vBoxCenter.getChildren().add(userPhoneNumField);

        vBoxCenter.getChildren().add(dayFieldTip);
        vBoxCenter.getChildren().add(userDayField);

        vBoxCenter.getChildren().add(hBoxCenterButtons);

        //adding objects to hBox that is below the catalog
        HBox hBoxCartButtons = new HBox(25);
        hBoxCartButtons.getChildren().add(addToCartButtonAmenity);

        //adding object to vBox catalog
        VBox vBoxCatalog = new VBox(10);
        vBoxCatalog.getChildren().add(amenityListInformation);
        vBoxCatalog.getChildren().add(listViewLeft);
        vBoxCatalog.getChildren().add(hBoxCartButtons);
        vBoxCatalog.getChildren().add(listViewRoom);
        vBoxCatalog.getChildren().add(addToCartButtonRoom);


        //adding objects to an hBox that holds the buttons below the shopping cart
        HBox hBoxShoppingCartButtons = new HBox(25);
        hBoxShoppingCartButtons.getChildren().add(removeItemFromCart);

        //adding object to vbox cart
        VBox vBoxCart = new VBox(10);
        vBoxCart.getChildren().add(cartListInformation);
        vBoxCart.getChildren().add(listViewRight);
        vBoxCart.getChildren().add(hBoxShoppingCartButtons);


        //Adding objects to the BorderPane
//        borderPane.setTop(vBoxCenter);
        borderPane.setLeft(vBoxCatalog);
        borderPane.setCenter(vBoxCenter);
        borderPane.setRight(vBoxCart);
        borderPane.setBottom(canvas);


        //Adding objects to the group
        group.getChildren().add(borderPane);


        //Setting scene
        Scene scene = new Scene(group, 1200, 1080);
        scene.setFill(Color.BEIGE);







        //setting stage
        stage.setScene(scene);
        stage.setTitle("North Shore Hotel Reservation App");

        //Showing stage
        stage.show();

    }

}
