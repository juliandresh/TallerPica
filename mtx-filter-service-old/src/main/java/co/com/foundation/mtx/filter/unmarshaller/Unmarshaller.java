package co.com.foundation.mtx.filter.unmarshaller;

public interface Unmarshaller<I,O> {

	O unmarshall( I input );
	
	
}
