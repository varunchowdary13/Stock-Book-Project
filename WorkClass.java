package StockBookPack;


import java.util.HashMap;



public class WorkClass {
	
	static DataWriterReaderClass dataW_R = new DataWriterReaderClass();
	
	@SuppressWarnings("unchecked")
	HashMap<String,Integer> pestStockBook = (HashMap<String,Integer>) dataW_R.pestDownloadMethod().clone();
	@SuppressWarnings("unchecked")
	HashMap<String,Integer> fertStockBook = (HashMap<String,Integer>) dataW_R.fertDownloadMethod().clone();
	
	
		

	
	
	
	
	 
	
//--------------    View Stock Methods    -------------------//
	int viewPestStock(String s) {
		
		return pestStockBook.get(s);
		
	}
	
	int viewFertStock(String s) {
		
		return fertStockBook.get(s);
	}
//--------------    Sell Stock Methods    -------------------//	
	int sellPestStock(String s,Integer i) {
		
		int dup = pestStockBook.get(s) - i;
		pestStockBook.put(s, dup);
		dataW_R.pestUploadMethod(pestStockBook);
		return dup;
	}
	
	int sellFertStock(String s,Integer i) {
		int dup = fertStockBook.get(s) - i;
		fertStockBook.put(s, dup);
		dataW_R.fertUploadMethod(fertStockBook);
		return dup;
	}
//--------------    Enter Stock Methods    -------------------//	
	int enterPestStock(String s, Integer i) {
		if (pestStockBook.containsKey(s)) {
			int dup = pestStockBook.get(s) + i;
			pestStockBook.put(s, dup);
			dataW_R.pestUploadMethod(pestStockBook);
			return dup;
		}else {
			pestStockBook.put(s, i);
			dataW_R.pestUploadMethod(pestStockBook);
			return i;
		}
		
		
		
		
	}
	
	int enterFertStock(String s, Integer i) {
		if (fertStockBook.containsKey(s)) {
			int dup = fertStockBook.get(s) + i;
			fertStockBook.put(s, dup);
			dataW_R.fertUploadMethod(fertStockBook);
			return dup;
		}else {
			fertStockBook.put(s, i);
			dataW_R.fertUploadMethod(fertStockBook);
			return i;
		}
	}



}
