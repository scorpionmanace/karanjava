package cs298project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class CsvParser {
	private String filePath;
	private String line;
	private final String csvSplitBy=",";
	private Map<String,List<String>> contents=new HashMap<String,List<String>>();
	private BufferedReader br=null;
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String parse(String filePath) throws IOException{
		br=new BufferedReader(new FileReader(filePath));
		line=br.readLine();
		
		while((line=br.readLine())!=null){
			String[] row=line.split(csvSplitBy);
		}
		
//		List<String> columnValue=new ArrayList<String>();
		
		return "";
	}
	public static void main(String p[]){
		
	}
	
}
