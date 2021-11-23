package com.revature.repositories;

import com.revature.models.Reimbursement;
import com.revature.models.Status;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReimbursementDAO {

    public Optional<Reimbursement> getById(int id) {
        return Optional.empty();
    }

    public List<Reimbursement> getByStatus(Status status) {
        return Collections.emptyList();
    }
    
    public Reimbursement update(Reimbursement unprocessedReimbursement) {
    	return null;
    }
}
