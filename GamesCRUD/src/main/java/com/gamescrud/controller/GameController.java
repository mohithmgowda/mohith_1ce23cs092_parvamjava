package com.gamescrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.gamescrud.model.Game;
import com.gamescrud.service.GameService;

@RestController
public class GameController{
	
	@Autowired
	private GameService gameService;
	
	@GetMapping({ "/games","/"," " })
	public List<Game> getALLGames(){
		List<Game> allGame=gameService.getALLGames();
		return allGame;
	}
	@GetMapping("/games/id")
	public Game getGameById(@RequestParam long id) {
		Game game =gameService.getGamebyId(id);
		return game;
	}
	@PostMapping({"/games","/",""})
	
	public String storeGames() {
		return "Storing game in server";
	}
	@PutExchange("/games/id")
	public String updateGameById() {
		return "updating game by id";
	}
	@DeleteMapping("/games/id")
	public String deleteGameById() {
		return "deleting game by id";
	}
}