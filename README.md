# League Backend Challenge Solution

## Introduction
This solution is to accomplish the task of matrix transformation written in Java. Consuming CSV file as input, this
application can be used to further contribute some backends tool which require matrix transformation service, including
echo, transpose(invert), flatten, sum and multiply. For how to run the sample code and further improvement, please refer
to the rest of the sections. 

## Code Execution
It is easy to run the current version of code. Clone this project tree to local and import to IntelliJ. Then click *Run
'Main'* (green triangle button).

## Test Integration
I have done the self test by changing valid integer element in CSV file. For unit testing purpose, here are some test
scenarios to consider: 

### Input-side
1) Test with empty CSV file (ideally "zero dimension" is also valid)
2) Test with 1 integer in the input file
3) Test with more than 1 integer of valid input, e,g.

```text
    1,2,3,4
    5,6 7,8
    9,10,11,12
    13,14,15,16
```

### Connection-side
1) Test whether the server connection (API Service) is good or not

**NOTE**: It would be better to consider some negative test, such as:
 - the input file is a non-CSV file;
 - the matrix is not a squared matrix (should we prompt an error/exception or permit the transformation action)
 

---
&copy; by Paul Xu for League take home coding assessment use only.
