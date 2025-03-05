package app1;

public class Calculator extends javax.swing.JFrame {
    private int result=0;
    private int press=0;
    private void temp()
    {
        if(result==0)
        {
            result=Integer.parseInt(NumText.getText());
        }
    }
    private void calculate()
    {
        //tôi nghĩ bạn nên dùng switch case
        if(press==1)
        {
            result = result+Integer.parseInt(NumText.getText());
        }
        else if(press==2)
        {
            result = result-Integer.parseInt(NumText.getText());
        }
        else if(press==3)
        {
            result = result/Integer.parseInt(NumText.getText());
        }
        else
        {
            result = result*Integer.parseInt(NumText.getText());
        }
    }
    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumText = new javax.swing.JTextField();
        plusBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        timeBtn = new javax.swing.JButton();
        rfsBtn = new javax.swing.JButton();
        resultBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTextActionPerformed(evt);
            }
        });

        plusBtn.setText("+");
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });

        minusBtn.setText("-");
        minusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBtnActionPerformed(evt);
            }
        });

        divideBtn.setText("/");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        timeBtn.setText("*");
        timeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeBtnActionPerformed(evt);
            }
        });

        rfsBtn.setText("Refresh");
        rfsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfsBtnActionPerformed(evt);
            }
        });

        resultBtn.setText("=");
        resultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(rfsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(resultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(timeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(NumText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plusBtn)
                    .addComponent(minusBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divideBtn)
                    .addComponent(timeBtn))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rfsBtn)
                    .addComponent(resultBtn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTextActionPerformed
        calculate();
    }//GEN-LAST:event_NumTextActionPerformed

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        temp();
        press=1;
        NumText.setText("");
    }//GEN-LAST:event_plusBtnActionPerformed

    private void minusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBtnActionPerformed
        temp();
        press=2;
        NumText.setText("");
    }//GEN-LAST:event_minusBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        temp();
        press=3;
        NumText.setText("");
    }//GEN-LAST:event_divideBtnActionPerformed

    private void timeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeBtnActionPerformed
        temp();
        press=4;
        NumText.setText("");
    }//GEN-LAST:event_timeBtnActionPerformed

    private void rfsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfsBtnActionPerformed
        result=0;
        NumText.setText("");
        //Khi đã refresh nhưng không xóa hiện thông báo "Error: Division by zero"
    }//GEN-LAST:event_rfsBtnActionPerformed

    private void resultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBtnActionPerformed
        calculate();
        NumText.setText(String.valueOf(result));
    }//GEN-LAST:event_resultBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumText;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton resultBtn;
    private javax.swing.JButton rfsBtn;
    private javax.swing.JButton timeBtn;
    // End of variables declaration//GEN-END:variables
}
