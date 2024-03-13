package com.jroslav.main.view;

public class View {
	private String pathName;

	public View(String pathName) {
		this.pathName = pathName;
	}

	public void outConsole(int countFile, int countDir) {
		System.out.println(" Path Name " + pathName);
		System.out.println("# amount file " + countFile);
		System.out.println("# amount dir " + countDir);
	}
}
