package com.phym.dao;

import java.util.List;

import com.phym.entity.OutDoorScreen;


public interface OutDoorScreenDao {
	//添加媒体资源
	public int insertOutDoor(OutDoorScreen outDoor);
	//显示媒体资源
	public List<OutDoorScreen> loadOutDoor(String userName);
	//通过资源id查找媒体资源
	public OutDoorScreen findOutDoorScreenById(String outDoorId);
	//修改媒体资源
	public int modifyOutDoor(OutDoorScreen outDoor);
	//删除媒体资源
	public int deleteOutDoor(String outDoorId);
}
