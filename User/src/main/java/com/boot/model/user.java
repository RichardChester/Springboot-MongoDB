package com.boot.model;

//import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RequestMapping;

@Document
@RequestMapping("/user")
public class user {
	
    @Id
    private String id;
    private String firstName;
    private String secondName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}



}
