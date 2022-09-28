package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Cricketer;

public interface ICricketerRepo extends JpaRepository<Cricketer, Integer> {

}
