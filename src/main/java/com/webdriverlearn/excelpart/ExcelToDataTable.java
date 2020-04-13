package com.webdriverlearn.excelpart;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.webdriverlearn.excelutils.ExcelReader;

import cucumber.api.DataTable;
import cucumber.api.Transformer;
import cucumber.runtime.ParameterInfo;
import cucumber.runtime.table.TableConverter;
import cucumber.runtime.xstream.LocalizedXStreams;
import gherkin.formatter.model.Comment;
import gherkin.formatter.model.DataTableRow;

public class ExcelToDataTable extends Transformer<DataTable>{

	@Override
	public DataTable transform(String filePath) {
		// TODO Auto-generated method stub
		
		ExcelReader reader=new ExcelReader.ExcelReaderBuilder().setFileLocation(filePath).setSheet(0).build();
		List<List<String>> excelData=new LinkedList<>();
		try {
			excelData=reader.getSheetDataAt();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		    throw new RuntimeException(e.getMessage());
		}
			
		
		int line=1;
		List<DataTableRow> listDR=new LinkedList<>();
		
		for(List<String> li:excelData)
		{
			
			Comment comment=new Comment(line+"",line++);
			DataTableRow dtr=new DataTableRow(Arrays.asList(comment),li,line);
			listDR.add(dtr);
		}
		
		ParameterInfo parameterInfo = new ParameterInfo(null, null, null, null);
	    TableConverter tableConverter = new TableConverter(new LocalizedXStreams(Thread.currentThread().getContextClassLoader()).get(Locale.getDefault()), parameterInfo);
		DataTable table=new DataTable(listDR, tableConverter);
	    return table;
	}

}
