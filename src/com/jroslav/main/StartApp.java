package com.jroslav.main;
// 13.03.2024 directory analyzer

import java.io.File;
import java.util.Scanner;

import com.jroslav.main.controller.Controller;
import com.jroslav.main.model.Analizer;
import com.jroslav.main.view.View;
import com.jroslav.writer.WriterFile;

public class StartApp {
	private static String date;

	public static void main(String[] args) {

		try (Scanner console = new Scanner(System.in)) {
			System.out.println("Enter path");
			analazePath(console);
			System.out.println("write data to file? y / n");
			if (console.nextLine().equalsIgnoreCase("y")) {
				WriterFile writerFile = new WriterFile(new File("log.txt"), date);
			}
			System.out.println("end program");
		}
	}

	private static void analazePath(Scanner console) {
		do {
			try {
				final String path = console.nextLine();
				final File file = new File(path);
				final View view = new View(file.getAbsolutePath().toString());
				final Analizer analizer = new Analizer(file);
				final Controller controller = new Controller(analizer, view);
				date = controller.dataDispley();
				System.out.println(date);
				break;
			} catch (final RuntimeException e) {
				System.out.println("enter the correct path");
			}
		} while (true);
	}
}