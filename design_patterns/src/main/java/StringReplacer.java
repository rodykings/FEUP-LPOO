public class StringReplacer implements StringTransformer{

    private char a;
    private char b;

    public StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink) {
        String replaced = drink.getText().replace(this.a, this.b);
        drink.setText(replaced);
    }
}
