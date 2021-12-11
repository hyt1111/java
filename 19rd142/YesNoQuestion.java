public class YesNoQuestion extends Question {

	private String question;
	
	private boolean answer;
	
	
	public YesNoQuestion(String question, boolean answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return this.question + "(y/n)";
	}
 
	public boolean check(String input) {
		if(input.equals("y") || input.equals("Y")) {
			return true;
		} else if(input.equals("n") || input.equals("N")) {
			return true;
		} else {
			return false;
		}
	}
 
	public boolean isCorrect(String input) {
		if(input.equals("y") || input.equals("Y")) {
			return this.answer;
		} else if(input.equals("n") || input.equals("N")) {
			
			return ! this.answer;
		} else {
			
			throw new IllegalArgumentException();
		}
	}

	public String getAnswer() {
		return this.answer ? "yes" : "no";
	}
}