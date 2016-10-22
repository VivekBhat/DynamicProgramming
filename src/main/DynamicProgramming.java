package main;

import java.util.HashMap;
import java.util.Map;

import problems.CoinChangingMinimumCoin;
import problems.Fibonaci;

public class DynamicProgramming {

	public static void main(String args[]) {
		// int total = 13;
		// int coins[] = { 7, 3, 2, 6 };
		// CoinChangingMinimumCoin cc = new CoinChangingMinimumCoin();
		// Map<Integer, Integer> map = new HashMap<>();
		// int topDownValue = cc.minimumCoinTopDown(total, coins, map);
		// int bottomUpValue = cc.minimumCoinBottomUp(total, coins);
		//
		// System.out.print(String.format("Bottom up and top down result %s %s",
		// bottomUpValue, topDownValue));

		int n = 7;
		Fibonaci val = new Fibonaci();
		System.out.println(val.fib(n));
	}
}
