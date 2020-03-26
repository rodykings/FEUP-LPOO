import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        char str[] = drink.getText().toCharArray();
        char finalStr[]  = new char[str.length];
        int counter =0;
        for(char c:str){
            if(isLowerCase(c))
                finalStr[counter] = toUpperCase(c);
            else
                finalStr[counter] = toLowerCase(c);
            counter++;
        }

        String string = new String(finalStr);
        drink.setText(string);

    }
}
