package dev.fringe.model;

import java.io.Serializable;

public class Movie implements Serializable {

	private static final long serialVersionUID = 1633621452611180090L;

	private String _title;
	private Integer _year;

	public Movie() {
	}

	public Movie(String title) {
		this.setTitle(title);
	}

	public Movie(String _title, Integer _year) {
		super();
		this._title = _title;
		this._year = _year;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public String getTitle() {
		return this._title;
	}

	public void setYear(Integer year) {
		this._year = year;
	}

	public Integer getYear() {
		return this._year;
	}

	public String toString() {
		return "Movie [_title=" + _title + ", _year=" + _year + "]";
	}
}