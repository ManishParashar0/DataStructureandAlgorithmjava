package string;

import java.util.Arrays;

public class ewe {
	static int i, j, count = 0, temp = 0;
	static String val = " ", tem = " ";
	static int o[];
	static int p[];

	public static void main(String[] args) {
		int a[] = { 1020304050 };
		String s = Integer.toString(a[0]);
		String[] split = s.split("");
		int[] values = new int[split.length];

		for (int i = 0; i < split.length; i++) {
			values[i] = Integer.parseInt(split[i]);
		}
		for (int z = 0; z < values.length; z++) {

			if (values[z] == 0) {
				val = values[z] + val;
			} else if (values[z] != 0) {
				tem = values[z] + tem;
			}
		}
		StringBuffer sb=new StringBuffer(tem);
		sb.reverse();
		System.out.println(sb+val);
	}

}

