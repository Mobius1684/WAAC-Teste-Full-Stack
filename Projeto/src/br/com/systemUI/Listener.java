package br.com.systemUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import br.com.System.CalculoMaximo;

public class Listener implements ActionListener{

	Container container;
	public Listener (Container _container)
	{
		container = _container;
	}

	@Override
	public void actionPerformed(ActionEvent buttonPressed) {
		Component [] components = container.getComponents();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		for(int j=0;j<components.length;j++) 
		{
			Container component = (Container) components[j];
			String componentName= component.getName();
			if (component instanceof JComboBox)
			{
				JComboBox combobox = (JComboBox) component;
				Integer value = (Integer) combobox.getSelectedItem();
				valueList.add(value);
			}
		}
		CalculoMaximo calculo = new CalculoMaximo();
		calculo.CalculoMaximo(valueList);
//		if (component instanceof Panel)
//		{
//			Graphics line = component.getGraphics();
//			line.drawLine(0, 0, 200, 200);
//		}
	}
	
}
