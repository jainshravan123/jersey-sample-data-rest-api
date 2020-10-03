# Jersey Sample Data Rest Api

[![Build Status](https://travis-ci.com/jainshravan123/jersey-sample-data-rest-api.svg?branch=master)](https://travis-ci.com/github/jainshravan123/jersey-sample-data-rest-api)

## About

This repository exposes the rest apis for generating the sample data.

## Description
This is a maven app which is hosted on heroku cloud. This app is using the jersey library for creating the rest apis.
<br />
e.g. https://still-peak-61721.herokuapp.com/


## API
This app is exposing the paginated apis for generating the sample data. 

If you don't provide any page number then this api will return the complete data.
<br />
e.g. https://still-peak-61721.herokuapp.com/webapi/engineers

This app is having the static data which is divided into 13 pages. If you give any page number from 1 to 13 then it'll return the proper data for that page. 
<br />
e.g. https://still-peak-61721.herokuapp.com/webapi/engineers?page=7


If you provide the page number lesser than 1 or more than 13 then it'll not return any item.
<br />
e.g. https://still-peak-61721.herokuapp.com/webapi/engineers?page=-4


