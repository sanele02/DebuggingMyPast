import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        int right =0;
        int wrong =0;
        int count =0;
        final int totalnumofquestions = 10;
        Scanner userinput = new  Scanner(System.in);

        System.out.println("Welcome to Debugging My Past - TRUE OR FALSE QUESTIONNAIRE");
        //collect name and surname of player
        System.out.print("Name: ");
        String name = userinput.next();
        System.out.print("Surname: ");
        String surname = userinput.next();

        //count down to game starting
        int start = 1;
        System.out.println("QUESTIONNAIRE will begin in...");
        for (int i=3;i >= start; i--){
            System.out.println(i);
        }
        // skip a line
        System.out.println(" ");

        // start with the questions
//quetion1
        System.out.println("*QUESTION 1*");
        System.out.print("I wrote my first line of code in Delphi? ");
        boolean q1 = userinput.nextBoolean();
        if (q1==false){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG...  wrote my first line of code in Python ");
            wrong++;
        }
//quetion2
        System.out.println("*QUESTION 2*");
        System.out.print("I have experience using Python for development? ");
        boolean q2 = userinput.nextBoolean();
        if (q2== true){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG...");
            wrong++;
        }
//quetion3
        System.out.println("*QUESTION 3*");
        System.out.print("I have never worked with databases before? ");
        boolean q3 = userinput.nextBoolean();
        if (q3== false){
            System.out.println("RIGHT");
            right++;
        }
        else{
            System.out.println("WRONG... My pre-school system  used the MICROSOFT ACCESS  database and i once created a application that has a MYSQL database.");
            wrong++;
        }
        //quetion4
        System.out.println("*QUESTION 4*");
        System.out.print("I have participated in the MTN Business App Academy? ");
        boolean q4 = userinput.nextBoolean();
        if (q4== true){
            System.out.println("RIGHT");
            right++;
        }
        else{
            System.out.println("WRONG");
            wrong++;
        }
//quetion5
        System.out.println("*QUESTION 5*");
        System.out.print("I built a rewards program application using Django? ");
        boolean q5 = userinput.nextBoolean();
        if (q5== false){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG... I used Streamlit");
            wrong++;
        }
//quetion6
        System.out.println("*QUESTION 6*");
        System.out.print("I have attended a hackathon before? ");
        boolean q6 = userinput.nextBoolean();
        if (q6== true){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG...");
            wrong++;
        }
//quetion7
        System.out.println("*QUESTION 7*");
        System.out.print("I hope to study Electrical Engineering in university? ");
        boolean q7 = userinput.nextBoolean();
        if (q7== false){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG... I want to study Computer Science or Information Technology");
            wrong++;
        }
//quetion8
        System.out.println("*QUESTION 8*");
        System.out.print("I started coding in high school.? ");
        boolean q8 = userinput.nextBoolean();
        if (q8== false){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG... I started coding when i was 12 years old.");
            wrong++;
        }

//quetion9
        System.out.println("*QUESTION 9*");
        System.out.print("I developed a pre-school registration system for my Grade 12 IT PAT project? ");
        boolean q9 = userinput.nextBoolean();
        if (q9== true){
            System.out.println("RIGHT...");
            right++;
        }
        else{
            System.out.println("WRONG...");
            wrong++;
        }

        //quetion10
        System.out.println("*QUESTION 10*");
        System.out.print("I am interested in solving real-world problems using code? ");
        boolean q10 = userinput.nextBoolean();
        if (q10 == true){
            System.out.println("RIGHT");
            right++;
        }
        else{
            System.out.println("WRONG...");
            wrong++;
        }


        double calculation;
        calculation = ((double)right/(double) totalnumofquestions)*100;
        if (calculation> 50.0){
            System.out.println("CONGRATULATIONS!!!  YOU GOT "+ calculation+ "%  on the quiz");
        } else if (calculation ==0.0) {
            System.out.println("YOU FAILED !!! , Are you really Sanele's friend?" );

        }
        System.out.println("_________________________________________________");
        System.out.println("Percentage: " + calculation + "%");
        System.out.println("TOTAL MARK");
        System.out.println(right+ " / "+ totalnumofquestions);
        System.out.println("_________________________________________________");

        //store players information in treemap


    }
}