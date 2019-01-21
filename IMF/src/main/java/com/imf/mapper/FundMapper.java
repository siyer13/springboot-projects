package com.imf.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.imf.dao.MutualFund;

@Mapper
public interface FundMapper {

	@Select("select scheme_name, scheme_code, isin_div_payout, isin_div_reinvestment, net_asset_value, fund_value_date, load_date  from scheme where fund_name = #{fundName}")
    @Results(value = {
            @Result(property = "schemeName", column = "scheme_name"),
            @Result(property = "schemeCode", column = "scheme_code"),
            @Result(property = "isinDivPayout", column = "isin_div_payout"),
            @Result(property = "isinDivReinvestment", column = "isin_div_reinvestment"),
            @Result(property = "netAssetValue", column = "net_asset_value"),
            @Result(property = "fundValueAsOfDate", column = "fund_value_date"),
            @Result(property = "dataLoadDate", column = "load_date")
    })
	List<MutualFund> getFundsByName(@Param("fundName") String fundName);
	
	@Select("select fund_name, scheme_name, scheme_code, isin_div_payout, isin_div_reinvestment, net_asset_value, fund_value_date, load_date  from scheme where scheme_type = #{schemeType}")
    @Results(value = {
    		@Result(property = "fundName", column = "fund_name"),
            @Result(property = "schemeName", column = "scheme_name"),
            @Result(property = "schemeCode", column = "scheme_code"),
            @Result(property = "isinDivPayout", column = "isin_div_payout"),
            @Result(property = "isinDivReinvestment", column = "isin_div_reinvestment"),
            @Result(property = "netAssetValue", column = "net_asset_value"),
            @Result(property = "fundValueAsOfDate", column = "fund_value_date"),
            @Result(property = "dataLoadDate", column = "load_date")
    })
	List<MutualFund> getFundsBySchemeType(@Param("schemeType") String schemeType);
}
