package reldemo;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em =JPAUtil.getEntityManager();

        // Fetching Author and Books
        Author author = em.find(Author.class, 1L);
        if (author != null) {
            System.out.println("Author: " + author.getName());
            for (Book book : author.getBooks()) {
                System.out.println("Book: " + book.getTitle());
            }
        }

        em.close();
        JPAUtil.closeEntityManagerFactory();
    }
}