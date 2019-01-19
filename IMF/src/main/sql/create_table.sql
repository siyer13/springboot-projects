CREATE TABLE `mutual_fund`.`scheme` (
  `fund_name` varchar(50) NOT NULL,
  `scheme_type` varchar(100) NOT NULL,
  `scheme_code` varchar(7) NOT NULL,
  `scheme_name` varchar(450) NOT NULL,
  `isin_div_payout` varchar(45) DEFAULT NULL,
  `isin_div_reinvestment` varchar(45) DEFAULT NULL,
  `net_asset_value` decimal(13,6) NOT NULL,
  `fund_value_date` varchar(11) NOT NULL,
  `load_date` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8