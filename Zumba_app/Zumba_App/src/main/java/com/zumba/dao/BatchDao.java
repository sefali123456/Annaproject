package com.zumba.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.batch;
import com.zumba.resource.DbResource;

public class BatchDao {
	public int storeBatchDetails(batch batch) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into batch values(?,?,?)");
			pstmt.setInt(1, batch.getBatchid());
			pstmt.setString(2, batch.getTypeofbatch());
			pstmt.setString(3, batch.getTime());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Batch insert error "+e.toString());
			return 0;

		}
	}
	
	public List<batch> findAllBatchInfo() {
		List<batch> listOfBatch = new ArrayList<>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from batch");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				batch batch =new batch();
				batch.setBatchid(rs.getInt(1));
				batch.setTypeofbatch(rs.getString(2));
				batch.setTime(rs.getString(3));
				listOfBatch.add(batch);
			}
		} catch (Exception e) {
			System.err.println("Batch retrieve error "+e.toString());
		}
		return listOfBatch;

		}

}