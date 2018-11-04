package lanqiao.seventh;

import org.junit.Test;

public class GroupB {
	/**
	 * @Description: 生日蜡烛
	 * 
	 *               某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
	 * 
	 *               现在算起来，他一共吹熄了236根蜡烛。
	 * 
	 *               请问，他从多少岁开始过生日party的？
	 * 
	 *               请填写他开始过生日party的年龄数。 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	 * 
	 * 
	 * 
	 * @return: 26
	 */
	@Test
	public void questionOne() {
		for (int i = 1; i < 100; i++) {
			int sum = 0;
			for (int j = i; j < 100; j++) {
				sum += j;
				if (sum == 236) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
