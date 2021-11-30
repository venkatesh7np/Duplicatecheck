package StudentRecords;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;


public class Excel
{
    public static void main(String[] args) throws IOException, BiffException, JSONException
    {
        File f = new File("D:\\Atmecs\\Assignments\\Records.xls");
        FileInputStream fis = new FileInputStream(f);
        Workbook w = Workbook.getWorkbook(fis);
        Sheet s = w.getSheet("Sheet1");

        FileWriter MyWriter = new FileWriter("D:\\Atmecs\\Assignments\\RecordsData22.json");
        for (int j = 1; j < s.getRows(); j++)
        {
            JSONObject obj = new JSONObject();
            // MyWriter.write(String.valueOf(obj.put(s.getCell(0, 0).getContents() +"/"+ s.getCell(1, 0).getContents()+"/" + s.getCell(2, 0).getContents(), s.getCell(0, j).getContents()+"/"+s.getCell(1,j).getContents()+"/"+s.getCell(2,j).getContents())));
            obj.put(s.getCell(0, 0).getContents(), s.getCell(0, j).getContents());
            obj.put(s.getCell(1, 0).getContents(), s.getCell(1, j).getContents());
            obj.put(s.getCell(2, 0).getContents(), s.getCell(2, j).getContents());
            MyWriter.write(obj.toString());
            MyWriter.write( "\n");
            MyWriter.flush();
        }
    }
}