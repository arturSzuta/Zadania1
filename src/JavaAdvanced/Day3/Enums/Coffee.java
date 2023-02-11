package JavaAdvanced.Day3.Enums;

public enum Coffee {
    LATTE(10, Roast.BLONDE),
    ESPRESSO(0,Roast.DARK),
    AMERICANO(5, Roast.MEDIUM);

    int milk;
    Roast roast;

    Coffee(int milk, Roast roast){
        this.milk = milk;
        this.roast = roast;
    }


}
