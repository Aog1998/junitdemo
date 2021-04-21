package com.example.junitdemo;


import java.util.List;


import com.example.junitdemo.domain.Book;
import com.example.junitdemo.domain.BookRepository;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private BookRepository bookRepository;



    //表示被注解的方法应该在当前类的所有@Test
    // @RepeatedTest，@ParameterizedTest和@TestFactory方法之前执行
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @BeforeEach
    @Disabled
    void getBookRepository(){
        bookRepository=new BookRepository();
    }

    /**
     * Test method for {@link com.example.junitdemo.domain.BookRepository#find()}.
     */
    @Test
    public void testFind() {
        BookRepository bookRepository=new BookRepository();
        List<Book>  list = bookRepository.find();
        for (int i = 0; i < list.size(); i++) {
            Book book=list.get(i);
            System.out.println("名称: "+book.getName()+" 描述: "+book.getDescription());

        }
    }



    @Test
    @DisplayName("测试是否查到的为第一本书 ")
    public void testFindById(){
        BookRepository bookRepository=new BookRepository();
        Book book = bookRepository.findById(1);
        assertEquals("book1", book.getName());
    }


    //表示被注解的方法应该在当前类的所有@Test...方法之后执行;
    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }
}
