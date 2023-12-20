package com.nt.beans;



import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Customer {
	
	private Integer cid;
	private String cname;
	private String addrs;
	//private String[] favColors;
	//private  List<String> studies;
	//private Map<String, Object>idDetails;
	//private Company company;

}
