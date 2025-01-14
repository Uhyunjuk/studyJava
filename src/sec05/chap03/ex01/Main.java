package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {

        // 정적 필드와 메소드는 인스턴스 생성하지 않고 그냥 사용
        String ycBrand = YalcoChicken.brand;
        String ycContact = YalcoChicken.contact();

        // 일반 인스턴스 필드와 메소드는 인스턴스 생성 후 접근해야함
        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String store1Intro = store1.intro();

        // 인스턴스의 static 프로퍼티 호출은 권장하지 않음
        // 혼란 초래, IDE에서도 자동완성 x
        String brand = store1.brand;
        String contact = store1.contact();
    }
}
