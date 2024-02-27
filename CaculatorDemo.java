
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculatorDemo {
	public static void main(String[] args) {
		JS win=new JS();
	}
}
class JS extends JFrame implements ActionListener{
	private StringBuilder sBuilder = new StringBuilder();  //����StringBuilder������ʾ���Լ���������������
	JTextArea text=new JTextArea();
	double a,b;
	Double sum;
	int i;
	public JS()
	{
		setBounds(100,100,400,400);
		setTitle("������");
		JMenuBar menubar=new JMenuBar();//�����˵���
		JMenu menu1=new JMenu("�鿴(V)");//���������ò˵���
		JMenu menu2=new JMenu("�༭(E)");//���������ò˵���
		JMenu menu3=new JMenu("����(H)");//���������ò˵���
		menubar.add(menu1);//���˵����뵽�˵�����
		menubar.add(menu2);
		menubar.add(menu3);
		this.setJMenuBar(menubar);//�����úõĲ˵������ڴ�����
		this.setLayout(new BorderLayout());//����ı���
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		text.setPreferredSize(new Dimension (370,60));//���������С
		p2.setLayout(new FlowLayout());
		p1.add(text);
		this.add(p1,BorderLayout.NORTH);
		
		
		p2.setLayout(new GridLayout(5,4));	//��Ӱ�ť
		JButton button[]=new JButton[20];
		button[0]=new JButton("C");		//���
		button[1]=new JButton("CE");	//���֮ǰ�����һ������
		button[2]=new JButton("%");		//ȡ��
		button[3]=new JButton("��");   //����
		button[4]=new JButton("7");
		button[5]=new JButton("8");
		button[6]=new JButton("9");
		button[7]=new JButton("x");  //�˺�
		button[8]=new JButton("4");
		button[9]=new JButton("5");
		button[10]=new JButton("6");
		button[11]=new JButton("��");  //����
		button[12]=new JButton("1");
		button[13]=new JButton("2");
		button[14]=new JButton("3");
		button[15]=new JButton("+");  //�Ӻ�
		button[16]=new JButton("e");	//�˷�
		button[17]=new JButton("0");
		button[18]=new JButton(".");  //С����
		button[19]=new JButton("="); //����
		
		for(int i=0;i<button.length;i++ )	//�������������
			p2.add(button[i]);
		button[19].setBackground(Color.ORANGE);//���ð�ť�ı�����ɫΪ��ɫ
		p2.add(button[19]);
		add(p2,BorderLayout.CENTER);
		
		for(int i=0;i<button.length;i++)	//Ϊÿһ���¼�(��ť)��Ӽ�����
			button[i].addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���X�ſ��Թرճ���
	}
	
	public void actionPerformed(ActionEvent e) //�¼�����
	{
		// TODO Auto-generated method stub
		String lab=e.getActionCommand();			//�õ���ǰ�İ�ť�ַ����������ƥ��
		
		if(lab.equals("0"))								//����ť 0~9
		{
			sBuilder.append("0");		//����StringBuilder��Ķ�����÷����������ݴ�����
			text.setText(sBuilder.toString());	//��ʾ֮ǰ�������������
		}
		else if(lab.equals("1"))
		{
			sBuilder.append("1");		//����StringBuilder��Ķ�����÷����������ݴ�����			
			text.setText(sBuilder.toString());	//��ʾ֮ǰ�������������	
		}
		else if(lab.equals("2"))
		{
			sBuilder.append("2");		//����StringBuilder��Ķ�����÷����������ݴ�����
			text.setText(sBuilder.toString());	 //��ʾ֮ǰ�������������
		}
		else if(lab.equals("3"))
		{
			sBuilder.append("3");		//����StringBuilder��Ķ�����÷����������ݴ�����
			text.setText(sBuilder.toString());	//��ʾ֮ǰ�������������
		}
		else if(lab.equals("4"))
		{
			sBuilder.append("4");					
			text.setText(sBuilder.toString());	
		}
		else if(lab.equals("5"))
		{
			sBuilder.append("5");				
			text.setText(sBuilder.toString());	
		}
		else if(lab.equals("6"))
		{
			sBuilder.append("6");				
			text.setText(sBuilder.toString());	
		}
		else if(lab.equals("7"))
		{
			sBuilder.append("7");					
			text.setText(sBuilder.toString());	
		}
		
		else if(lab.equals("8"))
		{
			sBuilder.append("8");						
			text.setText(sBuilder.toString());	
		}
		else if(lab.equals("9"))
		{
			sBuilder.append("9");		//����StringBuilder��Ķ�����÷����������ݴ�����		
			text.setText(sBuilder.toString());	//��ʾ֮ǰ�������������
		}
		
		else if(lab.equals("CE"))    				//����"CE"��ť�¼�   �������ǰ�����������
		{
			sBuilder.deleteCharAt(sBuilder.length() - 1);	//StringBuilder��ʵ����������÷����±��1����
			text.setText(sBuilder.toString());
		}
		else if(lab.equals("C"))                   //����"CE"��ť�¼�   �����֮ǰ���������е�����
		{
			sBuilder = new StringBuilder();						//���´����������֮ǰ���������е�����
			text.setText(sBuilder.toString());
		}
		else if(lab.equals("."))						// ����ť "." �¼�
		{
			sBuilder.append(".");						//����StringBuilder��Ķ�����÷����������ݴ�����
			text.setText(sBuilder.toString());			//��ʾ֮ǰ���������
		}
		
		else if(lab.equals("+"))	//����+"��ť�˷�
		{
			a = Double.parseDouble(sBuilder.toString());	//�� ����� ֮ǰ������ ��Ϊ��һ�������� a
			i=0;
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b
			text.setText("+");
		}
		else if(lab.equals("��"))		//����"��"��ť�˷�
		{
			a = Double.parseDouble(sBuilder.toString());	//��ǰ���������� ��Ϊ��һ��������a
			i=1;												//�����������  ��"��"֮ǰ�����ݼ�����Ϊ����
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b									
			text.setText("��");
		}
		else if(lab.equals("x"))    	//����"x"��ť�˷�
		{										
			a = Double.parseDouble(sBuilder.toString());	//��ǰ���������� ��Ϊ��һ��������a
			i=2;											//�����������  ��"��"֮ǰ�����ݼ�����Ϊ����
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b
			text.setText("x");
		}
		else if(lab.equals("��"))		//����"��"��ť�¼�
		{
			i=3;											//�����������  ��"��"֮ǰ�����ݼ�����Ϊ������
			a = Double.parseDouble(sBuilder.toString());	//��������������� ��Ϊ��һ��������a
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b
			text.setText("��");
		}
		
		else if(lab.equals("%"))	//����ȡ������
		{
			a = Double.parseDouble(sBuilder.toString());	//��ǰ���������� ��Ϊ��һ��������a
			i=4;											//���ȡ������
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b
			text.setText("%");
		}
		else if(lab.equals("e"))	//����ȡ������
		{
			a = Double.parseDouble(sBuilder.toString());	//��ǰ���������� ��Ϊ��һ��������a
			i=5;											//���ȡ������
			sBuilder = new StringBuilder();					//������������洢�ڶ��������� b
			text.setText("e");
		}
		else if(lab.equals("="))
		{
			b = Double.parseDouble(sBuilder.toString());	//һ����"=",���Ǿ��ܵõ��ڶ���������b
			if (i == 0)			//�ӷ� a+b
				{
					sum=a+b;
					text.setText(sum.toString());		//����ڶ����������Ѿ����������
					sBuilder = new StringBuilder();		//������ݣ�Ϊ����Ĳ��������ռ�
					sBuilder.append(sum);
				} 
			else if (i == 1) 	//�ӷ�  a-b
				{
					sum = a - b;
					text.setText(sum.toString());
					sBuilder = new StringBuilder();		//������ݣ�Ϊ����Ĳ��������ռ�
					sBuilder.append(sum);
				}
			else if (i == 2) 	//�˷�  a*b
				{
					sum = a * b;
					text.setText(sum.toString());
					sBuilder = new StringBuilder();
					sBuilder.append(sum);
				} 
			else if (i == 3) 	//���� a��b
				{
					sum = a / b;
					text.setText(sum.toString());
					sBuilder = new StringBuilder();
					sBuilder.append(sum);
				} 
			else if (i == 4)	 //	ȡ��      a%b
				{
					sum=a % b;
					int m=(int)a;
					int n=(int)b;
					sum=(double)m % n;
					text.setText(sum.toString());
					sBuilder = new StringBuilder();
					sBuilder.append(sum);
				} 
			else if (i == 5) 	//	����      a�ǵ���	 b��ָ��
			 {
				 sum=1.0;
				 if(b==0)
					 sum=1.0;
				 else
					 for(int i=1;i<=b;i++)
					  sum=sum*a;
					text.setText(sum.toString());
					sBuilder = new StringBuilder();
					sBuilder.append(sum);
				} 
			 else 
				text.setText(sBuilder.toString());
		}
	}
}





