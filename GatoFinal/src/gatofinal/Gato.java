package gatofinal;

import java.awt.event.*;
import javax.swing.*;

public class Gato extends JFrame implements ActionListener{
    Casilla [][]TABLERO;
    int Contador;
    
    public Gato() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        Contador = 0;
        TABLERO = new Casilla[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                TABLERO[i][j] = new Casilla();
                TABLERO[i][j].A.setBounds((i*100)+10, (j*100)+10, 100, 100);
                TABLERO[i][j].A.addActionListener(this);
                this.add(TABLERO[i][j].A);
            }
        }    
    }
    public void actionPerformed(ActionEvent e) 
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (e.getSource()==TABLERO[i][j].A) 
                {
                    Tiro(TABLERO[i][j]);
                    if(Revisar())
                    {
                        JOptionPane.showMessageDialog(null,"Has ganado!");
                        Reiniciar();
                    }
                    else if(Contador<9)
                    {
                    	Contador++;
                    }else
                    {
                    	JOptionPane.showMessageDialog(null,"Juego empatado!");
                        Reiniciar();                    	
                    }
                }
            }
        }        
    }
    void Tiro(Casilla X)
    {
        ImageIcon ICONO=null;
        if(Contador%2==0)
        {
            ICONO = new ImageIcon(this.getClass().getResource("O.png"));
            X.B=1;
        }
        else
        {
            ICONO = new ImageIcon(this.getClass().getResource("X.png"));
            X.B=4;
        }
        
        ICONO = new ImageIcon(ICONO.getImage().getScaledInstance(90, -1, java.awt.Image.SCALE_DEFAULT));
        X.A.setIcon(ICONO);
        X.A.removeActionListener(this);
    }
    boolean Revisar()
    {
        boolean Gano= false;
        int Suma=0;
        for(int i=0;i<3;i++)
        {
            Suma=TABLERO[i][0].B+TABLERO[i][1].B+TABLERO[i][2].B;
            if(Suma==3 || Suma==12)
            {
                Gano=true;
                break;
            }
        }
        for(int i=0;i<3;i++)
        {
            Suma=TABLERO[0][i].B+TABLERO[1][i].B+TABLERO[2][i].B;
            if(Suma==3 ||Suma==12)
            {
                Gano=true;
                break;
            } 
        }
        Suma=TABLERO[0][2].B+TABLERO[1][1].B+TABLERO[2][0].B;
        if(Suma==3 ||Suma==12)
                Gano=true;
        Suma=0;
        for(int i=0;i<3;i++)
            Suma+=TABLERO[i][i].B;
        
        if(Suma==3 ||Suma==12)
                Gano=true;            
        
        return Gano;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 350));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gato().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    void Reiniciar()
    {
    	Contador=0;
    	for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                TABLERO[i][j].A.setIcon(null);
                TABLERO[i][j].B=0;
                TABLERO[i][j].A.addActionListener(this);
            }
        }
    }
    
}
