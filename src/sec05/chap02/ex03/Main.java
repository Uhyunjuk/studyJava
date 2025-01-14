package sec05.chap02.ex03;

public class Main {
    public static void main(String[] args) {

        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 15000),
                new ChickenMenu("양념치킨", 18000),
                new ChickenMenu("화덕치킨", 19000, "bake")
        };

        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐구이");

    }
}
