package com.ls.dao;

import java.util.List;

import com.ls.vo.Requestjksf;

public interface RequestDaoInterface {

	public int registerRequest(Requestjksf r);
	public List<Requestjksf> getAllRequests();
	public Requestjksf getRequest(int rid);
	public List<Requestjksf> getRequestsWithBloodGroup(String bloodGroup);
	public int updateRequestStatus(int rid, int status);

}