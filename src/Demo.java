public class Demo {
    public static void main(String[] args) {
        Employee CEO = new Employee(1, "CEO", "Dave");
        Employee DevManager = new Employee(2, "Development Manager", "Peter");
        Employee QAManager = new Employee(3, "Quality Manager", "John");
        Employee DevTeamLeader = new Employee(4, "DevelopmentTeam Leader", "Rohan");
        Employee QATeamLeader = new Employee(5, " QA Team Leader", "Vijay");
        Employee SoftwareEngineer1 = new Employee(6, "Software Engineer", "Raj");
        Employee SoftwareEngineer2 = new Employee(7, "Software Engineer", "Mohan");
        Employee SoftwareEngineer3 = new Employee(8, "Software Engineer", "Hema");
        Employee QASoftwareEngineer1 = new Employee(9, "QA Software Engineer", "Saran");
        Employee QASoftwareEngineer2 = new Employee(10, "QA Software Engineer", "Riya");

        CEO.add(DevManager);
        CEO.add(QAManager);
        DevManager.add(DevTeamLeader);
        QAManager.add(QATeamLeader);
        DevTeamLeader.add(SoftwareEngineer1);
        DevTeamLeader.add(SoftwareEngineer2);
        DevTeamLeader.add(SoftwareEngineer3);
        QATeamLeader.add(QASoftwareEngineer1);
        QATeamLeader.add(QASoftwareEngineer2);
        CEO.print();
    }
}
