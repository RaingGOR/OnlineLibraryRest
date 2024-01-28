package ru.Raingor.OnlineLibraryRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Raingor.OnlineLibraryRest.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
