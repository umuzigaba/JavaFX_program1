module demo1.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo1.demo1 to javafx.fxml;
    exports demo1.demo1;
}