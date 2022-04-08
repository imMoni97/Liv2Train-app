package com.example.project.Liv2Trainapp.controller;
import com.example.project.Liv2Trainapp.entities.TrainingCenter;
import com.example.project.Liv2Trainapp.services.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.validation.Valid;

//We are at controller layer
@RestController
@RequestMapping("/center")
public class MyController {
    @Autowired
    private TrainingService trainingService;

    @GetMapping("/training")
    public List<TrainingCenter> getCenters(){
        return this.trainingService.getCenters();
    }

    @PostMapping(path="/training",consumes ="application/json")
    public TrainingCenter addCenter(@Valid @RequestBody TrainingCenter center) {
        return this.trainingService.addCenter(center);
    }

    @PutMapping("/training")
    public TrainingCenter updateCenter(@Valid @RequestBody TrainingCenter center) {
        return this.trainingService.updateCenter(center);
    }

    @DeleteMapping("/training/{centerID}")	//To delete a course
    public String deleteCourse(@PathVariable("centerID") String centerID) {
        try {
            this.trainingService.deleteCourse(centerID);
            return "Deletion Done succesfully";
        }catch (Exception e) {
            return "OOps !! No such record exist";
        }
    }


}
