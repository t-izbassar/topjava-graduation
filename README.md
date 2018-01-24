# Restaurant voting simple REST application

[![PDD status](http://www.0pdd.com/svg?name=t-izbassar/topjava-graduation)](http://www.0pdd.com/p?name=t-izbassar/topjava-graduation)
[![Build Status](https://travis-ci.org/t-izbassar/topjava-graduation.svg?branch=master)](https://travis-ci.org/t-izbassar/topjava-graduation)
[![Coverage Status](https://codecov.io/gh/t-izbassar/topjava-graduation/branch/master/graph/badge.svg)](https://codecov.io/gh/t-izbassar/topjava-graduation)
[![Quality Gate](https://sonarqube.com/api/badges/gate?key=com.github.tizbassar:topjava-graduation)](https://sonarqube.com/dashboard/index/com.github.tizbassar:topjava-graduation)
[![Quality Gate](https://sonarqube.com/api/badges/measure?key=com.github.tizbassar:topjava-graduation&metric=sqale_debt_ratio)](https://sonarqube.com/dashboard/index/com.github.tizbassar:topjava-graduation)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/t-izbassar/topjava-graduation/blob/master/LICENSE)

This application is a showcase for various
techniques, that are commonly used in modern
backend application development on java
technology stack.

## Logic description

Build a voting system for deciding where to have lunch.

    2 types of users: admin and regular users
    Admin can input a restaurant and it's lunch menu of the day 
    (2-5 items usually, just a dish name and price)
    Menu changes each day (admins do the updates)
    Users can vote on which restaurant they want to have lunch at
    Only one vote counted per user
    If user votes again the same day:
        If it is before 11:00 we asume that he changed his mind.
        If it is after 11:00 then it is too late, vote can't be changed
