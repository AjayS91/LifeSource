package com.ls.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ls.vo.Donor;

public class DonorResultSetExtractor implements ResultSetExtractor<Donor> {

	public Donor extractData(ResultSet rs) throws SQLException,DataAccessException {
		Donor donor = new Donor();
		donor.setDid(rs.getInt(1));
		donor.setDname(rs.getString(2));
		donor.setDpwd(rs.getString(3));
		donor.setDlocationx(rs.getDouble(4));
		donor.setDlocationy(rs.getDouble(5));
		donor.setDbloodgroup(rs.getString(6));
		donor.setDage(rs.getInt(7));
		donor.setDcontact(rs.getString(8));
		donor.setDgender(rs.getString(9));

		return donor;
	}

}
