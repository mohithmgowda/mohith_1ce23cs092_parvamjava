package com.gamescrud.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "game_id")
	private long gameId;
	@Column(name = "game_Name", length = 100)
	private String ganeName;
	@Column(name = "cost_per_hour", precision = 10, scale = 2)
	private BigDecimal CostPerHour;
	@Column(name="status")
		@Enumerated(EnumType.STRING)
		private Status status;

}
