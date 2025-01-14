package sec05.chap01.ex03;

public class Main {
    public static void main(String[] args) {

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        YalcoChicken store2 = new YalcoChicken(4, "강남");
        YalcoChicken store3 = new YalcoChicken(9, "제주");

        String[] intros = {store1.intro(), store2.intro(), store3.intro()};
    }
}
