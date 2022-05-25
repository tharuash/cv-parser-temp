package com.b127.dev;

import gate.util.GateException;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        ResumeParser resumeParser = new ResumeParser();

        String path = "/home/tharindu/Documents/idea-workspace/cv-parser/resumes/CV_MWTB-Aththanayake.pdf";

        ExtendedCandidate extendedCandidate = null;
        try {
            extendedCandidate = resumeParser.parseUsingGateAndAnnie(path);
        } catch (GateException | IOException exception) {
            exception.printStackTrace();
        }

        System.out.println(extendedCandidate.getSkills().toString());



    }
}
