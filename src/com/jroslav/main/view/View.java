package com.jroslav.main.view;

public class View {
	private String pathName;

	public View(String pathName) {
		this.pathName = pathName;
	}

	public String outConsole(int countFile, int countDir) {
		return " Path Name " + pathName + "\n" + "# amount file " + countFile + "\n"
				+ "# amount dir " + countDir + "\n";
	}
}
