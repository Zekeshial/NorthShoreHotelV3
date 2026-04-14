module com.example.northshorehotelv3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive org.apache.commons.csv;
    requires transitive com.opencsv;


    opens com.example.northshorehotelv3 to javafx.fxml;
    exports com.example.northshorehotelv3;
    exports FrontEnd;
    opens FrontEnd to javafx.fxml;
}