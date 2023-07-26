package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructors, getters, setters (excluding setter for portfolioId), etc.
    
    public Portfolio() {
    }

    // Constructors, getters, setters (excluding setter for portfolioId), etc.
    
    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}