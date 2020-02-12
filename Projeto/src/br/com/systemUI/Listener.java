package br.com.systemUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import br.com.System.CalculoMaximo;

public class Listener implements ActionListener{

	Container container;
	public Listener (Container _container)
	{
		container = _container;
	}

	@Override
	/**
	 * Action to be performed when clicking the "Aplicar" button.
	 * This will start the logic to alter the screen components and process
	 * the program's logic.
	 */
	public void actionPerformed(ActionEvent buttonPressed) {
		Component [] components = container.getComponents();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		valueList = populateValuesFromComboBox(components);
		populateLabels(components, valueList);

		results = new CalculoMaximo().calculoMaximo(valueList);

		resetPanels(components);
		populatePanels(components, results);

		for(int j=0;j<components.length;j++) 
		{
			Container component = (Container) components[j];
			if (component.getName().equalsIgnoreCase("lblSomaFormada"))
			{
				JLabel label = (JLabel) component;
				label.setText("A soma formada entre os maiores números é: " + results.get(0) + " + "
						+ results.get(1) + " + " + results.get(2) + " + " + results.get(3) + " = " + results.get(4));
			}
		}
	}

	/**
	 * This method gets the values inserted in the comboboxes and places them in
	 * in an Integer arrayList so the values can be manipulated.
	 */
	private ArrayList<Integer> populateValuesFromComboBox(Component [] components) {
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		for(int j=0;j<components.length;j++)
		{
			Container component = (Container) components[j];
			if (component instanceof JComboBox)
			{
				valueList.add(0);
			}
		}
		for(int j=0;j<components.length;j++)
		{
			Container component = (Container) components[j];
			if (component.getName().equalsIgnoreCase("comboBox1Linha1"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(0, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox1Linha2"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(1, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox2Linha2"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(2, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox1Linha3"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(3, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox2Linha3"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(4, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox3Linha3"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(5, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox1Linha4"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(6, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox2Linha4"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(7, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox3Linha4"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(8, value);
			}
			if (component.getName().equalsIgnoreCase("comboBox4Linha4"))
			{
				JComboBox combobox = (JComboBox) component;
				int value = Integer.parseInt(combobox.getSelectedItem().toString());
				valueList.set(9, value);
			}
		}
		return valueList;
	}

	/**
	 * This method gets the results received after processing the triangle's calculations,
	 * and draws the lines between the triangle values in the application.
	 */
	private void populatePanels(Component [] components, ArrayList<Integer> results) {
		int pos2 = results.get(5);
		int pos3 = results.get(6);
		int pos4 = results.get(7);
		for(int j=0;j<components.length;j++) 
		{
			Container component = (Container) components[j];
			if (pos2 == 0 && component.getName().equalsIgnoreCase("panel1_1"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos2 == 1 && component.getName().equalsIgnoreCase("panel1_2"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
			if (pos3 == 0 && component.getName().equalsIgnoreCase("panel2_1"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos3 == 1 && pos2 == 0 && component.getName().equalsIgnoreCase("panel2_2"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
			if (pos3 == 1 && pos2 == 1 && component.getName().equalsIgnoreCase("panel2_3"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos3 == 2 && component.getName().equalsIgnoreCase("panel2_4"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
			if (pos4 == 0 && component.getName().equalsIgnoreCase("panel3_1"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos4 == 1 && pos3 == 0 && component.getName().equalsIgnoreCase("panel3_2"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
			if (pos4 == 1 && pos3 == 1 && component.getName().equalsIgnoreCase("panel3_3"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos4 == 2 && pos3 == 1 && component.getName().equalsIgnoreCase("panel3_4"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
			if (pos4 == 2 && pos3 == 2 && component.getName().equalsIgnoreCase("panel3_5"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 14, 40, 0);
			}
			if (pos4 == 3 && component.getName().equalsIgnoreCase("panel3_6"))
			{
				Graphics line = component.getGraphics();
				line.drawLine(0, 0, 200, 75);
			}
		}
	}
	
	/**
	 * This method resets the drawn lines in the triangle for the next execution.
	 */
	private void resetPanels(Component [] components) { 
		for(int j=0;j<components.length;j++) 
		{
			Container component = (Container) components[j];
			if (component instanceof Panel)
			{
				Panel panel = (Panel) component;
				panel.getGraphics().clearRect(0, 0, 100, 100);
			}
		}
	}

	/**
	 * This method changes the contents of the triangle's labels, changing their original value from 'XX'
	 * to the values which were passed by the user during the execution.
	 */
	private void populateLabels(Component [] components, ArrayList<Integer> valueList) {
		for(int j=0;j<components.length;j++) 
		{
			Container component = (Container) components[j];
			if (component.getName().equalsIgnoreCase("lblX1_1"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(0).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX2_1"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(1).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX2_2"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(2).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX3_1"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(3).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX3_2"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(4).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX3_3"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(5).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX4_1"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(6).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX4_2"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(7).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX4_3"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(8).toString());
			}
			if (component.getName().equalsIgnoreCase("lblX4_4"))
			{
				JLabel label = (JLabel) component;
				label.setText(valueList.get(9).toString());
			}
		}
	}
}
