package chapter01_ex;

public class exercise_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int population = 312032486;
		
		int oneYearSeconds = 365 * 24 * 60 * 60;
		
		int populationYearOne = population + oneYearSeconds / 7 - oneYearSeconds / 13 + oneYearSeconds / 45;
		int populationYearTwo = population + 2 * oneYearSeconds / 7 - 2 * oneYearSeconds / 13 + 2 * oneYearSeconds / 45;
		int populationYearThree = population + 3 * oneYearSeconds / 7 - 3 * oneYearSeconds / 13 + 3 * oneYearSeconds / 45;
		int populationYearFour = population + 4 * oneYearSeconds / 7 - 4 * oneYearSeconds / 13 + 4 * oneYearSeconds / 45;
		int populationYearFive = population + 5 * oneYearSeconds / 7 - 5 * oneYearSeconds / 13 + 5 * oneYearSeconds / 45;
		
		System.out.println("Initial population: "+population);
		System.out.println("First year population: "+populationYearOne);
		System.out.println("Second year population: "+populationYearTwo);
		System.out.println("Third year population: "+populationYearThree);
		System.out.println("Fourth year population: "+populationYearFour);
		System.out.println("Fifth year population: "+populationYearFive);
	}

}
/*
(Population projection)
The U.S. Census Bureau projects population based on the following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that 
the current population is 312,032,486, and one year has 365 days. Hint: In Java, if 
two integers perform division, the result is an integer. The fractional part is truncated. 
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result 
with the fractional part, one of the values involved in the division must be a number 
with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/
