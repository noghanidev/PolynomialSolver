public class PolynomialCredibilityChecker {
    private String userInput;
    private int[] numList;

    PolynomialCredibilityChecker(String userInput)
    {
        this.userInput = userInput;
        numList = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

    public boolean credibleOrNot()
    {
        boolean credibleOrNot = true;

        int numOfPlusAndMinus = 1;  //number of repititions
        for(int i = 0; i < userInput.length(); i++)
        {
            if(userInput.charAt(i) == '+' || userInput.charAt(i) == '-')
            {
                numOfPlusAndMinus++;
            }
        }

        for(int i = 0; i < numOfPlusAndMinus; i++)
        {

        }
        return credibleOrNot;
    }



}
