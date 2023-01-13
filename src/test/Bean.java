package test;

import java.util.ArrayList;
import java.util.List;

public class Bean {
	
	long programId;
	long camapignId;
	List<Activity> activityList = new ArrayList<>();
	
	public long getProgramId() {
		return programId;
	}
	public void setProgramId(long programId) {
		this.programId = programId;
	}
	public long getCamapignId() {
		return camapignId;
	}
	public void setCamapignId(long camapignId) {
		this.camapignId = camapignId;
	}
	public List<Activity> getActivityList() {
		return activityList;
	}
	public void setActivityList(List<Activity> activity) {
		this.activityList.addAll(activity);
	}
	

}

class Activity{
	long activityId;
	String type;
	long linkId;
	String bot; 
	
	public String getBot() {
		return bot;
	}
	public void setBot(String bot) {
		this.bot = bot;
	}
	public long getActivityId() {
		return activityId;
	}
	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getLinkId() {
		return linkId;
	}
	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}
}
