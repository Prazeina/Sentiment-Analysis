
package mainlogic;

import java.util.Scanner;


public class NaiveBayesAlgorithm {

    public NaiveBayesAlgorithm(String abc) {
        this.abc = abc;
    }
    
    String abc;

    ReadFile file = new ReadFile();
    public int positiveCount;
    public int negativeCount;
    public void naiveBayes() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Word");
//        String name = sc.nextLine();
        //remove the stop word
        
        String name=abc;
        
        name = name.toLowerCase();
        
        if(name!=null) {
        	name = RemovePunctuation.removeStopWord(name);
        	
        
        boolean flag = false;
        
        String[] arr = name.split(" ");
        		

        
        for (String ss : arr) {
        	
  
            if (file.readnegationWords(ss)) {
                flag = true;
//                RemovePunctuation.removeStopWord(ss);
                String[] arr1 = name.split(" ");
//                System.out.println("Split :"+ss);
                for (String string : arr1) {
                	
//                	RemovePunctuation.removeStopWord(string);
                	
                    if (file.readNegativeWords(string)) {
                    	positiveCount++;
//                        System.out.println("Positive Sentence");
                    } else if (file.readPositiveWords(string)) {
                    	negativeCount++;
//                        System.out.println("Negative Sentence");
                    }
                }


            } else {
//            	RemovePunctuation.removeStopWord(ss);
                if (!flag) {
                    flag = false;
                    if (file.readNegativeWords(ss)) {
                    	negativeCount++;
//                        System.out.println("Negative Sentence"+file.readNegativeWords(ss));
                    } else if (file.readPositiveWords(ss)) {
                    	positiveCount++;
//                        System.out.println("Positive Sentence");
                    }
                }
            }

        }
        }

//        
//        System.out.println(result + "%");
//        System.out.println("positive word: "+positiveCount);
//        System.out.println("Negative Word: "+negativeCount);
    }

    int countWord(boolean... vars) {
        int count = 0;
        for (boolean var : vars) {
            count += (var ? 1 : 0);
        }
        return count;
    }
}


