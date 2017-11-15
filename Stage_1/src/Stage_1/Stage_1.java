package Stage_1;

import java.io.*;
import java.util.*;

public class Stage_1 {

	public static void main(String[] args) {

		String message;

		String[][] indat = new String[27][12];
		String[][] dat = new String[26][3];

		Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성
		System.out.println("날짜를 입력하세요 : ");

		message = scan.nextLine(); // 키보드 문자 입력*/

		String csvFile = "C:/Users/sara kim/workspace/Goodoc/src/Stage_1/hospital_info.csv";
		BufferedReader br = null;
		String line = "";
		int i, j;
		int row = 0, col = 3;
		int days = Integer.parseInt(message);

		System.out.println("hospital, distance, possible : ");
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] token = line.split(",", -1);

				for (i = 0; i < 12; i++) {
					indat[row][i] = token[i];
				}
				
				/*
				 * for (i = 0; i < 12; i++) { System.out.print(indat[row][i] +
				 * " , "); }
				 */

				// System.out.println("");
				// row++;
				
				if (days == 20171110) {
					if (indat[0][2].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][2]);
					} else
						continue;
				}
				
				else if (days == 20171111) {
					if (indat[0][3].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][3]);
					} else
						continue;
				}
				
				else if (days == 20171112) {
					if (indat[0][4].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][4]);
					} else
						continue;
				}
				
				else if (days == 20171113) {
					if (indat[0][5].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][5]);
					} else
						continue;
				}
				
				else if (days == 20171114) {
					if (indat[0][6].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][6]);
					} else
						continue;
				}
				
				else if (days == 20171115) {
					if (indat[0][7].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][7]);
					} else
						continue;
				}
				
				else if (days == 20171116) {
					if (indat[0][3].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][8]);
					} else
						continue;
				}
				
				else if (days == 20171117) {
					if (indat[0][3].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][9]);
					} else
						continue;
				}
				
				else if (days == 20171118) {
					if (indat[0][3].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][10]);
					} else
						continue;
				}
				
				else if (days == 20171119) {
					if (indat[0][3].contains("O")) {
						System.out.println(indat[0][0] + " , " + indat[0][1]
								+ " , " + indat[0][11]);
					} else
						continue;
				}
				
				else
					System.exit(0);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}