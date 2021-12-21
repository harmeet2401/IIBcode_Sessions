package com.in28mins.Myapi.ApiBeans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String name;
    private String add;

    public User(String name, String add) {
        this.name = name;
        this.add = add;
    }
}
