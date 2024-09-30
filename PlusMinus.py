#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Initialize counters for positives, negatives, and zeros
    positiveCount = 0
    negativeCount = 0
    zeroCount = 0
    
    # Get the total number of elements in the array
    n = len(arr)
    
    # Loop through the array and update counters
    for num in arr:
        if num > 0:
            positiveCount += 1
        elif num < 0:
            negativeCount += 1
        else:
            zeroCount += 1
    
    # Calculate the ratios
    positiveRatio = positiveCount / n
    negativeRatio = negativeCount / n
    zeroRatio = zeroCount / n
    
    # Print the results with 6 decimal places
    print(f"{positiveRatio:.6f}")
    print(f"{negativeRatio:.6f}")
    print(f"{zeroRatio:.6f}")

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
