package br.com.System;

import java.util.ArrayList;

public class CalculoMaximo {

	public ArrayList<Integer> calculoMaximo(ArrayList<Integer> valueList) {
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
			}
		}
		for(int i =0; i < miniValueList4.size(); i++)
		{
			if (miniValueList4.get(i) > higherValue4)
			{
				higherValue4 = miniValueList4.get(i);
				pos4 = i;
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

		return results;
	}
}
