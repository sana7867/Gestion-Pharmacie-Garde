package ma.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.entities.Users;

@Repository
public interface UserRepository extends JpaRepository< Users, Long> {

}