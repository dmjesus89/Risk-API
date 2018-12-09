package com.srm.riskapi.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srm.riskapi.config.util.ObjectMapperUtils;
import com.srm.riskapi.mvc.model.dto.RiskDTO;
import com.srm.riskapi.mvc.model.entity.RiskEntity;
import com.srm.riskapi.mvc.repository.RiskRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RiskServiceImpl {

	@Autowired
	private RiskRepository riskRepository;

	@Autowired
	private ObjectMapperUtils objectMapperUtils;

	public List<RiskDTO> getRisks() {
		List<RiskEntity> listRiskEntity = (List<RiskEntity>) riskRepository.findAll();
		List<RiskDTO> listRiskDTO = objectMapperUtils.mapAll(listRiskEntity, RiskDTO.class);
		return listRiskDTO;
	}

}
