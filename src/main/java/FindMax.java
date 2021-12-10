import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.Scanner;


public class FindMax {
        //ლოგერრის გამოზახება
        private static final Logger logger= LoggerFactory.getLogger(FindMax.class);

        //კითხულობს ფაილიდან ჩაწერილ ინფორმაციას პოულობს მაქსიმუმს და წერს ფაილში
        public static void fileInputOutput() {
            try {

                //ფაილიდან წაკითხვა
                Scanner file = new Scanner(new File("src/main/resources/data1.txt"));
                int MaxNum = file.nextInt();

                //მაქსიმუმის პოვნა
                while(file.hasNextInt()) {
                    int number = file.nextInt();

                    if(number > MaxNum) {
                        MaxNum = number;
                    }

                    System.out.println(number);
                }
                file.close();

                //ფაილში ჩაწერა
                BufferedWriter br = new BufferedWriter(new FileWriter("src/main/resources/data1.txt",true));
                br.write("\n"+ MaxNum);
                br.close();


                //გამოთვლილი საშუალოს დალოგვა წარმატებით შესრულების შემთხვევაში
                logger.trace("max is: " + MaxNum );
            } catch (Exception ex) {
                //შეცდომის დალოგვა
                System.out.println(ex.getMessage());
                logger.error("Error during reading system input", ex);
            }

        }
    }

