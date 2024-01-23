package days17;

//삼성에서 만든 엔진
public class S_Engine implements Engine {
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.9;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.8;

	}

	@Override
	public void stop() {
		this.speed =0;

	}


}
