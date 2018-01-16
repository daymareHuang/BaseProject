package checkSchedule;

public class ExamGrade {
  private double all;
  private double correct;
  
  public ExamGrade(int all, int correct) {
    this.all = all;
    this.correct = correct;
  }
  
  public double getExamGrade() {
    return correct / all;
  }
}
