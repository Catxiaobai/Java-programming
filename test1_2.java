package test;

import javax.swing.JOptionPane;

public class test1_2 {
	public static void main(String[] args) {
			char[] ch = new char[9];
			for(int i=0;i<9;i++)
				ch[i]= (char)(i+49);
			int count=0;
			while(count<9) {
				String str = JOptionPane.showInputDialog("---------------\n"
				+ "| "+ch[0]+" | "+ch[1]+" | "+ch[2]+" |\n"
				+ "| "+ch[3]+" | "+ch[4]+" | "+ch[5]+" |\n"
				+ "| "+ch[6]+" | "+ch[7]+" | "+ch[8]+" |\n"
				+ "---------------\n"
				+ "������λ�� ��");
				//�ҷ�����
				int a = Integer.parseInt(str)-1;
				while(ch[a]=='*'||ch[a]=='o') //�жϸ�λ���Ƿ�ʹ��
					{
						JOptionPane.showMessageDialog(null,"��᲻�����尡");
						str = JOptionPane.showInputDialog("---------------\n"
								+ "| "+ch[0]+" | "+ch[1]+" | "+ch[2]+" |\n"
								+ "| "+ch[3]+" | "+ch[4]+" | "+ch[5]+" |\n"
								+ "| "+ch[6]+" | "+ch[7]+" | "+ch[8]+" |\n"
								+ "---------------\n"
								+ "������λ�� ��");
						a = Integer.parseInt(str)-1;
					}
				ch[a]='*';
				count++;
				if(count>=9) break;
		//�ж��Ƿ�����
				if((ch[0]=='*'&&ch[3]=='*'&&ch[6]=='*')||
				(ch[1]=='*'&&ch[4]=='*'&&ch[7]=='*')||
				(ch[2]=='*'&&ch[5]=='*'&&ch[8]=='*')||
				(ch[0]=='*'&&ch[1]=='*'&&ch[2]=='*')||
				(ch[3]=='*'&&ch[4]=='*'&&ch[5]=='*')||
				(ch[6]=='*'&&ch[7]=='*'&&ch[8]=='*')||
				(ch[0]=='*'&&ch[4]=='*'&&ch[8]=='*')||
				(ch[2]=='*'&&ch[4]=='*'&&ch[6]=='*')
				)//��Ӯ��
		{
			JOptionPane.showMessageDialog(null, "---------------\n"
				+ "| "+ch[0]+" | "+ch[1]+" | "+ch[2]+" |\n"
				+ "| "+ch[3]+" | "+ch[4]+" | "+ch[5]+" |\n"
				+ "| "+ch[6]+" | "+ch[7]+" | "+ch[8]+" |\n"
				+ "---------------\n"
				+ "��ϲ��Ӯ��"
				);
			count=0;
			break;
		}
		//������
		int b=(int)(Math.random()*9);
		while(ch[b]=='*'||ch[b]=='o')
		{
			b=(int)(Math.random()*9);
		}
		ch[b]='o';
		count++;
		if(		(ch[0]=='o'&&ch[3]=='o'&&ch[6]=='o')||
				(ch[1]=='o'&&ch[4]=='o'&&ch[7]=='o')||
				(ch[2]=='o'&&ch[5]=='o'&&ch[8]=='o')||
				(ch[0]=='o'&&ch[1]=='o'&&ch[2]=='o')||
				(ch[3]=='o'&&ch[4]=='o'&&ch[5]=='o')||
				(ch[6]=='o'&&ch[7]=='o'&&ch[8]=='o')||
				(ch[0]=='o'&&ch[4]=='o'&&ch[8]=='o')||
				(ch[2]=='o'&&ch[4]=='o'&&ch[6]=='o')
		  )//������
		{
			JOptionPane.showMessageDialog(null, "---------------\n"
					+ "| "+ch[0]+" | "+ch[1]+" | "+ch[2]+" |\n"
					+ "| "+ch[3]+" | "+ch[4]+" | "+ch[5]+" |\n"
					+ "| "+ch[6]+" | "+ch[7]+" | "+ch[8]+" |\n"
					+ "---------------\n"
					+ "���ź�������"
					);
			count=0;
			break;
		}
		
			}
			if(count>=9)
				JOptionPane.showMessageDialog(null,"---------------\n"
						+ "| "+ch[0]+" | "+ch[1]+" | "+ch[2]+" |\n"
						+ "| "+ch[3]+" | "+ch[4]+" | "+ch[5]+" |\n"
						+ "| "+ch[6]+" | "+ch[7]+" | "+ch[8]+" |\n"
						+ "---------------\n"
						+ "��ϲ��͵��Դ��ƽ��"
						);
			System.exit(0);				
	}
	
}
