#!/usr/bin/env bash
pid=$(cat .app.pid)
kill -TERM ${pid}
rm ./.app.pid
