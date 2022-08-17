package com.spring.bean.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao cdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return cdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.cdiDao = someCdiDao;
	}
	
}
