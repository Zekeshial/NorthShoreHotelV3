module com.example.northshorehotelv3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.northshorehotelv3 to javafx.fxml;
    exports com.example.northshorehotelv3;
    exports FrontEnd;
    opens FrontEnd to javafx.fxml;
}