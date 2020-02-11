package br.com.System;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ManipulaLogs {

	public void GravaLog(String id, ArrayList<Integer> valueList, ArrayList<Integer> results, long elapsed) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter("LogFile.txt", true));
		writer.newLine();
		writer.append("Id de execução:" + id);
		writer.append(" /Lista de valores introduzidos: " + valueList.toString());
		writer.append(" /A soma formada entre os maiores números é: " + results.get(0) + " + "
				+ results.get(1) + " + " + results.get(2) + " + " + results.get(3) + " = " + results.get(4));
		writer.append(" /Tempo de execução: " + Long.toString(elapsed));
		writer.close();
	}
}
