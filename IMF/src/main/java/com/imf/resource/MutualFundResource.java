package com.imf.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imf.dao.MutualFund;
import com.imf.mapper.FundMapper;
import com.imf.service.MutualFundService;

@RestController
@RequestMapping("/api")
public class MutualFundResource implements MutualFundService {

	@Autowired
	private FundMapper fundMapper;
	
	@Override
	@GetMapping("/getFundsByName")
	public List<MutualFund> getFundsByName(String fundName) {
		
		return fundMapper.getFundsByName(fundName);
	}

}
