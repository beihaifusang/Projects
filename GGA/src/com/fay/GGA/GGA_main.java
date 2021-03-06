package com.fay.GGA;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

//import java.util.List;
//import com.fay.ABH.MyComparator;
import com.fay.CMS.CMSReader;
import com.fay.scheduler.SimpleScheduler;
import com.fay.scheduler.SimpleScheduler;
public class GGA_main {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		double TWT_total = 0;
		double DB_total = 0;
		long totalTime;
		DecimalFormat  df = new DecimalFormat("######0"); 
		// д���ļ�
		FileOutputStream fos=null;
		BufferedWriter bw=null ;
		try {
			fos = new FileOutputStream("data_ABH/ans.txt");
		    bw = new BufferedWriter(new OutputStreamWriter(fos));

			for (int jj = 0; jj < 1; jj++)
				for (int k = 1; k <  2 ; k++) {
					for (int i = 1; i <=10; i++) { // case ����
//						if( i!= 2 && i!= 5  && i!= 8  &&   i!= 10   )
//							continue;
						System.out.print("case"+i+"\t");
						AntSystem AS = new AntSystem();

						CMSReader dr = new CMSReader("data_\\"+i+".txt");
						AS.setProblemSize(dr.getMachine(),						// ���ÿ�ʼʱ��Set(), dr.getJobSet(),
								dr.getCellSet());

						long start = System.currentTimeMillis();
						for (int j = 0; j < 4; j++) {
							// ��ʼ��
							AS.Init();
							AS.schedule(i);				
						//	System.out.print(df.format(AS.Findbest())+"\t");
							TWT_total += AS.Findbest();// ������				
						}
						// TWT_total = TWT_total/5;
						totalTime = (System.currentTimeMillis() - start);
					 System.out.println("time\t" + totalTime/4000.0);
					 System.out.println("average\t"+df.format(TWT_total/4));
						TWT_total = 0;
						DB_total = 0;
						totalTime = 0;
					}
					System.out.println();
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(bw!=null)
				bw.close();
			if(fos!=null){
				fos.close();
			}
		}

	}
}