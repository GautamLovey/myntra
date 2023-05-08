package com.myntra.repository;

import com.myntra.registration.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MynTraRepo extends JpaRepository<UserRegistration,String> {



}
