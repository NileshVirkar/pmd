#!/usr/bin/python

import sys
import pygments
from pygments.lexers.python import Python3Lexer
from pygments.lexers.jvm import JavaLexer
from pygments.lexers.javascript import TypeScriptLexer
from pygments.lexers.php import PhpLexer
from pygments.lexers.go import GoLexer
from pygments.lexers.jvm import KotlinLexer
from pygments_lexer_solidity import SolidityLexer

import time

def getPhpLexer():
    return PhpLexer()

def getTypeScriptLexer():
    return TypeScriptLexer()

def getGoLexer():
    return GoLexer()

def getKotlinLexer():
    return KotlinLexer()

def getSolidityLexer():
    return KotlinLexer()

def getLexer(lang):
    switcher = {
        "PHP" : getPhpLexer(),
        "TYPESCRIPT" : getTypeScriptLexer(),
        "GO" : getGoLexer(),
        "KOTLIN" : getKotlinLexer(),
        "SOLIDITY" : getSolidityLexer()
    }
    func = switcher.get(lang, lambda: "Invalid language")
    return func

filename = str(sys.argv[1])
#print("File name:" + filename)
ct1 = int(round(time.time() * 1000))
f = open(filename, "r")
token_list = []
code = f.read()

for token in pygments.lex(code, getLexer(sys.argv[2])):
    token_list.append(token)
ct2 = int(round(time.time() * 1000))
#print("Time taken for parsing " + filename + " with pygments: " + str(ct2 - ct1) + " millisecond.")
print(token_list)

