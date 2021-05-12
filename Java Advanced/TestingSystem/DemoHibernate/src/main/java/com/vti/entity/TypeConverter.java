package com.vti.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TypeConverter implements AttributeConverter<Type, String> {

	
	@Override
	public String convertToDatabaseColumn(Type type) {
		if (type==null) {
			return null;
		}
		return type.getValue();
	}

	
	@Override
	public Type convertToEntityAttribute(String value) {
		if (value==null) {
			return null;
		}
		for (Type type : Type.values()) {
			if (type.getValue().equals(value)) {
				return type;
			}
		}

		return null;
	}

}
