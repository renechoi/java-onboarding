package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Problem1 {


	public static int solution(List<Integer> pobi, List<Integer> crong) {

		/*
		계산에 필요한 값들 구하기
		*/

		int pobiFirstNumber = getNumber(pobi, 0);
		int pobiSecondNumber = getNumber(pobi, 1);

		int crongFirstNumber = getNumber(crong, 0);
		int crongSecondNumber = getNumber(crong, 1);

		Integer pobiMaxValue = getMaxValue(pobiFirstNumber, pobiSecondNumber);
		Integer crongMaxValue = getMaxValue(crongFirstNumber, crongSecondNumber);

		/*
		구한 값들로 정답 구하는 로직
		*/

		if (!doesPageContinue(pobiFirstNumber, pobiSecondNumber) || !doesPageContinue(crongFirstNumber, crongSecondNumber)) {
			return -1;
		}

		return getTheAnswer(pobiMaxValue, crongMaxValue);
	}

	private static Integer getMaxValue(int firstNumber, int secondNumber) {
		List<Integer> maxNumberList = getMaxNumberList(firstNumber, secondNumber);
		return getMaxValue(maxNumberList);
	}

	private static List<Integer> getMaxNumberList(int firstNumber, int secondNumber) {
		List<Integer> maxNumbersList = new ArrayList<>();
		maxNumbersList.add(getMaxNumber(firstNumber));
		maxNumbersList.add(getMaxNumber(secondNumber));
		return maxNumbersList;
	}

	private static int getTheAnswer(Integer pobiMaxValue, Integer crongMaxValue) {

		return compareValues(pobiMaxValue, crongMaxValue);
	}

	private static int compareValues(Integer pobiMaxValue, Integer crongMaxValue) {

		if (Objects.equals(pobiMaxValue, crongMaxValue)) {
			return 0;
		}

		if (pobiMaxValue > crongMaxValue) {
			return 1;
		}

		return 2;
	}

	private static boolean doesPageContinue(int FirstNumber, int SecondNumber) {
		return FirstNumber + 1 == SecondNumber;
	}

	private static Integer getNumber(List<Integer> pobi, int index) {
		return pobi.get(index);
	}

	private static Integer getMaxValue(List<Integer> MaxNumbersList) {
		return Collections.max(MaxNumbersList);
	}

	private static int getNumberLength(int number) {
		return (int) (Math.log10(number) + 1);
	}

	private static int getMaxNumber(int number) {

		if (getNumberLength(number) == 3) {
			int firstNumberFirstDigit = getDigitsInThreeFigures(number, 1);
			int firstNumberSecondDigit = getDigitsInThreeFigures(number, 2);
			int firstNumberThirdDigit = getDigitsInThreeFigures(number, 3);

			int addition = getAddition(firstNumberFirstDigit, firstNumberSecondDigit, firstNumberThirdDigit);
			int multiplication = getMultiplication(firstNumberFirstDigit, firstNumberSecondDigit, firstNumberThirdDigit);

			return Math.max(addition, multiplication);
		}

		if (getNumberLength(number) == 2) {
			int firstNumberFirstDigit = getDigitsInTwoFigures(number, 1);
			int firstNumberSecondDigit = getDigitsInTwoFigures(number, 2);

			int addition = getAddition(firstNumberFirstDigit, firstNumberSecondDigit);
			int multiplication = getMultiplication(firstNumberFirstDigit, firstNumberSecondDigit);

			return Math.max(addition, multiplication);
		}

		return number;
	}

	private static int getDigitsInThreeFigures(int number, int position) {

		if (position == 1) {
			return number / 100;
		}

		if (position == 2) {
			return (number % 100) / 10;
		}

		if (position == 3) {
			return (number % 100) % 10;
		}

		throw new IllegalArgumentException("자리수 입력 오류");
	}

	private static int getDigitsInTwoFigures(int number, int position) {

		if (position == 1) {
			return (number % 100) / 10;
		}

		if (position == 2) {
			return (number % 100) % 10;
		}

		throw new IllegalArgumentException("자리수 입력 오류");
	}

	public static int getAddition(int... numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		return sum;
	}

	public static int getMultiplication(int... numbers) {
		int multiply = 1;

		for (int number : numbers) {
			multiply = multiply * number;
		}

		return multiply;
	}
}
