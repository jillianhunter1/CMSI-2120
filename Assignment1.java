class Grades {
  private int[] values;

  Grades () {

  }
  Grades (int[] myArray) {
      this.values = myArray;
  }
  public void setValues(int[] myArray) { 
    this.values=myArray;
  }
  public int[] getValues() { 
      return this.values;
  }
  public int highest() {
      // for (/* setup */; /* condition to keep going */ ; /* how to advance */) {
      int max = this.values[0];
      for (int value : this.values) {
      if (max < value) {
        max = value;
        }
      }
      return max;
    }
  public int lowest() {
    int min = this.values[0];
    for (int value : this.values) {
    if (min > value) {
      min = value;
    }
    }
    return min;
    }

  public int numOfGrades() {
      return this.values.length; 
  }

  public double average() { 
    float sum =0 ;
    int i=0;
    while(i < this.values.length) {
        sum += this.values[i];
        i++;
    }

    float average = (sum / this.values.length);
    
    return average;
}
  public int numOfFailingGrades(int gradeValue) { 
    int count=0;
    for (int value:this.values){
      if (gradeValue>value){
        count++;
      }
    }
    return count; 
}
  public void histogram() { 
    System.out.print("90-100 | ");
    for (int value : this.values) {
    if (value >= 90 && value <= 100) {
    System.out.print("*");
    }
    }
    System.out.println("");
    System.out.print("80-89 | ");
    for (int value : this.values) {
    if (value >= 80 && value <= 89) {
    System.out.print("*");
    }
    }
    System.out.println("");
    System.out.print("70-79 | ");
    for (int value : this.values) {
    if (value >= 70 && value <= 79) {
    System.out.print("*");
    }
    }
    System.out.println("");
    System.out.print("60-69 | ");
    for (int value : this.values) {
    if (value >= 60 && value <= 69) {
    System.out.print("*");
    }
    }
    System.out.println("");
    System.out.print("< 60 | ");
    for (int value : this.values) {
    if (value < 60) {
    System.out.print("*");
    }
    }
    System.out.println("");
  }
 
}

class GradesApp {
  public static void main(String[] args) {
      System.out.println("Welcome to the Grade Keeper App!💯");
      String response = System.console().readLine("Enter the number of grades to input: ");
      var numberOfGrades = Integer.parseInt(response);
      // for (/* setup */; /* condition to keep going */ ; /* how to advance */) {
      var grades = new int[numberOfGrades];
      for (var currentGrade = 0; currentGrade < numberOfGrades; currentGrade++) {
          String gradeResponse = System.console().readLine("Enter grade " + (currentGrade + 1) + ": ");
          var gradeValue = Integer.parseInt(gradeResponse);
          grades[currentGrade] = gradeValue;}
          Grades grader = new Grades(grades);
          grader.highest();
          grader.lowest();
          grader.numOfGrades();
          grader.average();
          System.out.println("Failing Grades: " + grader.numOfFailingGrades(70));
          System.out.println("The highest values is : " + grader.highest());
          System.out.println("The lowest values is : " + grader.lowest());
          System.out.println("Number of grades are : " + grader.numOfGrades());
          // System.out.println("Number of grades bellow 50 are : " + grader.numOfFailingGrades(50));
          System.out.println("Average grade is : " + grader.average());
          grader.histogram();
        }
      }