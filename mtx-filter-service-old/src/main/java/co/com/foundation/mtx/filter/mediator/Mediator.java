package co.com.foundation.mtx.filter.mediator;

public interface Mediator <I,O> {

	O process( I input );
	
}
