gb: $(file).gb

$(file).gb: $(file).o linkfile
	export file
	../wlalink -d -r -v -s linkfile $(file).gb 2> wlalink-log.txt || (cat wlalink-log.txt | grep -v DISCARD && false)
	grep --color=never BANK < wlalink-log.txt 2> /dev/null
	rm wlalink-log.txt

$(file).o: $(file).asm
	export $(file)
	../wla-gb $(file).asm

linkfile:
	echo "[objects]" > linkfile
	echo "$(file).o" >> linkfile
	
clean:
	rm -f $(file).sym
	rm -f $(file).o
	rm -f wlalink-log.txt
	rm -f $(file).gb
	rm -f linkfile
