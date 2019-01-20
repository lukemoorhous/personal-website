package com.moorhous.web;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program will parametrically pull updates from a specified git
 * repository.
 * 
 * @author Luke Moorhous
 * @version 1.0
 */
public class UpdateWebsite {

	public static void main(String[] args) {
		logArgs(args, new File("C:\\common\\development\\eclipse-workspace\\personal-website\\update.log"));
	}

	private static void logArgs(String[] args, File log) {
		FileWriter logger = null;

		try {
			logger = new FileWriter(log);
			logger.write("Hello World");
			for (String arg : args) {
				logger.write(arg);
			}
		} catch (IOException e) {
			for (String arg : args) {
				System.out.println(arg);
			}
		} finally {
			try {
				logger.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
