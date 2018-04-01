package com.hq.mobydroid.gui;

import com.hq.materialdesign.MaterialColor;
import com.hq.materialdesign.MaterialIcons;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.Customizer;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Bilux (i.bilux@gmail.com)
 */
public class MaterialButtonV extends JPanel implements Customizer, Serializable {

    private final PropertyChangeSupport propertySupport;
    private Object bean;
    private String text;
    private char icon;
    private MaterialButtonAction action;
    private boolean enabled;

    /**
     * Creates new customizer MaterialButton
     */
    public MaterialButtonV() {
        propertySupport = new PropertyChangeSupport(this);
        initComponents();

        addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }

            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }

            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_MainMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel_MainMouseReleased(evt);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_MainMouseClicked(evt);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_MainMouseExited(evt);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_MainMouseEntered(evt);
            }
        });

        // enable
        enabled = true;
    }

    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }

    private void jPanel_MainMouseEntered(java.awt.event.MouseEvent evt) {
        if (enabled) {
            setBackground(MaterialColor.GREY_200);
            jLabel_MainLabel.setForeground(MaterialColor.BLUE_700);
            jLabel_MainIcon.setForeground(MaterialColor.BLUE_700);
            jSeparator_Main.setBackground(MaterialColor.BLUE_700);
            jSeparator_Main.setForeground(MaterialColor.BLUE_700);
        }
    }

    private void jPanel_MainMouseExited(java.awt.event.MouseEvent evt) {
        if (enabled) {
            setBackground(MaterialColor.GREY_50);
            jLabel_MainLabel.setForeground(MaterialColor.GREY_700);
            jLabel_MainIcon.setForeground(MaterialColor.GREY_700);
            jSeparator_Main.setBackground(MaterialColor.GREY_50);
            jSeparator_Main.setForeground(MaterialColor.GREY_50);
        }
    }

    private void jPanel_MainMousePressed(java.awt.event.MouseEvent evt) {
        if (enabled) {
            setBackground(MaterialColor.GREY_400);
        }
    }

    private void jPanel_MainMouseReleased(java.awt.event.MouseEvent evt) {
        if (enabled) {
            setBackground(MaterialColor.GREY_200);
        }
    }

    private void jPanel_MainMouseClicked(java.awt.event.MouseEvent evt) {
        if (action != null && evt.getButton() == MouseEvent.BUTTON1 && enabled) {
            action.Action();
        }
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        if (action != null && (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) && enabled) {
            action.Action();
        }
    }

    private void formFocusLost(java.awt.event.FocusEvent evt) {
        setBorder(BorderFactory.createEmptyBorder());
    }

    private void formFocusGained(java.awt.event.FocusEvent evt) {
        setBorder(BorderFactory.createLineBorder(MaterialColor.BLUE_700, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_MainIcon = new javax.swing.JLabel();
        jLabel_MainLabel = new javax.swing.JLabel();
        jSeparator_Main = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(250, 250, 250));

        jLabel_MainIcon.setBackground(new java.awt.Color(250, 250, 250));
        jLabel_MainIcon.setFont(MaterialIcons.ICON_FONT.deriveFont(24f));
        jLabel_MainIcon.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_MainIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MainIcon.setText(String.valueOf(MaterialIcons.HOME));
        jLabel_MainIcon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel_MainLabel.setBackground(new java.awt.Color(250, 250, 250));
        jLabel_MainLabel.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MainLabel.setText("Material Button");

        jSeparator_Main.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator_Main.setForeground(new java.awt.Color(250, 250, 250));
        jSeparator_Main.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator_Main.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator_Main)
                    .addComponent(jLabel_MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MainIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel_MainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel_MainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_MainIcon;
    private javax.swing.JLabel jLabel_MainLabel;
    private javax.swing.JSeparator jSeparator_Main;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setEnabled(boolean enable) {
        enabled = enable;
        jLabel_MainIcon.setEnabled(enable);
        jLabel_MainLabel.setEnabled(enable);
        jSeparator_Main.setEnabled(enable);
        super.setEnabled(enable);
    }

    public String getText() {
        return text;
    }

    public void setText(String newValue) {
        String oldValue = text;
        text = newValue;
        jLabel_MainLabel.setText(text);
        propertySupport.firePropertyChange("Text", oldValue, text);
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char newValue) {
        char oldValue = icon;
        icon = newValue;
        jLabel_MainIcon.setText(String.valueOf(icon));
        propertySupport.firePropertyChange("Icon", oldValue, icon);
    }

    public MaterialButtonAction getAction() {
        return action;
    }

    public void setAction(MaterialButtonAction newAction) {
        MaterialButtonAction oldAction = action;
        action = newAction;
        propertySupport.firePropertyChange("Action", oldAction, action);
    }

}
