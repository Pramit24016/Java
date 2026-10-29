public class Question{
	private String prompt;
	private String[] options;
	private int correctAnswerIndex;
	public Question(String prompt,String[] options, int correctAnswer){
		this.prompt=prompt;
		this.options=options;
		this.correctAnswerIndex=correctAnswer;
	}
	public String getPrompt(){
		return prompt;
	}
	public String[] getOptions{
		return options;
	}
	public isCorrect(int userAnswer){
		return correctAnswerIndex==userAnswer;
	}
