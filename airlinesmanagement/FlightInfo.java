
package airlinesmanagement;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame {
    
    public FlightInfo() {
        // Set the background color and layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Title Label
        JLabel title = new JLabel("Flight Information", JLabel.CENTER);
        title.setFont(new Font("Tahoma", Font.BOLD, 24));
        title.setForeground(Color.BLUE);
        add(title, BorderLayout.NORTH);

        // Table to display flight information
        JTable table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        table.setRowHeight(30);
        table.setSelectionBackground(Color.LIGHT_GRAY);

        // Fetch data from the database and populate the table
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Scroll pane for the table
        JScrollPane jsp = new JScrollPane(table);
        add(jsp, BorderLayout.CENTER);

        // Frame settings
        setSize(1000, 600);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlightInfo();
    }
}
