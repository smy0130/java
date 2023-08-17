package acorn.study;

public class Audio extends AudioTVParent {
	
	public Audio() {}

	public Audio(boolean power, int volumn) {
		super(power, volumn); // AudioTVParent의 생성자 호출
	}
	
	public void tune() {
		String sOnOff = getPower() ? "ha ha ha..." : "turn it on"; // Getter 메서드 사용
		System.out.println(sOnOff);
	}
}