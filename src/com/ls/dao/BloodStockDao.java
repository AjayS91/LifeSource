package com.ls.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ls.dao.mapper.BloodStockMapper;
import com.ls.vo.BloodStock;

public class BloodStockDao implements BloodStockDaoInterface{
	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	public void addBloodStock(BloodStock bs) {
		String sql = "insert into bloodstock values (?,?,?,?)";
		jtemp.update(sql, new Object[] {bs.getBloodgroup(), bs.getUnits(), bs.getBid(), bs.getDid()});
		
	}

	public void updateBloodStock(BloodStock bs, int number) {
		String sql = "update bloodstock set units = ? where bid = ? and did = ?";
		jtemp.update(sql, new Object[] { bs.getUnits()+number , bs.getBid(), bs.getDid()  });
		
	}

	public List<BloodStock> getBloodStocksDonorBloodBank(int did, int bid) {
		String sql = "select * from bloodstock where did = ? and bid = ?";
		List<BloodStock> lis = jtemp.query(sql, new Object[] {did ,bid} , new BloodStockMapper());
		return lis;
	}

	public List<BloodStock> getBloodStocksDonorAllBloodBank(int did) {
		String sql = "select * from bloodstock where did = ?";
		List<BloodStock> lis = jtemp.query(sql, new Object[] {did } , new BloodStockMapper());
		return lis;
	}

	public List<BloodStock> getBloodStocksBloodBank(int bid) {
		String sql = "select * from bloodstock where bid = ?";
		List<BloodStock> lis = jtemp.query(sql, new Object[] {bid} , new BloodStockMapper());
		return lis;
	}

	public List<BloodStock> getBloodStocksBloodGroup(int bid, String bloodgroup) {
		String sql = "select * from bloodstock where bloodgroup = ? and bid = ?";
		List<BloodStock> lis = jtemp.query(sql, new Object[] {bloodgroup ,bid} , new BloodStockMapper());
		return lis;
	}


}
