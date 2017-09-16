package com.phym.service;

import com.phym.entity.OutDoor_Screen;
import com.phym.exception.OutDoorScreenException;

public interface OutDoorScreenService {
	
	//上传媒体资源
	public Boolean uploadResource(OutDoor_Screen OutDoor)throws OutDoorScreenException;
	
}
