package com.xmj.componetImpl;

import com.xmj.component.MyComponent;
import com.xmj.generaters.Generator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class GenerateTextRow extends JPanel implements MyComponent {

    static private GridLayout gridLayout;
    private JButton generateButton;
    private JTextField text;
    private Generator generator;

    static {
        gridLayout = new GridLayout(1,2);
        gridLayout.setHgap(30);
    }

    public GenerateTextRow(String buttonName,Generator generator){
        super(gridLayout);

        this.generator=generator;

        text = new JTextField();

        generateButton = new JButton();
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(generator.generateText());
                text.selectAll();
                text.copy();
            }
        });
        generateButton.setText(buttonName);
        this.add(generateButton);
        this.add(text);
    }

}
