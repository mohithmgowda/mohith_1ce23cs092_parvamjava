package com.gamescrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamescrud.model.Game;
import com.gamescrud.repository.GamesReposiyory;

@Service
public class GameService {
	@Autowired
	private GamesReposiyory gamesRepository;
	
	public List<Game> getALLGames(){
		List<Game> games=gamesRepository.findAll();
		return games;
		}
	public Game getGamebyId(long id) {
	Optional<Game> byId=gamesRepository.findById(id);
	Game game=byId.get();
	return game;
}
	public Game updateGameById(Game game,long id) {
			
	}
}