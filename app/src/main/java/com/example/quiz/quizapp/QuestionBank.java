package com.example.srbhs.quizapp;

public class QuestionBank {

    public String question[] = {
            "Which animal's heart must pump twice as hard as a cow's, to get blood up to the brain?",
            "Which insect can live for 9 days without its head?",
            "Which bird can only eat with its head upside down?",
            "Which is the only animal with four knees?",
            "Which animal's name means “I don't understand”?",
            "Which is the only animal to see infrared and ultraviolet light?",
            "Which insect doesn't sleep?",
            "What colour is insect blood?"
    };
    //Options of Questions
    public String options[][] = {
            {"Horse", "Giraffe", "Elephant"},
            {"Cockroach", "Ant", "Butterfly"},
            {"Ostrich", "Crane", "Flamingo"},
            {"Elephant", "Cow", "Dog"},
            {"Kookaburra", "Kangaroo", "Elephant"},
            {"Wolf", "Owl", "Goldfish"},
            {"Spider", "Ant", "Moth"},
            {"Green", "Red", "Blue"}
    };

    public String checkBoxQuestion[] = {
            "Creatures living on Land?", // CheckBox
            "Creatures living in Water?" // CheckBox
    };

    public String checkBoxOptions[][] = {
            {"Elephant","Whale","Ostrich"},
            {"Octopus", "JellyFish", "Kookaburra"}
    };

    public String checkBoxAnswer[][] = {
            {"Elephant", "-", "Ostrich"},
            {"Octopus", "JellyFish", "-"}
    };

    public String answers[] = {
            "Giraffe",
            "Cockroach",
            "Flamingo",
            "Elephant",
            "Kangaroo",
            "Owl",
            "Ant",
            "Green"
    };

    public int image[] = {
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1,
            R.drawable.qm1
    };

    public int checkBoxImage[] = {
            R.drawable.qm1,
            R.drawable.qm1
    };

    public String getQuestion(int questionNumber){
        return question[questionNumber];
    }

    public String getOptionOne(int questionNumber){
        return options[questionNumber][0];
    }

    public String getOptionTwo(int questionNumber){
        return options[questionNumber][1];
    }

    public String getOptionThree(int questionNumber){
        return options[questionNumber][2];
    }

    public String getAnswer(int questionNumber){
        return answers[questionNumber];
    }

    public String getCheckBoxQuestion(int questionNumber) {
        return checkBoxQuestion[questionNumber];
    }

    public String getCheckBoxOptionOne(int questionNumber) {
        return checkBoxOptions[questionNumber][0];
    }

    public String getCheckBoxOptionTwo(int questionNumber) {
        return checkBoxOptions[questionNumber][1];
    }

    public String getCheckBoxOptionThree(int questionNumber) {
        return checkBoxOptions[questionNumber][2];
    }

    public String[] getCheckBoxAnswer(int questionNumber) {
        return checkBoxAnswer[questionNumber];
    }

    public int getImage(int questionNumber){
        return image[questionNumber];
    }

    public int getCheckBoxImage(int questionNumber){
        return checkBoxImage[questionNumber];
    }

}
