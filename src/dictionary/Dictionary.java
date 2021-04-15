/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import javax.swing.*;

/**
 *
 * @author Kelash
 */
public class Dictionary extends javax.swing.JFrame {

    /**
     * Creates new form Dictionary
     */
    
    Hashtable dictionary = new Hashtable();
    
    public Dictionary() {
        initComponents();
        textArea.setEditable(false);
        dictionary.put("amazing", "Incredible, Unbelievable, Improbable, Astonishing");
        dictionary.put("anger", "Enrage, Infuriate, Arouse, Nettle");
        dictionary.put("angry", "Wrathful, Furious, Enraged, Indignant");
        dictionary.put("answer", "Reply, Respond, Retort, Acknowledge");
        dictionary.put("ask", "Question, Inquire, Query, Interrogate");
        dictionary.put("awful", "Dreadful, Terrible, Abominable, Unpleasant");
        dictionary.put("bad", "Depraved, Rotten, Contaminated, Sinful");
        dictionary.put("beautiful", "Gorgeous, Dazzling, Splendid, Magnificent");
        dictionary.put("begin", "Start, Open, Launch, Initiate");
        dictionary.put("big", "Enormous, Huge, Immense,Gigantic");
        dictionary.put("brave", "Courageous, Fearless, Dauntless, Intrepid");
        dictionary.put("break", "Fracture, Wreck, Crash, Demolish");
        dictionary.put("bright", "Sparkling, Shimmering, Radiant, Vivid");
        dictionary.put("calm", "Quiet,	Peaceful,	Unruffled,	Tranquil");
        dictionary.put("come", "Approach,	Advance,	Near,	Arrive");
        dictionary.put("cool", "Chilly,	Cold,	Frosty,	Frigid");
        dictionary.put("crooked", "Bent,	Twisted,	Zigzag,	Hooked");
        dictionary.put("cry", "Weep,	Wail,	Sob,	Bawl");
        dictionary.put("cut", "Slice,	Carve,	Cleave,	Slit");
        dictionary.put("dangerous", "Perilous,	Hazardous,	Risky,	Uncertain");
        dictionary.put("dark", "Shadowy,	Unlit,	Murky,	Gloomy");
        dictionary.put("decide", "Determine,	Settle,	Choose,	Resolve");
        dictionary.put("definite", "Certain,	Sure,	Positive,	Determined");
        dictionary.put("delicious", "Savory,	Delectable,	Appetizing,	Luscious");
        dictionary.put("describe", "Portray,	Characterize,	Picture,	Narrate");
        dictionary.put("destroy", "Ruin,	Demolish,	Raze,	Slay");
        dictionary.put("difference", "Disagreement,	Inequity,	Contrast,	Dissimilarity");
        dictionary.put("do", "Execute, Enact, Carry Out, Finish");
        dictionary.put("dull", "Unimaginative, Lifeless, Tedious, Tiresome");
        dictionary.put("eager", "Keen, Fervent, Enthusiastic, Involved");
        dictionary.put("end", "Stop, Finish, Terminate, Conclude");
        dictionary.put("enjoy", "Appreciate, Delight In,	Be Pleased,	Indulge In");
        dictionary.put("explain", "Elaborate,	Clarify,	Define,	Interpret");
        dictionary.put("fair", "Just,	Impartial,	Unbiased,	Objective");
        dictionary.put("fall", "Drop, Descend,	Plunge,	Topple");
        dictionary.put("false", "Fake,	Fraudulent,	Counterfeit,	Spurious");
        dictionary.put("fast", "Quick,	Rapid,	Hasty,	Swiftly");
        dictionary.put("fat", "Stout,	Corpulent,	Paunchy,	Plump");
        dictionary.put("fear", "Fright,	Dread,	Terror,	Alarm");
        dictionary.put("fly	", "Soar,	Hover,	Flit,	Wing");
        dictionary.put("funny", "Humorous,	Amusing,	Droll,	Laughable");
        dictionary.put("get", "Acquire,	Obtain,	Secure,	Procure");
        dictionary.put("go", "Recede,	Depart,	Fade,	Disappear");
        dictionary.put("good", "Excellent,	Apt,	Marvelous,	Qualified");
        dictionary.put("great", "Noteworthy,	Worthy,	Distinguished,	Remarkable");
        dictionary.put("gross", "Improper,	Rude,	Coarse,	Indecent");
        dictionary.put("happy", "Pleased,	Contented,	Satisfied,	Delighted");
        dictionary.put("hate", "Despise,	Loathe,	Detest,	Abhor");
        dictionary.put("have", "Acquire,	Gain,	Maintain,	Believe");
        dictionary.put("help", "Aid,	Assist,	Succor,	Encourage");
        dictionary.put("hide", "Conceal,	Camouflage,	Shroud,	Veil");
        dictionary.put("hurry", "Hasten,	Urge,	Accelerate,	Bustle");
        dictionary.put("hurt", "Damage,	Distress,	Afflict,	Pain");
        dictionary.put("idea", "Thought,	Concept,	Conception,	Notion");
        dictionary.put("important", "Necessary,	Vital,	Critical,	Indispensable");
        dictionary.put("interesting", "Fascinating,	Bright,	Intelligent,	Animated");
        dictionary.put("keep", "Hold,	Maintain,	Sustain,	Support");
        dictionary.put("kill", "Slay,   Execute,    Assassinate,    Abolish");
        dictionary.put("lazy", "Indolent,	Slothful,	Idle,	Inactive");
        dictionary.put("little", "Dinky,	Puny,	Diminutive,	Miniature");
        dictionary.put("look", "Scrutinize,	Inspect,	Survey,	Study");
        dictionary.put("love", "Like,	Admire,	Esteem,	Fancy");
        dictionary.put("make", "Design,	Fabricate,	Manufacture,	Produce");
        dictionary.put("mark", "Impress,	Effect,	Trace,	Imprint");
        dictionary.put("mischievous", "Prankish,	Waggish,	Impish,	Sportive");
        dictionary.put("move", "Plod,	Go,	Creep,	Crawl");
        dictionary.put("neat", "Trim,	Dapper,	Natty,	Smart");
        dictionary.put("new", "Novel,	Modern,	Current,	Recent");
        dictionary.put("old", "Aged,	Used,	Worn,	Dilapidated");
        dictionary.put("part", "Portion,       Section,      Fraction,     Fragment");
        dictionary.put("place", "Space,	Area,	Spot,	Plot");
        dictionary.put("plan", "Region,	Location,	Situation, Position");
        dictionary.put("predicament", "Quandary,  Dilemma, Plight,	Spot");
        dictionary.put("put", "Place,     Assign,    Keep,      Establish");
        dictionary.put("quiet", "Tranquil,    Peaceful,      Calm,       Restful");
        dictionary.put("right", "Correct,   Accurate,   Factual,     True");
        dictionary.put("run", "Race,     Sprint,       Dash,       Rush");
        dictionary.put("say", "Recount,    Narrate,      Explain,     Reveal");
        dictionary.put("scared", "Panicked,    Fearful,    Unnerved,    Insecure");
        dictionary.put("show", "Display,   Exhibit,      Present,   Note");
        dictionary.put("slow", "Unhurried,	Behind,	Tedious,	Slack");
        dictionary.put("stop", "Cease,	Halt,	Stay,	Pause");
        dictionary.put("story", "Tale,	Yarn,	Account,	Narrative");
        dictionary.put("strange", "Odd,	Peculiar,	Unusual,	Unfamiliar");
        dictionary.put("take", "Hold,	Catch,	Seize,	Grasp");
        dictionary.put("tell", "Disclose,	Reveal,	 Show,	Expose");
        dictionary.put("think", "Consider,	Contemplate,	Reflect,	Mediate");
        dictionary.put("trouble", "Distress,	Anguish,	Anxiety,	Wretchedness");
        dictionary.put("true", "Accurate,	Right,	Proper,	Precise");
        dictionary.put("ugly", "Horrible,	Unpleasant,	Monstrous,	Terrifying");
        
        
    }
    
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153), 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("My Dictionary");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153), 4));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Search");

        textField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField.setForeground(new java.awt.Color(255, 0, 153));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldKeyTyped(evt);
            }
        });

        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        scroll.setViewportView(list);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 410));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153), 4));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Synonyms");

        textArea.setBackground(new java.awt.Color(255, 255, 255));
        textArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 0, 204));
        jScrollPane2.setViewportView(textArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 480, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    
    private DefaultListModel<String> mod;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mod = new DefaultListModel();
        
        list.setModel(mod);
        
        mod.addElement("amazing");
        mod.addElement("anger");
        mod.addElement("angry");
        mod.addElement("answer");
        mod.addElement("ask");
        mod.addElement("awful");
        mod.addElement("bad");
        mod.addElement("beautiful");
        mod.addElement("begin");
        mod.addElement("big");
        mod.addElement("brave");
        mod.addElement("break");
        mod.addElement("bright");
        mod.addElement("calm");
        mod.addElement("come");
        mod.addElement("cool");
        mod.addElement("crooked");
        mod.addElement("cry");
        mod.addElement("cut");
        mod.addElement("dangerous");
        mod.addElement("dark");
        mod.addElement("decide");
        mod.addElement("definite");
        mod.addElement("delicious");
        mod.addElement("describe");
        mod.addElement("destroy");
        mod.addElement("difference");
        mod.addElement("do");
        mod.addElement("dull");
        mod.addElement("eager");
        mod.addElement("end");
        mod.addElement("enjoy");
        mod.addElement("explain");
        mod.addElement("fair");
        mod.addElement("fall");
        mod.addElement("false");
        mod.addElement("fast");
        mod.addElement("fat");
        mod.addElement("fear");
        mod.addElement("fly");
        mod.addElement("funny");
        mod.addElement("get");
        mod.addElement("go");
        mod.addElement("good");
        mod.addElement("great");
        mod.addElement("gross");
        mod.addElement("happy");
        mod.addElement("hate");
        mod.addElement("have");
        mod.addElement("help");
        mod.addElement("hide");
        mod.addElement("hurry");
        mod.addElement("hurt");
        mod.addElement("idea");
        mod.addElement("important");
        mod.addElement("interesting");
        mod.addElement("keep");
        mod.addElement("kill");
        mod.addElement("lazy");
        mod.addElement("little");
        mod.addElement("look");
        mod.addElement("love");
        mod.addElement("make");
        mod.addElement("mark");
        mod.addElement("mischievous");
        mod.addElement("move");
        mod.addElement("neat");
        mod.addElement("new");
        mod.addElement("old");
        mod.addElement("part");
        mod.addElement("place");
        mod.addElement("plan");
        mod.addElement("predicament");
        mod.addElement("quiet");
        mod.addElement("right");
        mod.addElement("run");
        mod.addElement("say");
        mod.addElement("scared");
        mod.addElement("show");
        mod.addElement("slow");
        mod.addElement("stop");
        mod.addElement("story");
        mod.addElement("strange");
        mod.addElement("take");
        mod.addElement("tell");
        mod.addElement("think");
        mod.addElement("trouble");
        mod.addElement("true");
        mod.addElement("ugly");
        
    }//GEN-LAST:event_formWindowOpened

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        if(!list.isSelectionEmpty()){
            String val = list.getSelectedValue();            
            textArea.setText(dictionary.get(val).toString());
        }
    }//GEN-LAST:event_listValueChanged

    private void textFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyPressed
        
    }//GEN-LAST:event_textFieldKeyPressed

    private void textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyTyped
        
        String str = textField.getText().trim();
        str += evt.getKeyChar();
        str = str.toLowerCase().trim();
        String s;
        
        for(int i=0; i<mod.size(); i++){
            s = mod.getElementAt(i);
            s = s.toLowerCase();
            if(s.startsWith(str)){
                list.setSelectedIndex(i);
                JScrollBar sb = scroll.getVerticalScrollBar();
                sb.setValue(i*20);
                return;
            }
        }
        textArea.setText("Not Found!");
        list.clearSelection();
        
    }//GEN-LAST:event_textFieldKeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dictionary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextPane textArea;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
