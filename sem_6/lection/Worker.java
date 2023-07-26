package Sem_6.lection;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("id:%d fn:%s ln:%s sal:%d", id, firstName, lastName, salary);
        // return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        Worker t = (Worker) obj;
        return id==t.id && firstName==t.firstName;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        // return super.hashCode();
        return id;
    }

}

