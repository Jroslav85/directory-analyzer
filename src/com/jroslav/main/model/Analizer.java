package com.jroslav.main.model;

import java.io.File;

public class Analizer {
	private File file;
	private int countFile;
	private int countDir;

	public Analizer(File file) {
		this.file = file;
		getListAnalazeDate();
	}

	private void getListAnalazeDate() {
		File[] filesAndDirectoriesArray = file.listFiles();
		for (File path : filesAndDirectoriesArray) {
			if (path.isDirectory() == true) {
				countDir = getCountDir() + 1;
			}
			if (path.isFile() == true) {
				countFile = getCountFile() + 1;
			}
		}
	}

	public int getCountFile() {
		return countFile;
	}

	public int getCountDir() {
		return countDir;
	}
}
