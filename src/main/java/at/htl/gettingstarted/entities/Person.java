package at.htl.gettingstarted.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    
    private String firstName;
    private String lastName;
}
