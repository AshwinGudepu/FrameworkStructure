package java8Tasks.ConstructorReference;

public class ConstructorReferenceRunner {

    public void callingConstructorReference(String name, int account, int salary) {
        ConstructorParameterisable constructorParameterisable = Employee::new;
        Employee callParameterizedConstructor = constructorParameterisable.getEmployeeDetails(name, account, salary);
        System.out.println("------------" + callParameterizedConstructor);
    }

    public static void main(String args[]) {
        ConstructorReferenceRunner constructorReferenceRunner = new ConstructorReferenceRunner();
        constructorReferenceRunner.callingConstructorReference("Test", 001, 1000);
        constructorReferenceRunner.callingConstructorReference("Hello", 002, 2000);
    }
}
