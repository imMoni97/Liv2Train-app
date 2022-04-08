package com.example.project.Liv2Trainapp.models;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

//listens to the updates made and makes timestamps
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.ofNullable("root").filter(s -> !s.isEmpty());
    }

}
