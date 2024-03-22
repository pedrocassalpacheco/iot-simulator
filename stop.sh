for pid in $(ps -ef | grep "simulator" | awk '{print $2}'); do kill -9 $pid; done
