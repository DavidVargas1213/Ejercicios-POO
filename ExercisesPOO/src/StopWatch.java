
public class StopWatch {

	Long startTime, endTime;

	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();

	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public void getElapsedTime() {
		Long elapsedTime = endTime - startTime;
		System.out.println(elapsedTime);
	}

	public Long getStartTime() {
		return startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

}
