package de.hdi.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hdi.tm.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
