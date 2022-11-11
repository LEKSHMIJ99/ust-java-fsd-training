package com.student.ust.controller;


import com.student.ust.entity.Books;
import com.student.ust.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/books/{id}")
    public ResponseEntity<Books> get(@PathVariable Integer id) {
        try {

            Books books = booksService.getBooksByID(id);
            return new ResponseEntity<Books>(books, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/books")
    public ResponseEntity<List<Books>> get2() {
        try {

            List<Books> booksList=booksService.getbooksAll();
            return new ResponseEntity<List<Books>>(booksList, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Books>>(HttpStatus.NOT_FOUND);
        }
    }




    @PostMapping("/books")
    public void add
            (@RequestBody Books books){
        booksService.saveBooks(books);
    }

    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable Integer id){
        booksService.deleteBooks(id);
    }

    @PutMapping("/books")
    public ResponseEntity<Books>update(@RequestBody Books books) {
        try {
            Books updatedbooks = booksService.updateBooks(books);
            return new ResponseEntity<Books>(updatedbooks, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);

        }
    }
}




