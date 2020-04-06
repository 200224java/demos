package com.revature.services;

import com.revature.repositories.IBackOutRepo;
import com.revature.repositories.IFrontOutRepo;

public class OuterService {
	
	private IFrontOutRepo fRepo;
	private IBackOutRepo bRepo;
	
	public OuterService() {
		super();
	}

	public OuterService(IFrontOutRepo fRepo, IBackOutRepo bRepo) {
		super();
		this.fRepo = fRepo;
		this.bRepo = bRepo;
	}

	public IFrontOutRepo getfRepo() {
		return fRepo;
	}

	public void setfRepo(IFrontOutRepo fRepo) {
		this.fRepo = fRepo;
	}

	public IBackOutRepo getbRepo() {
		return bRepo;
	}

	public void setbRepo(IBackOutRepo bRepo) {
		this.bRepo = bRepo;
	}

	public String getFront() {
		return fRepo.getString();
	}
	
	public String getBack() {
		return bRepo.getString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bRepo == null) ? 0 : bRepo.hashCode());
		result = prime * result + ((fRepo == null) ? 0 : fRepo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof OuterService)) {
			return false;
		}
		OuterService other = (OuterService) obj;
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
		return "OuterService [fRepo=" + fRepo + ", bRepo=" + bRepo + "]";
	}
	
	
	

}
