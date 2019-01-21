package com.imf.service;

import java.util.List;
import java.util.Map;

import com.imf.dao.MutualFund;

public interface MutualFundService {
	
	public List<?> getFundsByName(String fundName);
	
	public List<Map<String, List<MutualFund>>> getFundsBySchemeType(String schemeType);
	
	public List<?> getFundBySchemeName(String schemeName);

}
