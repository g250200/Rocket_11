package com.vti.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, String>{

	
	@Override
	public String convertToDatabaseColumn(Role role) {
		
		if (role == null) {
			return null;
		}
		return role.getCode();
	}

	
	@Override
	public Role convertToEntityAttribute(String value) {
		if (value == null) {
			return null;
		}
		for (Role role : Role.values()) {
			if (role.getCode().equals(value)) {
				return role;
			}
		}

		return null;

	}
	
}
