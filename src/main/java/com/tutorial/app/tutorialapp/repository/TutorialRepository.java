package com.tutorial.app.tutorialapp.repository;


import com.tutorial.app.tutorialapp.model.Tutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  Page<Tutorial> findByPublished(boolean published, Pageable pageable);

  Page<Tutorial> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}