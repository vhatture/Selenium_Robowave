package com.crm.advance_selenium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;

import com.crm.advance_selenium.BaseClass_Prime.ExcelUtility;

/*public class Main_Duplicate{

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
				int row = 0;
				
				Set<Integer> s = new LinkedHashSet();
				
				List<Integer> l = new ArrayList();
		 
				while(true)
				{
					try {
						String fetched= ExcelUtility.getData("Frequency", row, 0);
						
						if(fetched!=" ")
						{
							int num = (int)Double.parseDouble(fetched);
							
							s.add(num);
							l.add(num);
							
							row++;
						}
					}catch(NullPointerException n)
					{
						break;
					}
					
				}
				
				for(Integer i:s)
				{
					int rep = Collections.frequency(l, i);
					System.out.println(i+" Digit Repeated = "+rep+" Times");
					System.out.println();
				}
			}
		}
}*/
