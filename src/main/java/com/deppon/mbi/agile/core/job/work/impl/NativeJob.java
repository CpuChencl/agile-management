package com.deppon.mbi.agile.core.job.work.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import com.deppon.mbi.agile.core.job.work.AbstractJob;
import com.deppon.mbi.agile.core.job.work.JobException;


/**
 * 本地执行作业
 * 支持调用本地命令行内容
 * 
 */
public class NativeJob extends AbstractJob {

	private String command; 
	
	private StringBuffer result = new StringBuffer();

	public void setCommand(String command) {
		this.command = command;
	}

	public String getResult() {
		return result.toString();
	}

	@Override
	public boolean execute() throws JobException {
		
		if (command != null && !command.equals("")) {
			try {
				Process process = Runtime.getRuntime().exec(command);
				InputStreamReader streamReader = new InputStreamReader(process.getInputStream());
				LineNumberReader lineReader = new LineNumberReader(streamReader);

				String line = null;
				while ((line = lineReader.readLine()) != null) {
					result.append(line);
				}
			} catch (IOException e) {
				throw new JobException(e);
			}
		}
		
		return true;

	}

}
