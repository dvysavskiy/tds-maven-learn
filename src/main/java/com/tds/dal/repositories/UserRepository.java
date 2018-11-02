package com.tds.dal.repositories;

import com.tds.dal.modal.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
