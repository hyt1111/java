public abstract class Question {
	public abstract String getQuestion();
	public abstract boolean check(String input);
	
	public abstract boolean isCorrect(String input);

	public abstract String getAnswer();
}