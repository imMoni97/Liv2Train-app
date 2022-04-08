package com.example.project.Liv2Trainapp.services;

import com.example.project.Liv2Trainapp.entities.TrainingCenter;

import java.util.List;

public interface TrainingService {
    public List<TrainingCenter> getCenters();

    public TrainingCenter getCenter(String centerID);

    public TrainingCenter addCenter(TrainingCenter center);

    public TrainingCenter updateCenter(TrainingCenter center);

    public void deleteCourse(String centerID);
}
