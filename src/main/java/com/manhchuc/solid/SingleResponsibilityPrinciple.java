package com.manhchuc.solid;

import lombok.Data;

public class SingleResponsibilityPrinciple {
    /**
     * A class should only have a single responsibility, that is,
     * only changes to one part of the software's specification should be able to affect the specification of the class.
     */
    @Data
    class Book {
        private String author;
        private String name;
        private String content;
    }

    class BookPrinter {
        private void printTextOfTheBook(String text) {
            // TODO
        }
    }
}
