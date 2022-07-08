package com.example.pesel1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeselRepository extends JpaRepository<Pesel, Long> {

}
