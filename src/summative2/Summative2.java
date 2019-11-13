/*Malika Sharma
 *Science Quiz  
 *09/11/2019
 */
package summative2;
import java.util.Scanner;


/**
 *
 * @author VIASVS
 */
public class Summative2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in); 
        Scanner keyedInput = new Scanner(System.in); 
        int number =0; 
        int choice; 
        int incorrect =0; 
        int correct=0; 
        int num1, num2;  
        String answer1;
        while (true)
            {
            System.out.println("Science (Human Body) Quiz");
            System.out.println("Please pick a question to answer. Try to answer all the questions! FYI SPELLING COUNTS!");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Question 1…"); 
            System.out.println("Question 2…"); 
            System.out.println("Question 3…"); 
            System.out.println("Question 4…"); 
            System.out.println("Question 5..."); 
            System.out.println("percentage of correct answers (out of 5) -1...");
            System.out.println("percentage of incorrect answers (out of 5) -2...");
            System.out.println("6...Exit Game"); 
            number = keyedInput.nextInt();
            String [] questions = new String [6]; 
            String [] answers = new String [6]; 
            questions [0] = "The flow of blood around your body is called?";
            questions [1] = "The bones that make up your spine are called what?"; 
            questions [2] = "What is the human body’s biggest organ?"; 
            questions [3] = "Another name for your voice box is the?"; 
            questions [4] = "The innermost part of bones contains what?"; 
            answers [0] = "Circulation"; 
            answers [1] = "Vertebrae"; 
            answers [2] = "Skin"; 
            answers [3] = "Larynx"; 
            answers [4] = "Bonemarrow"; 
            if (number== 1){
            System.out.println(questions[0]);
            answer1 = keyboard.next();
            if ((answers[0]).equals(answer1)){
            System.out.println("Correct"); 
            correct++; 
            } else {
            System.out.println("Incorrect");
            incorrect++; }
        }
        if (number==2){ 
           System.out.println(questions[1]);
           answer1 = keyboard.next(); 
           if ((answers[1]).equals(answer1)){
           System.out.println("Correct");
           correct++; 
            } else {
             System.out.println("incorrect");
             incorrect++; }
        } 
         if (number==3){ 
            System.out.println(questions[2]); 
            answer1 = keyboard.next(); 
           if ((answers[2]).equals(answer1)){
           System.out.println("Correct");
           correct++; 
           } else {
             System.out.println("incorrect");
           incorrect++; }     
         } 
         if (number==4) {  
           System.out.println(questions[3]);
            answer1 = keyboard.next(); 
           if ((answers[3]).equals(answer1)) {
           System.out.println("Correct");
           } else {
             System.out.println("incorrect");
             incorrect++; }     
        } 
         if (number==5){ 
          System.out.println(questions[4]);
          answer1 = keyboard.next(); 
         if ((answers[4]).equals(answer1)) { 
        System.out.println("Correct");
         correct++; 
         }else {
         System.out.println("incorrect");
         incorrect++; } 
         }
         if (number==-1) { 
         System.out.println("Enter how many questions you got correct");
          num1 = keyedInput.nextInt();
          System.out.println("Enter how many questions there are in total (5)");
          num2 = keyedInput.nextInt(); 
         System.out.println("This is your percentage of correct answers in the quiz" + addAndOut(num1,num2) );
          }
         if (number==-2) { 
         System.out.println("Enter how many questions you got incorrect");
          num1 = keyedInput.nextInt();
          System.out.println("Enter how many questions there are in total (5)");
          num2 = keyedInput.nextInt(); 
         System.out.println("This is your percentage of incorrect answers in the quiz" + addAndOut(num1,num2) );
         if (number==6) { 
        System.out.println("You have chosen to exist, goodbye!"); 
          break; }   
   } 
    }
    } 
    public static int addAndOut (int n1, int n2){
    int mark  =n1*100/n2; 
    return mark;
    }
    public static int MultAndOut (int n1, int n2){
    int mark1  =n1*100/n2; 
    return mark1; 
} 
   
} 

    
   
