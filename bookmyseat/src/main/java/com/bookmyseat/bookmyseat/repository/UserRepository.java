package com.bookmyseat.bookmyseat.repository;

import com.bookmyseat.bookmyseat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
