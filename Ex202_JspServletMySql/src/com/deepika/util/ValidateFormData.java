package com.deepika.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class ValidateFormData {

	
	public static boolean isEmpty(String input) {
		return input==null || input=="";
	}
	
	public static boolean isValidEmail(String input) {
		return isEmpty(input) || Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(input).find();
	}
	
	public static boolean isValidDate(String input) {

		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean result = false;
		try {
			sdf.parse(input);
			result = true;
		} catch (Exception e) {
			return false;
		}

		return isEmpty(input) || result;
	}

}
