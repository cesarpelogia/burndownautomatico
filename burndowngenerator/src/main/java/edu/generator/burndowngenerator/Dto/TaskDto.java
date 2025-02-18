package edu.generator.burndowngenerator.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private String description;
    private boolean completed;

    // Getters e Setters
    public boolean isCompleted() {
        return completed;
    }
}