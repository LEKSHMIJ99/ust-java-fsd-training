package com.student.ust.service;



import com.student.ust.entity.Books;
import com.student.ust.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
public class BooksService {
    /**
     * The Student service.
     */
    @Autowired
    BooksRepository booksRepository;

    public Books getBooksByID(int id) {
        return booksRepository.findById(id).orElse(null);


    }

    public void saveBooks(Books books) {
        booksRepository.save(books);
    }

    public List<Books> getbooksAll() {
        return booksRepository.findAll();
    }

    public void deleteBooks(Integer id) {
        booksRepository.deleteById(id);
    }

    public Books updateBooks(Books books) {
        Books updateBooks = booksRepository.findById(books.getBookId()).orElseThrow(() -> new NoSuchElementException());
        updateBooks.setBookName(books.getBookName());
        updateBooks.setYear(books.getYear());
        booksRepository.save(updateBooks);
        return updateBooks;
    }

}



