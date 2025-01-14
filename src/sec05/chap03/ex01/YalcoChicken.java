package sec05.chap03.ex01;

public class YalcoChicken {

    // static 붙은것은 본사의 정보라고 생각하면 됨
    static String brand = "얄코치킨"; // 정적 필드
    static String contact() { // 정적 메소드
        return "%s입니다. 무엇을 도와드릴까요?"
                .formatted(brand);
    }

    int no;
    String name;

    YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro() {
        // 인스턴스 메소드에서는 정적 프로퍼티 사용 가능!
        return "안녕하세요, %s %d호 %s점입니다."
                .formatted(brand, no, name);
    }
}
