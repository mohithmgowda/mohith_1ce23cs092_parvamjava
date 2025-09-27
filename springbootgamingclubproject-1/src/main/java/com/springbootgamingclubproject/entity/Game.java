package com.springbootgamingclubproject.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long gameId;

	@Column(nullable = false, length = 100)
	private String gameName;

	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal costPerHour;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Status status;

	public enum Status {
		AVAILABLE, UNAVAILABLE
	}

	public Game() {
	}

	public Game(String gameName, BigDecimal costPerHour, Status status) {
		this.gameName = gameName;
		this.costPerHour = costPerHour;
		this.status = status;
	}

	// Getters and Set  ters (manual)
	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public BigDecimal getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(BigDecimal costPerHour) {
		this.costPerHour = costPerHour;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
