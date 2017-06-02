/**
 * Created by lonny on 6/1/2017.
 */
public class Question {
    protected String question;
    protected String instructions;



    public void setQuestion(String aQuestion){
        this.question=aQuestion;
    }
    public String getQuestion(Question question){
        return this.question;
    }
    public void setInstructions(String aInstruction){
        this.instructions=aInstruction;
    }

}
