package com.alfaizuna.scoreapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class ScoreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreAppApplication.class, args);
    }
}
@Controller
class ScoreController {
    private Game game = new Game();

    @GetMapping("/score")
    public String showScore(Model model) {
        model.addAttribute("currentScore", ScoreCalculator.calculateScore(game));
        return "score";
    }

    @PostMapping("/score/player1")
    public String player1Scores() {
        game.player1Scores();
        return "redirect:/score";
    }

    @PostMapping("/score/player2")
    public String player2Scores() {
        game.player2Scores();
        return "redirect:/score";
    }
}


