public class PolynomialCredibilityChecker {
    private final String userInput;
    private final char[] acceptableCharacters;

    PolynomialCredibilityChecker(String userInput)
    {
        this.userInput = userInput;
        acceptableCharacters = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'x', '^', '+', '-', ' ', '.'};

    }

    public boolean credibleOrNot()
    {
        boolean credibleOrNot = true;
        for(int i = 0; i < userInput.length(); i++)
        {
            if(userInput.charAt(i) == 'x' && i != userInput.length() - 1)
            {
                if(userInput.charAt(i + 1) != '^' && userInput.charAt(i + 1) != ' ')
                {
                    return false;
                }
            }

            if(userInput.charAt(i) == '+' || userInput.charAt(i) == '-')
            {
                if(userInput.charAt(i - 1) != ' ' || userInput.charAt(i + 1) != ' ')
                {
                    return false;
                }
            }

            if(userInput.charAt(i) == '.')
            {
                boolean isThereANumberAfterTheDecimal = false;
                if(userInput.charAt(userInput.length() - 1) == '.')
                    return false;
                for(int j = 0; j < 10; j++)
                {
                    if(i != userInput.length() - 1 &&userInput.charAt(i + 1) == acceptableCharacters[j])
                    {
                        isThereANumberAfterTheDecimal = true;
                        break;
                    }
                }
                if(!isThereANumberAfterTheDecimal)
                    return false;
            }

            for (char acceptableCharacter : acceptableCharacters)
            {
                if (userInput.charAt(i) != acceptableCharacter)
                {
                    credibleOrNot = false;
                }

                else
                {
                    credibleOrNot = true;
                    break;
                }
            }
            if(!credibleOrNot)
            {
                return credibleOrNot;
            }
        }
        return credibleOrNot;
    }



}
