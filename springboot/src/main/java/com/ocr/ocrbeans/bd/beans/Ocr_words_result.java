package com.ocr.ocrbeans.bd.beans;

import java.util.List;

public class Ocr_words_result {
	private Ocr_words_result_location location;
	private String words;
	private List<Ocr_Chars_Info> char1s;
	private List<Ocr_Coordinate> min_finegrained_vertexes_location;
	private List<Ocr_Coordinate> finegrained_vertexes_location;
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public Ocr_words_result_location getLocation() {
		return location;
	}
	public void setLocation(Ocr_words_result_location location) {
		this.location = location;
	}
	

	public List<Ocr_Coordinate> getFinegrained_vertexes_location() {
		return finegrained_vertexes_location;
	}

	public List<Ocr_Chars_Info> getChars() {
		return char1s;
	}

	public void setChars(List<Ocr_Chars_Info> chars) {
		this.char1s = chars;
	}

	public List<Ocr_Coordinate> getMin_finegrained_vertexes_location() {
		return min_finegrained_vertexes_location;
	}

	public void setMin_finegrained_vertexes_location(List<Ocr_Coordinate> min_finegrained_vertexes_location) {
		this.min_finegrained_vertexes_location = min_finegrained_vertexes_location;
	}

	public void setFinegrained_vertexes_location(List<Ocr_Coordinate> finegrained_vertexes_location) {
		this.finegrained_vertexes_location = finegrained_vertexes_location;
	}

	@Override
	public String toString() {
		return "Ocr_words_result{" +
				"location=" + location +
				", words='" + words + '\'' +
				", char1s=" + char1s +
				", min_finegrained_vertexes_location=" + min_finegrained_vertexes_location +
				", finegrained_vertexes_location=" + finegrained_vertexes_location +
				'}';
	}
}
