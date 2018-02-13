package com.fileIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.LinkedList;

public class StudentBook {

    public StudentBook(LinkedList<Student> _students) throws IOException {

        Path path = Paths.get("D:\\LearningJavaFun\\students.txt");

        for(Student student : _students){
            boolean fileExists = Files.exists(path);
            // Write student info to the students.txt file
            Files.write(path, Arrays.asList(student.toString()), StandardCharsets.UTF_8,
                    fileExists ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        }
    }

}
