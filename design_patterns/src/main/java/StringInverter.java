public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder input = new StringBuilder();
        input.append(drink.getText());
        input = input.reverse();
        drink.setText(input.toString());
    }
}
