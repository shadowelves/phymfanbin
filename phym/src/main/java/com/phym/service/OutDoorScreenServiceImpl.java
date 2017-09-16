package com.phym.service;

import com.phym.entity.OutDoor_Screen;
import com.phym.exception.OutDoorScreenException;

public class OutDoorScreenServiceImpl implements OutDoorScreenService {

	public Boolean uploadResource(OutDoor_Screen OutDoor) throws OutDoorScreenException{
		if(OutDoor == null) {
			return false;
		}
		
		return null;
	}

}
