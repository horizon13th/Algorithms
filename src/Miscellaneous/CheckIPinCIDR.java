package Miscellaneous;

import java.util.Arrays;

/*

Given CIDR x.x.x.x/y->calculate the first y bits in x.x.x.x = bitsCIDR
translate given IP into binary number->calculate the first y bits in given ip = bitsIP
return (bitsCIDR==bitsIP)

 */
public class CheckIPinCIDR {
	public static void main(String args[]) {
		String testCIDR = "192.128.1.134/25";
		String testIP = "192.128.1.255";
		System.out.println(CheckIPinCIDR(testIP, testCIDR));
	}

	public static boolean CheckIPinCIDR(String ip, String CIDR) {
		if (null == ip || null == CIDR) {
			System.out.println("invalid input");
			return false;
		}

		// get the number after "/" and reset CIDR
		int bits = Integer.parseInt(CIDR.substring((CIDR.indexOf("/") + 1)));

		if (!(13 <= bits && bits <= 27)) {
			System.out.println("invalid input");
			return false;
		}
		CIDR = CIDR.substring(0, CIDR.indexOf("/"));

		// store two IP addresses into two arrays (len=4)
		String[] CIDRarr = CIDR.split("\\.");
		String[] iparr = ip.split("\\.");
		String CIDRstr = "", ipstr = "";

		// decimal to binary string
		for (int i = 0; i < 4; i++) {
			CIDRarr[i] = String.format("%8s", Integer.toBinaryString((Integer.parseInt(CIDRarr[i]) & 0xFF)))
					.replace(' ', '0');
			iparr[i] = String.format("%8s", Integer.toBinaryString((Integer.parseInt(iparr[i]) & 0xFF))).replace(' ',
					'0');
			CIDRstr += CIDRarr[i];
			ipstr += iparr[i];
		}

		// check if the first n bits of two string equals
		boolean checkResult = CIDRstr.substring(0, bits).equals(ipstr.substring(0, bits));
		return checkResult;
	}
}
