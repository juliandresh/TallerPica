package co.com.foundation.mtx.filter.mediator.imp;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import co.com.foundation.mtx.filter.mediator.Mediator;
import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;
import co.com.foundation.mtx.filter.operations.info.AircraftInformation;
import co.com.foundation.mtx.filter.throttle.PostponedWorkItem;
import co.com.foundation.mtx.filter.throttle.WorkItem;
import co.com.foundation.mtx.filter.unmarshaller.impl.JAXBUnmarshaller;

public class ThrottleMediator implements Mediator<FilterCriteriaDTO, Boolean> {

	private static ThrottleMediator INSTANCE;
	
	private JAXBContext jaxbContext = JAXBUnmarshaller.getJAXBInstance(AircraftInformation.class);
	
	// -------------------------
	private long delay = 4000;
	private final Queue<PostponedWorkItem> delayedQueue = new DelayQueue<PostponedWorkItem>();
	
	
	private ThrottleMediator() {
	}

	public static ThrottleMediator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ThrottleMediator();
		return INSTANCE;
	}

	public Boolean process(final FilterCriteriaDTO input){
		
		boolean result = true;
		AircraftInformation aircraftInformation = null;
		Unmarshaller jaxbUnmarshaller;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			aircraftInformation = (AircraftInformation) jaxbUnmarshaller.unmarshal(new File("C://data/aircraft-operations-info.xml"));
		} catch (JAXBException e){		
			e.printStackTrace();
		}
		
		WorkItem item = new WorkItem();
		item.setCriteriaDTO(input);
		item.setResult(result);
		item.setXmlContent(aircraftInformation);
		
		PostponedWorkItem postponedWorkItem = new PostponedWorkItem(item, delay);
		delayedQueue.add(postponedWorkItem);
		
		return result;
	}
}
