set terminal svg size 1920, 1200 font "Helvetica,30"
unset key

set xlabel "Trådar"
set ylabel "Exekveringstid (ms)"
set grid

set output "~/Desktop/exjobb/report/threadsComp/threadsComp.svg"
plot "~/Desktop/exjobb/report/threadsComp/results2.txt" linetype 7 linewidth 4.000 pointsize 2.0 linecolor 6 with linespoints