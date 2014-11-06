/**
 * Principal.java
 * 
 * @author Brandon Mendez -13087
 * @author Alejandro Díaz - 13082
 * 
 * Descripcion: interfaz grafica de la resolcion de la hoja de trabajo no.9 de 
 * Algoritmos y estructura de datos.
 * 
 */
//Importando librerias utiles
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class InterfazGrafica extends JPanel implements ActionListener{
	/**ATRIBUTOS**/
	private static JFrame frame;										//frame principal de la GUI y frame de control de errores
	private JTextArea areatexto; 
	private JButton btonRutaMasCorta,btonCentroGrafo, btonModificarGrafo;
	private static String comRutaMasCorta="rutamascorta",
                comCentroGrafo="comcentrografo",
                comModificarGrafo="commodificargrafo";
	Calculos matriz;
	/**
	* Constructor con un parametro que es un frame de control de errores
	* @param v El parámetro v es un frame que sirve para mostrarle errores 
        * de ingreso al usuario
	*/
	public InterfazGrafica(JFrame v){		
            matriz = new Calculos();
            matriz.caminoCorto();
            


            //Construyendo paneles de la interfaz				
            JComponent panelBanner=panelBanner();											
            JComponent panelBotones=panelBotones();
            JComponent panelResultado=panelResultado();

            add(panelBanner);
            add(panelBotones);
            add(panelResultado);

            areatexto.setText("\nMatriz de adyacencia\n"+matriz.grafo.show()+"\n");
           
            
            
	}	
	
	/**
	* Método que devuelve el panel con los botones para seleccionar la implemetacion del stack
	* @return JPanel con tres botones
	*/	  									  							  
        protected JComponent panelBotones(){
            JPanel panel = new JPanel(new GridLayout(0,1));									//Creando panel con un Gridlayout con 0 filas 1 columna
            panel.setBorder(BorderFactory.createTitledBorder(" Seleccione una opcion. ")); 		
            panel.setPreferredSize(new Dimension(150, 95));     							//Cambiandolo de tamanio

            btonRutaMasCorta = new JButton("Ruta Mas corta");
            btonRutaMasCorta.setActionCommand(comRutaMasCorta);
            btonRutaMasCorta.addActionListener(this);												//Asignando listener                        
            
            btonCentroGrafo = new JButton ("Centro del Grafo");
            btonCentroGrafo.setActionCommand(comCentroGrafo);
            btonCentroGrafo.addActionListener(this);												//Asignando listener                        
            btonModificarGrafo = new JButton ("Modificar Grafo");
            btonModificarGrafo.setActionCommand(comModificarGrafo);
            btonModificarGrafo.addActionListener(this);
            
            panel.add(btonRutaMasCorta);
            panel.add(btonCentroGrafo);
            panel.add(btonModificarGrafo);
            
            return panel;
	}
		
	
			
	/**
	* Método que devuelve el panel con una caja de texto y scroll
	* @return JPanel con una caja de texto y scroll
	*/	  									  							  
        protected JComponent panelResultado(){
            JPanel panel = new JPanel(new GridLayout(0,1));                                                             //Creando panel con un Gridlayout con 0 filas 1 columna
            panel.setBorder(BorderFactory.createTitledBorder(" Resultado. ")); 		
            panel.setPreferredSize(new Dimension(335, 100));     							//Cambiandolo de tamanio

            areatexto = new JTextArea ( 16, 58 );
            areatexto.setEditable ( false ); // set textArea non-editable
            JScrollPane scroll = new JScrollPane ( areatexto );
            scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

            panel.add ( scroll );


            return panel;
	}	
	
	
			
	/**
	* Método que devuelve el panel con el banner que contiene una imagen jpg de una calculadora
	* @return JPanel con una imagen
	*/
	protected JComponent panelBanner(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		JLabel banner = new JLabel("", JLabel.CENTER);  						//Centrando banner              
		banner.setOpaque(true);        											//Haciendolo mas opaco
		banner.setPreferredSize(new Dimension(454, 325));         				//Cambiandolo de tamaÃ±o
		banner.setIcon(new ImageIcon("guate.jpg")); 							//Creando Imaege icon con parametro de direccion	
		JPanel bannerPanel = new JPanel(new BorderLayout());      				//Creando panel para banner
		bannerPanel.add(banner, BorderLayout.CENTER);        					//Centrado y agregando el banner al panel
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Ciudades Principales de Guatemala")); 	//Colocandole texto al borde			
		panel.add(bannerPanel, BorderLayout.CENTER);							//AÃ±adiendo al Frame
		return panel;
	}

	/**
	*	GESTIONADOR DE EVENTOS: Permite gestionar todos los eventos de la clase.
	* @see ActionEvent
	* @see ActionListener
	*/						  
	public void actionPerformed(ActionEvent e){									//Empieza el control de eventos
            String comando = e.getActionCommand();										//String del comando de accion			
            if(comando.equals(comRutaMasCorta)){
                matriz.caminoCorto();
                String ciudad1 = (String)JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la ciudad de salida:\n",
                "Ciudad De salida",
                JOptionPane.PLAIN_MESSAGE);
                
                String ciudad2 = (String)JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la ciudad de destino:\n",
                "Ciudad De destino",
                JOptionPane.PLAIN_MESSAGE);
         
                if(matriz.grafo.contains(ciudad1)&&matriz.grafo.contains(ciudad2)){                    
                    JOptionPane.showMessageDialog(null,"\nLa ruta mas corta es: "+matriz.grafo.getEdge(ciudad1, ciudad2),
                    "Centro Grafo",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            if(comando.equals(comCentroGrafo)){
                JOptionPane.showMessageDialog(null,matriz.centroGrafo(),
                "Centro Grafo",JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            if(comando.equals(comModificarGrafo)){
                String eleccion = (String)JOptionPane.showInputDialog(null,
                "Pesione 1 si hay interrupcion de trafico entre dos ciudades:"
                        + "\n Presione 2 Para establecer coneccion entre dos nuevas ciudades:",
                "Mensaje",
                JOptionPane.PLAIN_MESSAGE);
                
                if(eleccion.equals("1")){
                   String ciudadSalida = (String)JOptionPane.showInputDialog(null,
                    "Ingrese la ciudad de salida: ",
                    "Ciudad Salida",
                    JOptionPane.PLAIN_MESSAGE);
                   
                   String ciudadDestino = (String)JOptionPane.showInputDialog(null,
                    "Ingrese la ciudad de destino: ",
                    "Ciudad Destino",
                    JOptionPane.PLAIN_MESSAGE);
                   
                   if(matriz.grafo.contains(ciudadSalida)&&matriz.grafo.contains(ciudadDestino)){
                        matriz.grafo.addEdge(ciudadSalida, ciudadDestino, 10000);
                    }
                }

                if(eleccion.equals("2")){
                     String ciudadSalida = (String)JOptionPane.showInputDialog(null,
                    "Ingrese la ciudad de salida: ",
                    "Ciudad Salida",
                    JOptionPane.PLAIN_MESSAGE);
                   
                   String ciudadDestino = (String)JOptionPane.showInputDialog(null,
                    "Ingrese la ciudad de destino: ",
                    "Ciudad Destino",
                    JOptionPane.PLAIN_MESSAGE);
                   String distancia = (String)JOptionPane.showInputDialog(null,
                    "Ingrese la distancia entre las dos ciudades ingresadas: ",
                    "Distancia",
                    JOptionPane.PLAIN_MESSAGE);
                   
                    if(matriz.grafo.contains(ciudadSalida)&&matriz.grafo.contains(ciudadDestino)){
                        matriz.grafo.addEdge(ciudadSalida, ciudadDestino, distancia);
                    }
                    else{
                        matriz.grafo.add(ciudadSalida);
                        matriz.grafo.add(ciudadDestino);
                        matriz.grafo.addEdge(ciudadSalida, ciudadDestino, distancia);
                    }        
                    matriz.caminoCorto();
                    areatexto.setText("\nMatriz de adyacencia\n"+matriz.grafo.show()+"\n");
           
                    
                }
                
            }
            
            
            
      
            
            
            
            
		
	}//Final de gestionador de eventos	

	/**
	* creandoInterfaz:Metodo que crea el Frame principal, el contenedor principal y muestra la interfaz grafica
	* @see windowActivated */
	public void creandoInterfaz() {
		frame = new JFrame(" Hoja de Trabajo No.9 Algoritmos y Estructura de Datos. ");			        						//Creando la ventana principal
		frame.setPreferredSize(new Dimension(580, 510)); 						//colocar caracteristicas al frame (tamaÃ±o)
		
		this.setOpaque(true); 													//Se vuelve opaco el panel de contenido para que no sea diferenciado
		frame.setContentPane(this);												//Estableciendo el panel principal.
		frame.setResizable(false);												//Bloqueando la maximizaciÃ³n de la ventana
		
		frame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);	//Asegurandose de que el evento foco se valla al Panel principal
		frame.addWindowListener(new WindowAdapter() {							//El evento foco se centra en este panel no importa que
		//Cerrando con confirmacion
		public void windowClosing(WindowEvent we){
			int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea salir?");
				if ( eleccion == 0) {
					System.exit(0);
				}  
			}
		});
		
		//Mostrando el frame
		frame.pack();
		frame.setLocationRelativeTo(null);;										//Frame en el centro
		frame.setVisible(true);	
	}


}
