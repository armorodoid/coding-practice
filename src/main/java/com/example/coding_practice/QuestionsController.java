package com.example.coding_practice;

import com.example.CodingQuestions.One.QuestionOne;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionsController {

    @PostMapping("/one")
    public int questionOne(@RequestBody int[] array) {
        QuestionOne questionOne = new QuestionOne();
        return questionOne.sumOfArray(array);
    }
}
