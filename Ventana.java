import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel Titulo, Titulo1;

    private JLabel LigasI, LigasII, LigasIII, LigasIV, LigasV, LigasVI;
    public JLabel[] Teams = new JLabel[26];

    private JTextField AreaTitulo, AreaTituloI;

    private JTextField AreaI, AreaII, AreaIII;

    // private JTextField A;

    private JLabel DivisionI, DivisionII, DivisionIII, DivisionIV, DivisionV, DivisionVI; // para las etiquetas div
    private JLabel subdivision, subdivision1;
    public JLabel[] Eliminados = new JLabel[10], Clasificados = new JLabel[10];

    JButton Boton, Next; // AGREGAR BOTONES

    public int Switch = 0, Switch1 = 0;

    public Ventana() {
        setLayout(null);
        setTitle("SERIES REGULAR");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // getContentPane().setBackground(new Color(217, 217, 217));

        // titulos
        Titulo = new JLabel("The League");
        Titulo.setFont(new Font("Calibri bold", 3, 20));
        // Titulo.setBounds(350, -120, 200, 300);
        add(Titulo);

        // *********************************AREA TEXTO *******************
        AreaTitulo = new JTextField();
        AreaTitulo.setBounds(275, 15, 250, 25);
        AreaTitulo.setBackground(new Color(255, 255, 153));
        AreaTitulo.setEditable(false);// gracias bloquear la excritura del area de textos
        // add(AreaTitulo);

        /*********************************** */
        LigasI = new JLabel("Liga I:");
        LigasI.setFont(new Font("Calibri regular", 4, 14));
        // LigasI.setBounds(130, -100, 200, 300);
        add(LigasI);

        Teams[0] = new JLabel("A: 0-0");
        Teams[0].setFont(new Font("Calibri regular", 4, 14));
        // Teams[0].setBounds(230, -100, 200, 300);
        add(Teams[0]);

        Teams[1] = new JLabel("B: 0-0");
        Teams[1].setFont(new Font("Calibri regular", 4, 14));
        // Teams[1].setBounds(330, -100, 200, 300);
        add(Teams[1]);

        Teams[2] = new JLabel("C: 0-0");
        Teams[2].setFont(new Font("Calibri regular", 4, 14));
        // Teams[2].setBounds(430, -100, 200, 300);
        add(Teams[2]);

        Teams[3] = new JLabel("D: 0-0");
        Teams[3].setFont(new Font("Calibri regular", 4, 14));
        // Teams[3].setBounds(530, -100, 200, 300);
        add(Teams[3]);

        Teams[4] = new JLabel("E: 0-0");
        Teams[4].setFont(new Font("Calibri regular", 4, 14));
        // Teams[4].setBounds(230, -80, 200, 300);
        add(Teams[4]);

        Teams[5] = new JLabel("F: 0-0");
        Teams[5].setFont(new Font("Calibri regular", 4, 14));
        // Teams[5].setBounds(330, -80, 200, 300);
        add(Teams[5]);

        Teams[6] = new JLabel("M: 0-0");
        Teams[6].setFont(new Font("Calibri regular", 4, 14));
        // Teams[6].setBounds(430, -80, 200, 300);
        add(Teams[6]);

        Teams[7] = new JLabel("P: 0-0");
        Teams[7].setFont(new Font("Calibri regular", 4, 14));
        // Teams[7].setBounds(530, -80, 200, 300);
        add(Teams[7]);

        Teams[8] = new JLabel("G: 0-0");
        Teams[8].setFont(new Font("Calibri regular", 4, 14));
        // Teams[8].setBounds(230, -60, 200, 300);
        add(Teams[8]);

        Teams[9] = new JLabel("H: 0-0");
        Teams[9].setFont(new Font("Calibri regular", 4, 14));
        // Teams[9].setBounds(330, -60, 200, 300);
        add(Teams[9]);

        Teams[10] = new JLabel("L: 0-0");
        Teams[10].setFont(new Font("Calibri regular", 4, 14));
        // Teams[10].setBounds(430, -60, 200, 300);
        add(Teams[10]);

        Teams[11] = new JLabel("Y: 0-0");
        Teams[11].setFont(new Font("Calibri regular", 4, 14));
        // Teams[11].setBounds(530, -60, 200, 300);
        add(Teams[11]);

        // *********************************AREA TEXTO *******************
        AreaI = new JTextField();
        AreaI.setBounds(125, 40, 500, 65);
        AreaI.setBackground(new Color(255, 255, 255));
        AreaI.setEditable(false);// gracias bloquear la excritura del area de textos
        // add(AreaI);

        // *****************************************************************************
        LigasII = new JLabel("Liga II:");
        LigasII.setFont(new Font("Calibri regular", 4, 14));
        // LigasII.setBounds(130, -20, 200, 300);
        add(LigasII);

        Teams[12] = new JLabel("I: 0-0");
        Teams[12].setFont(new Font("Calibri regular", 4, 14));
        // Teams[12].setBounds(230, -20, 200, 300);
        add(Teams[12]);

        Teams[13] = new JLabel("J: 0-0");
        Teams[13].setFont(new Font("Calibri regular", 4, 14));
        // Teams[13].setBounds(330, -20, 200, 300);
        add(Teams[13]);

        Teams[14] = new JLabel("K: 0-0");
        Teams[14].setFont(new Font("Calibri regular", 4, 14));
        // Teams[14].setBounds(430, -20, 200, 300);
        add(Teams[14]);

        Teams[15] = new JLabel("N: 0-0");
        Teams[15].setFont(new Font("Calibri regular", 4, 14));
        // Teams[15].setBounds(230, 0, 200, 300);
        add(Teams[15]);

        Teams[16] = new JLabel("O: 0-0");
        Teams[16].setFont(new Font("Calibri regular", 4, 14));
        // Teams[16].setBounds(330, 0, 200, 300);
        add(Teams[16]);

        Teams[17] = new JLabel("Q: 0-0");
        Teams[17].setFont(new Font("Calibri regular", 4, 14));
        // Teams[17].setBounds(430, 0, 200, 300);
        add(Teams[17]);

        Teams[18] = new JLabel("W: 0-0");
        Teams[18].setFont(new Font("Calibri regular", 4, 14));
        // Teams[18].setBounds(230, 20, 200, 300);
        add(Teams[18]);

        Teams[19] = new JLabel("X: 0-0");
        Teams[19].setFont(new Font("Calibri regular", 4, 14));
        // Teams[19].setBounds(330, 20, 200, 300);
        add(Teams[19]);

        Teams[20] = new JLabel("Z: 0-0");
        Teams[20].setFont(new Font("Calibri regular", 4, 14));
        // Teams[20].setBounds(430, 20, 200, 300);
        add(Teams[20]);

        // *********************************AREA TEXTO *******************
        AreaII = new JTextField();
        AreaII.setBounds(125, 120, 400, 65);
        AreaII.setBackground(new Color(255, 255, 255));
        AreaII.setEditable(false);// gracias bloquear la excritura del area de textos
        // add(AreaII);

        // *******************************************************************************
        LigasIII = new JLabel("Liga V:");
        LigasIII.setFont(new Font("Calibri regular", 4, 14));
        // LigasIII.setBounds(130, 60, 200, 300);
        add(LigasIII);

        Teams[21] = new JLabel("R: 0-0");
        Teams[21].setFont(new Font("Calibri regular", 4, 14));
        // Teams[21].setBounds(230, 60, 200, 300);
        add(Teams[21]);

        Teams[22] = new JLabel("S: 0-0");
        Teams[22].setFont(new Font("Calibri regular", 4, 14));
        // Teams[22].setBounds(330, 60, 200, 300);
        add(Teams[22]);

        Teams[23] = new JLabel("T: 0-0");
        Teams[23].setFont(new Font("Calibri regular", 4, 14));
        // Teams[23].setBounds(430, 60, 200, 300);
        add(Teams[23]);

        Teams[24] = new JLabel("U: 0-0");
        Teams[24].setFont(new Font("Calibri regular", 4, 14));
        // Teams[24].setBounds(530, 60, 200, 300);
        add(Teams[24]);

        Teams[25] = new JLabel("V: 0-0");
        Teams[25].setFont(new Font("Calibri regular", 4, 14));
        // Teams[25].setBounds(630, 60, 200, 300);
        add(Teams[25]);

        // *********************************AREA TEXTO *******************
        AreaIII = new JTextField();
        AreaIII.setBounds(125, 200, 600, 25);
        AreaIII.setBackground(new Color(255, 255, 255));
        AreaIII.setEditable(false);// gracias bloquear la excritura del area de textos
        // add(AreaIII);

        // *******************************************Otras LIGA/DIVISION
        // ***********************************************************************
        LigasIV = new JLabel("División IV");
        LigasIV.setFont(new Font("Calibri regular", 4, 14));
        // LigasIV.setBounds(580, 20, 200, 300);
        add(LigasIV);

        LigasV = new JLabel("División V");
        LigasV.setFont(new Font("Calibri regular", 4, 14));
        // LigasV.setBounds(580, 20, 200, 300);
        add(LigasV);

        LigasVI = new JLabel("División VI");
        LigasVI.setFont(new Font("Calibri regular", 4, 14));
        // LigasVI.setBounds(580, 20, 200, 300);
        add(LigasVI);

        // **************************************************************************************************************
        //

        // ***********************************************************************************************************************
        Titulo1 = new JLabel("PostSeason");
        Titulo1.setFont(new Font("Calibri bold", 3, 20));
        // Titulo1.setBounds(350, 200, 200, 300);
        add(Titulo1);

        // *********************************AREA TEXTO *******************
        AreaTituloI = new JTextField();
        // AreaTituloI.setBounds(275, 335, 250, 25);
        AreaTituloI.setBackground(new Color(255, 255, 153));
        AreaTituloI.setEditable(false);// gracias bloquear la excritura del area de textos
        // add(AreaTituloI);

        // Division
        DivisionI = new JLabel("Div I:");
        DivisionI.setFont(new Font("Calibri regular", 4, 16));
        // DivisionI.setBounds(50, 230, 200, 300);
        add(DivisionI);

        DivisionII = new JLabel("Div II:");
        DivisionII.setFont(new Font("Calibri regular", 4, 16));
        // DivisionII.setBounds(170, 230, 200, 300);
        add(DivisionII);

        DivisionIII = new JLabel("Div III:");
        DivisionIII.setFont(new Font("Calibri regular", 4, 16));
        // DivisionIII.setBounds(290, 230, 200, 300);
        add(DivisionIII);

        DivisionIV = new JLabel("Div IV:");
        DivisionIV.setFont(new Font("Calibri regular", 4, 16));
        // DivisionIV.setBounds(410, 230, 200, 300);
        add(DivisionIV);

        DivisionV = new JLabel("Div V:");
        DivisionV.setFont(new Font("Calibri regular", 4, 16));
        // DivisionV.setBounds(530, 230, 200, 300);
        add(DivisionV);

        DivisionVI = new JLabel("Div VI:");
        DivisionVI.setFont(new Font("Calibri regular", 4, 16));
        // DivisionVI.setBounds(650, 230, 200, 300);
        add(DivisionVI);

        /*************************** Agregar subTitulos ****************************/
        subdivision = new JLabel("Eliminados");
        subdivision.setFont(new Font("Calibri bold", 2, 16));
        // subdivision.setBounds(180, 290, 200, 300);
        add(subdivision);

        Eliminados[0] = new JLabel("Eliminado 1");
        Eliminados[0].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[0].setBounds(130, 305, 200, 300);
        add(Eliminados[0]);

        Eliminados[1] = new JLabel("Eliminado 2");
        Eliminados[1].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[1].setBounds(130, 325, 200, 300);
        add(Eliminados[1]);

        Eliminados[2] = new JLabel("Eliminado 3");
        Eliminados[2].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[0].setBounds(130, 345, 200, 300);
        add(Eliminados[2]);

        Eliminados[3] = new JLabel("Eliminado 4");
        Eliminados[3].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[3].setBounds(130, 365, 200, 300);
        add(Eliminados[3]);

        Eliminados[4] = new JLabel("Eliminado 5");
        Eliminados[4].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[4].setBounds(130, 385, 200, 300);
        add(Eliminados[4]);

        Eliminados[5] = new JLabel("Eliminado 6");
        Eliminados[5].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[5].setBounds(230, 305, 200, 300);
        add(Eliminados[5]);

        Eliminados[6] = new JLabel("Eliminado 7");
        Eliminados[6].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[6].setBounds(230, 325, 200, 300);
        add(Eliminados[6]);

        Eliminados[7] = new JLabel("Eliminado 8");
        Eliminados[7].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[7].setBounds(230, 345, 200, 300);
        add(Eliminados[7]);

        Eliminados[8] = new JLabel("Eliminado 9");
        Eliminados[8].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[8].setBounds(230, 365, 200, 300);
        add(Eliminados[8]);

        Eliminados[9] = new JLabel("Eliminado 10");
        Eliminados[9].setFont(new Font("Calibri regular", 4, 14));
        // Eliminados[9].setBounds(230, 385, 200, 300);
        add(Eliminados[9]);

        /****************************** Otra Subdivicion ****************************/
        subdivision1 = new JLabel("Clasificados");
        subdivision1.setFont(new Font("Calibri bold", 2, 16));
        // subdivision1.setBounds(530, 290, 200, 300);
        add(subdivision1);

        Clasificados[0] = new JLabel("Clasificados 1");
        Clasificados[0].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[0].setBounds(480, 305, 200, 300);
        add(Clasificados[0]);

        Clasificados[1] = new JLabel("Clasificados 2");
        Clasificados[1].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[1].setBounds(480, 325, 200, 300);
        add(Clasificados[1]);

        Clasificados[2] = new JLabel("Clasificados 3");
        Clasificados[2].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[2].setBounds(480, 345, 200, 300);
        add(Clasificados[2]);

        Clasificados[3] = new JLabel("Clasificados 4");
        Clasificados[3].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[3].setBounds(480, 365, 200, 300);
        add(Clasificados[3]);

        Clasificados[4] = new JLabel("Clasificados 5");
        Clasificados[4].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[4].setBounds(480, 385, 200, 300);
        add(Clasificados[4]);

        Clasificados[5] = new JLabel("Clasificados 6");
        Clasificados[5].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[5].setBounds(580, 305, 200, 300);
        add(Clasificados[5]);

        Clasificados[6] = new JLabel("Clasificados 7");
        Clasificados[6].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[6].setBounds(580, 325, 200, 300);
        add(Clasificados[6]);

        Clasificados[7] = new JLabel("Clasificados 8");
        Clasificados[7].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[7].setBounds(580, 345, 200, 300);
        add(Clasificados[7]);

        Clasificados[8] = new JLabel("Clasificados 9");
        Clasificados[8].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[8].setBounds(580, 365, 200, 300);
        add(Clasificados[8]);

        Clasificados[9] = new JLabel("Clasificados 10");
        Clasificados[9].setFont(new Font("Calibri regular", 4, 14));
        // Clasificados[9].setBounds(580, 385, 200, 300);
        add(Clasificados[9]);

        // AGREGAR BOTON
        Boton = new JButton("Iniciar");
        Boton.setFont(new Font("Calibri", 1, 20));
        Boton.setBounds(686, 623, 100, 40);
        Boton.setForeground(new Color(138, 97, 255));
        Boton.setBackground(new Color(189, 255, 243));
        add(Boton);
        Boton.addActionListener(this);

        Next = new JButton("NEXT");
        Next.setFont(new Font("Calibri", 1, 16));
        // Next.setBounds(716, 0, 70, 30);
        // Next.setForeground(new Color(138, 97, 255));
        // Next.setBackground(new Color(189, 255, 243));
        add(Next);
        Next.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Boton) {
            // NOta tienes que instanciar la otra clase para que se enlace
            Switch1 = Switch1 + 1;

            if (Switch1 == 1) {
                Titulo.setBounds(350, -120, 200, 300);

                LigasI.setBounds(130, -100, 200, 300);
                LigasII.setBounds(130, -20, 200, 300);
                LigasIII.setBounds(130, 60, 200, 300);

                Teams[0].setBounds(230, -100, 200, 300);
                Teams[1].setBounds(330, -100, 200, 300);
                Teams[2].setBounds(430, -100, 200, 300);
                Teams[3].setBounds(530, -100, 200, 300);
                Teams[4].setBounds(230, -80, 200, 300);
                Teams[5].setBounds(330, -80, 200, 300);
                Teams[6].setBounds(430, -80, 200, 300);
                Teams[7].setBounds(530, -80, 200, 300);
                Teams[8].setBounds(230, -60, 200, 300);
                Teams[9].setBounds(330, -60, 200, 300);
                Teams[10].setBounds(430, -60, 200, 300);
                Teams[11].setBounds(530, -60, 200, 300);

                // ********************************************************************

                Teams[12].setBounds(230, -20, 200, 300);
                Teams[13].setBounds(330, -20, 200, 300);
                Teams[14].setBounds(430, -20, 200, 300);
                Teams[15].setBounds(230, 0, 200, 300);
                Teams[16].setBounds(330, 0, 200, 300);
                Teams[17].setBounds(430, 0, 200, 300);
                Teams[18].setBounds(230, 20, 200, 300);
                Teams[19].setBounds(330, 20, 200, 300);
                Teams[20].setBounds(430, 20, 200, 300);

                // ***********************************************************************

                Teams[21].setBounds(230, 60, 200, 300);
                Teams[22].setBounds(330, 60, 200, 300);
                Teams[23].setBounds(430, 60, 200, 300);
                Teams[24].setBounds(530, 60, 200, 300);
                Teams[25].setBounds(630, 60, 200, 300);

                // *********************************************************************************

                Next.setBounds(716, 0, 70, 30);
            }

            if (Switch1 == 2) {
                Titulo1.setBounds(350, 200, 200, 300);
                DivisionI.setBounds(50, 230, 200, 300);
                DivisionII.setBounds(170, 230, 200, 300);
                DivisionIII.setBounds(290, 230, 200, 300);
                DivisionIV.setBounds(410, 230, 200, 300);
                DivisionV.setBounds(530, 230, 200, 300);
                DivisionVI.setBounds(650, 230, 200, 300);

                AreaTituloI.setBounds(275, 335, 250, 25);
            }

            if (Switch1 == 3) {
                /**** */
                // NOta tienes que instanciar la otra clase para que se enlace

                /******************** Subdiviciones ************/
                subdivision.setBounds(180, 290, 200, 300);
                Eliminados[0].setBounds(130, 305, 200, 300);
                Eliminados[1].setBounds(130, 325, 200, 300);
                Eliminados[2].setBounds(130, 345, 200, 300);
                Eliminados[3].setBounds(130, 365, 200, 300);
                Eliminados[4].setBounds(130, 385, 200, 300);
                Eliminados[5].setBounds(230, 305, 200, 300);
                Eliminados[6].setBounds(230, 325, 200, 300);
                Eliminados[7].setBounds(230, 345, 200, 300);
                Eliminados[8].setBounds(230, 365, 200, 300);
                Eliminados[9].setBounds(230, 385, 200, 300);

                /****************************** Otra Subdivicion */
                subdivision1.setBounds(530, 290, 200, 300);
                Clasificados[0].setBounds(480, 305, 200, 300);
                Clasificados[1].setBounds(480, 325, 200, 300);
                Clasificados[2].setBounds(480, 345, 200, 300);
                Clasificados[3].setBounds(480, 365, 200, 300);
                Clasificados[4].setBounds(480, 385, 200, 300);
                Clasificados[5].setBounds(580, 305, 200, 300);
                Clasificados[6].setBounds(580, 325, 200, 300);
                Clasificados[7].setBounds(580, 345, 200, 300);
                Clasificados[8].setBounds(580, 365, 200, 300);
                Clasificados[9].setBounds(580, 385, 200, 300);

                Switch1 = 0;
            }
            System.out.print(Switch1);

        }

        if (e.getSource() == Next) {
            Switch = Switch + 1;

            if (Switch == 1) {
                Titulo.setText("The Division");

                LigasI.setText("División I");
                Teams[0].setBounds(130, -80, 200, 300);
                Teams[1].setBounds(130, -60, 200, 300);
                Teams[2].setBounds(130, -40, 200, 300);
                Teams[3].setBounds(130, -20, 200, 300);

                LigasIV.setBounds(130, 20, 200, 300);
                Teams[6].setBounds(130, 40, 200, 300);
                Teams[15].setBounds(130, 60, 200, 300);
                Teams[16].setBounds(130, 80, 200, 300);
                Teams[7].setBounds(130, 100, 200, 300);
                Teams[17].setBounds(130, 120, 200, 300);

                LigasII.setText("División II");
                LigasII.setBounds(350, -100, 200, 300);
                Teams[4].setBounds(350, -80, 200, 300);
                Teams[5].setBounds(350, -60, 200, 300);
                Teams[8].setBounds(350, -40, 200, 300);
                Teams[9].setBounds(350, -20, 200, 300);

                LigasV.setBounds(350, 20, 200, 300);
                Teams[21].setBounds(350, 40, 200, 300);
                Teams[22].setBounds(350, 60, 200, 300);
                Teams[23].setBounds(350, 80, 200, 300);
                Teams[24].setBounds(350, 100, 200, 300);
                Teams[25].setBounds(350, 120, 200, 300);

                // **************************** */
                LigasIII.setText("División III");
                LigasIII.setBounds(580, -100, 200, 300);

                Teams[12].setBounds(580, -80, 200, 300);
                Teams[13].setBounds(580, -60, 200, 300);
                Teams[14].setBounds(580, -40, 200, 300);
                Teams[10].setBounds(580, -20, 200, 300);

                LigasVI.setBounds(580, 20, 200, 300);
                Teams[18].setBounds(580, 40, 200, 300);
                Teams[19].setBounds(580, 60, 200, 300);
                Teams[11].setBounds(580, 80, 200, 300);
                Teams[20].setBounds(580, 100, 200, 300);

            }

            if (Switch == 2) {
                Titulo.setText("The League");
                Switch = 0;

                LigasI.setText("Ligas I:");
                Teams[0].setBounds(230, -100, 200, 300);
                Teams[1].setBounds(330, -100, 200, 300);
                Teams[2].setBounds(430, -100, 200, 300);
                Teams[3].setBounds(530, -100, 200, 300);

                LigasIV.setBounds(-330, 20, 200, 300);
                Teams[7].setBounds(530, -80, 200, 300);
                Teams[15].setBounds(230, 0, 200, 300);
                Teams[16].setBounds(330, 0, 200, 300);
                Teams[6].setBounds(430, -80, 200, 300);
                Teams[17].setBounds(430, 0, 200, 300);

                LigasII.setText("Ligas II:");
                LigasII.setBounds(130, -20, 200, 300);
                Teams[4].setBounds(230, -80, 200, 300);
                Teams[5].setBounds(330, -80, 200, 300);
                Teams[8].setBounds(230, -60, 200, 300);
                Teams[9].setBounds(330, -60, 200, 300);

                LigasV.setBounds(-200, 0, 200, 300);
                Teams[21].setBounds(230, 60, 200, 300);
                Teams[22].setBounds(330, 60, 200, 300);
                Teams[23].setBounds(430, 60, 200, 300);
                Teams[24].setBounds(530, 60, 200, 300);
                Teams[25].setBounds(630, 60, 200, 300);

                LigasIII.setText("Ligas V:");
                LigasIII.setBounds(130, 60, 200, 300);

                Teams[12].setBounds(230, -20, 200, 300);
                Teams[13].setBounds(330, -20, 200, 300);
                Teams[14].setBounds(430, -20, 200, 300);
                Teams[10].setBounds(430, -60, 200, 300);

                LigasVI.setBounds(-100, 0, 200, 300);
                Teams[18].setBounds(230, 20, 200, 300);
                Teams[19].setBounds(330, 20, 200, 300);
                Teams[11].setBounds(530, -60, 200, 300);
                Teams[20].setBounds(430, 20, 200, 300);
            }

            // System.out.print(Switch);
        }

    }

    public static void main(String args[]) {
        Ventana Laventana = new Ventana();
        Laventana.setBounds(0, 0, 800, 700);
        Laventana.setVisible(true);
        Laventana.setResizable(false);
        Laventana.setLocationRelativeTo(null);

    }

}
