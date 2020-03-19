package com.revature.models;

import java.time.LocalDateTime;

public class Reimbursement {

	private int reimb_id;
	private double reimb_amount;
	private LocalDateTime reimb_submitted;
	private LocalDateTime reimb_resolved;
	private String reimb_description;
	// Some type for the receipt
	private Employee reimb_author;
	private Employee reimb_resolver;
	private Status reimb_status;
	private Type reimb_type;
	
	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimb_id, double reimb_amount, LocalDateTime reimb_submitted, LocalDateTime reimb_resolved,
			String reimb_description, Employee reimb_author, Employee reimb_resolver, Status reimb_status,
			Type reimb_type) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status = reimb_status;
		this.reimb_type = reimb_type;
	}	
}
