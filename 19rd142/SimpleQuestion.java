public class SimpleQuestion extends Question {

	private String question;
	private String answer;
	
	public SimpleQuestion(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return this.question;
	}
 
	public boolean check(String input) {
		return true;
	}
 
	
	public boolean isCorrect(String input) {
		return this.answer.equals(input);
	}

	public String getAnswer() {
		return this.answer;
	}
}