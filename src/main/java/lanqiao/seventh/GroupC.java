package lanqiao.seventh;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GroupC {

	/**
	 * @Description: 凑算式
	 * 
	 *               B DEF A + --- + ------- = 10 C GHI
	 * 
	 *               （如果显示有问题，可以参见【图1.jpg】）
	 * 
	 *               这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
	 * 
	 *               比如： 6+8/3+952/714 就是一种解法， 5+3/1+972/486 是另一种解法。
	 * 
	 *               这个算式一共有多少种解法？
	 * 
	 *               注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
	 * @return: 返回结果描述
	 */
	@Test
	public void questionSix() {
		ff(1);
		System.out.println(count);
	}

	public static void ff(int m) {
		if (m == 10) {
			if (check())
				count++;
		}
		for (int i = 1; i <= 9; i++) {
			if (k6[i] == false) {
				k6[i] = true;//回溯法
				g6[m] = i;
				ff(m + 1);
				k6[i] = false;
			}
		}
	}

	public static boolean check() {
		double q = g6[1];
		double w = g6[2] * 1.00 / g6[3];
		double e = (g6[3] * 100 + g6[4] * 10 + g6[5]) * 1.00 / (g6[7] * 100 + g6[8] * 10 + g6[9]);
		return q + w + e == 10;
	}

	static boolean k6[] = new boolean[10];// 判断这个数有没有被取过
	static int g6[] = new int[10];// 保存9个数
	static int count = 0;

	/**
	 * @Description: 分小组
	 * 
	 *               9名运动员参加比赛，需要分3组进行预赛。 有哪些分组的方案呢？
	 * 
	 *               我们标记运动员为 A,B,C,... I 下面的程序列出了所有的分组方法。
	 * 
	 *               该程序的正常输出为： ABC DEF GHI ABC DEG FHI ABC DEH FGI ABC DEI FGH ABC
	 *               DFG EHI ABC DFH EGI ABC DFI EGH ABC DGH EFI ABC DGI EFH ABC DHI
	 *               EFG ABC EFG DHI ABC EFH DGI ABC EFI DGH ABC EGH DFI ABC EGI DFH
	 *               ABC EHI DFG ABC FGH DEI ABC FGI DEH ABC FHI DEG ABC GHI DEF ABD
	 *               CEF GHI ABD CEG FHI ABD CEH FGI ABD CEI FGH ABD CFG EHI ABD CFH
	 *               EGI ABD CFI EGH ABD CGH EFI ABD CGI EFH ABD CHI EFG ABD EFG CHI
	 *               ..... (以下省略，总共560行)。
	 * 
	 *               public class A { public static String remain(int[] a) { String
	 *               s = ""; for(int i=0; i<a.length; i++){ if(a[i] == 0) s +=
	 *               (char)(i+'A'); } return s; }
	 * 
	 *               public static void f(String s, int[] a) { for(int i=0;
	 *               i<a.length; i++){ if(a[i]==1) continue; a[i] = 1; for(int
	 *               j=i+1; j<a.length; j++){ if(a[j]==1) continue; a[j]=1; for(int
	 *               k=j+1; k<a.length; k++){ if(a[k]==1) continue; a[k]=1;
	 *               System.out.println(__________________________________); //填空位置
	 *               a[k]=0; } a[j]=0; } a[i] = 0; } }
	 * 
	 *               public static void main(String[] args) { int[] a = new int[9];
	 *               a[0] = 1;
	 * 
	 *               for(int b=1; b<a.length; b++){ a[b] = 1; for(int c=b+1;
	 *               c<a.length; c++){ a[c] = 1; String s = "A" + (char)(b+'A') +
	 *               (char)(c+'A'); f(s,a); a[c] = 0; } a[b] = 0; } } }
	 * 
	 *               仔细阅读代码，填写划线部分缺少的内容。
	 * 
	 *               注意：不要填写任何已有内容或说明性文字。
	 * 
	 * @return: s + " " + (char) ('A' + i) + (char) ('A' + j) + (char) ('A' + k) + "
	 *          " + remain(a)
	 * 
	 *          main方法选出第一个小组，f再其余的队员中选出第二组成员，remain方法返回最后三个人
	 */
	@Test
	public void questionFive() {
		int[] a = new int[9];
		a[0] = 1;

		for (int b = 1; b < a.length; b++) {
			a[b] = 1;
			for (int c = b + 1; c < a.length; c++) {
				a[c] = 1;
				String s = "A" + (char) (b + 'A') + (char) (c + 'A');
				f(s, a);
				a[c] = 0;
			}
			a[b] = 0;
		}
	}

	public static String remain(int[] a) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				s += (char) (i + 'A');
		}
		return s;
	}

	public static void f(String s, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1)
				continue;
			a[i] = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == 1)
					continue;
				a[j] = 1;
				for (int k = j + 1; k < a.length; k++) {
					if (a[k] == 1)
						continue;
					a[k] = 1;
					System.out.println(
							s + " " + (char) ('A' + i) + (char) ('A' + j) + (char) ('A' + k) + " " + remain(a)); // 填空位置
					// System.out.println("" + ((char) ('A' + a[i])) + (char) ('A' + a[j] + (char)
					// ('A' + a[k]))); // 填空位置
					a[k] = 0;
				}
				a[j] = 0;
			}
			a[i] = 0;
		}
	}

	/**
	 * @Description: 骰子游戏
	 * 
	 *               我们来玩一个游戏。 同时掷出3个普通骰子（6个面上的数字分别是1~6）。 如果其中一个骰子上的数字等于另外两个的和，你就赢了。
	 * 
	 *               下面的程序计算出你能获胜的精确概率（以既约分数表示）
	 * 
	 *               public class Main { public static int gcd(int a, int b) {
	 *               if(b==0) return a; return gcd(b,a%b); }
	 * 
	 *               public static void main(String[] args) { int n = 0; for(int
	 *               i=0; i<6; i++) for(int j=0; j<6; j++) for(int k=0; k<6; k++){
	 *               if(________________________________) n++; //填空位置 }
	 * 
	 *               int m = gcd(n,6*6*6); System.out.println(n/m + "/" + 6*6*6/m);
	 *               } }
	 * 
	 *               仔细阅读代码，填写划线部分缺少的内容。 注意：不要填写任何已有内容或说明性文字。
	 * @return: 返回结果描述
	 */
	@Test
	public void questionFour() {
		int n = 0;
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				for (int k = 0; k < 6; k++) {
					if ((i + j + 2 == k + 1) || (i + k + 2 == j + 1) || (j + k + 2 == i + 1))
						n++; // 填空位置
				}

		int m = gcd(n, 6 * 6 * 6);
		System.out.println(n / m + "/" + 6 * 6 * 6 / m);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	/**
	 * @Description: 平方怪圈
	 * 
	 *               如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。 对新产生的正整数再做同样的处理。
	 *               如此一来，你会发现，不管开始取的是什么数字， 最终如果不是落入1，就是落入同一个循环圈。 请写出这个循环圈中最大的那个数字。
	 *               请填写该最大数字。 @return：145
	 */
	@Test
	public void questionThree() {
		Integer max = 0;
		for (int i = 2; i <= 100000; i++) {
			Integer s = GroupC.questionThreeTool(i + "");
			max = max > s ? max : s;
		}
		System.out.println("终极：" + max);
	}

	public static Integer questionThreeTool(String num) {
		List<String> list = new ArrayList<>();
		boolean bb = true;
		Integer max = 0;
		do {
			int x, sum = 0;
			char[] cs = num.toCharArray();
			for (char c : cs) {
				x = Integer.parseInt(c + "");
				sum += (x * x);
			}
			if (list.indexOf(sum + "") != -1) {
				max = 0;
				for (int i = list.indexOf(sum + ""); i < list.size(); i++) {
					Integer c = Integer.parseInt(list.get(list.indexOf(sum + "")));
					max = max > c ? max : c;
				}
				return max;
			}
			if (sum == 1) {
				return 0;
			}
			if (max < sum) {
				max = sum;
			}
			num = sum + "";
			list.add(sum + "");
		} while (bb);
		System.out.println(list.toString());
		System.out.println(max);
		return max;
	}

	/**
	 * @Description: 煤球数目
	 * 
	 *               有一堆煤球，堆成三角棱锥形。具体： 第一层放1个， 第二层3个（排列成三角形）， 第三层6个（排列成三角形），
	 *               第四层10个（排列成三角形）， .... 如果一共有100层，共有多少个煤球？ 请填表示煤球总数目的数字。
	 *               //注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	 * 
	 * @return：171700
	 */
	@Test
	public void questionTwo() {
		// 1 3 6 10 ... (n-1)+i; n为上次的记录,i为第几层
		Integer i = 2, n = 1;
		Long count = (long) 1;
		System.out.println("第一层: 1,共计 1");
		for (; i <= 100; i++) {
			n = n + i;
			count += n;
			System.out.println("第" + i + "层:" + n + ",共计" + count);
		}
	}

	/**
	 * @Description: 小明很喜欢猜谜语。
	 * 
	 *               最近，他被邀请参加了X星球的猜谜活动。 每位选手开始的时候都被发给777个电子币。 规则是：猜对了，手里的电子币数目翻倍，
	 *               猜错了，扣除555个电子币, 扣完为止。 小明一共猜了15条谜语。 战果为：vxvxvxvxvxvxvvx
	 *               其中v表示猜对了，x表示猜错了。 请你计算一下，小明最后手里的电子币数目是多少。 请填写表示最后电子币数目的数字。
	 *               注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	 * 
	 * @return：58497
	 */
	@Test
	public void questionOne() {
		char[] cs = "vxvxvxvxvxvxvvx".toCharArray();
		Long gold = (long) 777;
		for (int i = 0; i < cs.length; i++) {
			System.out.println("第" + (i + 1) + "次猜测：");
			if (cs[i] == 'v') {
				gold += gold;
				System.out.println("翻倍:" + gold);
			} else {
				gold -= 555;
				System.out.println("减去:" + gold);
			}
		}
		System.out.println(gold);
	}

}
