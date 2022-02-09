// *This is a simple program that requires the user to enter a numerical value
// *that returns the respective grade scored. If the score is above 100, the
// *program will throw an exception and terminate the program


public class grade { //start of class grade
    public static void main(String[] args){ //main subroutine
        int score; //score is of type int. No decimals


        System.out.println("Enter the numerical score without decimals");
        score = TextIO.getInt(); //entry of numerical score by user

        System.out.println("Your grade is " + letterGrade(score)); //expected output

    }
    static char letterGrade(int score){ //letterGrade subroutine for score function
            if (score > 100)  //throw an exception if input is greater than 100
                throw new IllegalArgumentException("Score cannot not be greater than 100");

            //if statements for score function
            if (score >= 90)
                return 'A';
            else if (score >= 80)
                return 'B';
            else if (score >= 70)
                return 'C';
            else if (score >= 60)
                return 'D';
            else if (score >= 50)
                return 'E';
            else
                return 'F';

    } //end of letterGrade() subroutine
}// end of class grade
