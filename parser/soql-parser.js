// mygenerator.js
var fs = require("fs");
var Parser = require("jison").Parser;

var bnf = fs.readFileSync("parser/soql.y", "utf8");
var parser = new Parser(bnf);

// parser.parse("SELECT :*");
// parser.parse ("SELECT *");
// parser.parse("SELECT :*, *");
// parser.parse("SELECT thing1, thing2");

// parser.parse("SELECT 1 + 1 WHERE 1 = 1");
// parser.parse("SELECT 1 + 1 WHERE 1 == 1");
// var result = parser.parse("SELECT 1 + -1 WHERE 1 == 1");
// console.log(result);

console.log(JSON.stringify(
    parser.parse("SELECT :*, *, blah, fdagfd AS frog, fdsag WHERE 1 + 1 == 4 ORDER BY fdsgfsd ASC")
)
);