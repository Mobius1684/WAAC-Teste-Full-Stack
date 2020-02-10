package br.com.systemTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.System.CalculoMaximo;

class systemTest {

	ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	ArrayList<Integer> testList2 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
	ArrayList<Integer> resultList = new ArrayList<Integer>();
	ArrayList<Integer> expectedResultList1 = new ArrayList<Integer>(Arrays.asList(0,2,5,9,16,1,2,3));
	ArrayList<Integer> expectedResultList2 = new ArrayList<Integer>(Arrays.asList(9,8,6,3,26,0,0,0));
	CalculoMaximo testeCalculo = new CalculoMaximo();

	@Test
	void test1() {
		resultList = testeCalculo.calculoMaximo(testList);
		assertThat(resultList, is(expectedResultList1));
	}

	@Test
	void test2() {
		resultList = testeCalculo.calculoMaximo(testList2);
		assertThat(resultList, is(expectedResultList2));
	}
}
