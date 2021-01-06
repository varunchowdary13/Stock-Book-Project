package StockBookPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map.Entry;

public class DataWriterReaderClass {
	final static String pestOutputFilePath = "D://Java Projects//Stock register files//pest_stock_book.txt";
	final static String fertOutputFilePath = "D://Java Projects//Stock register files//fert_stock_book.txt";
	
//----------------      pest Methods     ------------------//
	void pestUploadMethod(HashMap<String,Integer> hm) {
		File file = new File(pestOutputFilePath);
		BufferedWriter bf = null;
		
		try {
			
			bf = new BufferedWriter(new FileWriter(file));
			
			for(Entry<String, Integer> entry: hm.entrySet()) {
				 bf.write( entry.getKey() + ":" + entry.getValue() );
				 bf.newLine();
			}
			bf.flush();
		}catch(Exception e) {
			System.out.println("You got this Exception while writing data to the file.");
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			}catch(Exception e) {
				System.out.println("You got this Exception while closing buffered writer");
			}
		}
		
	}
	
	HashMap<String,Integer> pestDownloadMethod() {
		
		HashMap<String,Integer> tempMap = new HashMap<String,Integer>();
		BufferedReader br = null;
		
		try {
			File file = new File(pestOutputFilePath);
			
			br = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				String[] parts = line.split(":");
				String name = parts[0].trim();
				Integer number  = Integer.parseInt(parts[1].trim());
				if(!name.equals("") && !number.equals("")) {
					tempMap.put(name, number);
				}
			}
			
		}catch(Exception e){
            e.printStackTrace();
        }finally{
            
            //Always close the BufferedReader
            if(br != null){
                try { 
                    br.close(); 
                }catch(Exception e){};
            }
        }
		
		return tempMap;
	}
	
	
//-------------------     fert Methods      ---------------------//
	void fertUploadMethod(HashMap<String,Integer> hm) {
		File file = new File(fertOutputFilePath);
		BufferedWriter bf = null;
		
		try {
			
			bf = new BufferedWriter(new FileWriter(file));
			
			for(Entry<String, Integer> entry: hm.entrySet()) {
				 bf.write( entry.getKey() + ":" + entry.getValue() );
				 bf.newLine();
			}
			bf.flush();
		}catch(Exception e) {
			System.out.println("You got this Exception while writing data to the file.");
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			}catch(Exception e) {
				System.out.println("You got this Exception while closing buffered writer");
			}
		}
		
	}
	
	HashMap<String,Integer> fertDownloadMethod() {
		
		HashMap<String,Integer> tempMap = new HashMap<String,Integer>();
		BufferedReader br = null;
		
		try {
			File file = new File(fertOutputFilePath);
			
			br = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				String[] parts = line.split(":");
				String name = parts[0].trim();
				Integer number  = Integer.parseInt(parts[1].trim());
				if(!name.equals("") && !number.equals("")) {
					tempMap.put(name, number);
				}
			}
			
		}catch(Exception e){
            e.printStackTrace();
        }finally{
            
            //Always close the BufferedReader
            if(br != null){
                try { 
                    br.close(); 
                }catch(Exception e){};
            }
        }
		
		return tempMap;
	}
}
