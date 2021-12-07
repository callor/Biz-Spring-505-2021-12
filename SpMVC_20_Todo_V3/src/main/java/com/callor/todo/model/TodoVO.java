package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	
	private Long seq;
	private String to_sdate;
	private String to_stime;
	private String to_edate;
	private String to_etime;
	
	private String to_text;
	
	private String to_oImage;
	private String to_sImage;
	

}
