package com.example.coding_practice;

import com.example.CodingQuestions.Four.FourSolution;
import com.example.CodingQuestions.One.QuestionOne;
import com.example.CodingQuestions.Three.ThreeQuestion;
import com.example.CodingQuestions.Two.TwoQuestion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionsController {

    @PostMapping("/one")
    public int questionOne(@RequestBody int[] array) {
        QuestionOne questionOne = new QuestionOne();
        return questionOne.sumOfArray(array);
    }

    @PostMapping("/two")
    public boolean questionTwo(@RequestBody int[] array, @RequestParam int target) {
        TwoQuestion twoQuestion = new TwoQuestion();
        return twoQuestion.twoSum(array, target);
    }

    @PostMapping("/three")
    public int questionThree(@RequestBody int[] array) {
        ThreeQuestion threeQuestion = new ThreeQuestion();
        return threeQuestion.diffBetweenEvenAndOdd(array);
    }

    @PostMapping("/four")
    public boolean questionThree(@RequestBody String s) {
        FourSolution fourSolution = new FourSolution();
        return fourSolution.isPalindrome(s);
    }
}
