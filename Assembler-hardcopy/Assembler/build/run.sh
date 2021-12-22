#!/bin/bash
# HOW TO RUN CODE

rm wlalink-log.txt linkfile;

file=$1 make;
java -jar ../GBTester.jar ./$1.gb;

