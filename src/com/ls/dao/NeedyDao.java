package com.ls.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ls.dao.mapper.NeedyRowMapper;
import com.ls.vo.Location;
import com.ls.vo.Needy;

public class NeedyDao {

	private JdbcTemplate jtemp;

	public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	public int addNeedy(int nid, String nname, String npwd, Double nlocationx, Double nlocationy, String nbloodgroup,
			int nage, String ncontact, String ngender) {
		String qy = "insert into needy values(?,?,?,?,?,?,?,?,?)";
		Object[] param = { nid, nname, npwd, nlocationx, nlocationy, nbloodgroup, nage, ncontact, ngender };
		jtemp.update(qy, param);
		return 1;
	}

	public List<Needy> getAllNeedy() {
		String qy = "select * from needy";
		List<Needy> lst = jtemp.query(qy, new NeedyRowMapper());
		return lst;
	}

	public Needy getNeedy(int nid) {
		String qy = "select * from needy where nid=?";
		Object[] param = { nid };
		Needy n = jtemp.queryForObject(qy, param, new NeedyRowMapper());
		return n;
	}

	public int updateLocation(int nid, double x, double y) {
		String qy = "update Needy set (nlocationx,nlocationy) = (?,?)  where nid=?";
		Object[] param = { x, y, nid };
		jtemp.update(qy, param);
		return 1;
	}

	public Location getLocation(int nid) {
		String qy = "select * from needy where nid=?";
		Object[] param = { nid };
		Needy n = jtemp.queryForObject(qy, param, new NeedyRowMapper());
		return new Location(n.getNlocationx(), n.getNlocationy());
	}
}

/*
 * package com.ls.dao;
 *
 * import java.util.Date; import java.util.List; import java.util.Map;
 *
 * import com.ls.dao.mapper.NeedyRowMapper; import com.ls.vo.Needy; import
 * com.ls.vo.Location;
 *
 * public interface DaoNeedyI {
 *
 * public Needy getNeedy(int nid); public List<Needy> getAllNeedy(); public int
 * updateLocation(int nid, double x, double y); public Location getLocation(int
 * nid); public int addNeedyint nid, String nname, String npwd, Double
 * nlocationx, Double nlocationy, String nbloodgroup, int nage, String ncontact,
 * String ngender);
 *
 * }
 */
