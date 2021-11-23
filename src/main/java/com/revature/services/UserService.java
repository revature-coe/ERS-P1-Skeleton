package com.revature.services;

import java.util.Optional;

import com.revature.models.User;

/**
 * The UserService should handle the processing and retrieval of Users for the ERS application.
 *
 * {@code getByUsername} and {@code getById} are the minimum methods required;
 * however, additional methods can be added.
 *
 * Examples:
 * <ul>
 *     <li>Update User Information</li>
 *     <li>Get Users by Email</li>
 *     <li>Get All Users</li>
 * </ul>
 */
public class UserService {

	/**
     * <ul>
     *     <li>Should retrieve a User with the corresponding username or an empty optional if there is no match.</li>
     * </ul>
     */
	public Optional<User> getByUsername(String username) {
		return Optional.empty();
	}
	
	/**
     * <ul>
     *     <li>Should retrieve a User with the corresponding id or an empty optional if there is no match.</li>
     * </ul>
     */
	public Optional<User> getById(int id) {
		return Optional.empty();
	}
}
