package tablas;
import java.awt.*;
import java.awt.event.*;

public class frame extends Frame implements ActionListener {

	Frame contenedor;
	Panel p;
	
	CheckboxGroup tablasMultiplicar;
	Checkbox por1;
	Checkbox por2;
	Checkbox por3;
	Checkbox por4;
	Checkbox por5;
	Checkbox por6;
	Checkbox por7;
	Checkbox por8;
	Checkbox por9;
	
	Button mostrarTabla;
	List tablas;
	
	public frame(){
		contenedor=new Frame("Las tablas de Multiplicar");
		contenedor.setLayout(new FlowLayout());
		contenedor.setVisible(true);
		contenedor.setSize(505,500);
		
		p=new Panel();
		contenedor.add(p);
		
		tablasMultiplicar=new CheckboxGroup();
		por1=new Checkbox("1",tablasMultiplicar,true);
		por2=new Checkbox("2",tablasMultiplicar,false);
		por3=new Checkbox("3",tablasMultiplicar,false);
		por4=new Checkbox("4",tablasMultiplicar,false);
		por5=new Checkbox("5",tablasMultiplicar,false);
		por6=new Checkbox("6",tablasMultiplicar,false);
		por7=new Checkbox("7",tablasMultiplicar,false);
		por8=new Checkbox("8",tablasMultiplicar,false);
		por9=new Checkbox("9",tablasMultiplicar,false);
		
		p.add(por1);
		p.add(por2);
		p.add(por3);
		p.add(por4);
		p.add(por5);
		p.add(por6);
		p.add(por7);
		p.add(por8);
		p.add(por9);
		
		tablas=new List();
		p.add(tablas);
		
		mostrarTabla=new Button("Mostrar tabla");
		p.add(mostrarTabla);
		mostrarTabla.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tablasMultiplicar.getSelectedCheckbox()==por1){
					for(int i=0;i<10;i++){
						tablas.add("1 X "+i+" = "+1*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por2){
					for(int i=0;i<10;i++){
						tablas.add("2 X "+i+" = "+2*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por3){
					for(int i=0;i<10;i++){
						tablas.add("3 X "+i+" = "+3*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por4){
					for(int i=0;i<10;i++){
						tablas.add("4 X "+i+" = "+4*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por5){
					for(int i=0;i<10;i++){
						tablas.add("5 X "+i+" = "+5*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por6){
					for(int i=0;i<10;i++){
						tablas.add("6 X "+i+" = "+6*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por7){
					for(int i=0;i<10;i++){
						tablas.add("7 X "+i+" = "+7*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por8){
					for(int i=0;i<10;i++){
						tablas.add("8 X "+i+" = "+8*i);
					}
				} else if(tablasMultiplicar.getSelectedCheckbox()==por9){
					for(int i=0;i<10;i++){
						tablas.add("9 X "+i+" = "+9*i);
					}
				}
			}
			
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
