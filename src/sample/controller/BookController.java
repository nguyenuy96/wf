package sample.controller;

import java.awt.print.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.dao.BookDao;
import sample.dto.BookDto;

public class BookController {

    ObservableList<BookDto> bookData = FXCollections.observableArrayList();
    private final BookDao bookDao = new BookDao();

    @FXML
    public AnchorPane bookAnchorPanel;
    @FXML
    public TabPane bookPanel;
    @FXML
    public Tab bookTab;
    @FXML
    public TableView<BookDto> bookTable;
    @FXML
    public TableColumn<BookDto, String> bookId;
    @FXML
    public TableColumn<BookDto, String> bookName;
    @FXML
    public TableColumn<BookDto, String> author;
    @FXML
    public TableColumn<BookDto, Integer> total;
    @FXML
    public TableColumn<BookDto, Integer> remain;

    private void TableViewLoad(ObservableList<BookDto> bookDtos) {

        bookTable.setItems(getTicketData());

    }

    public ObservableList<BookDto> getTicketData() {
        return bookData;
    }


    public void initialize(){
        bookData.addAll(bookDao.getBooks());
        bookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        bookName.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        total.setCellValueFactory(new PropertyValueFactory<>("total"));
        remain.setCellValueFactory(new PropertyValueFactory<>("remain"));
        TableViewLoad(bookData);
    }

    public void onClickBookMenu(MouseEvent mouseEvent) {
        System.out.println("abc");
    }
}
