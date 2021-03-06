#!/usr/bin/env bash

while [[ $# > 1 ]]
do
    key="$1"

    case $key in
        -n | --number)
            server_number=$2
            shift
            ;;
        --default)
            echo default
            ;;
        *)
            ;;
    esac
    shift
done

bound=`expr ${server_number} - 1`

for i in $(seq 0 $bound)
do
    echo Stop Graph Database Server on node-$i
    ssh node-$i "~/iogp-code/release/iogp-0.1/bin/server.sh stop" &
done