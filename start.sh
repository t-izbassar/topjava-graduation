#!/usr/bin/env bash
RUN_COMMAND="java -jar $1"
${RUN_COMMAND} >.log 2>.error.log & echo $! >>.app.pid
sleep 3s
