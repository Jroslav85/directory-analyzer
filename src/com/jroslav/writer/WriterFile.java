package com.jroslav.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
	private final File file;
	private final String line;

	public WriterFile(File file, String line) {
		this.file = file;
		this.line = line;
		try {
			writeFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeFile() throws IOException {
		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write(line + "\n");
		}
	}
}
