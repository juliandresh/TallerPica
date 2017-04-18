package co.com.foundation.mtx.filter.mediator.imp;

import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;

import co.com.foundation.mtx.filter.mediator.Mediator;
import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;
import co.com.foundation.mtx.filter.throttle.PostponedWorkItem;
import co.com.foundation.mtx.filter.throttle.WorkItem;
import co.com.foundation.mtx.filter.unmarshaller.Unmarshaller;
import co.com.foundation.mtx.filter.unmarshaller.impl.DOMUnmarshaller;

public class ThrottleMediator implements Mediator<FilterCriteriaDTO, Boolean> {

	private static ThrottleMediator INSTANCE;
	
	private Unmarshaller<String,Document> unmarshaller = DOMUnmarshaller.newInstance();
	
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

	public Boolean process(final FilterCriteriaDTO input) {
		
		boolean result = true;
		
		try {
			String info = FileUtils.readFileToString(new File("C://data/aircraft-operations-info.xml"),"UTF-8");
			Document document = unmarshaller.unmarshall(info);
			/**TODO: evaluate document to obtain response**/
			
			WorkItem item = new WorkItem();
			item.setCriteriaDTO(input);
			item.setResult(result);
			item.setXmlContent(document);
			PostponedWorkItem postponedWorkItem = new PostponedWorkItem(item, delay);
			delayedQueue.add(postponedWorkItem);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
