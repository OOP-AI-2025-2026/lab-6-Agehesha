package ua.opnu.list;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public final class SortingList extends Application {

    private final ObservableList<Student> students = FXCollections.observableArrayList(
            new Student("Роман", "Шугаєв", 91.2),
            new Student("Анна", "Коваленко", 87.5),
            new Student("Петро", "Іванов", 75.0),
            new Student("Марія", "Сидоренко", 93.4),
            new Student("Олег", "Петренко", 79.8)
    );

    @Override
    public void start(Stage stage) {
        TableView<Student> table = buildTable();

        Button btnSortByName = new Button("Сортувати за іменем");      
        Button btnSortBySurname = new Button("Сортувати за прізвищем");  
        Button btnSortByGpa = new Button("Сортувати за середнім балом"); 

        final boolean[] ascendingByName = { true };
        final boolean[] ascendingBySurname = { true };
        final boolean[] ascendingByGpa = { true };

        btnSortByName.setOnAction(e -> {
            students.sort(new NameSorter(ascendingByName[0]));
            ascendingByName[0] = !ascendingByName[0];
            table.refresh();
        });


        btnSortBySurname.setOnAction(e -> {
            students.sort(new SurnameSorter(ascendingBySurname[0]));
            ascendingBySurname[0] = !ascendingBySurname[0];
            table.refresh();
        });

        btnSortByGpa.setOnAction(e -> {
            students.sort(new GpaSorter(ascendingByGpa[0]));
            ascendingByGpa[0] = !ascendingByGpa[0];
            table.refresh();
        });

        HBox controls = new HBox(8, btnSortByName, btnSortBySurname, btnSortByGpa);
        controls.setPadding(new Insets(8));

        BorderPane root = new BorderPane();
        root.setTop(controls);
        root.setCenter(table);

        stage.setTitle("SortingList");
        stage.setScene(new Scene(root, 720, 420));
        stage.show();
    }

    private TableView<Student> buildTable() {
        TableView<Student> table = new TableView<>(students);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TableColumn<Student, String> colName = new TableColumn<>("Ім'я");
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Student, String> colSurname = new TableColumn<>("Прізвище");
        colSurname.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, Double> colGpa = new TableColumn<>("Середній бал");
        colGpa.setCellValueFactory(new PropertyValueFactory<>("avgMark"));

        table.getColumns().setAll(colName, colSurname, colGpa);
        return table;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
