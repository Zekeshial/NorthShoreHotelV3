

package FrontEnd;

import BackEnd.Amenities.*;
import BackEnd.Client;
import BackEnd.DataManagment.DataFileWriter;
import BackEnd.Interfaces.Pricable;
import BackEnd.Reservations.Reservation;
import BackEnd.Rooms.*;
import BackEnd.ShoppingCart;
import BackEnd.Utilities.Maintenance;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class MainPage extends Application {



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



        //Creating the borderPane
        BorderPane borderPane = new BorderPane();

        //Creating a group for all the children of pane
        Group group = new Group();


        //Creating a Vbox to Hold the Receipt
        VBox vBoxReceipt = new VBox(0);
        VBox vBoxProgramOutputInfo = new VBox(0);




        //title pane information
        Label programWelcomeMessage = new Label("Welcome to the North Shore Hotel Reservation System");

        Label amenityListInformation = new Label("This is a list of amenities you can purchase.");
        Label cartListInformation = new Label("This is your shopping cart or list of items you wish to purchase.");
        Label roomListInformation = new Label("This is a list of rooms available to be reserved.");

        Label nameFieldTip = new Label("Enter your name in the textbox below.");
        Label dayFieldTip = new Label("Enter the number of Days you wish to stay");
        Label emailFieldTip = new Label("Enter your Email in the textbox below.");
        Label phoneNumFieldTip = new Label("Enter your phone number in the textbox below.");
        Text programOutputInfoTextTip = new Text("The area below will give information if you do something wrong or correct in the program.");
        Label maintenanceRequestFieldTip = new Label("Enter the description of the maintenance you want done on your room below.");




        //Text field pane information
        TextField userNameField = new TextField();
        userNameField.setPromptText("Enter your Name Here");

        TextField userEmailField = new TextField();
        userEmailField.setPromptText("Enter your Email Here");

        TextField userPhoneNumField = new TextField();
        userPhoneNumField.setPromptText("Enter your Phone Number Here");

        NumericTextField userDayField = new NumericTextField();
        userDayField.setPromptText("Enter Days Here");

        TextField userMaintenanceRequest = new TextField();
        userMaintenanceRequest.setPromptText("Enter the description of Your Request Here");

        Text programOutputInformationTextField = new Text();
        programOutputInformationTextField.setWrappingWidth(300);



        //Clear button info
        Button clearInfo = new Button("Clear");
        clearInfo.setOnAction(event -> {
            //Clearing Fields
            userNameField.clear();
            userDayField.clear();
            userEmailField.clear();
            userPhoneNumField.clear();
            //Clearing vBoxOutPuts
            vBoxProgramOutputInfo.getChildren().clear();
            vBoxReceipt.getChildren().clear();
        });

        //Close Application button info
        Button closeApplication = new Button("Close Application");
        closeApplication.setOnAction(event ->{stage.close();
        });

        //Add Amenity to Cart Button Info
        Button addToCartButtonAmenity = new Button("Add Selected Amenity to Cart");
        addToCartButtonAmenity.setOnAction(event -> {
            Amenity amenity = listViewLeft.getSelectionModel().getSelectedItem();
            if (amenity instanceof Pricable) {
                observableCart.add((Pricable) amenity);
            } else {
                vBoxProgramOutputInfo.getChildren().clear();
                programOutputInformationTextField.setText("The item selected is not an Pricable Item.");
            }

        });

        //Add Room to Cart Button Info
        Button addToCartButtonRoom = new Button("Add Selected Room to Cart");
        addToCartButtonRoom.setOnAction(event -> {
            Room selectedRoom = listViewRoom.getSelectionModel().getSelectedItem();
            boolean observableRoomStatus = true;
            //Checking to see if a room has already been added to the cart
            for (Pricable roomsInList: observableCart){
                if (roomsInList instanceof Room) {
                    observableRoomStatus = false;
                    break;
                }
            }
            if (selectedRoom instanceof Pricable && observableRoomStatus) {
                observableCart.add((Pricable) selectedRoom);
            } else if (selectedRoom == null) {
                vBoxProgramOutputInfo.getChildren().clear();
                programOutputInformationTextField.setText("You haven't selected a Room. Please select a room first before trying to add one.");
                vBoxProgramOutputInfo.getChildren().add(programOutputInformationTextField);
            } else {
                vBoxProgramOutputInfo.getChildren().clear();
                programOutputInformationTextField.setText("You have already selected a room to stay in. " +
                        "To select a different one first remove the selected room and then add a new room.");
                vBoxProgramOutputInfo.getChildren().add(programOutputInformationTextField);

                //Code needs to be looked at
//                try (ScheduledExecutorService service = Executors.newScheduledThreadPool(1)) {
//                    service.schedule(() -> {
//                        vBoxProgramOutputInfo.getChildren().clear();
//                        }, 5, TimeUnit.SECONDS);
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
            }
        });

        //Remove Items from cart Button
        Button removeItemFromCart = new Button("Remove Selected Item");
        removeItemFromCart.setOnAction(actionEvent -> {
            int amenity = listViewRight.getSelectionModel().getSelectedIndex();
            observableCart.remove(amenity);
        });



        //Get total cost of Items in the viewable shopping cart button
        Button getCost = new Button ("Get Receipt");
        getCost.setOnAction(actionEvent -> {
            //Creating a class shopping cart to hold purchasable Items
            ShoppingCart cart = new ShoppingCart();

            //Creating a Client based text fields
            Client client = new Client();
            client.setClientName(userNameField.getText());
            client.setClientEmail(userEmailField.getText());
            client.setClientPhoneNum(userPhoneNumField.getText());

            //Creating Reservations
            Reservation reservation = new Reservation();
            reservation.setCustomer(client);
            reservation.setStayStartDate(LocalDate.now());
            reservation.setStayDuration(userDayField.getIntValue());
            for (Pricable roomsInList: observableCart) {
                if (roomsInList instanceof Room) {
                    reservation.setRoom((Room) roomsInList);
                    break;
                }
            }
            //Adding reservation to the cart
            cart.addItemToCart(reservation);

            //Adding amenities to the cart
            for (Pricable itemsInCart: observableCart) {
                if (itemsInCart instanceof Amenity) {
                    cart.addItemToCart(itemsInCart);
                }
            }

            //Creating The Information on the receipt
            //Removing receipt if one already existed
            vBoxReceipt.getChildren().clear();

            Text receiptStartingInfo = new Text();
            receiptStartingInfo.setWrappingWidth(300);

            //Creating the starting info
            receiptStartingInfo.setText("Receipt sent to: " + reservation.getCustomer().getClientEmail() +
                    "\nClient : " + reservation.getCustomer().getClientName() +
                    "\nClients Room: " + reservation.getRoom().getRoomName() + " " + reservation.getRoom().getRoomNum() +
                    "\n-----------------------------" +
                    "\nStay Duration: " + reservation.getStayDuration() + " Days" +
                    "\nCost of stays: " + reservation.getPrice());
            vBoxReceipt.getChildren().add(receiptStartingInfo);

            //Creating the amenity info for the receipt
            for (Pricable itemsInCart: observableCart) {
                if (itemsInCart instanceof Amenity) {
                    Text amenityInReceipt = new Text();
                    amenityInReceipt.setWrappingWidth(300);
                    amenityInReceipt.setText("\nAmenity Name: " + ((Amenity) itemsInCart).getAmenityName() + ", Price: " + itemsInCart.getPrice());
                    vBoxReceipt.getChildren().add(amenityInReceipt);
                }
            }

            //creating the total/ending portion of the receipt
            Text receiptEndingInfo = new Text();
            receiptEndingInfo.setWrappingWidth(300);
            receiptEndingInfo.setText("-----------------------------"
            + "\nTotal Due: " + cart.getTotalCostOfItems());
            vBoxReceipt.getChildren().add(receiptEndingInfo);
        });

        //Creating a button for Maintenance requests
        Button maintenanceRequest = new Button("Request Maintenance");
        maintenanceRequest.setOnAction(actionEvent -> {
            Maintenance maintenance = new Maintenance();
            maintenance.setName(userNameField.getText());
            maintenance.setDescription(userMaintenanceRequest.getText());
            for (Pricable roomsInList: observableCart) {
                if (roomsInList instanceof Room) {
                    maintenance.setLocation((Room) roomsInList);
                    break;
                } else {
                    vBoxProgramOutputInfo.getChildren().clear();
                    programOutputInformationTextField.setText("You don't have a room selected in the cart. In order to make a request select the your room and add it to the cart. Then try again.");
                    vBoxProgramOutputInfo.getChildren().add(programOutputInformationTextField);
                }
            }
            if (maintenance.getLocation() == null) {
                vBoxProgramOutputInfo.getChildren().clear();
                programOutputInformationTextField.setText("You don't have a room selected in the cart. In order to make a request select the your room and add it to the cart. Then try again.");
                vBoxProgramOutputInfo.getChildren().add(programOutputInformationTextField);
            } else {
                DataFileWriter writer = new DataFileWriter("Maintenance Requests");
                writer.writeMaintenanceRequest(maintenance);

                vBoxProgramOutputInfo.getChildren().clear();
                programOutputInformationTextField.setText("Request has been submitted.");
                vBoxProgramOutputInfo.getChildren().add(programOutputInformationTextField);
            }
        });






        //adding objects to hBox center buttons
        HBox hBoxCenterButtons = new HBox(25);
        hBoxCenterButtons.getChildren().add(maintenanceRequest);
        hBoxCenterButtons.getChildren().add(getCost);
        hBoxCenterButtons.getChildren().add(clearInfo);
        hBoxCenterButtons.getChildren().add(closeApplication);



        //adding objects to center vbox
        VBox vBoxCenter = new VBox(10);
        vBoxCenter.getChildren().add(programWelcomeMessage);

        vBoxCenter.getChildren().add(nameFieldTip);
        vBoxCenter.getChildren().add(userNameField);

        vBoxCenter.getChildren().add(emailFieldTip);
        vBoxCenter.getChildren().add(userEmailField);

        vBoxCenter.getChildren().add(phoneNumFieldTip);
        vBoxCenter.getChildren().add(userPhoneNumField);

        vBoxCenter.getChildren().add(dayFieldTip);
        vBoxCenter.getChildren().add(userDayField);

        vBoxCenter.getChildren().add(maintenanceRequestFieldTip);
        vBoxCenter.getChildren().add(userMaintenanceRequest);

        vBoxCenter.getChildren().add(hBoxCenterButtons);

        vBoxCenter.getChildren().add(programOutputInfoTextTip);
        vBoxCenter.getChildren().add(vBoxProgramOutputInfo);

        //adding objects to hBox that is below the catalog
        HBox hBoxCartButtons = new HBox(25);
        hBoxCartButtons.getChildren().add(addToCartButtonAmenity);

        //adding object to vBox catalog
        VBox vBoxCatalog = new VBox(10);
        vBoxCatalog.getChildren().add(amenityListInformation);
        vBoxCatalog.getChildren().add(listViewLeft);
        vBoxCatalog.getChildren().add(hBoxCartButtons);

        //adding object to a vBox call List of Rooms
        VBox vBoxListOfRooms = new VBox(10);
        vBoxListOfRooms.getChildren().add(roomListInformation);
        vBoxListOfRooms.getChildren().add(listViewRoom);
        vBoxListOfRooms.getChildren().add(addToCartButtonRoom);

        HBox hBoxLeftSideOfBorderPane = new HBox(2);
        hBoxLeftSideOfBorderPane.getChildren().add(vBoxListOfRooms);
        hBoxLeftSideOfBorderPane.getChildren().add(vBoxCatalog);


        //adding objects to an hBox that holds the buttons below the shopping cart
        HBox hBoxShoppingCartButtons = new HBox(25);
        hBoxShoppingCartButtons.getChildren().add(removeItemFromCart);

        //adding object to vbox cart
        VBox vBoxCart = new VBox(10);
        vBoxCart.getChildren().add(cartListInformation);
        vBoxCart.getChildren().add(listViewRight);
        vBoxCart.getChildren().add(hBoxShoppingCartButtons);
        vBoxCart.getChildren().add(vBoxReceipt);


        //Adding objects to the BorderPane
        borderPane.setTop(programWelcomeMessage);
        borderPane.setLeft(hBoxLeftSideOfBorderPane);
        borderPane.setCenter(vBoxCenter);
        borderPane.setRight(vBoxCart);
        borderPane.setBottom(null);


        //Adding objects to the group
        group.getChildren().add(borderPane);

        //Adding a ScrollPane to allow the window to fit any size of content displayed, then adding our group to the scroll pane to allow everything to be displayed.
        ScrollPane scrollPane = new ScrollPane(group);
        scrollPane.setStyle("-fx-background:  #eee2b1; -fx-border-color: #42d7f5;");


        //Setting scene
        Scene scene = new Scene(scrollPane, 1280, 900);
        scene.setFill(Color.BEIGE);







        //setting stage
        stage.setScene(scene);
        stage.setTitle("North Shore Hotel Reservation App");

        //Showing stage
        stage.show();


    }

}
