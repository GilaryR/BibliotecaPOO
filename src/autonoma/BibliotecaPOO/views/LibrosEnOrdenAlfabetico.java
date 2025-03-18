
package autonoma.BibliotecaPOO.views;

import autonoma.BibliotecaPOO.models.Biblioteca;
import autonoma.BibliotecaPOO.models.Libro;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gilary
 * @since 20250316
 * @version 1.0
 */
public class LibrosEnOrdenAlfabetico extends javax.swing.JDialog {
    private Biblioteca biblioteca;
    /**
     * Creates new form LibrosEnOrdenAlafabetico
     */
    public LibrosEnOrdenAlfabetico(java.awt.Frame parent, boolean modal, Biblioteca biblioteca) {
        super(parent, modal);
        initComponents();
        this.biblioteca = biblioteca;
                   this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/Biblioteca.png")).getImage());
        }catch(Exception e){
            System.out.println("Imagen no encontrada");
            
        }
        llenarTablaLibrosOrdenados();

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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibrosOrdenados = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(79, 149, 157));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Orden alafabetico");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/BibliotecaPOO/images/LibrosAlfabeticamente.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(87, 180, 186));

        TablaLibrosOrdenados.setBackground(new java.awt.Color(220, 215, 201));
        TablaLibrosOrdenados.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        TablaLibrosOrdenados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "ID", "TITULO"
            }
        ));
        jScrollPane1.setViewportView(TablaLibrosOrdenados);

        btnCerrar.setBackground(new java.awt.Color(79, 149, 157));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnCerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCerrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      dispose ();
    }//GEN-LAST:event_btnCerrarActionPerformed
private void llenarTablaLibrosOrdenados() {
    DefaultTableModel modelo = (DefaultTableModel) TablaLibrosOrdenados.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de llenarla

    // Obtener lista de libros de la biblioteca
    List<Libro> libros = biblioteca.getLibros();

    // Ordenar libros alfabéticamente por título
    libros.sort(Comparator.comparing(Libro::getTitulo));

    // Llenar la tabla con los libros ordenados
    for (Libro libro : libros) {
        String letraInicial = libro.getTitulo().substring(0, 1).toUpperCase();
        modelo.addRow(new Object[]{letraInicial, libro.getId(), libro.getTitulo()});
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaLibrosOrdenados;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
