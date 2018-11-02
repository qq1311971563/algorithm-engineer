package lanqiao.seventh;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GroupC {
	
	
	/**
	 * @Description: 平方怪圈
	 * 
	 *               如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。 对新产生的正整数再做同样的处理。
	 *               如此一来，你会发现，不管开始取的是什么数字， 最终如果不是落入1，就是落入同一个循环圈。 请写出这个循环圈中最大的那个数字。
	 *               请填写该最大数字。
	 * @return：返回结果描述
	 */
	@Test
	public void demo4() {
		Integer max = 0;
		for (int i = 2; i <= 100000; i++) {
			Integer s = GroupC.tool1(i + "");
			max = max > s ? max : s;
		}
		System.out.println("终极：" + max);
	}

	public static Integer tool1(String num) {
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
