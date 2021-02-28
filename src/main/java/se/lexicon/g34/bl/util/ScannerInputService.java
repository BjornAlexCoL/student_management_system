package se.lexicon.g34.bl.util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component ("ScannerInputService")
public class ScannerInputService implements UserInputService {
    private Scanner scanner=new Scanner(System.in );
    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;
    }
}
