package no.uio.ifi.asp.parser;

import no.uio.ifi.asp.main.Main;
import no.uio.ifi.asp.runtime.RuntimeReturnValue;
import no.uio.ifi.asp.runtime.RuntimeScope;
import no.uio.ifi.asp.runtime.RuntimeValue;
import no.uio.ifi.asp.scanner.Scanner;
import no.uio.ifi.asp.scanner.TokenKind;

public class AspBooleanLiteral extends AspAtom {

    TokenKind boolOprKind;

    AspBooleanLiteral(int n) {
        super(n);
    }

    public static AspBooleanLiteral parse(Scanner s) {
        Main.log.enterParser("boolean literal");
        AspBooleanLiteral boolOpr = new AspBooleanLiteral(s.curLineNum());

        boolOpr.boolOprKind = s.curToken().kind;
        skip(s, boolOpr.boolOprKind);

        Main.log.leaveParser("boolean literal");
        return boolOpr;
    }

    @Override
    protected void prettyPrint() {
        Main.log.prettyWrite(boolOprKind.toString());

    }

    @Override
    RuntimeValue eval(RuntimeScope curScope) throws RuntimeReturnValue {
        return null;
    }

}
