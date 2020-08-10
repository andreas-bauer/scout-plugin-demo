
// SPDX-FileCopyrightText: 2020 Andreas Bauer
//
// SPDX-License-Identifier: MIT

package plugin;

import scout.StateController;

import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AndiDemo {
	private static String LOG_FILE = "Demo-Plugin-Log.txt";

	private static Font textBoxFont = new Font("Arial", Font.PLAIN, 32);

	/**
	 * Called when the plugin is enabled
	 */
	public void enablePlugin() {
		StateController.displayMessage("Andi Plugin Enabled");
		log("Demo Plugin Enabled");
	}

	/**
	 * Called when the plugin is disabled
	 */
	public void disablePlugin() {
		StateController.displayMessage("Plugin Disabled");
		log("Demo Plugin Disabled");
	}

	/**
	 * Called when the session begins
	 */
	public void startSession() {
		log("*** NEW SESSION ***");
		StateController.displayMessage("Session Started");
	}

	/**
	 * Called when the session is stopped
	 */
	public void stopSession() {
	}

	/**
	 * Called when the state changes
	 */
	public void changeState() {
		// TODO: Crawl state
	}

	public void generateReport() {
		// TODO: Generate report as JSON file
	}

	public void paintCaptureForeground(Graphics g) {
		//TODO: Draw collected state information as graph
	}


	private void log(String message) {
		try {
			FileWriter fileWriter = new FileWriter(LOG_FILE,true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			doWriteLog(printWriter, message);
			printWriter.close();
		} catch (Exception e) {
			// do nothing
		}
	}

	SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");

	private void doWriteLog(PrintWriter writer, String message) {
		String now = formatter.format(new Date());
		writer.printf("[%s] %s \n", now, message);
	}

}
