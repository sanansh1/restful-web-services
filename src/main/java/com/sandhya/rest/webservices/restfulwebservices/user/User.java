package com.sandhya.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user_details")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 2, message = "Name should have atleast 2 characters")
    @JsonProperty("user_name")
    private String name;
    @Past(message = "Birth Date should be in the past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;


    public User(int i, String adam, LocalDate localDate) {
        this.id=i;
        this.name=adam;
        this.birthDate=localDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
