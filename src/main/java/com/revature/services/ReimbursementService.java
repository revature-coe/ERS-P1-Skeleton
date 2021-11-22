package com.revature.services;

import com.revature.models.Reimbursement;
import com.revature.models.Status;

import java.util.List;

/**
 * The ReimbursementService should handle the submission, processing,
 * and retrieval for the ERS application.
 *
 * {@code process} and {@code getReimbursementsByStatus} are the minimum methods required;
 * however, additional methods can be added.
 *
 * Examples:
 * <ul>
 *     <li>Create Reimbursement</li>
 *     <li>Update Reimbursement</li>
 *     <li>Delete Reimbursement</li>
 *     <li>Get Reimbursements by ID</li>
 *     <li>Get Reimbursements by Author</li>
 *     <li>Get Reimbursements by Resolver</li>
 *     <li>Get All Reimbursements</li>
 * </ul>
 */
public class ReimbursementService {

    /**
     * <ul>
     *     <li>Should ensure that the user is logged in as a Finance Manager</li>
     *     <li>Must throw exception if user is not logged in as a Finance Manager</li>
     *     <li>Should ensure that the reimbursement request exists</li>
     *     <li>Must throw exception if the reimbursement request is not found</li>
     *     <li>Should persist the updated reimbursement status with resolver information</li>
     *     <li>Must throw exception if persistence is unsuccessful</li>
     * </ul>
     *
     * Note: unprocessedReimbursement will have a status of PENDING, additional fields may be null.
     * After processing, the reimbursement will have its status changed to either APPROVED or DENIED.
     */
    public Reimbursement process(Reimbursement unprocessedReimbursement) {
        return null;
    }

    /**
     * <ul>
     *     <li>Should retrieve all reimbursements with the correct status</li>
     *     <li>Must throw exception if there are no reimbursements with the status</li>
     * </ul>
     *
     */
    public List<Reimbursement> getReimbursementsByStatus(Status status) {
        return null;
    }

}
