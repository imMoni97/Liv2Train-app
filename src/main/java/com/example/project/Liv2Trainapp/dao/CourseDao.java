package com.example.project.Liv2Trainapp.dao;

import com.example.project.Liv2Trainapp.entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

//Dao Layer for database connectivity
public interface CourseDao extends JpaRepository<TrainingCenter, String> {

}
