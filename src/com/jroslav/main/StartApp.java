package com.jroslav.main;

import java.io.File;
import java.util.Scanner;

import com.jroslav.main.controller.Controller;
import com.jroslav.main.model.Analizer;
import com.jroslav.main.view.View;

// 13.03.2024 directory analyzer

public class StartApp {

	public static void main(String[] args) {
		
		try(Scanner console = new Scanner(System.in)) {
			System.out.println("Enter path");
			String path = console.nextLine();
			View view = new View(path);
			Analizer analizer = new Analizer(new File(path));
			Controller controller = new Controller(analizer, view);
			controller.dataDispley();
		}
	}
}
