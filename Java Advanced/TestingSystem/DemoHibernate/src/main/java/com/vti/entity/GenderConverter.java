package com.vti.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, String> {

	@Override
	public String convertToDatabaseColumn(Gender gender) {
		if (gender == null) {
			return null;
		}
		return gender.getValue();
	}

	@Override
	public Gender convertToEntityAttribute(String value) {
		
		if (value == null) {
			return null;
		}
		
		switch (value) {
		case "M":

			return Gender.MALE;
		case "F":

			return Gender.FEMALE;
		case "U":

			return Gender.UNKNOWN;

		default:
			throw new IllegalArgumentException("Gender [" + value + "] not supported.");
		}
	}

}
