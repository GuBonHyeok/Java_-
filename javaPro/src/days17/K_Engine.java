package days17;

//기아에서 만든 엔진
public class K_Engine implements Engine {
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.5;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.5;

	}

	@Override
	public void stop() {
		this.speed =0;

	}

}
