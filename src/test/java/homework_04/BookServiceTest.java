package homework_04;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


class BookServiceTest {

    @Test
    public void testBooksSearchWithMock() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        bookService.findBookById("1");
        verify(bookRepository).findById("1");

        bookService.findAllBooks();
        verify(bookRepository).findAll();
    }
}