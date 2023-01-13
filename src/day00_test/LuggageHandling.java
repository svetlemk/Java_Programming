package day00_test;

import java.util.ArrayList;
import java.util.List;

public class LuggageHandling {

        public static String simulateLuggageHandling(String luggageWeights) {
            List<List<Integer>> containers = new ArrayList<>();
            int currentContainerWeight = 0;
            List<Integer> currentContainer = new ArrayList<>();

            String[] weights = luggageWeights.split(",");

            // load the luggage into containers
            for (String weight : weights) {
                int luggageWeight = Integer.parseInt(weight);
                if (currentContainerWeight + luggageWeight <= 40) {
                    currentContainer.add(luggageWeight);
                    currentContainerWeight += luggageWeight;
                } else {
                    containers.add(currentContainer);
                    currentContainer = new ArrayList<>();
                    currentContainer.add(luggageWeight);
                    currentContainerWeight = luggageWeight;
                }
            }
            // add the last container
            containers.add(currentContainer);

            // simulate the unloading of luggage
            List<Integer> unloadingOrder = new ArrayList<>();
            for (List<Integer> container : containers) {
                unloadingOrder.addAll(container);
            }

            // convert list to string
            return unloadingOrder.stream().map(Object::toString)
                    .reduce((s1, s2) -> s1 + "," + s2).orElse("");
        }

        public static void main(String[] args) {
            String luggageWeights = "30,5,6";
            System.out.println(simulateLuggageHandling(luggageWeights));
        }

}
