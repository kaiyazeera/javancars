#!/bin/bash
# HOW TO RUN CODE

cp ../../Task3/asm/code.asm $1.asm;
rm wlalink-log.txt linkfile;

file=$1 make;
java -jar ../GBTester.jar ./$1.gb;

