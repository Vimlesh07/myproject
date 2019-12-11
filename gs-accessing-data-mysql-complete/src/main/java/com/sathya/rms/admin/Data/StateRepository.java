package com.sathya.rms.admin.Data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
 public Optional<State> findBystid(String stid);
}
