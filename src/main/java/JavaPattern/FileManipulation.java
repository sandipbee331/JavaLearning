package JavaPattern;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import testcases.Login;

import com.opencsv.CSVReaderBuilder;
//import com.opencsv.CSVWriterBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.HashMap;

public class FileManipulation extends Login {

	
	  public  void extractColumn() throws InterruptedException {
	 
	//public static void main(String[] args) {
		long nowTime = new Date().getTime();

		String csvFile1 = System.getProperty("user.dir") + "\\Unprocessed\\" + "export.csv";
		String csvFile2 = System.getProperty("user.dir") + "\\Unprocessed\\" + "export (1).csv";
		String combinedCsvFile = System.getProperty("user.dir") + "\\Unprocessed\\" + "semiProcessed" + ".csv";
		String processedFile = System.getProperty("user.dir") + "\\Processed\\" + nowTime  + ".csv";
		int[] columnsToExtract1 = { 3, 5,10,18,19,28 }; // for the ATC sample file
		int[] columnsToExtract2 = { 3, 5, 10,18,19,28 }; // Specify the column indices to extract from the second file

		try {
			List<String[]> dataFromCsv1 = extractColumns(csvFile1, columnsToExtract1);
			List<String[]> dataFromCsv2 = extractColumns1(csvFile2, columnsToExtract2);

			dataFromCsv1 = circleUpdation(dataFromCsv1);
			dataFromCsv2 = circleUpdation(dataFromCsv2);

			//dataFromCsv1 = addExtraColumn(dataFromCsv1, "Alarm Name", "4G Outage");
		//	dataFromCsv2 = addExtraColumn(dataFromCsv2, "Alarm Name", "4G Outage");

			List<String[]> combinedData = new ArrayList<>(dataFromCsv1);
			combinedData.addAll(dataFromCsv2);
			// circleUpdation(combinedData);
			writeCombinedDataToCsv(combinedData, combinedCsvFile);
			Thread.sleep(5000);
	// writeCombinedDataToCsv(combinedData, combinedCsvFile, "Alarm Name", "4G Outage");
	// writeCombinedDataToCsv1(combinedData, combinedCsvFile, "Alarm Name", "4G Outage");
			System.out.println("Combination completed successfully.");
			addColumn(combinedCsvFile,processedFile, "Alarm Name", "4G Outage");
			//deleteProcessedFile();
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static List<String[]> extractColumns(String filePath, int[] columnsToExtract) throws IOException {
		List<String[]> extractedData = new ArrayList<>();

		Reader reader = new FileReader(filePath);
		CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL);

		for (CSVRecord record : csvParser) {
			String[] extractedRow = new String[columnsToExtract.length];
			for (int i = 0; i < columnsToExtract.length; i++) {
				int columnIndex = columnsToExtract[i];
				if (columnIndex >= 0 && columnIndex < record.size()) {
					extractedRow[i] = record.get(columnIndex);
				} else {
					extractedRow[i] = "";
				}
			}
			extractedData.add(extractedRow);
		}

		csvParser.close();
		return extractedData;
	}

	// for csv2 without header

	private static List<String[]> extractColumns1(String filePath, int[] columnsToExtract) throws IOException {
		List<String[]> extractedData = new ArrayList<>();

		Reader reader = new FileReader(filePath);
		CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL);
		boolean skipHeader = true;
		for (CSVRecord record : csvParser) {
			if (skipHeader) {
				skipHeader = false; // Skip the first row (header)
				continue;
			}
			String[] extractedRow = new String[columnsToExtract.length];
			for (int i = 0; i < columnsToExtract.length; i++) {
				int columnIndex = columnsToExtract[i];
				if (columnIndex >= 0 && columnIndex < record.size()) {
					extractedRow[i] = record.get(columnIndex);
				} else {
					extractedRow[i] = "";
				}
			}
			extractedData.add(extractedRow);
		}

		csvParser.close();
		return extractedData;
	}

	
	  private static void writeCombinedDataToCsv(List<String[]> data, String
	  filePath) throws IOException 
	  { 
		  FileWriter writer = new FileWriter(filePath);
	   	  CSVPrinter csvPrinter = new CSVPrinter( writer, CSVFormat.DEFAULT);
	  
	  // Write the combined header 
	   	  // csvPrinter.printRecord(header);
	  
	  // Write the combined data for  
	  for  (String[] row : data) {
	  csvPrinter.printRecord((Object[]) row);
	  }
	  
	  csvPrinter.close(); 
	  }
	 
	

	// Replace the circle name with its abbreviation
	public static List<String[]> circleUpdation(List<String[]> data) {
		System.out.println("Hello");
		HashMap<String, String> mapCircle = new HashMap<String, String>();
		mapCircle.put("Madhya Pradesh", "MPCG");
		mapCircle.put("Karnataka", "KTK");
		mapCircle.put("Delhi", "DL");
		mapCircle.put("Maharashtra", "MH");
		mapCircle.put("NorthEast", "ANE");
		mapCircle.put("Telangana", "AP");
		mapCircle.put("Punjab", "PUN");
		mapCircle.put("Jammu", "JK");
		mapCircle.put("Uttar Pradesh (East)", "UPE");
		mapCircle.put("Odisha", "OR");
		mapCircle.put("Mumbai", "MUM");
		mapCircle.put("Chhattisgarh", "MPCG");
		mapCircle.put("Rajasthan", "RAJ");
		mapCircle.put("Bihar", "BNJ");
		mapCircle.put("Andhra Pradesh", "AP");
		mapCircle.put("Gujarat", "GUJ");
		mapCircle.put("Himachal Pradesh", "HP");
		mapCircle.put("Kolkata", "WB");
		mapCircle.put("Haryana", "HR");
		mapCircle.put("Tamil Nadu", "TN");
		mapCircle.put("Jharkhand", "BNJ");
		mapCircle.put("Kashmir", "JK");
		mapCircle.put("Assam", "ANE");
		mapCircle.put("Uttar Pradesh (West)", "UPW");
		mapCircle.put("West Bengal", "WB");
		mapCircle.put("Uttarakhand", "UPW");
		mapCircle.put("Kerala", "KL");

		for (String[] row : data) {
			String originalValue = row[0]; // Assuming the first column contains the value to be replaced
			if (mapCircle.containsKey(originalValue)) {
				row[0] = mapCircle.get(originalValue); // Replace the value with the corresponding mapped value
			}
		}
		return data;
	}

	
			public static void addColumn(String inputFile, String outputFile,String columnHeader, String columnValue)
			{
				// String inputFile = "F:\\Code_workSpace\\testingProject\\Datafiles\\1697613148567.csv"; // Replace with your input CSV file path
			      //  String outputFile = "F:\\Code_workSpace\\testingProject\\Datafiles\\columnAdded1pp.csv"; // Replace with your output CSV file path
			        String newColumnName = "NewColumn";
			        List<String> newColumnData = new ArrayList<>();

			        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
			             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

			            List<String[]> lines = reader.readAll();
			         
			            String[] headers = lines.get(0);
			            System.out.println(headers);

			            // Append the new column header
			            String[] newHeaders = new String[headers.length + 1];
			            System.arraycopy(headers, 0, newHeaders, 0, headers.length);
			            newHeaders[headers.length] = columnHeader;
			            writer.writeNext(newHeaders);

			            // Generate or collect data for the new column
			            for (int i = 1; i < lines.size(); i++) {
			                String newCellValue = columnValue; // Replace with your data source
			                newColumnData.add(newCellValue);
			            }

			            // Append data to the new column
			            for (int i = 1; i < lines.size(); i++) 
			            {
			                String[] rowData = lines.get(i);
			                String[] newRowData = new String[rowData.length + 1];
			                System.arraycopy(rowData, 0, newRowData, 0, rowData.length);
			                newRowData[rowData.length] = newColumnData.get(i - 1);
			                writer.writeNext(newRowData);
			            }

			            System.out.println("New column appended successfully.");

			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			}
	
	
	
	
	
	
	
	
	
	
}
