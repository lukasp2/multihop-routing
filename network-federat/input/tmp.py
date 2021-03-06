#!/usr/bin/env python3

import math
import itertools

points = [
    [1.019016839, 0.241572304],
    [1.019832718, 0.238665652],
    [1.017292621, 0.232495195],
    [1.019832718, 0.238665652],
    [1.017292621, 0.232495195],
    [1.019016839, 0.241572304],
    [1.016850056, 0.243673738],
    [1.019832718, 0.238665652],
    [1.016850056, 0.243673738],
    [1.019016839, 0.241572304],
    [1.016850056, 0.243673738],
    [1.017292621, 0.232495195],
    [1.018892754, 0.242614286],
    [1.019832718, 0.238665652],
    [1.018892754, 0.242614286],
    [1.019016839, 0.241572304],
    [1.018892754, 0.242614286],
    [1.017292621, 0.232495195],
    [1.018892754, 0.242614286],
    [1.016850056, 0.243673738],
    [1.020455931, 0.233184734],
    [1.019832718, 0.238665652],
    [1.020455931, 0.233184734],
    [1.019016839, 0.241572304],
    [1.020455931, 0.233184734],
    [1.017292621, 0.232495195],
    [1.020455931, 0.233184734],
    [1.016850056, 0.243673738],
    [1.020455931, 0.233184734],
    [1.018892754, 0.242614286]
]

def calc_distance(p0, p1):
    return math.sqrt((p0[0] - p1[0])**2 + (p0[1] - p1[1])**2)

num_distances = 0
avg_distance = 0

for p0, p1 in itertools.combinations(points, 2):
    num_distances = num_distances + 1
    distance = calc_distance(p0, p1)
    avg_distance = avg_distance + distance / num_distances
    print('distance:', distance)
    
print ('avg distance', avg_distance)
