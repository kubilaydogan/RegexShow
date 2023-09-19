# REGEX

### Digits

```regexp
(\\d+)          : 33
\"(\\d+)\"      : "33"

([0-9]{3}+)     : 202  (only digit allowed & 3 digits accepted)

```

### String

```regexp
(.*)                    : String
\"(.+)\"                : "String"
([a-zA-Z]*)             : Only String
\"([a-zA-Z]*)\"         : Only "String"
([a-zA-Z0-9]*           : Only String or Integers (no special characters)
(|not )                 : (optional) not
(|a|not a)              : (optional) 'a' or 'not a'
rows?                   : row or rows
colou?r                 : matches colour or color
(?:validate|verify)     : You can see these options, but they are not parameters
(error|success|warning) : A parameter that can have 3 values

\"([^\"]*)\"            : Multiline "String"

```