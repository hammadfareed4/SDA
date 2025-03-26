/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pipeandfilter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PipeAndFilter {

    public static void main (String [] args ) {
        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();
        filters.add(PipeAndFilter::filterEvenNumbers);
        filters.add(PipeAndFilter::squareNumbers);
        filters.add(PipeAndFilter::filterNumbersGreaterThanTen);
        filters.add(PipeAndFilter::filterOddNumbers);

        List<Integer> result = processPipeline(input, filters);

        System.out.println(result);
    }

    private static List<Integer> processPipeline(List<Integer> input, List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;
        for(Function<List<Integer>, List<Integer>> filter : filters){
            output = filter.apply(output);
        }
        return output;
    }

    private static List<Integer> filterEvenNumbers(List<Integer> input){
        return input.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> squareNumbers(List<Integer> input){
        return input.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    private static List<Integer> filterNumbersGreaterThanTen(List<Integer> input){
        return input.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
    }

    private static List<Integer> filterOddNumbers(List<Integer> input){
        return input.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }
}
