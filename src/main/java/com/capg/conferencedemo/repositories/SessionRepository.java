package com.capg.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
