package acorn.study;

public class TV extends AudioTVParent {
    private int size;

    public TV() {}

    public TV(boolean power, int volumn, int size) {
        super(power, volumn); // AudioTVParent의 생성자 호출
        this.size = size; // size 필드 초기화
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void watch() {
        String sOnOff = getPower() ? "Have fun" : "Switch on"; // Getter 메서드 사용
        System.out.println(sOnOff);
    }
}
