package com.ocr.ocrbeans.bd.beans;

import java.util.List;

public class Ocr_Bean {
	
	private Long log_id;
	
	private int words_result_num;
	
	private List<Ocr_words_result> words_result;
	
	
	public Long getLog_id() {
		return log_id;
	}
	public void setLog_id(Long log_id) {
		this.log_id = log_id;
	}
	public int getWords_result_num() {
		return words_result_num;
	}
	public void setWords_result_num(int words_result_num) {
		this.words_result_num = words_result_num;
	}
	
	public List<Ocr_words_result> getWords_result() {
		return words_result;
	}
	
	public void setWords_result(List<Ocr_words_result> words_result) {
		this.words_result = words_result;
	}

	@Override
	public String toString() {
		return "Ocr_Bean{" +
				"log_id=" + log_id +
				", words_result_num=" + words_result_num +
				", words_result=" + words_result +
				'}';
	}


}
