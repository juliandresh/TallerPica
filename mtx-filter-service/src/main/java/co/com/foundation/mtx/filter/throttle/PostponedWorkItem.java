package co.com.foundation.mtx.filter.throttle;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class PostponedWorkItem implements Delayed {

	private final long origin;
	private final long delay;
	private final WorkItem workItem;

	public PostponedWorkItem(final WorkItem workItem, final long delay) {
		this.origin = System.currentTimeMillis();
		this.workItem = workItem;
		this.delay = delay;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(delay - (System.currentTimeMillis() - origin), TimeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Delayed delayed) {
		if (delayed == this) {
			return 0;
		}

		if (delayed instanceof PostponedWorkItem) {
			long diff = delay - ((PostponedWorkItem) delayed).delay;
			return ((diff == 0) ? 0 : ((diff < 0) ? -1 : 1));
		}

		long d = (getDelay(TimeUnit.MILLISECONDS) - delayed.getDelay(TimeUnit.MILLISECONDS));
		return ((d == 0) ? 0 : ((d < 0) ? -1 : 1));
	}

	@Override
	public String toString() {
		return "PostponedWorkItem [origin=" + origin + ", delay=" + delay + ", workItem=" + workItem + "]";
	}

}