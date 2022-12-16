package com.Registration.RegistrationFrom.Repository;

import com.Registration.RegistrationFrom.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
