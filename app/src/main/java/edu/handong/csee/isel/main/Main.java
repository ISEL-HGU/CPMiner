/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.handong.csee.isel.main;

import edu.handong.csee.isel.utils.PythonParser;

public class Main {

    public static void main(String[] args) {
        PythonParser pythonParser = new PythonParser("/Users/leechanggong/Projects/KISTI2022/SZZpy/app/src/main/java/edu/handong/csee/isel/utils/comment_remover.py");
        pythonParser.runPy();
        System.out.println(PythonParser.getSuccessOutput());

    }
}
