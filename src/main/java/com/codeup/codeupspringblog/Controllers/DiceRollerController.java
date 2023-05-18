package com.codeup.codeupspringblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiceRollerController {
    @GetMapping("/dice-roller")
    public String showDiceRoll(){
        return "roll-dice";
    }

    @PostMapping("/dice-roller")
    public String rollDice(@RequestParam(name = "rollGuess") int guess, Model model){
        model.addAttribute("guess", "You guessed: " + guess);


        int roll = (int) Math.floor(Math.random() * 6 + 1);
        model.addAttribute("roll", "We rolled a: " + roll);

        boolean correctGuess = false;
        if(roll == guess){
            correctGuess = true;
        }
        model.addAttribute("correctGuess", correctGuess);
        return "roll-dice";
    }
}
