package com.sp.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/********************************
Author:����
tools :eclipse+ADT23.6+SDK19

********************************/
public class MainActivity extends Activity implements View.OnClickListener {
	//���ʽ
	private String expression="";
	//����ؼ�����
	private Button bZero;
	private Button bOne;
	private Button bTwo;
	private Button bThree;
	private Button bFour;
	private Button bFive;
	private Button bSix;
	private Button bSeven;
	private Button bEight;
	private Button bNine;
	private Button bJia;
	private Button bJian;
	private Button bCheng;
	private Button bChu;
	private Button bLeft;
	private Button bRight;
	private Button bDian;
	private Button bClear;
	private Button bDlete;
	private Button bDengyu;
	private TextView result;
	private TextView exp;
	
	public void setButtonOnClick()
	{
		//��ȡ�ؼ����
		bZero=(Button)findViewById(R.id.zero);
		bOne=(Button)findViewById(R.id.one);
		bTwo=(Button)findViewById(R.id.two);
		bThree=(Button)findViewById(R.id.three);
		bFour=(Button)findViewById(R.id.four);
		bFive=(Button)findViewById(R.id.five);
		bSix=(Button)findViewById(R.id.six);
		bSeven=(Button)findViewById(R.id.seven);
		bEight=(Button)findViewById(R.id.eight);
		bNine=(Button)findViewById(R.id.nine);
		bJia=(Button)findViewById(R.id.jia);
		bJian=(Button)findViewById(R.id.jian);
		bCheng=(Button)findViewById(R.id.cheng);
		bChu=(Button)findViewById(R.id.chu);
		bLeft=(Button)findViewById(R.id.left);
		bRight=(Button)findViewById(R.id.right);
		bDian=(Button)findViewById(R.id.dian);
		bClear=(Button)findViewById(R.id.clear);
		bDlete=(Button)findViewById(R.id.delete);
		bDengyu=(Button)findViewById(R.id.dengyu);
		exp=(TextView)findViewById(R.id.textView1);
		result=(TextView)findViewById(R.id.textView2);
		//�󶨵���¼�
		bZero.setOnClickListener(this);
		bOne.setOnClickListener(this);
		bTwo.setOnClickListener(this);
		bThree.setOnClickListener(this);
		bFour.setOnClickListener(this);
		bFive.setOnClickListener(this);
		bSix.setOnClickListener(this);
		bSeven.setOnClickListener(this);
		bEight.setOnClickListener(this);
		bNine.setOnClickListener(this);
		bJia.setOnClickListener(this);
		bJian.setOnClickListener(this);
		bCheng.setOnClickListener(this);
		bChu.setOnClickListener(this);
		bLeft.setOnClickListener(this);
		bRight.setOnClickListener(this);
		bDian.setOnClickListener(this);
		bClear.setOnClickListener(this);
		bDlete.setOnClickListener(this);
		bDengyu.setOnClickListener(this);
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setButtonOnClick();
	}
	
	public void updateView()
	{
		//������ձ��ʽ
		exp.setText("");
		//Ȼ�����ñ��ʽ
		exp.setText(expression);
	}
	
	//��Ӱ�ť����
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.zero:
			//�жϱ��ʽ�Ƿ�Ϊ��
			if(expression=="") break;
			else
			{
				expression+='0';
				updateView();
			}
			break;
		case R.id.one:
			expression+='1';
			updateView();
			break;
		case R.id.two:
			expression+='2';
			updateView();
			break;
		case R.id.three:
			expression+='3';
			updateView();
			break;
		case R.id.four:
			expression+='4';
			updateView();
			break;
		case R.id.five:
			expression+='5';
			updateView();
			break;
		case R.id.six:
			expression+='6';
			updateView();
			break;
		case R.id.seven:
			expression+='7';
			updateView();
			break;
		case R.id.eight:
			expression+='8';
			updateView();
			break;
		case R.id.nine:
			expression+='9';
			updateView();
			break;
		case R.id.jia:
			expression+='+';
			updateView();
			break;
		case R.id.jian:
			expression+='-';
			updateView();
			break;
		case R.id.cheng:
			expression+='��';
			updateView();
			break;
		case R.id.chu:
			expression+='��';
			updateView();
			break;
		case R.id.dengyu:
			//��ȡ������
			double result1=calculate.compute(expression);
			//ת����string
			String res=String.valueOf(result1);
			int i=0;
			//Ѱ��С����
			while(i<res.length()&&res.charAt(i)!='.') i++;
//			//˳���ҵ�С���� ����5λС����
//			if(i>0&&i<res.length()-1)
//			{
//				if(res.length()-i<=6)
//				{
//					break;
//				}else
//				{
//					res=res.substring(0, i+6);
//				}
//			}
			//��ʾ���
			result.setText(res);
			break;
		case R.id.dian:
			expression+='.';
			updateView();
			break;
		case R.id.left:
			expression+='(';
			updateView();
			break;
		case R.id.right:
			expression+=')';
			updateView();
			break;
		case R.id.clear:
			//���
			expression="";
			exp.setText("");
			result.setText("");
			break;
		case R.id.delete:
			if(expression.length()!=0)
			{
				expression=expression.substring(0, expression.length()-1);
				updateView();
			}
			break;
			
		}
		
		
	}
}
