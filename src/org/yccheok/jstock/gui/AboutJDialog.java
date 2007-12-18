/*
 * AboutJDialog.java
 *
 * Created on July 5, 2007, 1:01 AM
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2007 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

/**
 *
 * @author  yccheok
 */
public class AboutJDialog extends javax.swing.JDialog {
    
    /** Creates new form AboutJDialog */
    public AboutJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        /* Just for fun. */
        final int index = random.nextInt(images.length);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(images[index])));
   }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About JStock");
        setBackground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/192x192/j0424124.gif")));
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JStock");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("version 0.9.5");

        jLabel4.setText("<html>\nJStock is a stock analysis tool which help you to pick stocks in an automated way.\n<br>\n<br>\nCopyright &copy; 2007 Yan Cheng Cheok <a href=\"mailto:yccheok@yahoo.com\">yccheok@yahoo.com</a>\n<br>\n<br>\nProject website : <a href=\"http://sourceforge.net/projects/jstock\">http://sourceforge.net/projects/jstock</a>\n</html>");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("License"));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.\n\nThis program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.\n\nYou should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCaretPosition(1);
        this.jScrollPane2.getVerticalScrollBar().setValue(0);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-451)/2, (screenSize.height-555)/2, 451, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private static final String[] images = {
        "/images/192x192/j0424124.gif",
        "/images/192x192/j0366390.gif",
        "/images/192x192/j0409253.gif",
        "/images/192x192/j0411029.gif", 
        "/images/192x192/j0237330.gif"
    };
        
    private java.util.Random random = new java.util.Random();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    
}
