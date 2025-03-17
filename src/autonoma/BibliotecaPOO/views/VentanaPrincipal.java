/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.BibliotecaPOO.views;

import autonoma.BibliotecaPOO.models.Autor;
import autonoma.BibliotecaPOO.models.Biblioteca;
import autonoma.BibliotecaPOO.models.Libro;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jgiugtiñut
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Biblioteca biblioteca;
    /**
     * Creates new form VentanaPrincipal
     */

    
    public VentanaPrincipal() {
        biblioteca = new Biblioteca(new ArrayList<Libro>());
        initComponents();
                this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/Biblioteca.png")).getImage());
        }catch(Exception e){
            
        }
        llenarTablaLibros();
        
    }

        public Biblioteca getBiblioteca(){
        return biblioteca;
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
        EliminarLibro = new javax.swing.JPanel();
        EliminarLibroIMG = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AgregarLibro = new javax.swing.JPanel();
        AgregarLibroIMG = new javax.swing.JLabel();
        BuscarLibro = new javax.swing.JPanel();
        BuscarLibroIMG = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ActualizarLibro = new javax.swing.JPanel();
        AutualizarLibroIMG = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LibroAlfabeticamente = new javax.swing.JPanel();
        LIbrosAlfabeticamenteIMG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(87, 180, 186));

        EliminarLibro.setBackground(new java.awt.Color(87, 180, 186));
        EliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarLibroMouseExited(evt);
            }
        });

        EliminarLibroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/EliminarLibro.png"))); // NOI18N

        javax.swing.GroupLayout EliminarLibroLayout = new javax.swing.GroupLayout(EliminarLibro);
        EliminarLibro.setLayout(EliminarLibroLayout);
        EliminarLibroLayout.setHorizontalGroup(
            EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLibroLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(EliminarLibroIMG)
                .addContainerGap())
        );
        EliminarLibroLayout.setVerticalGroup(
            EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLibroLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(EliminarLibroIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(79, 149, 157));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setText("BIBLIOTECA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        AgregarLibro.setBackground(new java.awt.Color(87, 180, 186));
        AgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarLibroMouseExited(evt);
            }
        });

        AgregarLibroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/AgregarLibro.png"))); // NOI18N

        javax.swing.GroupLayout AgregarLibroLayout = new javax.swing.GroupLayout(AgregarLibro);
        AgregarLibro.setLayout(AgregarLibroLayout);
        AgregarLibroLayout.setHorizontalGroup(
            AgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLibroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AgregarLibroIMG)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        AgregarLibroLayout.setVerticalGroup(
            AgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarLibroIMG)
                .addGap(10, 10, 10))
        );

        BuscarLibro.setBackground(new java.awt.Color(87, 180, 186));
        BuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarLibroMouseExited(evt);
            }
        });

        BuscarLibroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/BuscarLibro.png"))); // NOI18N

        javax.swing.GroupLayout BuscarLibroLayout = new javax.swing.GroupLayout(BuscarLibro);
        BuscarLibro.setLayout(BuscarLibroLayout);
        BuscarLibroLayout.setHorizontalGroup(
            BuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarLibroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BuscarLibroIMG)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        BuscarLibroLayout.setVerticalGroup(
            BuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarLibroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BuscarLibroIMG)
                .addGap(10, 10, 10))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Libro");

        ActualizarLibro.setBackground(new java.awt.Color(87, 180, 186));
        ActualizarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarLibroMouseExited(evt);
            }
        });

        AutualizarLibroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/ActualizarLibro.png"))); // NOI18N

        javax.swing.GroupLayout ActualizarLibroLayout = new javax.swing.GroupLayout(ActualizarLibro);
        ActualizarLibro.setLayout(ActualizarLibroLayout);
        ActualizarLibroLayout.setHorizontalGroup(
            ActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizarLibroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AutualizarLibroIMG)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        ActualizarLibroLayout.setVerticalGroup(
            ActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarLibroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AutualizarLibroIMG)
                .addGap(10, 10, 10))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Actualizar Libro");

        LibroAlfabeticamente.setBackground(new java.awt.Color(87, 180, 186));
        LibroAlfabeticamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibroAlfabeticamenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LibroAlfabeticamenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LibroAlfabeticamenteMouseExited(evt);
            }
        });

        LIbrosAlfabeticamenteIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/LibrosAlfabeticamente.png"))); // NOI18N

        javax.swing.GroupLayout LibroAlfabeticamenteLayout = new javax.swing.GroupLayout(LibroAlfabeticamente);
        LibroAlfabeticamente.setLayout(LibroAlfabeticamenteLayout);
        LibroAlfabeticamenteLayout.setHorizontalGroup(
            LibroAlfabeticamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibroAlfabeticamenteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LIbrosAlfabeticamenteIMG)
                .addContainerGap())
        );
        LibroAlfabeticamenteLayout.setVerticalGroup(
            LibroAlfabeticamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibroAlfabeticamenteLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(LIbrosAlfabeticamenteIMG)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Libros Alfabeticamente");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("Agregar Libro");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Eliminar Libro");

        TablaLibros.setBackground(new java.awt.Color(220, 215, 201));
        TablaLibros.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "TITULO"
            }
        ));
        jScrollPane1.setViewportView(TablaLibros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LibroAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LibroAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AgregarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ActualizarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EliminarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarLibroMouseEntered
        this.mouseEntered(AgregarLibro);
    }//GEN-LAST:event_AgregarLibroMouseEntered

    private void AgregarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarLibroMouseExited
        this.mouseExited(AgregarLibro);
    }//GEN-LAST:event_AgregarLibroMouseExited

    private void BuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarLibroMouseEntered
        this.mouseEntered(BuscarLibro);
    }//GEN-LAST:event_BuscarLibroMouseEntered

    private void BuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarLibroMouseExited
        this.mouseExited(BuscarLibro);
    }//GEN-LAST:event_BuscarLibroMouseExited

    private void ActualizarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarLibroMouseEntered
        this.mouseEntered(ActualizarLibro);
    }//GEN-LAST:event_ActualizarLibroMouseEntered

    private void ActualizarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarLibroMouseExited
       this.mouseExited(ActualizarLibro);
    }//GEN-LAST:event_ActualizarLibroMouseExited

    private void EliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarLibroMouseEntered
        this.mouseEntered(EliminarLibro);
    }//GEN-LAST:event_EliminarLibroMouseEntered

    private void EliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarLibroMouseExited
        this.mouseExited(EliminarLibro);
    }//GEN-LAST:event_EliminarLibroMouseExited

    private void LibroAlfabeticamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibroAlfabeticamenteMouseEntered
        this.mouseEntered(LibroAlfabeticamente);
    }//GEN-LAST:event_LibroAlfabeticamenteMouseEntered

    private void LibroAlfabeticamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibroAlfabeticamenteMouseExited
        this.mouseExited(LibroAlfabeticamente);
    }//GEN-LAST:event_LibroAlfabeticamenteMouseExited

    private void AgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarLibroMouseClicked
    AgregarLibro agregarLibro = new AgregarLibro(this, true, biblioteca);
    agregarLibro.setVisible(true);
    }//GEN-LAST:event_AgregarLibroMouseClicked

    private void BuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarLibroMouseClicked
       new BuscarLibro(this, true).setVisible(true);
    }//GEN-LAST:event_BuscarLibroMouseClicked

    private void ActualizarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarLibroMouseClicked
      new ActualizarLibro(this, true).setVisible(true);
    }//GEN-LAST:event_ActualizarLibroMouseClicked

    private void EliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarLibroMouseClicked
    new EliminarLibro(this, true).setVisible(true);
    }//GEN-LAST:event_EliminarLibroMouseClicked

    private void LibroAlfabeticamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibroAlfabeticamenteMouseClicked
      new LibrosEnOrdenAlfabetico(this, true).setVisible(true);
    }//GEN-LAST:event_LibroAlfabeticamenteMouseClicked
        private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(79,149,157));
        
    }
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(87,180,186));
    }
   
public void llenarTablaLibros() {
        DefaultTableModel modelo = (DefaultTableModel) TablaLibros.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de llenarla

        for (Libro libro : biblioteca.getLibros()) { 
            modelo.addRow(new Object[]{
                libro.getId(),
                libro.getTitulo()
            });
        }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActualizarLibro;
    private javax.swing.JPanel AgregarLibro;
    private javax.swing.JLabel AgregarLibroIMG;
    private javax.swing.JLabel AutualizarLibroIMG;
    private javax.swing.JPanel BuscarLibro;
    private javax.swing.JLabel BuscarLibroIMG;
    private javax.swing.JPanel EliminarLibro;
    private javax.swing.JLabel EliminarLibroIMG;
    private javax.swing.JLabel LIbrosAlfabeticamenteIMG;
    private javax.swing.JPanel LibroAlfabeticamente;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



}
