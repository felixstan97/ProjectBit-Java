package it.bit.gestionalecorsi.esercizioDati;

import it.bit.gestionalecorsi.entities.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvParser  {

    private Path percorsoFile;

    public CsvParser(Path percorsoFile){
        this.percorsoFile = percorsoFile;
    }

    public Iterable<Enrollment> read() throws IOException {
        List<Enrollment> le = new ArrayList<>();
        //fileReader sa leggere un carattere alla volta
        //bufferedReader sa leggere l' acapo e legge una riga alla volta
        try (BufferedReader br = new BufferedReader(new FileReader(percorsoFile.toFile()))) {

            String line;

            while ( (line = br.readLine()) != null){
                String[] tokens = line.split(",");
                Student st = new Student();
                st.setFirstName(tokens[0].trim());
                st.setLastName(tokens[1].trim());
                st.setGender(tokens[2].trim().equals("m") ? Gender.MALE : Gender.FEMALE);

                Enrollment en = new Enrollment();
                en.setStudent(st);
                LocalDate date = LocalDate.parse(tokens[3].trim());
                en.setEnrollDate(date);

                CourseEdition c1 = new CourseEdition();
                c1.setId(Integer.parseInt(tokens[4].trim()));

                Course course = new Course();
                course.setName(tokens[5].trim());
                c1.setCourse(course);

                en.setPayed(tokens[6] == "true"? true : false);

                en.setGrade(Double.parseDouble(tokens[7].trim()));

                le.add(en);
            }
        }
        return le;
    }
}
