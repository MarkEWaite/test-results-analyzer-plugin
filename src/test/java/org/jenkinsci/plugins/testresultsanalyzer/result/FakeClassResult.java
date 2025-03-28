package org.jenkinsci.plugins.testresultsanalyzer.result;

import hudson.tasks.test.TestObject;

public class FakeClassResult extends FakeTabulatedResult {

    public FakeClassResult(TestObject parent, String name) {
        super(parent, name);
    }

    public void addTest(String testMethod, TestStatus testStatus) {
        addTestResult(new FakeTestMethod(this, testMethod, testStatus));
    }
}
