package com.ls.dao;

import java.util.List;

import com.ls.vo.BloodStock;

public interface BloodStockDaoInterface {
	public void addBloodStock(BloodStock bs);
	public void updateBloodStock(BloodStock bs, int number);
	public List<BloodStock> getBloodStocksDonorBloodBank(int did, int bid);
	public List<BloodStock> getBloodStocksDonorAllBloodBank(int did);
	public List<BloodStock> getBloodStocksBloodBank(int bid);
	public List<BloodStock> getBloodStocksBloodGroup(int bid, String bloodgroup);
	
}
