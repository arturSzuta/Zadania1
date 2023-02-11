package JavaAdvanced.Day3.Enums;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Coffee latte = Coffee.LATTE;
        Coffee americano = Coffee.AMERICANO;
        Coffee espresso = Coffee.ESPRESSO;

        System.out.println(latte);
        System.out.println(Coffee.valueOf("LATTE")); // gdy nie mamy dostepu do enuma. tylk
        System.out.println(Coffee.values());
        Stream.of(Coffee.values()).forEach(System.out::println);
        for (Coffee coffee : Coffee.values()) {
            System.out.println(coffee);
        }
        System.out.println("********");
        System.out.println(DaysOfWeek.MONDAY);
        Stream.of(DaysOfWeek.values()).forEach(System.out::println);

        System.out.println("********");

        OrderCoffee orderAmericano = new OrderCoffee(americano, 10);
        OrderCoffee orderEspresso = new OrderCoffee(Coffee.ESPRESSO, 10);
        OrderCoffee orderLatte = new OrderCoffee(Coffee.LATTE, 10);

        OrderCoffee[] typTablicowy = {orderAmericano, orderLatte, orderEspresso};
        OrderCoffee[] typTablicowy2 = new OrderCoffee[3];
        typTablicowy2[0] = orderAmericano;
        typTablicowy2[1] = orderLatte;
        typTablicowy2[2] = orderEspresso;

        for(OrderCoffee orderCoffee : typTablicowy2){
            System.out.println(orderCoffee.price);
            System.out.println(orderCoffee.coffee);
            System.out.println(orderCoffee.coffee.milk);
        }

    }
}