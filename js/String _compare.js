//String object initialization
const str1 = new String('Welcome Winter');
const str2 = new String('Welcome Winter');

//String literal initialization
const str3 = 'Welcome Winter';

const str4 = str1;

// String  comparison

// return false - because str1 and str2 are two different objects
str1 == str2;

// return true
str1 == str3;

// return true
str1 === str4;

// instance of object
typeof(str1);

// instance of string
typeof(str3);