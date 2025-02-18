package main.java.edu.generator.burndowngenerator.Issues;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IssueDto {
    
    private String title;
    private String body;
    private String state;
    private List<TaskDto> tasks;

    public void extractTasksFromBody() {
    Pattern pattern = Pattern.compile("- \\[(x| )\\] (.*)");
    Matcher matcher = pattern.matcher(this.body);

    while (matcher.find()) {
        boolean isCompleted = matcher.group(1).trim().equals("x");
        String description = matcher.group(2).trim();
        tasks.add(new TaskDTO(description, isCompleted));
        }
    }
}


