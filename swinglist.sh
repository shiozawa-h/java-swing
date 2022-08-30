#! /bin/sh

for d in *; do
    for f in `find $d -name *.java`; do
	echo "/*" $f "*/"
	cat $f
	echo
	echo
    done
done
