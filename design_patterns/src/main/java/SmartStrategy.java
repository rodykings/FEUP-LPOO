public class SmartStrategy implements OrderingStrategy{


    private boolean happyHour;
    private boolean want = false;
    private StringRecipe recipe;
    private StringDrink drink;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
            if(happyHour || bar.isHappyHour()){
                bar.order(drink, recipe);
            }else{
                want = true;
                this.recipe = recipe; this.drink=drink;
            }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.happyHour = true;
        if(want){
            bar.order(drink, recipe);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

        this.happyHour = false;
    }
}
