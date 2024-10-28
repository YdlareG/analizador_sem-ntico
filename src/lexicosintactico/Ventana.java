package lexicosintactico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos Word y txt", "docx", "txt");
    File f;
    JFileChooser j = new JFileChooser();
    String data1[][] = {};
    String cabecera1[] = {"No.", " Token ", " Tipo"};
    String path;
    int cont = 0;
    int errores;
    String mensajini = "";
    String tipo = "";

    public Ventana() {
        initComponents();

    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtATraducido = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        btnTraducir = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Error = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Traduccion JavaScript");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtATraducido.setColumns(20);
        txtATraducido.setRows(5);
        jScrollPane1.setViewportView(txtATraducido);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Ejecutar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnTraducir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTraducir.setText("Traducir a PROGRAMA");
        btnTraducir.setEnabled(false);
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 204, 204));

        tabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Source Code");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Análisis Léxico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Tabla de Símbolos");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Error.setEditable(false);
        Error.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Error.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Error.setForeground(java.awt.Color.blue);
        jScrollPane5.setViewportView(Error);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Análisis Sintáctico - Semántico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtATexto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtATexto1.setText("calculo INICIO{\n" +
            "\n" +
            "DBL variable, variable2, resultado;\n" +
            "NUM valor;\n" +
            "\n" +
            "valor=0;\n" +
            "\n" +
            "variable = LEER(#Intruduzca un valor#);\n" +
            "variable2 = LEER(#Intruduzca otro valor#);\n" +
            "\n" +
            "resultado=variable+variable2;\n" +
            "SI(resultado==0){\n" +
            "IMPRIMIR(#RESULTADO ES IGUAL A 0 #);\n" +
            "FIN}\n" +
            "\n" +
            "FINAL}");
        txtATexto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtATexto1FocusLost(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setOpaque(false);

        LineaError.setEditable(false);
        LineaError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LineaError.setForeground(java.awt.Color.red);
        LineaError.setToolTipText("");
        LineaError.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas)
            .addComponent(LineaError)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Listado de errores");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel2)
                                .addGap(288, 288, 288)
                                .addComponent(jLabel3))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(275, 275, 275))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HashMap<String, Integer> r = new HashMap<>();
        HashMap<String, Integer> operadores = new HashMap<>();
        HashMap<String, Integer> id = new HashMap<>();
        HashMap<String, Integer> delimitadores = new HashMap<>();
        HashMap<String, Integer> numeros = new HashMap<>();
        LinkedList<String> texto = new LinkedList<>();
        
//ESPECIFICACION DE PALABRAS RESERVADAS
        r.put("INICIO", 0);
        r.put("FINAL", 0);
        r.put("STR", 0);
        r.put("ALFA", 0);
        r.put("NUM", 0);
        r.put("DBL", 0);
        r.put("BOOL", 0);
        r.put("LNUM", 0);
        r.put("LEER", 0);
        r.put("IMPRIMIR", 0);
        r.put("MIENTRAS", 0);
        r.put("SI", 0);
        r.put("IS", 0);
        r.put("START", 0);
        r.put("STEP", 0);
        r.put("TO", 0);
        r.put("STOP", 0);
        r.put("FMIENTRAS", 0);
        r.put("FIN", 0);
        
//ESPECIFICACION DE SIMBOLOS DE OPERACIONES ARITMETICOS, RELACIONALES Y LOGICOS
        operadores.put("/", 0);
        operadores.put("*", 0);
        operadores.put("+", 0);
        operadores.put("-", 0);
        operadores.put("=", 0);
        operadores.put("==", 0);
        operadores.put("^", 0);
        operadores.put("<", 0);
        operadores.put(">", 0);
        operadores.put("||", 0);
        operadores.put("&&", 0);
        
//ESPECIFICACION DE SIMBOLOS DELIMITADORES
        delimitadores.put("#", 0);
        delimitadores.put(";", 0);
        delimitadores.put("{", 0);
        delimitadores.put("}", 0);
        delimitadores.put(")", 0);
        delimitadores.put(",", 0);
        delimitadores.put("(", 0);

        //ESTRUCTURA DE LA TABLA DE SIMBOLOS ----- EN ESTA TABLA TENDREMOS LAS COLUMNAS Token, Cantidad de veces que se repita dicho token y Tipo
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Token", "Cantidad", "Tipo"});

        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "{}();,\"=+-*/><||&&# \n\t", true);
        String token, text = "";
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if (!" ".equals(token) && !"\n".equals(token) && !"\t".equals(token)) {
                if (r.containsKey(token)) {
                    r.put(token, r.get(token) + 1);
                } else {
                    if (operadores.containsKey(token)) {
                        operadores.put(token, operadores.get(token) + 1);
                    } else {
                        if (delimitadores.containsKey(token)) {
                            delimitadores.put(token, delimitadores.get(token) + 1);
                            if ("#".equals(token)) {
                                token = st.nextToken();
                                while (st.hasMoreTokens() && !"#".equals(token)) {
                                    text += token;
                                    token = st.nextToken();
                                }
                                texto.add(text);
                                delimitadores.put(token, delimitadores.get(token) + 1);
                                text = "";
                            }
                        } else {
                            if (id.containsKey(token)) {
                                id.put(token, id.get(token) + 1);
                            } else {
                                if (token.matches("([0-9]*)|([0-9]*.[0-9]+)")) {
                                    if (numeros.containsKey(token)) {
                                        numeros.put(token, numeros.get(token) + 1);
                                    } else {
                                        numeros.put(token, 1);
                                    }
                                } else {
                                    id.put(token, 1);
                                }
                            }
                        }
                    }
                }
            }
        }

        Iterator<String> itr = r.keySet().iterator();
        while (itr.hasNext()) {
            token = itr.next();
            //Aqui se comprueba si el token es una palabra con (r.get(token)) de ser asi tendra la cadena "Palabra Reservada"
            if (r.get(token) > 0) {
                model.addRow(new Object[]{token, r.get(token), "Palabra Reservada"}); 
            }
        }
        itr = operadores.keySet().iterator();
        while (itr.hasNext()) {
            token = itr.next();
            //Aqui se comprueba si el token es un operador con (operadores.get(token)) de ser asi tendra la cadena "Operador"
            if (operadores.get(token) > 0) {
                model.addRow(new Object[]{token, operadores.get(token), "Operador"});
            }
        }
        itr = delimitadores.keySet().iterator();
        while (itr.hasNext()) {
            token = itr.next();
            //Aqui se comprueba si el token es un delimitador con (delimitadores.get(token)) de ser asi tendra la cadena "Delimitador"
            if (delimitadores.get(token) > 0) {
                model.addRow(new Object[]{token, delimitadores.get(token), "Delimitador"});
            }
        }
        itr = id.keySet().iterator();
        while (itr.hasNext()) {
            token = itr.next();
            //Aqui se comprueba si el token es un Identificador con (id.get(token)) de ser asi tendra la cadena "Identificador"
            if (id.get(token) > 0) {
                model.addRow(new Object[]{token, id.get(token), "Identificador"});
            }
        }
        itr = numeros.keySet().iterator();
        while (itr.hasNext()) {
            token = itr.next();
            //Aqui se comprueba si el token es un numero con (numeros.get(token)) de ser asi tendra la cadena "Número"
            if (numeros.get(token) > 0) {
                if (token.matches("[0-9]+")) { //Aqui se especifica una expresion regular que solo permite numeros positivos
                    model.addRow(new Object[]{token, numeros.get(token), "Número"});
                }
                if (token.matches("[0-9]+.[0-9]+")) {//Aqui se especifica una expresion regular que permite numeros positivos decimales
                    model.addRow(new Object[]{token, numeros.get(token), "Número Decimal"});
                }
            }
        }
        itr = texto.iterator();
        while (itr.hasNext()) {
            model.addRow(new Object[]{itr.next(), "1", "Texto"});

        }
        tabla.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        errores = 0;
        
        LinkedList<String> ENT = new LinkedList<>();
        LinkedList<String> DEC = new LinkedList<>();
        LinkedList<String> TEXT = new LinkedList<>();
        LinkedList<String> TAKE = new LinkedList<>();
//Se definen variables que contengan cadenas con simbolos para luego comprobar la coincidencia o match con el codigo intruducido por el usuario
        String //                signo = "([=<>])",
                signo = "(=|<|>|==|<=|>=|!=)",
                id = "([(a-z)(A-Z)](\\w)*)",
                numeros = "((\\d)+)",
                decimales = "((\\d)+(\\.)(\\d)+)",
                text = "((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)",
                send = "((\\s)*IMPRIMIR(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)(\\s)*(\\))(\\s)*(;))",
                //take = "((\\s)*TAKE(\\b)(\\s)*"+id+"((\\s)*(,(\\s)*"+id+"))*(\\s)*(;))",
                take = "(([.\\w\\s]*)*(\\s)*=(\\s)*LEER(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)(\\s)*(\\))(\\s)*(;))",
                operaciones = "((" + id + "|" + numeros + "|" + decimales + ")(\\s)*([+-/*](\\s)*(" + id + "|" + numeros + "|" + decimales + "))+)",
                defVal = "((\\s)*" + id + "(\\s)*=(\\s)*(" + id + "|" + text + "|" + operaciones + "|" + numeros + "|" + decimales + ")(\\s)*(;))",
                defValVar = "((\\s)*" + id + "(\\s)*=(\\s)*(" + id + "|" + text + "|" + operaciones + "|" + numeros + "|" + decimales + ")(\\s)*)",
                condicion = id + "(\\s)*" + signo + "(\\s)*(" + id + "|" + numeros + "|" + decimales + ")((\\s)*([(&&)(||)](\\s)*" + id + "(\\s)*" + signo + "(\\s)*(" + id + "|" + numeros + "|" + decimales + ")))*",
                var = "((\\s)*((NUM)|(DBL)|(STR))(\\b)(\\s)*(" + id + "|" + defValVar + ")((\\s)*(,(\\s)*(" + id + "|" + defValVar + ")))*(\\s)*(;))",
                main = "((\\s)*" + id + "(\\b)(\\s)*INICIO(\\s)*(\\{)[.\\W\\w\\s]*(FINAL(\\s)*(\\})(\\s)*)$)",
                main2 = "((\\s)*" + id + "(\\b)(\\s)*INICIO(\\s)*(\\{))",
                main3 = "((\\s)*FINAL(\\s)*(\\})(\\s)*)",
                start2 = "((\\s)*START(\\b)(\\s)*(" + id + "|" + numeros + ")(\\b)(\\s)*(=)*(" + id + "|" + numeros + ")(\\b)(\\s)*(STEP)(\\b)(\\s)*" + numeros + "(\\s)*[+-]?(\\s)*(\\b)(TO)(\\b)(\\s)*(" + id + "|" + numeros + ")(\\s)*(\\{))",
                start3 = "((\\s)*STOP(\\s)*(\\}))",
                when2 = "((\\s)*MIENTRAS(\\s)*(\\()(\\s)*" + condicion + "(\\s)*(\\))(\\s)*(\\{))",
                when3 = "((\\s)*FMIENTRAS(\\s)*(\\}))",
                condiciones2 = "((\\s)*SI(\\s)*(\\()(\\s)*" + condicion + "(\\s)*(\\))(\\s)*(\\{))",
                condiciones3 = "((\\s)*FIN(\\s)*(\\}))",
                entero = "[0-9]*",
                decimal = "[0-9]*.[0-9]+";
        LinkedList<Integer> error = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), ";{}", true);
        String token = "", txt = "", e;
        int i = 1, mainE = 0, start = 0, when = 0, it = 0, eB = 0;
        Error.setText("");
        if (txtATexto1.getText().matches(main)) {

            while (st.hasMoreTokens()) {
                token = st.nextToken();
                if (st.hasMoreTokens()) {
                    token = token + st.nextToken();
                }
                if (token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1) {
                    String auxTok = st.nextToken();
                    token = token + (auxTok.substring(0, auxTok.indexOf("\n")));
                }
                StringTokenizer lin = new StringTokenizer(token, "\n", true);
                while (lin.hasMoreTokens()) {
                    e = lin.nextToken();
                    if ("\n".equals(e)) {
                        i++;
                    }
                }

                if (token.matches(start2)) {
                    start++;
                }
                if (token.matches(start3)) {
                    start--;
                }
                if (token.matches(when2)) {
                    when++;
                }
                if (token.matches(when3)) {
                    when--;
                }
                if (token.matches(condiciones2)) {
                    it++;
                }
                if (token.matches(condiciones3)) {
                    it--;
                }
                if ((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) {
                    eB = 1;
                }

                if ((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(main2) || token.matches(main3) || token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(condiciones2) || token.matches(condiciones3)) && eB == 0) {
                    if (token.matches(take)) {

                    }
                    if (token.matches(var)) {
                        StringTokenizer stTipo = new StringTokenizer(token, " ,;");
                        String tipo = stTipo.nextToken();

                        if (tipo.contains("NUM")) {//Esto hace referencia un tipo de dato int o Numerico

                            while (stTipo.hasMoreTokens()) {
                                tipo = stTipo.nextToken();

                                if (ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo) || TAKE.contains(tipo)) {
                                    Error.setText("La Variable esta repetida (" + tipo + ") " + i + ": \n"
                                            + "________________________________________________________________________\n" + token);
                                    for (int j = 1; j < i; j++) {
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt + " ¡!");
                                    errores = 1;
                                    break;
                                }

                                ENT.add(tipo);
                            }
                        }
                        if (tipo.contains("DBL")) { //Esto hace referencia un tipo de dato String o cadena de texto

                            while (stTipo.hasMoreTokens()) {
                                tipo = stTipo.nextToken();

                                if (ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo) || TAKE.contains(tipo)) {
                                    Error.setText("La Variable esta repetida (" + tipo + ") " + i + ": \n"
                                            + "________________________________________________________________________\n" + token);
                                    for (int j = 1; j < i; j++) {
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt + " ¡!");
                                    errores = 1;
                                    break;
                                }

                                DEC.add(tipo);
                            }
                        }
                        if (tipo.contains("LEER")) { //Esta es la funcion de lectura o entrada de datos, al momento de traducir a JavaScript esta pasa a ser prompt

                            while (stTipo.hasMoreTokens()) {
                                tipo = stTipo.nextToken();

                                if (ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo) || TAKE.contains(tipo)) {
                                    Error.setText("La Variable esta repetida (" + tipo + ") " + i + ": \n"
                                            + "________________________________________________________________________\n" + token);
                                    for (int j = 1; j < i; j++) {
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt + " ¡!");
                                    errores = 1;
                                    break;
                                }

                                TAKE.add(tipo);
                            }
                        }
                        if (tipo.contains("STR")) {//Esto hace referencia un tipo de dato String o cadena de texto

                            while (stTipo.hasMoreTokens()) {
                                tipo = stTipo.nextToken();

                                if (ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo) || TAKE.contains(tipo)) {
                                    Error.setText("La variable esta repetida (" + tipo + ") " + i + ": \n"
                                            + "________________________________________________________________________\n" + token);
                                    for (int j = 1; j < i; j++) {
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt + " ¡!");
                                    errores = 1;
                                    break;
                                }

                                TEXT.add(tipo);
                            }
                        }
                    }
                    if (token.matches(defVal)) {
                        StringTokenizer stComprobar = new StringTokenizer(token, " \n\t=;");
                        String ID = stComprobar.nextToken(), comprobar = "", tok = "";
                        //System.out.print(ID);
                        while (stComprobar.hasMoreTokens()) {
                            comprobar += stComprobar.nextToken();
                        }

                        if (ENT.contains(ID)) {
                            StringTokenizer stComprobarE = new StringTokenizer(comprobar, "+*/-");
                            while (stComprobarE.hasMoreTokens()) {
                                tok = stComprobarE.nextToken();

                                if (tok.matches(id)) {
                                    if (ENT.contains(tok)); else {
                                        Error.setText("ERROR SEMÁNTICO (" + tok + ") " + i + ": \n"
                                                + "________________________________________________________________________\n" + token);
                                        for (int j = 1; j < i; j++) {
                                            txt += "\n";
                                        }
                                        LineaError.setText(txt + " ¡!");
                                        errores = 1;
                                        break;
                                    }
                                } else {
                                    if (tok.matches(entero)); else {
                                        Error.setText("ERROR SEMÁNTICO (" + tok + ") " + i + ": \n"
                                                + "________________________________________________________________________\n" + token);
                                        for (int j = 1; j < i; j++) {
                                            txt += "\n";
                                        }
                                        LineaError.setText(txt + " ¡!");
                                        errores = 1;
                                        break;
                                    }
                                }
                            }
                        } else {
                            if (DEC.contains(ID)) {
                                StringTokenizer stComprobarD = new StringTokenizer(comprobar, "+*/-");
                                while (stComprobarD.hasMoreTokens()) {
                                    tok = stComprobarD.nextToken();

                                    if (tok.matches(id)) {
                                        if (DEC.contains(tok)); else {
                                            Error.setText("ERROR SEMÁNTICO (" + tok + ") " + i + ": \n"
                                                    + "________________________________________________________________________\n" + token);
                                            for (int j = 1; j < i; j++) {
                                                txt += "\n";
                                            }
                                            LineaError.setText(txt + " ¡!");
                                            errores = 1;
                                            break;
                                        }
                                    } else {
                                        if (tok.matches(decimal)); else {
                                            Error.setText("ERROR SEMÁNTICO (" + tok + ") " + i + ": \n"
                                                    + "________________________________________________________________________\n" + token);
                                            for (int j = 1; j < i; j++) {
                                                txt += "\n";
                                            }
                                            LineaError.setText(txt + " ¡!");
                                            errores = 1;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (TEXT.contains(ID)) {
                                    if (comprobar.matches("((((\")[.\\W\\w\\s]*(\"))|(" + id + "))((\\s)*(\\+)((\\s)*((\")[.\\W\\w\\s]*(\"))|(" + id + ")))*)")); else {
                                        Error.setText("ERROR SEMÁNTICO " + i + ": \n"
                                                + "________________________________________________________________________\n" + token);
                                        for (int j = 1; j < i; j++) {
                                            txt += "\n";
                                        }
                                        LineaError.setText(txt + " ¡!");
                                        errores = 1;
                                        break;
                                    }
                                } else {
                                    Error.setText("Variable no declarada " + i + ": \n"
                                            + "________________________________________________________________________\n" + token);
                                    for (int j = 1; j < i; j++) {
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt + " ¡!");
                                    errores = 1;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    if (token.contains("IMPRIMIR")) { //Aqui se hace la traduccion de la palabra IMPRIMIR del codigo fuente a PRINT del lenguaje destino (JavaScript)
                        txtATraducido.setText("PRINT");
                        Error.setText("Error al declarar sentencia IMPRIMIR; en la linea " + i + ": \n"
                                + "\n" + token);
                        errores = 1;
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("NUM") || token.contains("DBL") || token.contains("STR")) {
                        Error.setText("Error en declaracion de variables; en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("LEER")) {//Aqui se comprueba la funcion LEER
                        Error.setText("Error en lectura de valor LEER  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("STOP}")) {

                        Error.setText("Cierre de Ciclo START incorrecto  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("START")) {

                        Error.setText("Inicio de Ciclo START incorrecto  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("FMIENTRAS")) {
                        Error.setText("Cierre de ciclo FMIENTRAS incorrecto en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        break;
                    }
                    if (token.contains("MIENTRAS")) {
                        Error.setText("Inicio de ciclo MIENTRAS incorrecto en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("FIN")) {

                        Error.setText("Cierre de condicion 'SI' incorrecto en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("SI")) {

                        Error.setText("Inicio de SI incorrecto; en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    } else {
                        Error.setText("Sintaxis Erronea en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                }

            }

        } else {
            st = new StringTokenizer(txtATexto1.getText(), ";{}", true);
            while (st.hasMoreTokens()) {
                token = st.nextToken();
                if (st.hasMoreTokens()) {
                    token = token + st.nextToken();
                }
                if (token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1) {
                    String auxTok = st.nextToken();
                    token = token + (auxTok.substring(0, auxTok.indexOf("\n")));
                }
                StringTokenizer lin = new StringTokenizer(token, "\n", true);
                while (lin.hasMoreTokens()) {
                    e = lin.nextToken();
                    if ("\n".equals(e)) {
                        i++;
                    }
                }
                if (eB == 1) {
                    break;
                }
                if (token.matches(start2)) {
                    start++;
                }
                if (token.matches(start3)) {
                    start--;
                }
                if (token.matches(when2)) {
                    when++;
                }
                if (token.matches(when3)) {
                    when--;
                }
                if (token.matches(condiciones2)) {
                    it++;
                }
                if (token.matches(condiciones3)) {
                    it--;
                }
                if ((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) {
                    eB = 1;
                }

                if ((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(main2) || token.matches(main3) || token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(condiciones2) || token.matches(condiciones3)) && eB == 0) {
                    Error.setText("Compilado Exitosamente");
                    if (token.matches(main3)) {
                        eB = 1;
                    }
                } else {
                    if (token.contains("IMPRIMIR")) {
                        Error.setText("Error al declarar sentencia IMPRIMIR  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("NUM") || token.contains("DBL") || token.contains("STR")) {
                        Error.setText("Error en declaracion de variables  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("LEER")) {
                        Error.setText("Error en lectura de valor LEER en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("STOP}")) {
                        Error.setText("Cierre de Ciclo START incorrecto en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("START")) {
                        Error.setText("Inicio de Ciclo START incorrecto  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("FMIENTRAS")) {
                        Error.setText("Cierre de ciclo MIENTRAS incorrecto  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("MIENTRAS")) {
                        Error.setText("Inicio de ciclo MIENTRAS incorrecto  en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("FIN")) {
                        Error.setText("Cierre de condicion SI incorrecto; en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                    if (token.contains("SI")) {
                        Error.setText("Inicio de SI incorrecto en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    } else {
                        Error.setText("Sintaxis Erronea en la linea " + i + ": \n"
                                + "\n" + token);
                        for (int j = 1; j < i; j++) {
                            txt += "\n";
                        }
                        LineaError.setText(txt + " ¡!");
                        errores = 1;
                        break;
                    }
                }
            }
            if (mainE == 0) {
                Error.setText("Cierre de funcion incorrecto en la Linea " + i + ": \n"
                        + "\n" + token);
                for (int j = 1; j < 1; j++) {
                    txt += "\n";
                }
                LineaError.setText(txt + " ¡!");
                errores = 1;
            }
        }
        if (errores == 1) {
            btnTraducir.setEnabled(false);
        } else {
            btnTraducir.setEnabled(true);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //ESTE BOTON HACE UNA LIMPIEZA DE LOS CAMPOS DE TEXTO y SE DESACTIVA EL BOTON DE TRADUCIR
        txtATexto1.setText("");
        LineaError.setText("");
        Error.setText("");
        txtATraducido.setText("");
        btnTraducir.setEnabled(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducirActionPerformed
        txtATraducido.setText("");
        //SE DEFINEN LAS VARIABLES QUE SERAN COMPROBADAS EN EL CODIGO INTRUDUCIDO POR EL USUARIO
        String signo = "(=|<|>|==|<=|>=|!=)",
                id = "([(a-z)(A-Z)](\\w)*)",
                numeros = "((\\d)+)",
                decimales = "((\\d)+(\\.)(\\d)+)",
                text = "((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)",
                send = "((\\s)*IMPRIMIR(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)(\\s)*(\\))(\\s)*(;))",
                //take = "((\\s)*TAKE(\\b)(\\s)*"+id+"((\\s)*(,(\\s)*"+id+"))*(\\s)*(;))",
                take = "(([.\\w\\s]*)*(\\s)*=(\\s)*LEER(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|(" + id + "))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|(" + id + ")))*)(\\s)*(\\))(\\s)*(;))",
                operaciones = "((" + id + "|" + numeros + "|" + decimales + ")(\\s)*([+-/*](\\s)*(" + id + "|" + numeros + "|" + decimales + "))+)",
                defVal = "((\\s)*" + id + "(\\s)*=(\\s)*(" + id + "|" + text + "|" + operaciones + "|" + numeros + "|" + decimales + ")(\\s)*(;))",
                defValVar = "((\\s)*" + id + "(\\s)*=(\\s)*(" + id + "|" + text + "|" + operaciones + "|" + numeros + "|" + decimales + ")(\\s)*)",
                condicion = id + "(\\s)*" + signo + "(\\s)*(" + id + "|" + numeros + "|" + decimales + ")((\\s)*([(&&)(||)](\\s)*" + id + "(\\s)*" + signo + "(\\s)*(" + id + "|" + numeros + "|" + decimales + ")))*",
                var = "((\\s)*((NUM)|(DBL)|(STR))(\\b)(\\s)*(" + id + "|" + defValVar + ")((\\s)*(,(\\s)*(" + id + "|" + defValVar + ")))*(\\s)*(;))",
                main = "((\\s)*" + id + "txtATraducidoINICIO(\\s)*(\\{)[.\\W\\w\\s]*(FINAL(\\s)*(\\})(\\s)*)$)",
                main2 = "((\\s)*" + id + "(\\b)(\\s)*INICIO(\\s)*(\\{))",
                main3 = "((\\s)*FINAL(\\s)*(\\})(\\s)*)",
                start2 = "((\\s)*START(\\b)(\\s)*(" + id + "|" + numeros + ")(\\b)(\\s)*(=)*(" + id + "|" + numeros + ")(\\b)(\\s)*(STEP)(\\b)(\\s)*" + numeros + "(\\s)*[+-]?(\\s)*(\\b)(TO)(\\b)(\\s)*(" + id + "|" + numeros + ")(\\s)*(\\{))",
                foresito = "((\\s)*FOR(\\b)(\\s)*(" + id + "|" + numeros + ")(\\b)(\\s)*(TO)(\\b)(\\s)*(" + id + "|" + numeros + ")(\\s)*)",
                start3 = "((\\s)*STOP(\\s)*(\\}))",
                when2 = "((\\s)*MIENTRAS(\\s)*(\\()(\\s)*" + condicion + "(\\s)*(\\))(\\s)*(\\{))",
                when3 = "((\\s)*FMIENTRAS(\\s)*(\\}))",
                it2 = "((\\s)*SI(\\s)*(\\()(\\s)*" + condicion + "(\\s)*(\\))(\\s)*(\\{))",
                it3 = "((\\s)*FIN(\\s)*(\\}))",
                entero = "[0-9]*",
                step = "(STEP)(\\b)(\\s)*" + numeros + "(\\s)*[+-]?(\\s)*(\\b)",
                to = "TO(\\b)(\\s)*(" + id + "|" + numeros + ")(\\s)*(\\{)",
                decimal = "[0-9]*.[0-9]+";
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "\n");
        String token;
        String classname = "";
        while (st.hasMoreTokens()) {
            //JOptionPane.showMessageDialog(this,"Identificando Variables...");
            token = st.nextToken();

            if (token.matches(main2)) {

                String tokinn = "'";
                StringTokenizer tokin = new StringTokenizer(token, " \n");
                while (tokin.hasMoreTokens()) {
                    String testo = "";
                    testo = testo + txtATraducido.getText();
                    tokinn = tokin.nextToken();
                    if (tokinn.contains("INICIO")) {
                        txtATraducido.setText(testo + "REM ");

                    }
                    if (tokinn.matches(id) && tokinn.contains("INICIO") == false && tokinn.contains("{") == false) {
                        String txt = "";

                        classname = tokinn;
                        txtATraducido.setText(txt + "\nfunction " + testo + tokinn + "(){\n");

                    }
                    if (tokinn.contains("{")) {
                        txtATraducido.setText(testo + " \n");
                    }
                }

            }

            if (token.matches(var)) {
                String a, b = "";
                a = txtATraducido.getText();

                txtATraducido.setText(a);
                String tokinn = "";
                StringTokenizer tokin = new StringTokenizer(token, " \n,;");
                while (tokin.hasMoreTokens()) {
                    String testo = "";
                    testo = testo + txtATraducido.getText();
                    tokinn = tokin.nextToken();

                    if (tokinn.contains("NUM") || tokinn.contains("DBL") || tokinn.contains("STR")) {
                        String enteros = "";
                        if (tokinn.contains("NUM")) {
                            enteros = " AS INTEGER";
                            b = "var ";
                        }
                        if (tokinn.contains("DBL")) {
                            enteros = " AS DOUBLE";
                            b = "var ";
                        }
                        if (tokinn.contains("STR")) {
                            enteros = " AS STRING";
                            b = "var ";
                        }

                        int contador = 0;
                        while (tokin.hasMoreTokens()) {
                            tokinn = tokin.nextToken();
                            if (!tokinn.equals(";")) {

                                if (contador >= 1) {
                                    b += "," + tokinn + "";
                                } else {
                                    b += tokinn;
                                }
                            }

                            contador += 1;

                        }
                        b += ";";
                        txtATraducido.setText(testo + b + "\n");
                    }

                }
            }

        }
        String b = txtATraducido.getText();
        b = b + "  \n";
        txtATraducido.setText(b);

        StringTokenizer st1 = new StringTokenizer(txtATexto1.getText(), "\n");
        String token1;
        while (st1.hasMoreTokens()) {
            token1 = st1.nextToken();

            if (token1.matches(start3)) {

                String a = txtATraducido.getText() + "\nNEXT\n";
                txtATraducido.setText(a);
            }
            if (token1.matches(when2)) {
                StringTokenizer st2 = new StringTokenizer(token1, "()");
                while (st2.hasMoreTokens()) {
                    String tuken = st2.nextToken();
                    if (tuken.contains("=") || tuken.contains("<") || tuken.contains(">")) {
                        if (tuken.contains("=")) {
                            StringTokenizer st3 = new StringTokenizer(tuken, "=");
                            while (st3.hasMoreTokens()) {
                                String tuken2 = st3.nextToken();

                                if (st3.hasMoreTokens() == true) {
                                    String a = txtATraducido.getText() + tuken2 + "=";
                                    txtATraducido.setText(a);
                                } else {
                                    String a = txtATraducido.getText() + tuken2;
                                    txtATraducido.setText(a);
                                }

                            }
                        } else {
                            String a = txtATraducido.getText() + tuken;
                            txtATraducido.setText(a);
                        }
                    }

                    if (tuken.contains("MIENTRAS")) {
                        String a = txtATraducido.getText() + "\nwhile( ";
                        txtATraducido.setText(a);

                    }
                    if (tuken.contains("{")) {
                        String a = txtATraducido.getText() + "){\n";
                        txtATraducido.setText(a);
                    }
                }
            }
            if (token1.matches(when3)) {
                String a = txtATraducido.getText() + "\n \n";
                txtATraducido.setText(a);
            }
            if (token1.matches(it2)) {
                StringTokenizer st2 = new StringTokenizer(token1, "()");
                while (st2.hasMoreTokens()) {
                    String tuken = st2.nextToken();
                    if (tuken.contains("=") || tuken.contains("<") || tuken.contains(">") || tuken.contains(">=") || tuken.contains("<=")) {
                        if (tuken.contains("==")) {
                            StringTokenizer st3 = new StringTokenizer(tuken, "=");
                            while (st3.hasMoreTokens()) {
                                String tuken2 = st3.nextToken();

                                if (st3.hasMoreTokens() == true) {
                                    String a = txtATraducido.getText() + tuken2 + "==";
                                    txtATraducido.setText(a);
                                } else {
                                    String a = txtATraducido.getText() + tuken2;
                                    txtATraducido.setText(a);
                                }

                            }
                        } else {
                            String a = txtATraducido.getText() + tuken;
                            txtATraducido.setText(a);
                        }
                    }

                    if (tuken.contains("SI")) {
                        String a = txtATraducido.getText() + "\nif(";
                        txtATraducido.setText(a);

                    }
                    if (tuken.contains("{")) {
                        String a = txtATraducido.getText() + "){\n";
                        txtATraducido.setText(a);
                    }
                }
            }
            if (token1.matches(it3)) {
                String a = txtATraducido.getText() + "\n} \n";
                txtATraducido.setText(a);
            }
            if (token1.matches(main3)) {
                String invocacion = classname + "()";
                String c = txtATraducido.getText() + "}\n\n" + invocacion;
                txtATraducido.setText(c);
            }
            if (token1.matches(take)) {
                StringTokenizer st2 = new StringTokenizer(token1, "()");
                while (st2.hasMoreTokens()) {
                    String tuken = st2.nextToken();
                    if (tuken.contains("LEER")) {
                        String a = txtATraducido.getText() + "\n" + tuken.replace("LEER", "prompt("); //Aqui hace el reemplazo de la palabra LEER por prompt que corresponde a entrada de datos en JS
                        a = a.replace('#', '"');
                        txtATraducido.setText(a);
                    }
                    if (tuken.contains("+")) {
                        String tokesito;
                        StringTokenizer tuk = new StringTokenizer(tuken, "+");
                        while (tuk.hasMoreTokens()) {
                            tokesito = tuk.nextToken();
                            if (tuk.hasMoreTokens()) {
                                String a = txtATraducido.getText() + tokesito;//+",";
                                a = a.replace('#', '"');// Aqui se remplazan las comillas para las cadenas de texto por el signo de numeral
                                txtATraducido.setText(a);
                            } else {
                                String a = txtATraducido.getText();//+tokesito;
                                a = a.replace('#', '"');

                                txtATraducido.setText(a);
                            }
                        }
                    }

                    if (tuken.contains(";")) {
                        String a = txtATraducido.getText() + ");\n";
                        a = a.replace('#', '"');
                        txtATraducido.setText(a);

                    }
                    if (tuken.contains("LEER") == false && tuken.contains("+") == false && tuken.contains(";") == false) {
                        String a = txtATraducido.getText() + tuken;
                        a = a.replace('#', '"');
                        txtATraducido.setText(a);
                    }
                }
            }

            if (token1.matches(send)) {
                StringTokenizer st2 = new StringTokenizer(token1, "()");
                while (st2.hasMoreTokens()) {
                    String tuken = st2.nextToken();
                    if (tuken.contains("IMPRIMIR")) {

                        String a = txtATraducido.getText() + "\nconsole.log(";
                        a = a.replace('#', '"');

                        txtATraducido.setText(a);
                    }
                    if (tuken.contains("+")) {
                        String tokesito;
                        StringTokenizer tuk = new StringTokenizer(tuken, "+");
                        while (tuk.hasMoreTokens()) {
                            tokesito = tuk.nextToken();
                            if (tuk.hasMoreTokens()) {
                                String a = txtATraducido.getText() + tokesito + "+";
                                a = a.replace('#', '\"');
                                txtATraducido.setText(a);
                            } else {
                                String a = txtATraducido.getText() + tokesito;
                                a = a.replace('#', '"');
                                txtATraducido.setText(a);
                            }
                        }
                    }

                    if (tuken.contains(";")) {
                        String a = txtATraducido.getText() + "); \n";
                        a = a.replace("#", "\"");
                        txtATraducido.setText(a);
                    }
                    if (tuken.contains("IMPRIMIR") == false && tuken.contains("+") == false && tuken.contains(";") == false) {
                        String a = txtATraducido.getText() + tuken;
                        a = a.replace("#", "\"") + "";

                        txtATraducido.setText(a);
                    }
                }
            }

            if (token1.matches(defVal)) {
                String tokesito;
                StringTokenizer tuk = new StringTokenizer(token1);
                while (tuk.hasMoreTokens()) {
                    tokesito = tuk.nextToken();
                    String a = txtATraducido.getText() + tokesito + "\n";
                    //a=a.replace(';',' ');
                    txtATraducido.setText(a);
                }

                //JOptionPane.showMessageDialog(this,"Se encontro una operación");
            }

            if (token1.matches(start2)) {
                String tokesito = "";
                String texto = "";
                StringTokenizer tuk = new StringTokenizer(token1, "\\s");
                while (tuk.hasMoreTokens()) {
                    tokesito = tuk.nextToken();
                    String a = txtATraducido.getText() + "\n";
                    tokesito = tokesito.replace("START", "FOR");
                    tokesito = tokesito.replaceAll(step, " ");
                    tokesito = tokesito.replace("{", "\n");
                    texto += a + tokesito;
                    txtATraducido.setText(texto);

                }

                JOptionPane.showMessageDialog(this, "Se encontro un ciclo for");

            }

        }

        


    }//GEN-LAST:event_btnTraducirActionPerformed

    private void txtATexto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtATexto1FocusLost
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "\n", true);
        String txt = "", token;
        LineaError.setText("");
        Error.setText("");
        cont = 1;
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if ("\n".equals(token)) {
                cont++;
            }
        }
        for (int i = 1; i <= cont; i++) {
            txt += i + "\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
        FileWriter fichero = new FileWriter("D:/UTESA/Ciclo Actual/Compiladores/Semana7MiniCompilador/MyCompilador/src/lexicosintactico/script.js");
        String valor = txtATraducido.getText();
        PrintWriter guarda = new PrintWriter(fichero);
        guarda.print(valor);
        
        FileWriter fichero1 = new FileWriter("D:/UTESA/Ciclo Actual/Compiladores/Semana7MiniCompilador/MyCompilador/src/lexicosintactico/index.html");
        String valor1 = "<script src='script.js'></script>";
        PrintWriter guarda1 = new PrintWriter(fichero1);
        guarda1.print(valor1);
        
        fichero1.close();    
        fichero.close();   
        
        try {
	
	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "D:/UTESA/Ciclo Actual/Compiladores/Semana7MiniCompilador/MyCompilador/src/lexicosintactico/index.html");
} catch (IOException ioe) {
	System.out.println (ioe);
}
        } catch(Exception ex){// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
   }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Error;
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton btnTraducir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JEditorPane txtATexto1;
    private javax.swing.JTextArea txtATraducido;
    // End of variables declaration//GEN-END:variables
}
