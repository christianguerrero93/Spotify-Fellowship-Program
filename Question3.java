import java.util.Arrays;

public class Question3 {

	public static int changePossibilities(int[] denominations, int total) {

		int dp[] = new int[total + 1];

		dp[0] = 1;

		for (int i = 0; i < denominations.length; i++) {

			for (int j = 1; j <= total; j++) {

				if (j >= denominations[i]) {

					dp[j] =  dp[j] + dp[j - denominations[i]];
				}
			}
		}

		return dp[total];
	}

	public static void main(String[] args) {

		int[] coins = { 1, 2, 3 };
		int answer = changePossibilities(coins, 4);

		System.out.println(answer);

	}

}
