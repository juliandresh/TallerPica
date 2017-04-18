package co.com.foundation.javeriana.sandbox.component.workflow;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class WorkflowBusinessComponent {

	public void validateCredit(){
		/** validate credit logic **/
		sleep(2000);
	}
	
	public void persistInformation(){
		/** persistence logic **/
		sleep(1200);
	}
	
	public void deliverTransaction(){
		/** delivering logic **/
		sleep(800);
	}
	
	public String generateTransactionId(){
		String id = "000-";
		Random r = new Random();
		for( int i=0;i<650;++i ){
			id = id+r.nextInt();
		}
		
		return id;
	}
	
	private void sleep( long ms ){
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
