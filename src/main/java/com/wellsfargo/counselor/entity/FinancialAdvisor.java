package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorId;

    private String name;
    private String email;
    private String password;

    // Constructors, getters, setters (excluding setter for advisorId), etc.

    public FinancialAdvisor() {
    }

    // Constructors, getters, setters (excluding setter for advisorId), etc.
    
    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
