package ru.Raingor.OnlineLibraryRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Raingor.OnlineLibraryRest.domain.Book;

@Repository
public interface BookReposiroty extends JpaRepository<Book, Long> {
}
