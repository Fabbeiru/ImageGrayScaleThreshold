/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabiyjose.dialogspractise6;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

/**
 *
 * @author Fabián y José María
 */
public class DialogsPractise6 extends javax.swing.JFrame {

    /**
     * Creates new form DialogsPractise6
     */
    
    JFileChooser fc = new JFileChooser();
    FileNameExtensionFilter filter;
    int umbral;
    
    public DialogsPractise6() {        
        initComponents();
        initFilters();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);  
        
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);        
    }
    
    private void initFilters(){
        filter = new FileNameExtensionFilter("Images", "jpg", "jpeg");
        fc.addChoosableFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanCont = new javax.swing.JPanel();
        canvas = new com.fabiyjose.dialogspractise6.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        image = new javax.swing.JMenu();
        loadImage = new javax.swing.JMenuItem();
        saveImage = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        previousImage = new javax.swing.JMenuItem();
        actualImage = new javax.swing.JMenuItem();
        filteredImage = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        closeWindow = new javax.swing.JMenuItem();
        options = new javax.swing.JMenu();
        applyFilter = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THRESHOLDING IMAGE");

        jLabel1.setText("© José María & Fabián");

        jPanCont.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPLOAD AN IMAGE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanContLayout = new javax.swing.GroupLayout(jPanCont);
        jPanCont.setLayout(jPanContLayout);
        jPanContLayout.setHorizontalGroup(
            jPanContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
            .addGroup(jPanContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanContLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanContLayout.setVerticalGroup(
            jPanContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
            .addGroup(jPanContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanContLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        image.setMnemonic('I');
        image.setText("Image");

        loadImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadImage.setText("Upload");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });
        image.add(loadImage);

        saveImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveImage.setText("Save");
        saveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageActionPerformed(evt);
            }
        });
        image.add(saveImage);

        viewMenu.setText("View");

        previousImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        previousImage.setText("Previous Image");
        previousImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousImageActionPerformed(evt);
            }
        });
        viewMenu.add(previousImage);

        actualImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        actualImage.setText("Actual image");
        actualImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualImageActionPerformed(evt);
            }
        });
        viewMenu.add(actualImage);

        filteredImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        filteredImage.setText("FIltered image");
        filteredImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filteredImageActionPerformed(evt);
            }
        });
        viewMenu.add(filteredImage);

        image.add(viewMenu);
        image.add(jSeparator1);

        closeWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        closeWindow.setText("Exit & close");
        closeWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowActionPerformed(evt);
            }
        });
        image.add(closeWindow);

        jMenuBar1.add(image);

        options.setMnemonic('O');
        options.setText("Options");

        applyFilter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        applyFilter.setText("Apply filter");
        applyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterActionPerformed(evt);
            }
        });
        options.add(applyFilter);

        jMenuBar1.add(options);

        helpMenu.setMnemonic('H');
        helpMenu.setText("Help");

        aboutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenu.setText("About");
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenu);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        int res = fc.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION){
            File img = fc.getSelectedFile();
            canvas.loadImage(img);
            
            if (!canvas.checkSize()) {
                int rp = JOptionPane.showConfirmDialog(this, "Image dimension must be at most 1024x768,"
                        + " Do you want to resize it?", "RESIZE IMAGE", JOptionPane.YES_NO_OPTION);
                
                if (rp == JOptionPane.YES_OPTION) {
                    canvas.resize();                    
                } else {
                    if (canvas.nullImage(0)) {
                        canvas.reset();                        
                    }else{
                        canvas.restore();
                    }
                    return;
                }          
            }   
            canvas.setImage();
            canvas.viewImage(1);
            String textBorder = "ACTUAL IMAGE";
            jPanCont.setBorder(new TitledBorder(null, textBorder, 2, 0, new Font("Tahoma", Font.BOLD, 12), Color.BLACK));
        }
    }//GEN-LAST:event_loadImageActionPerformed

    private void applyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterActionPerformed
        
        if (canvas.nullImage(1)) {
            JOptionPane.showConfirmDialog(this, "Please, first upload an image", 
                    "UPLOAD AN IMAGE", JOptionPane.OK_CANCEL_OPTION);
            return;            
        } 
        
        String res;        
        String msg = "Please, introduce a threshold between 0 and 255, both inclusive";
        
        do{
            res = JOptionPane.showInputDialog(this, msg, "THRESHOLD", JOptionPane.OK_CANCEL_OPTION);
            if (res == null) return;
            if (!(res.matches("^[0-9]+$") && Integer.parseInt(res) <= 255 && Integer.parseInt(res) >= 0)){
                msg = "Threshold must be between 0 and 255, both inclusive";
            }
        } while (!(res.matches("^[0-9]+$") && Integer.parseInt(res) <= 255 && Integer.parseInt(res) >= 0));
        
        umbral = Integer.parseInt(res);
        canvas.applyFilter(umbral);
        JOptionPane.showConfirmDialog(this, "Thresholding has been done. Use 'view' submenu to check it", 
                    "SUCCESS THRESHOLDING", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_applyFilterActionPerformed

    private void previousImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousImageActionPerformed
        if (canvas.nullImage(0)) {
            JOptionPane.showConfirmDialog(this, "Please, load at least two image to view the previous", 
                    "VIEW PREVIOUS", JOptionPane.OK_CANCEL_OPTION);
            return;            
        }
        canvas.viewImage(0);
        String textBorder = "PREVIOUS IMAGE";
        jPanCont.setBorder(new TitledBorder(null, textBorder, 2, 0, new Font("Tahoma", Font.BOLD, 12), Color.BLACK));
    }//GEN-LAST:event_previousImageActionPerformed

    private void actualImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualImageActionPerformed
        if (canvas.nullImage(1)) {
            JOptionPane.showConfirmDialog(this, "Please, first upload an image", 
                    "UPLOAD AN IMAGE", JOptionPane.OK_CANCEL_OPTION);
            return;            
        }
        canvas.viewImage(1);
        String textBorder = "ACTUAL IMAGE";
        jPanCont.setBorder(new TitledBorder(null, textBorder, 2, 0, new Font("Tahoma", Font.BOLD, 12), Color.BLACK));
    }//GEN-LAST:event_actualImageActionPerformed

    private void filteredImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filteredImageActionPerformed
        if (canvas.nullImage(1)) {
            JOptionPane.showConfirmDialog(this, "Please, first upload an image", 
                    "UPLOAD AN IMAGE", JOptionPane.OK_CANCEL_OPTION);
            return;            
        } 
        
        if (canvas.nullImage(2)){
            JOptionPane.showConfirmDialog(this, "Please, apply thresholding to see this image", 
                    "APPLY THRESHOLDING", JOptionPane.OK_CANCEL_OPTION);
            return;  
        }
        canvas.viewImage(2);
        String textBorder = "FILTERED IMAGE (Threshold: " + umbral + ")";
        jPanCont.setBorder(new TitledBorder(null, textBorder, 2, 0, new Font("Tahoma", Font.BOLD, 12), Color.BLACK));
    }//GEN-LAST:event_filteredImageActionPerformed

    private void saveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageActionPerformed
        if (canvas.nullImage(1)){
            JOptionPane.showConfirmDialog(this, "Please, first upload an image", 
                    "UPLOAD AN IMAGE", JOptionPane.OK_CANCEL_OPTION);
            return;
        }else if (canvas.nullImage(2)){
            JOptionPane.showConfirmDialog(this, "Please, apply thresholding to save this image", 
                    "APPLY THRESHOLDING", JOptionPane.OK_CANCEL_OPTION);
            return;  
        }
        
        int res = fc.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION){
            String img = fc.getSelectedFile().getAbsolutePath();
            canvas.saveImage(img);
            
            JOptionPane.showConfirmDialog(this, "Image has been saved in: " + img, "SAVE IMAGE", JOptionPane.OK_CANCEL_OPTION);
        }                
        
    }//GEN-LAST:event_saveImageActionPerformed

    private void closeWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "This window will close. Proceed?", 
                "CLOSE WINDOW", JOptionPane.YES_NO_OPTION);
        
        if (res == JOptionPane.YES_OPTION) this.dispose();
    }//GEN-LAST:event_closeWindowActionPerformed

    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
        JOptionPane.showMessageDialog(this, 
                "To use the application you must first upload an image (.jpg or .jpeg),\n"
              + "then you may apply the filter from the 'Options' menu where you will be\n"
              + "asked to introduce a range of values between 0 and 255, where 0 corresponds\n"
              + "to full white and 255 to full black. Either the original image or the\n"
              + "altered one may be displayed on the 'View' submenu.", "HELP MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuActionPerformed
    
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
            java.util.logging.Logger.getLogger(DialogsPractise6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogsPractise6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogsPractise6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogsPractise6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogsPractise6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JMenuItem actualImage;
    private javax.swing.JMenuItem applyFilter;
    private com.fabiyjose.dialogspractise6.Canvas canvas;
    private javax.swing.JMenuItem closeWindow;
    private javax.swing.JMenuItem filteredImage;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanCont;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem loadImage;
    private javax.swing.JMenu options;
    private javax.swing.JMenuItem previousImage;
    private javax.swing.JMenuItem saveImage;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}