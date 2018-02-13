package com.fileIO;

import java.io.IOException;
import java.util.LinkedList;

public class FileIO {

    public static void main(String[] args) throws IOException {

        /* Student & StudentBook example */
        StudentBook book = new StudentBook();
        book.createNewStudentsList();
        book.saveStudentsToFile();
        LinkedList<Student> temp = book.getStudentsFromFile();
        for(Student student : temp){
            System.out.println(student.toString());
        }

        /* NO. 1 */
        /* This will append to an existing file, it will NOT create a new file if the file is not found */
        /* If the file is not found there will be a NoSuchFileException thrown */
        /*
        Path path = Paths.get("D:\\LearningJavaFun\\temp.txt");
        Files.write(path, "append\n".getBytes(), StandardOpenOption.APPEND);
        */

        /* NO. 2 */
        /* This is the same as NO. 1 but it does a new line at the end */
        /*
        Path path = Paths.get("D:\\LearningJavaFun\\temp.txt");
        Files.write(path, Arrays.asList("Append with new line"), StandardCharsets.UTF_8,
                StandardOpenOption.APPEND);
        */

        /* NO. 3 */
        /* Same as NO 1&2. But this one creates the file if the Paths.get() does not detect the file at said path */
        /*
        Path path = Paths.get("D:\\LearningJavaFun\\ass.txt");
        boolean fileExists = Files.exists(path);
        Files.write(path, Arrays.asList("Cold as ice"), StandardCharsets.UTF_8,
                fileExists ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        */

        /* NO. 4 */
        /* Creates file but does not append over existing, overwrites existing data inside file */
        /*
        PrintWriter out = new PrintWriter("D:\\LearningJavaFun\\temp.txt");
        out.println("What.exe.what");
        out.close();
        */
    }

}
