package com.yumbiryani.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="biryani_table")
public class biryani {
	@Id 
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniPrice;
	private String biryaniDesc;

}
