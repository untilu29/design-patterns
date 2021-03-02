package com.manhchuc.solid;

public class InterfaceSegregationPrinciple {
    /**
     * Many client-specific interfaces are better than one general-purpose interface.
     */
    interface BookRepository {
        void getBook();

        void getListBook();

        void setBook();
    }

    interface BookAuthorRepository {
        void getAuthorByBook();

        void getListAuthor();
    }

    public class Book implements BookRepository, BookAuthorRepository {

        public void getBook() {

        }

        public void getListBook() {

        }

        public void setBook() {

        }

        public void getAuthorByBook() {

        }

        public void getListAuthor() {

        }
    }
}
