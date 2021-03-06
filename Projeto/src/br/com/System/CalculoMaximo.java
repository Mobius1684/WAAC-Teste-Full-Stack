package br.com.System;

import java.io.IOException;
import java.util.ArrayList;
import br.com.System.ManipulaLogs;

public class CalculoMaximo {

	private static long idCounter = 0;

	/**
	 * This method calculates the values of the triangle's sum for each of it's lines.
	 * It separates the received input into 3 smaller arrays and one simple int variable(for the first triangle line),
	 * the other smaller arrays represent each triangle line, and the calculations will be done separately
	 * to each of these arrays.
	 * An Id is also generated here for each iteration of the execution, there is also an a timer added to check the time taken on the execution,
	 * although during tests, the timer was never different from 0 unless I stopped the execution for a while through
	 * debugging. The information used here is going to be logged to a file.
	 */
	public ArrayList<Integer> calculoMaximo(ArrayList<Integer> valueList) {
		long start = System.currentTimeMillis();
		String id = createID();
		int miniValueList1 = 0;
		ArrayList<Integer> miniValueList2 = new ArrayList<Integer>();
		ArrayList<Integer> miniValueList3 = new ArrayList<Integer>();
		ArrayList<Integer> miniValueList4 = new ArrayList<Integer>();
		for(int i =0; i < valueList.size(); i++)
		{
			int value = valueList.get(i);
			if (i == 0)
			{
				miniValueList1 = value;
			}
			if (i > 0 && i < 3)
			{
				miniValueList2.add(value);
			}
			if (i >= 3 && i < 6)
			{
				miniValueList3.add(value);
			}
			if (i >= 6)
			{
				miniValueList4.add(value);
			}
		}
		int higherValue2 = 0;
		int higherValue3 = 0;
		int higherValue4 = 0;
		int pos2 = 0;
		int pos3 = 0;
		int pos4 = 0;
		for(int i =0; i < miniValueList2.size(); i++)
		{
			if (miniValueList2.get(i) > higherValue2)
			{
				higherValue2 = miniValueList2.get(i);
				pos2 = i;
			}
		}
		for(int i =0; i < miniValueList3.size(); i++)
		{
			if (miniValueList3.get(i) > higherValue3)
			{
				higherValue3 = miniValueList3.get(i);
				pos3 = i;
				if ((pos2 == 0 && pos3 == 2) || (pos2 == 1 && pos3 == 0))
				{
					pos3 = pos2;
					higherValue3 = miniValueList3.get(pos2);
				}
			}
		}
		for(int i =0; i < miniValueList4.size(); i++)
		{
			if (miniValueList4.get(i) > higherValue4)
			{
				higherValue4 = miniValueList4.get(i);
				pos4 = i;
				if ((pos3 == 0 && pos4 >= 2) || (pos3 == 1 && (pos4 == 0 || pos4 == 3)) || (pos3 == 2 && pos4 <= 1)) 
				{
					pos4 = pos3;
					higherValue4 = miniValueList4.get(pos3);
				}
			}
		}
		int SumValue1 = miniValueList1;
		int SumValue2 = higherValue2;
		int SumValue3 = higherValue3;
		int SumValue4 = higherValue4;
		int Sum = SumValue1 + SumValue2 +SumValue3 + SumValue4;

		ArrayList<Integer> results = new ArrayList<Integer>();
		results.add(SumValue1);
		results.add(SumValue2);
		results.add(SumValue3);
		results.add(SumValue4);
		results.add(Sum);
		results.add(pos2);
		results.add(pos3);
		results.add(pos4);

		long elapsed = System.currentTimeMillis() - start;
		try {
			new ManipulaLogs().GravaLog(id, valueList, results, elapsed);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}

	private static synchronized String createID()
	{
		return String.valueOf(idCounter++);
	} 
}
