package se.lexicon.g34.bl.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.font.TrueTypeFont;

import java.util.Scanner;

@Component ("ScannerInputService")
public class ScannerInputService implements UserInputService {

    private Scanner scanner=new Scanner(System.in );

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt(){
    int number = 0;
    boolean validNumber = false;
        while(!validNumber){
        try{
            number = Integer.parseInt(getString().trim());
            validNumber = true;
        }catch (NumberFormatException ex){
            System.out.println("Not a integer");
        }
        if(!validNumber){
            System.out.println("Try again");
        }}
        return number;
    }
}
