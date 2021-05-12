package com.vti.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class GenerationTypeConverter implements AttributeConverter<GenerationType, String> {

	
	@Override
	public String convertToDatabaseColumn(GenerationType generationType) {
		if (generationType==null) {
			return null;
		}
		return generationType.getValue();
	}

	
	@Override
	public GenerationType convertToEntityAttribute(String value) {
		if (value == null) {
			return null;
		}
		
		for (GenerationType generationType : GenerationType.values()) {
			if (generationType.getValue().equals(value)) {
				return generationType;
			}
		}
		return null;
	}

}
