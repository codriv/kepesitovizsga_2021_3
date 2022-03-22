package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null || contacts == null) {
            throw new IllegalArgumentException("Parameter is null!");
        }
        List<String> entries = new ArrayList<>();
        for (Map.Entry entry: contacts.entrySet()) {
            entries.add(entry.getKey() + ": " + entry.getValue());
        }
        try {
            Files.write(Path.of(output), entries);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!");
        }
    }
}
