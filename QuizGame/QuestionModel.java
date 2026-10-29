public class QuestionModel{
	Question questions;
	int currentIndex;
	int score;
	QuestionModel(List<Question> qt){
		questions=qt;
		score=0;
		currentIndex=0;
	}
	int hasQuestion(){
		return currentIndex <  questions.size()
	}
	String getQuestions(){
		if(!hasQuestion()){
			return null;
		}
		return question.get(currentIndex++);
	}
	int getScore()[
		return score;
	}
	int totalQuestions(){
		return question.size();
	}
}
