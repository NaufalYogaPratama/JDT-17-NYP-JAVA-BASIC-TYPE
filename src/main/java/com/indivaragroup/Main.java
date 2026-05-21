package com.indivaragroup;

import com.indivaragroup.data.type.TypeDataNonPrimitive;
import com.indivaragroup.expression.Expression;
import com.indivaragroup.house.floor.Ceramic;
import com.indivaragroup.calculation.identity.registration.CalculationRegistrationIdentity;
import com.indivaragroup.calculation.report.students.ScoringStudents;
import com.indivaragroup.calculation.conversion.data.type.ConversionDataType;
import com.indivaragroup.data.type.CharacterTypeData;
import com.indivaragroup.jav.logic.ReleaseFilterLogic;
import com.indivaragroup.data.type.ArrayDataType;
import com.indivaragroup.operator.augmented.assignment.AugmentedAssignment;
import com.indivaragroup.operator.bitwise.BitwiseOperator;
import com.indivaragroup.operator.bool.BooleanOperator;
import com.indivaragroup.operator.compare.ComparingOperator;
import com.indivaragroup.operator.instanceOf.InstanceOfOperator;
import com.indivaragroup.operator.unary.UnaryOperator;
import com.indivaragroup.todolist.logic.TaskManager;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String helloWorld = "HELLO, JDT-17";

        System.out.println("INI STRING UNTUK HELLO - WORLD =" + helloWorld);

        int helloInteger = 69;

        System.out.println("INI STRING UNTUK HELLO - INTEGER =" + helloInteger);

        double helloDouble = 69.69;

        System.out.println("INI STRING UNTUK HELLO - DOUBLE =" + helloDouble);

        boolean helloBoolean = true;

        System.out.println("INI STRING UNTUK HELLO - BOOLEAN =" + helloBoolean);

        char helloChar = 'H';

        System.out.println("INI STRING UNTUK HELLO - CHAR =" + helloChar);

        //
        Ceramic ceramic = new Ceramic();

        ceramic.setNameCeramic("MARMER");

        if (ceramic.getNameCeramic().equals("MARMER")) {
            System.out.println("\nINI BENAR MARMER --- " + true);
        } else {
            System.out.println("\nINI BUKAN MARMER --- " + false);
        }

        ceramic.setNameCeramic("BATU");

        if (ceramic.getNameCeramic().equals("MARMER")) {
            System.out.println("\nINI BENAR MARMER --- " + true);
        } else {
            System.out.println("\nINI BUKAN MARMER --- " + false);
        }

        CalculationRegistrationIdentity calcidentity = new CalculationRegistrationIdentity();

        int uang = 10000;

        System.out.println("\n == SISTEM REGISTRASI KTP ==");

        calcidentity.processKtpRegistration(uang);

        //GRADE
        new ScoringStudents().processAllStudents();

        new ConversionDataType().conversionDataType();

        new CharacterTypeData().characterTypeData();

        new ReleaseFilterLogic().processReleases();

        new TypeDataNonPrimitive().typeData();

        new ArrayDataType().arrayData();

        new TaskManager().runMiniProject();

        new AugmentedAssignment().augmentedAssignmentFunction();

        UnaryOperator.unaryOperator();

        ComparingOperator.comparingOperator();

        BitwiseOperator.bitwiseOperator();

        BooleanOperator.booleanOperator();

        InstanceOfOperator.instanceOfOperator();

        Expression.expression();
    }
}
