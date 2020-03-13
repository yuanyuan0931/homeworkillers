package cy;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class view extends JFrame{
	
	//创建窗口
	public view() {
		System.out.println(equationExe.getEquation());
		
		setTitle("四则运算小游戏");
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		//生成组件
		JLabel jl1 = new JLabel("请计算：");
		JLabel jl2 = new JLabel(equationExe.getEquation());
		JLabel jl3 = new JLabel("*");
		JLabel jl4 = new JLabel("100");
		
		JTextField jt = new JTextField();
		
		//添加提示
		jl1.setBounds(20, 20, 150, 50);
		jl1.setFont(new Font("黑体",Font.PLAIN,20));
		c.add(jl1);
		
		//设置算式
		jl2.setBounds(20, 50, 100, 100);
		jl2.setFont(new Font("黑体",Font.PLAIN,20));
		c.add(jl2);
		
		//添加输入框
		jt.setBounds(90, 90, 50, 20);
		c.add(jt);
			
		//添加确认按钮,绑定事件，定义分数
		JButton btn1 = new JButton("Confirmed!");
		btn1.setBounds(20, 125, 100, 25);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(jt.getText());
				int res = Integer.valueOf(jt.getText());
				if(res == equationExe.res1) {
					System.out.println("√");
				}
				else {
					System.out.println("×");
				}
			}
		});
		
		//添加取消按钮
		JButton btn2 = new JButton("Cancelled!");
		btn2.setBounds(150, 125, 100, 25);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
			}
		});
		
		c.add(btn1);
		c.add(btn2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new view();
	}
	
//	public static boolean Judge() {
//		int res = Integer.valueOf(view.jt.getText());
//		if(res == equationExe.res1) {
//			getScore();
//		}
//	}
	
	

}
