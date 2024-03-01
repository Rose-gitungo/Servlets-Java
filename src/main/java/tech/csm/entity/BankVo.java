package tech.csm.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BankVo {

	private String BankId;
	private String IFSC;
	private String bankName;
}
