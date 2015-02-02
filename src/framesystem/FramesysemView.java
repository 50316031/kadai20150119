package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FramesysemView extends Frame implements ActionListener,WindowListener{

	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private Button button1 = new Button("�����Z");
	
	//mm1�p
	
	private TextField m1 = new TextField("",10);
	private TextField m2 = new TextField("",10);
	private TextField m3 = new TextField("",10);
	private TextField m4 = new TextField("",10);
	private TextField m5 = new TextField("",10);
	private TextField m6 = new TextField("",10);
	private TextField m7 = new TextField("",10);
	private TextField m8 = new TextField("",10);
	private TextField m9 = new TextField("",10);
	private TextField m10 = new TextField("",10);
	private TextField m11 = new TextField("",10);
	private Button bm = new Button("M/M/1");
	private Button bm1 = new Button("M/M/s");
	
	public FramesysemView(FramesystemController controller) {
		// TODO Auto-generated constructor stub
	addWindowListener(this);
	setTitle("FrameSystem");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	add(text1);
	add(text2);
	add(button1);
	add(new Label("����"));
	add(text3);
	add(new Label("��"));
	add(m1);
	add(new Label("��"));
	add(m2);
	add(bm);
	add(new Label("���όn���l��"));
	add(m3);
	add(new Label("��"));
	add(m10);
	add(new Label("��"));
	add(m11);
	add(new Label("s"));
	add(m4);
	add(bm1);
	add(new Label("���p��"));
	add(m5);
	add(new Label("���ϑ҂��l��"));
	add(m6);
	add(new Label("���όn���l��"));
	add(m7);
	add(new Label("���ϑ҂�����"));
	add(m8);
	add(new Label("���όn������"));
	add(m9);
	button1.addActionListener(this);
	bm.addActionListener(this);
	bm1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource() == button1){
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1,val2);
		text3.setText(String.valueOf(clib.getPlus()));
		}
		else if(e.getSource() == bm){
			double lambda = Double.parseDouble(m1.getText());
			double mu = Double.parseDouble(m2.getText());
			MM1_lib mlib = new MM1_lib(lambda,mu);
			m3.setText(String.valueOf(mlib.getLength()));
		}
		else{
			double lambda = Double.parseDouble(m10.getText());
			double mu = Double.parseDouble(m11.getText());
			int s = Integer.parseInt(m4.getText());
			MMS_lib mms = new MMS_lib(lambda,mu,s);
			m5.setText(String.valueOf(mms.getRho()));
			m6.setText(String.valueOf(mms.getLq()));
			m7.setText(String.valueOf(mms.getL()));
			m8.setText(String.valueOf(mms.getWq()));
			m9.setText(String.valueOf(mms.getW()));
		
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
