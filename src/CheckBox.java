/**
 * Created by lonny on 6/1/2017.
 */
public class CheckBox extends Question{
    private static String instructions="Please enter all numbers that apply without commas.";
    private int correctAnswer;
    private String allAnswers;

    public CheckBox(String aQuestion,String aInstruction,int aCorrectAnswer){
        super(aQuestion);
        this.instructions=aInstruction;
        this.correctAnswer=aCorrectAnswer;

    }
    public void setInstructions(String aInstruction){
        this.instructions=aInstruction;
    }
    public getInstructions(String instructions){
        return this.instructions;
    }
}
