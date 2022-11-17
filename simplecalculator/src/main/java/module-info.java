module com.crawfordg {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.crawfordg to javafx.fxml;
    exports com.crawfordg;
}
