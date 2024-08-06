import java.util.ArrayList;
public class PolynomialTermsPutInOrder {
    PolynomialTermsPutInOrder(String userInput){}

    public ArrayList<Integer> correctlyArrangedPolynomial(String userInput) {

        ArrayList<Integer> numListOfPowers = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++)
        {
            if(userInput.charAt(i) == '^')
            {
                numListOfPowers.add(Character.getNumericValue(userInput.charAt(i + 1)));
            }

            if(userInput.charAt(i) == 'x' && i < userInput.length() - 1 && userInput.charAt(i + 1) != '^')
            {
                numListOfPowers.add(1);
            }


            if (userInput.charAt(i) == ' ' && userInput.charAt(i - 1) != '+' && userInput.charAt(i - 1) != '-' && userInput.charAt(i - 2) != '^' && userInput.charAt(i - 1) != 'x')
            {
                numListOfPowers.add(0);
            }

            if(i == userInput.length() - 1)
            {
                if(userInput.charAt(userInput.length() - 2) != '^' && userInput.charAt(i) != 'x')
                    numListOfPowers.add(0);
                if(userInput.charAt(i) == 'x')
                    numListOfPowers.add(1);
            }
        }
        return numListOfPowers;
    }


}
