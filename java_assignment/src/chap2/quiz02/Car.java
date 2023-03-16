package chap2.quiz02;

public class Car {
	
	private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	public Car(String model) {
		super();
		this.model = model;
	}

	void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		this.injectGasoline();
		this.injectOil();
		start = true; //시동on
		this.moveCylinder();
		System.out.println("시동이 걸렸습니다");
	}
	
	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	void engineStop() {
		if(this.speed > 0 ) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return; //탈출기능
		} else if(this.speed == 0) {
			if(this.mode != 'P') {
				System.out.println("P 모드로 먼저 변속기를 변경하세요. ");
				return;
			}
		}
		start = false; //0 이상아니고 p모드면 시동꺼짐
		System.out.println("시동이 꺼졌습니다.");
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			System.out.println("속도는 0미만, 200이상일 수 없습니다.");
			return;
		} else if(!start) {
			System.out.println("시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.");
			return;
		}
		switch(mode) {
			case'R':
				if(speed > 40) {
					System.out.println("R모드는 속도를 40초과해서 지정할 수 없습니다");
					break;
				}
				this.speed = speed; //40미만이라면 속도저장
				System.out.printf("속도: %d", speed);
				break;
			case'D':
				this.speed = speed;
				System.out.printf("속도: %d", speed);
				break;
			default:
				mode = 'P';
				System.out.println("D나 R모드가 아니라면 속도를 지정할 수 없습니다.");
		}
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		switch(mode) {
		case'P':case'R':case'N':case'D':
			this.mode = mode;
			break;
		default :
			System.out.println("P,R,N,D 중 하나 선택하세요");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
	
	
	
	
	
}
