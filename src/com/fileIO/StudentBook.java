package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentBook {

    private LinkedList<Student> students;

    public StudentBook() {
        students = new LinkedList<>();
    }

    public void createNewStudentsList() {
        if(!students.isEmpty())
            students.clear(); // Clear the current list

        // Fill the list with students based on input
        Scanner reader = new Scanner(System.in);

        // Register students
        while(true){
            System.out.println("Name then enter, then GPA, Q to quit");
            String name = reader.nextLine();
            if(name.toLowerCase().equals("q")){
                break;
            }
            String gpa = reader.nextLine();
            if(gpa.toLowerCase().equals(("q"))){
                break;
            }

            Student newStudent = new Student(name, Double.parseDouble(gpa));
            students.add(newStudent);
        }
    }

    public void saveStudentsToFile() throws  IOException{
        Path path = Paths.get("D:\\LearningJavaFun\\students.txt");

        for(Student student : students){
            boolean fileExists = Files.exists(path);
            // Write student info to the students.txt file
            Files.write(path, Arrays.asList(student.toString()), StandardCharsets.UTF_8,
                    fileExists ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        }
    }

    public LinkedList<Student> getStudentsFromFile() throws IOException {
        LinkedList<Student> _students = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader("D:\\LearningJavaFun\\students.txt"));
        String line;
        while((line = br.readLine()) != null){
            // Format:
            // Name: xxx, GPA: xxx
            // 012345
            // Get the index values for formatting the line
            int commaIndex = line.indexOf(',');
            int nameStartIndex = 5; // At this index until the commaIndex the name is represented
            int gpaStartIndex = commaIndex+6; // At this index the gpa is represented

            // Get the student info, create student and push it into the return list
            String name = line.substring(nameStartIndex, commaIndex);
            double gpa = Double.parseDouble(line.substring(gpaStartIndex, line.length()));
            Student student = new Student(name, gpa);
            _students.add((student));
        }

        return _students;
    }
}
