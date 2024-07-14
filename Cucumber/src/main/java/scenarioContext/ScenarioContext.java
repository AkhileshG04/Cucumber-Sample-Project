package scenarioContext;

import java.util.HashMap;
import java.util.Map;

import context.GoogleSearch;

public class ScenarioContext {

	 private Map<String, Object> scenarioContext;

	    public ScenarioContext(){
	        scenarioContext = new HashMap<String, Object>();
	    }

	    public void setContext(GoogleSearch key, Object value) {
	        scenarioContext.put(key.toString(), value);
	    }

	    public Object getContext(GoogleSearch key){
	        return scenarioContext.get(key.toString());
	    }

	    public Boolean isContains(GoogleSearch key){
	        return scenarioContext.containsKey(key.toString());
	    }
	    
}
