/**
 *
 * @author nestor
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


public class EscenaJuego extends javax.swing.JFrame {

    /**
     * Creates new form EscenaJuego
     */
    public EscenaJuego() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        labelTitulo = new Titulo();
        panelInformacion = new javax.swing.JPanel();
        labelTituloScore = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        labelTituloRespuestas = new javax.swing.JLabel();
        panelContenedorRespuestas = new javax.swing.JPanel();
        labelInstruccion = new javax.swing.JLabel();
        panelRespuestas = new javax.swing.JPanel();
        panelPie = new javax.swing.JPanel();
        labelTituloFrase = new javax.swing.JLabel();
        panelFrases = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        opcion1 = new javax.swing.JLabel();
        opcion2 = new javax.swing.JLabel();
        opcion3 = new javax.swing.JLabel();
        sujeto = new javax.swing.JLabel();
        predicado = new javax.swing.JLabel();
        verbo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        preguntaActual = 1;

        MouseListener ml = new MouseAdapter(){
            public void mousePressed(MouseEvent  e){
            JComponent jc = (JComponent)e.getSource();
            TransferHandler th = jc.getTransferHandler();
            th.exportAsDrag(jc, e, TransferHandler.COPY);
            }
        };

        inicializarControlador();
        actualizarPantalla();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 150, 0));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        panelEncabezado.setBackground(new java.awt.Color(255, 150, 0));
        panelEncabezado.setMaximumSize(new java.awt.Dimension(800, 100));
        panelEncabezado.setPreferredSize(new java.awt.Dimension(800, 100));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        labelTitulo.setBackground(java.awt.Color.gray);
        labelTitulo.setFont(new java.awt.Font("Lobster", 1, 36)); // NOI18N
        labelTitulo.setForeground(java.awt.Color.white);
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setMaximumSize(new java.awt.Dimension(300, 17));
        labelTitulo.setPreferredSize(new java.awt.Dimension(300, 17));
        panelEncabezado.add(labelTitulo, java.awt.BorderLayout.LINE_START);

        panelInformacion.setBackground(new java.awt.Color(255, 150, 0));
        panelInformacion.setPreferredSize(new java.awt.Dimension(200, 100));

        labelTituloScore.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTituloScore.setForeground(java.awt.Color.white);
        labelTituloScore.setText("Score:");

        labelScore.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelScore.setForeground(java.awt.Color.white);
        labelScore.setText("0");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTituloScore, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloScore)
                    .addComponent(labelScore))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelEncabezado.add(panelInformacion, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panelEncabezado);

        panelCuerpo.setBackground(new java.awt.Color(255, 150, 0));
        panelCuerpo.setMaximumSize(new java.awt.Dimension(800, 150));
        panelCuerpo.setPreferredSize(new java.awt.Dimension(800, 150));

        labelTituloRespuestas.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTituloRespuestas.setForeground(java.awt.Color.white);
        labelTituloRespuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloRespuestas.setText("Answers");
        labelTituloRespuestas.setMaximumSize(new java.awt.Dimension(100, 17));
        labelTituloRespuestas.setPreferredSize(new java.awt.Dimension(100, 17));

        panelContenedorRespuestas.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        panelContenedorRespuestas.setMaximumSize(new java.awt.Dimension(589, 150));
        panelContenedorRespuestas.setPreferredSize(new java.awt.Dimension(589, 126));

        labelInstruccion.setBackground(java.awt.Color.black);
        labelInstruccion.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        labelInstruccion.setForeground(java.awt.Color.white);
        labelInstruccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInstruccion.setText("Drag and drop a verb");

        panelRespuestas.setBackground(java.awt.Color.white);
        panelRespuestas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 30));

        opcion1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        opcion1.setMaximumSize(new java.awt.Dimension(100, 100));
        opcion1.setTransferHandler(new TransferHandler("text"));
        opcion1.addMouseListener(ml);
        panelRespuestas.add(opcion1);

        opcion2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        opcion2.setTransferHandler(new TransferHandler("text"));
        opcion2.addMouseListener(ml);
        panelRespuestas.add(opcion2);

        opcion3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        opcion3.setTransferHandler(new TransferHandler("text"));
        opcion3.addMouseListener(ml);
        panelRespuestas.add(opcion3);

        javax.swing.GroupLayout panelContenedorRespuestasLayout = new javax.swing.GroupLayout(panelContenedorRespuestas);
        panelContenedorRespuestas.setLayout(panelContenedorRespuestasLayout);
        panelContenedorRespuestasLayout.setHorizontalGroup(
            panelContenedorRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelInstruccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRespuestas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        panelContenedorRespuestasLayout.setVerticalGroup(
            panelContenedorRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorRespuestasLayout.createSequentialGroup()
                .addComponent(labelInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRespuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addComponent(labelTituloRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedorRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(labelTituloRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedorRespuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelCuerpo);

        panelPie.setBackground(new java.awt.Color(255, 150, 0));
        panelPie.setMaximumSize(new java.awt.Dimension(800, 150));
        panelPie.setPreferredSize(new java.awt.Dimension(800, 150));

        labelTituloFrase.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTituloFrase.setForeground(java.awt.Color.white);
        labelTituloFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFrase.setText("Phrase");
        labelTituloFrase.setMaximumSize(new java.awt.Dimension(100, 17));
        labelTituloFrase.setPreferredSize(new java.awt.Dimension(100, 17));

        panelFrases.setMaximumSize(new java.awt.Dimension(589, 32767));
        panelFrases.setPreferredSize(new java.awt.Dimension(589, 100));
        panelFrases.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 35));

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.add(sujeto);

        panelFrases.add(jPanel4);

        verbo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        verbo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        verbo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        verbo.setFocusable(false);
        verbo.setMinimumSize(new java.awt.Dimension(50, 29));
        verbo.setName(""); // NOI18N
        verbo.setPreferredSize(new java.awt.Dimension(120, 29));
        verbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verboActionPerformed(evt);
            }
        });
        panelFrases.add(verbo);

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.add(predicado);

        panelFrases.add(jPanel6);

        nextButton.setText("Next");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPieLayout = new javax.swing.GroupLayout(panelPie);
        panelPie.setLayout(panelPieLayout);
        panelPieLayout.setHorizontalGroup(
            panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPieLayout.createSequentialGroup()
                .addComponent(labelTituloFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFrases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        panelPieLayout.setVerticalGroup(
            panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPieLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(labelTituloFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPieLayout.createSequentialGroup()
                        .addComponent(panelFrases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPieLayout.createSequentialGroup()
                        .addComponent(nextButton)
                        .addGap(57, 57, 57))))
        );

        getContentPane().add(panelPie);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verboActionPerformed
    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        verificarRespuesta();
        actualizarPantalla();

    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel opcion1;
    private javax.swing.JLabel opcion2;
    private javax.swing.JLabel opcion3;
    private javax.swing.JLabel sujeto;
    private javax.swing.JLabel predicado;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField verbo;
    public javax.swing.JLabel labelInstruccion;
    public javax.swing.JLabel labelScore;
    public Titulo labelTitulo;
    public javax.swing.JLabel labelTituloFrase;
    public javax.swing.JLabel labelTituloRespuestas;
    public javax.swing.JLabel labelTituloScore;
    public javax.swing.JButton nextButton;
    public javax.swing.JPanel panelContenedorRespuestas;
    public javax.swing.JPanel panelCuerpo;
    public javax.swing.JPanel panelEncabezado;
    public javax.swing.JPanel panelFrases;
    public javax.swing.JPanel panelInformacion;
    public javax.swing.JPanel panelPie;
    public javax.swing.JPanel panelRespuestas;
    public Controlador driver;
    public Round round;
    public int preguntaActual;
    private EscenaFinal desempeño;
    // End of variables declaration//GEN-END:variables


    /*Mis metodos*/

    public void inicializarControlador(){
        driver = new Controlador(); 
        round = driver.obtenerRoundActual();    
    }

    public void actualizarPantalla(){

        if(preguntaActual <= round.preguntas.length){
            labelTitulo.texto = "Question #" + preguntaActual;
            labelTitulo.letras = labelTitulo.texto.split("");
            opcion1.setText(round.preguntas[preguntaActual - 1].respuestas[0].resp);
            opcion2.setText(round.preguntas[preguntaActual - 1].respuestas[1].resp);
            opcion3.setText(round.preguntas[preguntaActual - 1].respuestas[2].resp);

            verbo.setText("");
            sujeto.setText(round.preguntas[preguntaActual - 1].textoPregunta1);
            predicado.setText(round.preguntas[preguntaActual - 1].textoPregunta3);
        }else{
            setVisible(false);
            
            desempeño = new EscenaFinal();
            desempeño.setVisible(true);
            desempeño.score.setText(labelScore.getText());

        }
        
    }

    public void verificarRespuesta(){
        String respuestasUsuario = verbo.getText();


        if(respuestasUsuario.equals(opcion1.getText())){
            if(round.preguntas[preguntaActual-1].respuestas[0].esCorrecto){
                labelScore.setText(Integer.parseInt(labelScore.getText()) + round.puntosSumadosPorRespuestaCorrecta + "");
            }
        }else{
            if(respuestasUsuario.equals(opcion2.getText())){
                if(round.preguntas[preguntaActual-1].respuestas[1].esCorrecto){
                    labelScore.setText(Integer.parseInt(labelScore.getText()) + round.puntosSumadosPorRespuestaCorrecta + "");
                }
            
            }else{
                if(respuestasUsuario.equals(opcion3.getText())){                  
                     if(round.preguntas[preguntaActual-1].respuestas[2].esCorrecto){
                        labelScore.setText(Integer.parseInt(labelScore.getText()) + round.puntosSumadosPorRespuestaCorrecta + "");
                    }
            
                }
            }
        }
        
        preguntaActual++;
    }
}

class Titulo extends JLabel implements Runnable{
    int tamañoTexto;
    Thread hilo;
    String texto;
    String letras[];
    public Titulo(){
        tamañoTexto = 50;
        texto = "";
        letras = texto.split("");
        hilo = new Thread(this);
        hilo.start();
    }
    public void run(){
        while(true){
            
            for(String letra: letras){
                setFont(new java.awt.Font("Lobster", 1, tamañoTexto));
                setText(getText() + letra);
                tamañoTexto-=2;
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){}
                
            }
            try{
                    Thread.sleep(300);
                }catch(InterruptedException e){}
            setText("");
            tamañoTexto = 50;
            setFont(new java.awt.Font("Lobster", 1, tamañoTexto));
        }
    }
}