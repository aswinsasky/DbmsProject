/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;
import dao.PharmacyUtils;

/**
 * This class is responsible for opening a PDF file based on an ID.
 * It uses the PharmacyUtils class for the billPath.
 * 
 * @author AKHIL JOSEPH
 */
public class OpenPdf {
    
    /**
     * Opens a PDF file based on the provided ID.
     * 
     * @param id The ID used to construct the file path.
     */
    public static void openById(String id) {
        try {
            // Construct the file path using the billPath from PharmacyUtils and the provided ID.
            String filePath = PharmacyUtils.billPath + id + ".pdf";
            
            // Check if the file exists.
            if (new File(filePath).exists()) {
                // If the file exists, open it using the default program associated with PDF files.
                Desktop.getDesktop().open(new File(filePath));
            } else {
                // If the file doesn't exist, show a message.
                JOptionPane.showMessageDialog(null, "File doesn't exist");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during the process.
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
/**
 *
 * @author AKHIL JOSEPH
 */

