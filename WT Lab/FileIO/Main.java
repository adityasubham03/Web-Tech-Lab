import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Demonstration of fileoutput stream
        DataInputStream d = new DataInputStream(System.in); // DataInputStream is used to take input from user from
                                                            // keyboard
        FileOutputStream fout = new FileOutputStream("abc.txt", true);// Used to create a file output stream and if the
                                                                      // file is not there it creates a new file.
        System.out.println("Enter @ to end");
        char ch;
        while ((ch = (char) d.read()) != '@') { // here d.read is used to take input and then explicitly typecasted to
                                                // type char and store it in ch
            fout.write(ch); // Used to write it to the file
        }
        fout.close();// To commit the changes to the file




        // Reading files using FileInputStream
        FileInputStream fin = new FileInputStream("abc.txt"); // Initializes FileInputStream
        int i=0;

        do{
            i=fin.read(); //Read file byte by byte
            if(i!=-1) System.out.println((char)i); //Prints the character by converting it to char -- if you print it without typecasting it will print the ascii value of the byte recieved if the byte contains a it will print 97.
        } while (i != -1); //If it reaches the end of file(EOF) then it returns -1 that is our termination condition
        fin.close(); // Always close the stream to save/ avoiding resource leak





        //Demonstration of file-writer
        String name = "Aditya Choudhury";
        FileWriter fout1 = new FileWriter("abc.txt",true);
        for(i=0;i<name.length();i++)
            fout1.write(name.charAt(i));
        fout1.close();



        int ch1;
        //Demonstration of file-reader
        FileReader fin1 = new FileReader("abc.txt");
        while ((ch1 = fin1.read()) != -1) {
            System.out.print((char)ch1);
        }
        fin1.close();





        try {
            // create a FileReader and BufferedReader to read from the input file
            FileReader fileReader = new FileReader("abc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // create a FileWriter and BufferedWriter to write to the output file
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // read each line of text from the input file and write it to the output file
            String line;
            System.out.println("The lines are:- ");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // close the input and output streams
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



//Input Stream, Output Stream, File reader, File writer, BufferReader, BufferWriter