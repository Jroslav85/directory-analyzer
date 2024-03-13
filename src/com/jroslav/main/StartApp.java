package com.jroslav.main;
// 13.03.2024 directory analyzer

import java.io.File;
import java.util.Scanner;

import com.jroslav.main.controller.Controller;
import com.jroslav.main.model.Analizer;
import com.jroslav.main.view.View;

public class StartApp {

	public static void main(String[] args) {

		try (Scanner console = new Scanner(System.in)) {
			System.out.println("Enter path");
			analazePath(console);
		}
	}

	private static void analazePath(Scanner console) {
		do {
			try {
				final String path = console.nextLine();
				final File file = new File(path);
				final View view = new View(file.getName());
				final Analizer analizer = new Analizer(file);
				final Controller controller = new Controller(analizer, view);
				controller.dataDispley();
				break;
			} catch (final Exception e) {
				System.out.println("enter the correct path");
			}
		} while (true);
	}
}