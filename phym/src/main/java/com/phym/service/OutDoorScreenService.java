package com.phym.service;

import java.util.List;

import com.phym.entity.OutDoorScreen;
import com.phym.exception.OutDoorScreenException;

public interface OutDoorScreenService {
	
	//上传媒体资源
	public Boolean uploadResource(OutDoorScreen outDoor)throws OutDoorScreenException;
	//加载媒体资源
	public List<OutDoorScreen> loadOutDoor(String userName);
	//删除媒体资源
	public Boolean deleteMediaResource(String outDoorId);
	//通过id查询媒体资源
	public OutDoorScreen findOutDoorScreenById(String outDoorId);
	//修改媒体资源
	public Boolean modifyOutDoor(OutDoorScreen outDoor);
}
