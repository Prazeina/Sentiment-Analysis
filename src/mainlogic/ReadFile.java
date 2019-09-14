
package mainlogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

	 public boolean readNegativeWords(String word) {
	        BufferedReader in = null;
	        boolean flag = false;
//		        System.out.println("Read File negative word: "+word);
	        try {

	            in = new BufferedReader(new FileReader("negative_word.txt"));
	            flag = readFile(in, word);
	        } catch (Exception e) {
	            e.printStackTrace();

	        } finally {
	            try {
	                in.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }

	        return flag;
	    }

	    public boolean readPositiveWords(String word) {
	        BufferedReader in = null;
	        boolean flag = false;
	//System.out.println("ReadFile PositiveWord: " + word);
	        try {
	            in = new BufferedReader(new FileReader("positive_word.txt"));
	            flag = readFile(in, word);
	        } catch (Exception e) {
	            e.printStackTrace();

	        } finally {
	            try {
	                in.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }

	        return flag;
	    }

	    public boolean readnegationWords(String word) {
	        BufferedReader in = null;
	        boolean flag = false;
	//System.out.println("ReadFile PositiveWord: " + word);
	        try {
	            in = new BufferedReader(new FileReader("negation_word.txt"));
	            flag = readFile(in, word);
	        } catch (Exception e) {
	            e.printStackTrace();

	        } finally {
	            try {
	                in.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }

	        return flag;
	    }

	    private boolean readFile(BufferedReader bufferedReader, String word) {
	        String line;
	        boolean flag = false;

	        try {
	            while ((line = bufferedReader.readLine()) != null) {
//					System.out.println("POSITIVE: "+line);
	                String[] arr = line.split(" ");

	                for (String ss : arr) {
	                    if (ss.matches(word)) {
	                        flag = true;
	                    }
	                }
	            }
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            try {
	                bufferedReader.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }

	        return flag;
	    }
}



