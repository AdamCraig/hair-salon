# _Death By Glamour Salon_

#### _An interactive Java web app simulating a salon in the Underground that allows a user to view and add stylists/clients to the salon._

#### By _**Adam Craig**_

## Description

_An interactive Java web app that allows a user (the salon owner) to view a list of stylists currently employed at the salon, add stylists, view each stylist's unique page, and a list of each stylist's clients._

## Setup/Installation Requirements

_The project comes with two .sql files, hair_salon and hair_salon_test. Only hair_salon is needed for normal functionality with the pre-seeded stylists (and their unique backgrounds). Alternatively, one could set up the database tables in the command line as follows:

In PSQL:

CREATE DATABASE hair_salon;

CREATE TABLE stylists (id serial PRIMARY KEY, name varchar);

CREATE TABLE clients (id serial PRIMARY KEY, name varchar, stylist_id int);

## Known Bugs

_No known bugs at this time._

## Support and contact details

_For all issues and support, please contact:
Adam Craig at ajcraig@suffolk.edu_

## Technologies Used

_POSTGRESQL, SQL2O, Java, Spark, JUnit, Gradle, Velocity, FluentLenium, HTML, CSS, Bootstrap_

### License

_The MIT License (MIT)

Copyright (c) [2016] [Adam Craig]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE._
