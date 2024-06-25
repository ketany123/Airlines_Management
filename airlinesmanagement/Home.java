//package airlinesmanagement;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener{
//    
//    public Home() {
//        setLayout(null);
//        
////        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/front.png"));
////        JLabel image = new JLabel(i1);
////        image.setBounds(0, 0, 1600, 800);
////        add(image);
//        
//        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
//        heading.setBounds(500, 40, 1000, 40);
//        heading.setForeground(Color.BLUE);
//        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
////        image.add(heading);
//        
//        JMenuBar menubar = new JMenuBar();
//        setJMenuBar(menubar);
//        
//        JMenu details = new JMenu("Details");
//        menubar.add(details);
//        
//        JMenuItem flightDetails = new JMenuItem("Flight Details");
//        flightDetails.addActionListener(this);
//        details.add(flightDetails);
//        
//        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
//        customerDetails.addActionListener(this);
//        details.add(customerDetails);
//        
//        JMenuItem bookFlight = new JMenuItem("Book Flight");
//        bookFlight.addActionListener(this);
//        details.add(bookFlight);
//        
//        JMenuItem journeyDetails = new JMenuItem("Journey Details");
//        journeyDetails.addActionListener(this);
//        details.add(journeyDetails);
//        
//        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
//        ticketCancellation.addActionListener(this);
//        details.add(ticketCancellation);
//        
//        JMenu ticket = new JMenu("Ticket");
//        menubar.add(ticket);
//        
//        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
//        ticket.add(boardingPass);
//        
//        
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        String text = ae.getActionCommand();
//        
//        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
//        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
//        }
//        else if (text.equals("Book Flight")) {
//            new BookFlight();
//        } else if (text.equals("Journey Details")) {
//            new JournetDetails();
//        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
//        } else if (text.equals("Boarding Pass")) {
//            new BoardingPass();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Home();
//    }
//}
//
//
//
//package airlinesmanagement;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener {
//    
//    public Home() {
//        setLayout(new BorderLayout());
//        
//        // Header Image
////        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("front.png"));
////        JLabel image = new JLabel(i1);
////        image.setPreferredSize(new Dimension(1600, 300));
////        add(image, BorderLayout.NORTH);
//        
//        // Welcome Panel
//        JPanel welcomePanel = new JPanel();
//        welcomePanel.setLayout(new BorderLayout());
//        
//        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU", JLabel.CENTER);
//        heading.setForeground(Color.BLUE);
//        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
//        welcomePanel.add(heading, BorderLayout.CENTER);
//        
//        add(welcomePanel, BorderLayout.CENTER);
//        
//        // Menu Bar
//        JMenuBar menubar = new JMenuBar();
//        setJMenuBar(menubar);
//        
//        JMenu details = new JMenu("Details");
//        menubar.add(details);
//        
//        JMenuItem flightDetails = new JMenuItem("Flight Details");
//        flightDetails.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/flight.png")));
//        flightDetails.addActionListener(this);
//        flightDetails.setToolTipText("View and manage flight details");
//        details.add(flightDetails);
//        
//        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
//        customerDetails.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/customer.png")));
//        customerDetails.addActionListener(this);
//        customerDetails.setToolTipText("Add new customer details");
//        details.add(customerDetails);
//        
//        JMenuItem bookFlight = new JMenuItem("Book Flight");
//        bookFlight.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/book.png")));
//        bookFlight.addActionListener(this);
//        bookFlight.setToolTipText("Book a new flight");
//        details.add(bookFlight);
//        
//        JMenuItem journeyDetails = new JMenuItem("Journey Details");
//        journeyDetails.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/journey.png")));
//        journeyDetails.addActionListener(this);
//        journeyDetails.setToolTipText("View journey details");
//        details.add(journeyDetails);
//        
//        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
//        ticketCancellation.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/cancel.png")));
//        ticketCancellation.addActionListener(this);
//        ticketCancellation.setToolTipText("Cancel a booked ticket");
//        details.add(ticketCancellation);
//        
//        JMenu ticket = new JMenu("Ticket");
//        menubar.add(ticket);
//        
//        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
//        boardingPass.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlinesmanagement/icons/boarding.png")));
//        ticket.add(boardingPass);
//        boardingPass.setToolTipText("Generate boarding pass");
//        
//        // Footer
//        JPanel footer = new JPanel();
//        footer.setLayout(new FlowLayout(FlowLayout.CENTER));
//        JLabel footerLabel = new JLabel("Air India © 2024 | All Rights Reserved");
//        footer.add(footerLabel);
//        
//        add(footer, BorderLayout.SOUTH);
//        
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        String text = ae.getActionCommand();
//        
//        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
//        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
//        } else if (text.equals("Book Flight")) {
//            new BookFlight();
//        } else if (text.equals("Journey Details")) {
//            new JournetDetails();
//        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
//        } else if (text.equals("Boarding Pass")) {
//            new BoardingPass();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Home();
//    }
//}

//
//package airlinesmanagement;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener {
//    
//    public Home() {
//        // Set layout manager to BorderLayout
//        setLayout(new BorderLayout());
//
//        // Create and add a heading label
//        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU", JLabel.CENTER);
//        heading.setForeground(Color.BLUE);
//        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
//        add(heading, BorderLayout.NORTH);
//
//        // Create a panel for the menu buttons
//        JPanel menuPanel = new JPanel();
//        menuPanel.setLayout(new GridLayout(5, 2, 10, 10));
//        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//        // Add menu buttons to the panel
//        addMenuButton(menuPanel, "Flight Details");
//        addMenuButton(menuPanel, "Add Customer Details");
//        addMenuButton(menuPanel, "Book Flight");
//        addMenuButton(menuPanel, "Journey Details");
//        addMenuButton(menuPanel, "Cancel Ticket");
//        addMenuButton(menuPanel, "Boarding Pass");
//
//        // Add the menu panel to the center of the frame
//        add(menuPanel, BorderLayout.CENTER);
//
//        // Create a menu bar and add it to the frame
//        JMenuBar menubar = new JMenuBar();
//        setJMenuBar(menubar);
//
//        // Create the 'Details' menu and add it to the menu bar
//        JMenu details = new JMenu("Details");
//        menubar.add(details);
//
//        // Add menu items to the 'Details' menu and add action listeners to them
//        addMenuItem(details, "Flight Details");
//        addMenuItem(details, "Add Customer Details");
//        addMenuItem(details, "Book Flight");
//        addMenuItem(details, "Journey Details");
//        addMenuItem(details, "Cancel Ticket");
//
//        // Create the 'Ticket' menu and add it to the menu bar
//        JMenu ticket = new JMenu("Ticket");
//        menubar.add(ticket);
//
//        // Add menu item to the 'Ticket' menu and add action listener to it
//        addMenuItem(ticket, "Boarding Pass");
//
//        // Frame settings
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    
//    private void addMenuButton(JPanel panel, String text) {
//        JButton button = new JButton(text);
//        button.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        button.addActionListener(this);
//        panel.add(button);
//    }
//
//    private void addMenuItem(JMenu menu, String text) {
//        JMenuItem menuItem = new JMenuItem(text);
//        menuItem.addActionListener(this);
//        menu.add(menuItem);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String text = ae.getActionCommand();
//        
//        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
//        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
//        } else if (text.equals("Book Flight")) {
//            new BookFlight();
//        } else if (text.equals("Journey Details")) {
//            new JournetDetails();
//        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
//        } else if (text.equals("Boarding Pass")) {
//            new BoardingPass();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Home();
//    }
//}

//
//package airlinesmanagement;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener {
//    
//    public Home() {
//        // Set the layout to BorderLayout
//        setLayout(new BorderLayout());
//
//        // Load the image
//        ImageIcon icon = new ImageIcon("front.png");  // Make sure home.jpg is in the same folder as Home.java
//        Image image = icon.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
//        ImageIcon scaledIcon = new ImageIcon(image);
//        JLabel background = new JLabel(scaledIcon);
//        background.setLayout(new BorderLayout());
//        add(background);
//
//        // Create and add a heading label
//        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU", JLabel.CENTER);
//        heading.setForeground(Color.BLUE);
//        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
//        background.add(heading, BorderLayout.NORTH);
//
//        // Create a panel for the menu buttons
//        JPanel menuPanel = new JPanel();
//        menuPanel.setLayout(new GridLayout(5, 2, 10, 10));
//        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        menuPanel.setOpaque(false);  // Make panel transparent
//
//        // Add menu buttons to the panel
//        addMenuButton(menuPanel, "Flight Details");
//        addMenuButton(menuPanel, "Add Customer Details");
//        addMenuButton(menuPanel, "Book Flight");
//        addMenuButton(menuPanel, "Journey Details");
//        addMenuButton(menuPanel, "Cancel Ticket");
//        addMenuButton(menuPanel, "Boarding Pass");
//
//        // Add the menu panel to the center of the background label
//        background.add(menuPanel, BorderLayout.CENTER);
//
//        // Create a menu bar and add it to the frame
//        JMenuBar menubar = new JMenuBar();
//        setJMenuBar(menubar);
//
//        // Create the 'Details' menu and add it to the menu bar
//        JMenu details = new JMenu("Details");
//        menubar.add(details);
//
//        // Add menu items to the 'Details' menu and add action listeners to them
//        addMenuItem(details, "Flight Details");
//        addMenuItem(details, "Add Customer Details");
//        addMenuItem(details, "Book Flight");
//        addMenuItem(details, "Journey Details");
//        addMenuItem(details, "Cancel Ticket");
//
//        // Create the 'Ticket' menu and add it to the menu bar
//        JMenu ticket = new JMenu("Ticket");
//        menubar.add(ticket);
//
//        // Add menu item to the 'Ticket' menu and add action listener to it
//        addMenuItem(ticket, "Boarding Pass");
//
//        // Frame settings
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    
//    private void addMenuButton(JPanel panel, String text) {
//        JButton button = new JButton(text);
//        button.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        button.addActionListener(this);
//        panel.add(button);
//    }
//
//    private void addMenuItem(JMenu menu, String text) {
//        JMenuItem menuItem = new JMenuItem(text);
//        menuItem.addActionListener(this);
//        menu.add(menuItem);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String text = ae.getActionCommand();
//        
//        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
//        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
//        } else if (text.equals("Book Flight")) {
//            new BookFlight();
//        } else if (text.equals("Journey Details")) {
//            new JournetDetails();
//        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
//        } else if (text.equals("Boarding Pass")) {
//            new BoardingPass();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Home();
//    }
//}
//
//package airlinesmanagement;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener {
//    
//    public Home() {
//        // Set the layout to BorderLayout
//        setLayout(new BorderLayout());
//
//        // Create a panel for the main content
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        add(mainPanel, BorderLayout.CENTER);
//
//        // Create and add a heading label
//        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU", JLabel.CENTER);
//        heading.setForeground(Color.BLUE);
//        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
//        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
//        mainPanel.add(heading);
//
//        // Add some vertical spacing between heading and image
//        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
//
//        // Load and add the image
//        ImageIcon icon = new ImageIcon("front.png");  // Make sure home.jpg is in the same folder as Home.java
//        Image image = icon.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
//        ImageIcon scaledIcon = new ImageIcon(image);
//        JLabel imageLabel = new JLabel(scaledIcon);
//        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        mainPanel.add(imageLabel);
//
//        // Add some vertical spacing between image and menu panel
//        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
//
//        // Create a panel for the menu buttons
//        JPanel menuPanel = new JPanel();
//        menuPanel.setLayout(new GridLayout(5, 2, 10, 10));
//        menuPanel.setOpaque(false);  // Make panel transparent
//        mainPanel.add(menuPanel);
//
//        // Add menu buttons to the panel
//        addMenuButton(menuPanel, "Flight Details");
//        addMenuButton(menuPanel, "Add Customer Details");
//        addMenuButton(menuPanel, "Book Flight");
//        addMenuButton(menuPanel, "Journey Details");
//        addMenuButton(menuPanel, "Cancel Ticket");
//        addMenuButton(menuPanel, "Boarding Pass");
//
//        // Create a menu bar and add it to the frame
//        JMenuBar menubar = new JMenuBar();
//        setJMenuBar(menubar);
//
//        // Create the 'Details' menu and add it to the menu bar
//        JMenu details = new JMenu("Details");
//        menubar.add(details);
//
//        // Add menu items to the 'Details' menu and add action listeners to them
//        addMenuItem(details, "Flight Details");
//        addMenuItem(details, "Add Customer Details");
//        addMenuItem(details, "Book Flight");
//        addMenuItem(details, "Journey Details");
//        addMenuItem(details, "Cancel Ticket");
//
//        // Create the 'Ticket' menu and add it to the menu bar
//        JMenu ticket = new JMenu("Ticket");
//        menubar.add(ticket);
//
//        // Add menu item to the 'Ticket' menu and add action listener to it
//        addMenuItem(ticket, "Boarding Pass");
//
//        // Frame settings
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    
//    private void addMenuButton(JPanel panel, String text) {
//        JButton button = new JButton(text);
//        button.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        button.addActionListener(this);
//        panel.add(button);
//    }
//
//    private void addMenuItem(JMenu menu, String text) {
//        JMenuItem menuItem = new JMenuItem(text);
//        menuItem.addActionListener(this);
//        menu.add(menuItem);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String text = ae.getActionCommand();
//        
//        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
//        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
//        } else if (text.equals("Book Flight")) {
//            new BookFlight();
//        } else if (text.equals("Journey Details")) {
//            new JournetDetails();
//        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
//        } else if (text.equals("Boarding Pass")) {
//            new BoardingPass();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Home();
//    }
//}

package airlinesmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    
    public Home() {
        // Set the layout to BorderLayout
        setLayout(new BorderLayout());

        // Create a panel for the main content
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(mainPanel, BorderLayout.CENTER);

        // Create and add a heading label
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU", JLabel.CENTER);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(heading);

        // Add some vertical spacing between heading and image
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Load and add the image
        ImageIcon icon = new ImageIcon(getClass().getResource("front.png"));  // Use getResource to load the image
        Image image = icon.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(imageLabel);

        // Add some vertical spacing between image and menu panel
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Create a panel for the menu buttons
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(5, 2, 10, 10));
        menuPanel.setOpaque(false);  // Make panel transparent
        mainPanel.add(menuPanel);

        // Add menu buttons to the panel
        addMenuButton(menuPanel, "Flight Details");
        addMenuButton(menuPanel, "Add Customer Details");
        addMenuButton(menuPanel, "Book Flight");
        addMenuButton(menuPanel, "Journey Details");
        addMenuButton(menuPanel, "Cancel Ticket");
        addMenuButton(menuPanel, "Boarding Pass");

        // Create a menu bar and add it to the frame
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        // Create the 'Details' menu and add it to the menu bar
        JMenu details = new JMenu("Details");
        menubar.add(details);

        // Add menu items to the 'Details' menu and add action listeners to them
        addMenuItem(details, "Flight Details");
        addMenuItem(details, "Add Customer Details");
        addMenuItem(details, "Book Flight");
        addMenuItem(details, "Journey Details");
        addMenuItem(details, "Cancel Ticket");

        // Create the 'Ticket' menu and add it to the menu bar
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);

        // Add menu item to the 'Ticket' menu and add action listener to it
        addMenuItem(ticket, "Boarding Pass");

        // Frame settings
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void addMenuButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Tahoma", Font.PLAIN, 18));
        button.addActionListener(this);
        panel.add(button);
    }

    private void addMenuItem(JMenu menu, String text) {
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.addActionListener(this);
        menu.add(menuItem);
    }

    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JournetDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }
    }
    
    public static void main(String[] args) {
        new Home();
    }
}
