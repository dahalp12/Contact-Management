package com.contact.demo.controllers;

import java.util.HashSet;
import java.util.Set;

import com.contact.demo.dtos.AddressDto;
import com.contact.demo.dtos.ContactDto;
import com.contact.demo.dtos.NameDto;
import com.contact.demo.dtos.PhoneDto;

public class TestUtils {

	public static ContactDto dummyContact() {
		ContactDto contactDto = new ContactDto();
		contactDto.setEmail("dahal.pritam@aol.com");
		contactDto.setId(1l);

		NameDto name = new NameDto();
		name.setFirst("Pritam");
		name.setLast("Dahal");
		contactDto.setName(name);

		Set<PhoneDto> phoneDtos = new HashSet<>();
		PhoneDto homePhone = new PhoneDto();
		homePhone.setNumber("5857774541");
		homePhone.setType("home");

		PhoneDto workPhone = new PhoneDto();
		homePhone.setNumber("4057638985");
		homePhone.setType("cell");
		phoneDtos.add(homePhone);
		phoneDtos.add(workPhone);

		contactDto.setPhone(phoneDtos);

		AddressDto addressDto = new AddressDto();
		addressDto.setStreet("3457 Carlson blvd");
		addressDto.setCity("El Cerrito");
		addressDto.setState("California");
		addressDto.setZip(94537);
		contactDto.setAddress(addressDto);

		return contactDto;
	}
	
	public static ContactDto dummyContactResponse() {
		ContactDto contactDto = new ContactDto();
		contactDto.setEmail("dahal.pritam@aol.com");
		contactDto.setId(1l);

		NameDto name = new NameDto();
		name.setFirst("Pritam");
		name.setLast("Dahal");
		contactDto.setName(name);

		Set<PhoneDto> phoneDtos = new HashSet<>();
		PhoneDto homePhone = new PhoneDto();
		homePhone.setNumber("5857774541");
		homePhone.setType("home");

		PhoneDto workPhone = new PhoneDto();
		homePhone.setNumber("4057638985");
		homePhone.setType("cell");
		phoneDtos.add(homePhone);
		phoneDtos.add(workPhone);

		contactDto.setPhone(phoneDtos);

		AddressDto addressDto = new AddressDto();
		addressDto.setStreet("3457 Carlson blvd");
		addressDto.setCity("El Cerrito");
		addressDto.setState("California");
		addressDto.setZip(94530);
		contactDto.setAddress(addressDto);

		return contactDto;
	}

	public static String dummyContactresponse() {

		return "{\n" + "\"id\": 1,\n" + "\"name\": {\n" + "\"first\": \"Pritam\",\n" + "\"last\": \"Dahal\",\n"
				+ "\"middle\": \"Mailo\"\n" + "},\n" + "\"address\": {\n" + "\"street\": \"3457 Carlson blvd\",\n"
				+ "\"city\": \"El Cerrito\",\n" + "\"state\": \"California\",\n" + "\"zip\": 94530\n" + "},\n"
				+ "\"phone\": [\n" + "{\n" + "\"number\": \"4057638985\",\n" + "\"type\": \"mobile\"\n" + "},\n"
				+ "{\n" + "\"number\": \"4057638985\",\n" + "\"type\": \"home\"\n" + "}\n" + "],\n"
				+ "\"email\": \"dahal.pritam@aol.com\"\n" + "}\n";
	}
	
	public static String dummyContactrequest() {

		return "{\n" + "\"id\": 1,\n" + "\"name\": {\n" + "\"first\": \"Pritam\",\n" + "\"last\": \"Dahal\",\n"
				+ "\"middle\": \"Mailo\"\n" + "},\n" + "\"address\": {\n" + "\"street\": \"3457 Carlson blvd\",\n"
				+ "\"city\": \"El Cerrito\",\n" + "\"state\": \"California\",\n" + "\"zip\": 94530\n" + "},\n"
				+ "\"phone\": [\n" + "{\n" + "\"number\": \"4057638985\",\n" + "\"type\": \"mobile\"\n" + "},\n"
				+ "{\n" + "\"number\": \"4057638985\",\n" + "\"type\": \"home\"\n" + "}\n" + "],\n"
				+ "\"email\": \"dahal.pritam@aol.com\"\n" + "}\n";
	}

}
