import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javafx.scene.control.Alert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basharat Ali
 */
public class BtnHndMainMenu implements ActionListener
{
    Search search = new Search();
    QuranPointers pointer = new QuranPointers();

    MainMenu menu;
    public BtnHndMainMenu(MainMenu menu)
    {
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equalsIgnoreCase("Search Parah"))
        {
            System.out.println(menu.parahNumField.getText());
            search.SearchByParahNumber(parseInt(menu.parahNumField.getText()) - 1);
            
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Invalid Input");
//            alert.setHeaderText("Invalid Input");
//            alert.setContentText("MSG");
//            alert.showAndWait();
        } 
        else
        if(e.getActionCommand().equalsIgnoreCase("Search Surah "))
        {
            search.SearchBySurahNumber(parseInt(menu.surahNumField.getText()) - 1);
        } 
        else
        if(e.getActionCommand().equalsIgnoreCase("Search Surah"))
        {
            search.SearchBySurahName(menu.surahNameField.getText());
        } 
        else
        if(e.getActionCommand().equalsIgnoreCase("Search Ayat"))
        {
            search.SearchByAyatNumber(parseInt(menu.ayatNumField.getText()), parseInt(menu.ayatNumField2.getText()) - 1);
        } 
        else
        if(e.getActionCommand().equalsIgnoreCase("Search String"))	
        {
            search.searchByString(menu.stringField.getText());
        }
        else
        if(e.getActionCommand().equalsIgnoreCase("Exit"))	
        {
            System.exit(0);
        }   
    }
}
