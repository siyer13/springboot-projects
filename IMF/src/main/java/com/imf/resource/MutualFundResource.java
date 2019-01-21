package com.imf.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@Override
	@GetMapping("/getFundsBySchemeType")
	public List<Map<String, List<MutualFund>>> getFundsBySchemeType(String schemeType) {
		List<MutualFund> mutualFundList = new ArrayList<>();
		MutualFund mf = null;
		Map<String,List<MutualFund>> fundMap = new HashMap<>();
		List<Map<String, List<MutualFund>>> fundsBySchemeType = new ArrayList<>();;
		List<MutualFund> fundList ;
		mutualFundList = fundMapper.getFundsBySchemeType(schemeType);
		for(MutualFund entry : mutualFundList) {
			fundList = null;
			if(fundMap.containsKey(entry.getFundName())) {
				fundList = fundMap.get(entry.getFundName());
				mf = new MutualFund();
				mf.setSchemeName(entry.getSchemeName());
				mf.setSchemeCode(entry.getSchemeCode());
				mf.setIsinDivPayout(entry.getIsinDivPayout());
				mf.setIsinDivReinvestment(entry.getIsinDivReinvestment());
				mf.setNetAssetValue(entry.getNetAssetValue());
				mf.setFundValueAsOfDate(entry.getFundValueAsOfDate());
				mf.setDataLoadDate(entry.getDataLoadDate());
				fundList.add(mf);
				fundMap.put(entry.getFundName(), fundList);
			} else {
				fundList = new ArrayList<>();
				mf = new MutualFund();
				mf.setSchemeCode(entry.getSchemeCode());
				mf.setSchemeName(entry.getSchemeName());
				mf.setIsinDivPayout(entry.getIsinDivPayout());
				mf.setIsinDivReinvestment(entry.getIsinDivReinvestment());
				mf.setNetAssetValue(entry.getNetAssetValue());
				mf.setFundValueAsOfDate(entry.getFundValueAsOfDate());
				mf.setDataLoadDate(entry.getDataLoadDate());
				fundList.add(mf);
				fundMap.put(entry.getFundName(), fundList);
			}
		}
		fundsBySchemeType.add(fundMap);
		return fundsBySchemeType;
	}
	
	@Override
	@GetMapping("/getFundBySchemeName")
	public List<MutualFund> getFundBySchemeName(String schemeName) {
		return fundMapper.getFundBySchemeName(schemeName);
	}
		
}
