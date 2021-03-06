
import java.awt.Font;
import java.awt.GraphicsEnvironment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows 10 Version 2
 */
public class ChangeFontDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChangeFontDialog
     */
    MTE h;
    String name = "";
    int style = 0;
    int size = 0;

    public ChangeFontDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        h = (MTE) parent;
        loadFont();
        setCurrentFont();
    }

    private void loadFont() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilyNames = ge.getAvailableFontFamilyNames();
        listFont.setListData(fontFamilyNames);
    }

    private void setCurrentFont() {
        Font f = h.txtA.getFont();
        name = f.getFontName();
        style = f.getStyle();
        size = f.getSize();
        System.out.println(name + " " + style + " " + size);
        listFont.setSelectedValue(name, true);
        listSize.setSelectedValue(size + "", true);
        listStyle.setSelectedIndex(style);

    }

    private void setSampleFont() {
        name = listFont.getSelectedValue();
        size = Integer.parseInt(listSize.getSelectedValue());
        style = listStyle.getSelectedIndex();
        switch (style) {
            case 0:
                lblPrev.setFont(new Font(name, Font.PLAIN, size));
                break;
            case 1:
                lblPrev.setFont(new Font(name, Font.BOLD, size));
                break;
            case 2:
                lblPrev.setFont(new Font(name, Font.ITALIC, size));
                break;
            case 3:
                lblPrev.setFont(new Font(name, Font.BOLD + Font.ITALIC, size));
                break;
            default:
                break;
        }
    }

    private void setSelectedFont() {
        switch (style) {
            case 0:
                h.txtA.setFont(new Font(name, Font.PLAIN, size));
                break;
            case 1:
                h.txtA.setFont(new Font(name, Font.BOLD, size));
                break;
            case 2:
                h.txtA.setFont(new Font(name, Font.ITALIC, size));
                break;
            case 3:
                h.txtA.setFont(new Font(name, Font.BOLD + Font.ITALIC, size));
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFont = new javax.swing.JList<>();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listStyle = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listSize = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        lblPrev = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Style:");

        jLabel3.setText("Size:");

        listFont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listFontMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listFont);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Font:");

        listStyle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Plain", "Bold", "Italic", "Bold Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listStyle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listStyleMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listStyle);

        listSize.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "10", "12", "16", "18", "20", "24", "28", "32", "48", "72" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listSizeMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(listSize);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));

        lblPrev.setText("AaBbCcDdEeFfGgHhIiJj");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrev)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(lblPrev)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOk)
                                    .addComponent(btnCancel)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        setSelectedFont();
        this.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void listFontMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFontMouseReleased
        setSampleFont();
    }//GEN-LAST:event_listFontMouseReleased

    private void listSizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSizeMouseReleased
        setSampleFont();
    }//GEN-LAST:event_listSizeMouseReleased

    private void listStyleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStyleMouseReleased
        setSampleFont();
    }//GEN-LAST:event_listStyleMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeFontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeFontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeFontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeFontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeFontDialog dialog = new ChangeFontDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JList<String> listFont;
    private javax.swing.JList<String> listSize;
    private javax.swing.JList<String> listStyle;
    // End of variables declaration//GEN-END:variables
}
