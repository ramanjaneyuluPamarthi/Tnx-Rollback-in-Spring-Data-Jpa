package com.nit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
