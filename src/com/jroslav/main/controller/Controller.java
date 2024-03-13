package com.jroslav.main.controller;

import com.jroslav.main.model.Analizer;
import com.jroslav.main.view.View;

public class Controller {
	private Analizer analizer;
	private View view;

	public Controller(Analizer analizer, View view) {
		this.analizer = analizer;
		this.view = view;
	}
	
	public void dataDispley() {
		view.outConsole(analizer.getCountFile(), analizer.getCountDir());
	}
}