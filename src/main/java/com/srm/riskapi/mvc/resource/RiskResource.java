package com.srm.riskapi.mvc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srm.riskapi.mvc.model.dto.RiskDTO;
import com.srm.riskapi.mvc.service.RiskServiceImpl;

@RestController
@RequestMapping("/api/risks")
public class RiskResource {

	@Autowired
	private RiskServiceImpl riskService;

	@GetMapping
	public ResponseEntity<List<RiskDTO>> getUsers() {
		List<RiskDTO> listUser = riskService.getRisks();
		if (!listUser.isEmpty()) {
			return ResponseEntity.ok(listUser);
		}
		return ResponseEntity.ok().build();
	}

}
