package com.newshop.newshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.newshop.newshop.model.Account;

@Repository
public interface  AccountRepository extends JpaRepository<Account, Long> {

}
