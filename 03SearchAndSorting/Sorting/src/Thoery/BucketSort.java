package Thoery;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    private static void displayArray(float[] arr) {
        for (float i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.3f, 0.2f, 0.3f, 0.1f, 0.4f};

        displayArray(arr);
        System.out.println("After sorting: ");
        bucketSort(arr);
        displayArray(arr);
    }

    private static void bucketSort(float[] arr) {
        // no.of buckets
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        //add elements into buckets
        for (float v : arr) {
            int bucketIdx = (int) v * 10;
            buckets[bucketIdx].add(v);
        }

        //sort each bucket individually
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        //merge all buckets to get final array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size(); j++) {
                arr[index++]= currentBucket.get(j);
            }
        }
    }
}
