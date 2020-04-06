package com.revature.services;

import com.revature.repositories.IBackInRepo;
import com.revature.repositories.IFrontInRepo;

public class InnerService {
	
	private IFrontInRepo fRepo;
	private IBackInRepo bRepo;
	
	public InnerService() {
		super();
	}
	
	public InnerService(IFrontInRepo fRepo, IBackInRepo bRepo) {
		super();
		this.fRepo = fRepo;
		this.bRepo = bRepo;
	}
	public IFrontInRepo getfRepo() {
		return fRepo;
	}
	public void setfRepo(IFrontInRepo fRepo) {
		this.fRepo = fRepo;
	}
	public IBackInRepo getbRepo() {
		return bRepo;
	}
	public void setbRepo(IBackInRepo bRepo) {
		this.bRepo = bRepo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bRepo == null) ? 0 : bRepo.hashCode());
		result = prime * result + ((fRepo == null) ? 0 : fRepo.hashCode());
		return result;
	}
	
	public String getFront() {
		return fRepo.getString();
	}
	
	public String getBack() {
		return bRepo.getString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InnerService)) {
			return false;
		}
		InnerService other = (InnerService) obj;
		if (bRepo == null) {
			if (other.bRepo != null) {
				return false;
			}
		} else if (!bRepo.equals(other.bRepo)) {
			return false;
		}
		if (fRepo == null) {
			if (other.fRepo != null) {
				return false;
			}
		} else if (!fRepo.equals(other.fRepo)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "InnerService [fRepo=" + fRepo + ", bRepo=" + bRepo + "]";
	}
	
	

}
