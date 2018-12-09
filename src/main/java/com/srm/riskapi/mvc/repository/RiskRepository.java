package com.srm.riskapi.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.srm.riskapi.mvc.model.entity.RiskEntity;

public interface RiskRepository extends CrudRepository<RiskEntity, Long> {

}
