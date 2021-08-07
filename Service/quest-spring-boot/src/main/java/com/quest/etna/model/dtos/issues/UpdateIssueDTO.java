package com.quest.etna.model.dtos.issues;

import com.quest.etna.model.enums.IssuePriority;
import com.quest.etna.model.enums.IssueStatus;
import com.quest.etna.model.enums.IssueType;


public class UpdateIssueDTO
{

	private String title;
	private String description;
	private IssueType type;
	private IssueStatus status;
	private IssuePriority priority;
	private Integer milestoneId;
	private Integer assigneeId;
	
	
	public String getTitle()
	{
		return title;
	}
	
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
	public String getDescription()
	{
		return description;
	}
	
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	
	public IssueType getType()
	{
		return type;
	}
	
	
	public void setType(IssueType type)
	{
		this.type = type;
	}
	
	
	public IssueStatus getStatus()
	{
		return status;
	}
	
	
	public void setStatus(IssueStatus status)
	{
		this.status = status;
	}
	
	
	public IssuePriority getPriority()
	{
		return priority;
	}
	
	
	public void setPriority(IssuePriority priority)
	{
		this.priority = priority;
	}
	
	
	public Integer getMilestoneId()
	{
		return milestoneId;
	}
	
	
	public void setMilestoneId(Integer milestoneId)
	{
		this.milestoneId = milestoneId;
	}
	
	
	public Integer getAssigneeId()
	{
		return assigneeId;
	}
	
	
	public void setAssigneeId(Integer assigneeId)
	{
		this.assigneeId = assigneeId;
	}
}
