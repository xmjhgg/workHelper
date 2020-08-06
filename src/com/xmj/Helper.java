package com.xmj;

import com.xmj.component.MyComponent;
import com.xmj.generaterImpl.*;
import com.xmj.componetImpl.GenerateTextRow;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Helper {
    static JFrame mainFrame =new JFrame();
    static List<MyComponent> rowsList = new ArrayList<>();

    static {
        mainFrame.setSize(800, 300);
        mainFrame.setTitle("小工具v1.0");
        mainFrame.setDefaultCloseOperation(3);
    }

    static{
        GenerateTextRow identifyRow = new GenerateTextRow("生成身份证号",new IdentifyGenerator());
        GenerateTextRow phoneNumberRow = new GenerateTextRow("生成手机号",new PhoneNumberGenerator());
        GenerateTextRow taxperNumberRow = new GenerateTextRow("生成纳税人税号",new TaxperNumberGenerator());
        GenerateTextRow emailRow = new GenerateTextRow("生成邮箱",new EmailGenerator());
        GenerateTextRow bankAccount = new GenerateTextRow("生成银行账号",new BankAccountGenerator());
        GenerateTextRow randomNumber32 = new GenerateTextRow("生成32位随机数",new RandomNumber32Generator());

        rowsList.add(identifyRow);
        rowsList.add(phoneNumberRow);
        rowsList.add(taxperNumberRow);
        rowsList.add(emailRow);
        rowsList.add(bankAccount);
        rowsList.add(randomNumber32);

    }

    public static void main(String[] args) {
        GridLayout gridLayout = new GridLayout(rowsList.size(), 1);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        JPanel container = new JPanel(gridLayout);

        for (MyComponent component:rowsList){
            container.add((GenerateTextRow) component);
        }


        mainFrame.setContentPane(container);
        mainFrame.setVisible(true);
    }
}
