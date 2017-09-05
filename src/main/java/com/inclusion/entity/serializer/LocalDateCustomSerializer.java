package com.inclusion.entity.serializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateCustomSerializer extends JsonSerializer<LocalDate>{

	@Override
	public void serialize(LocalDate arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonProcessingException {		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		arg1.writeObject(arg0.format(formatter));
		
	}

}
