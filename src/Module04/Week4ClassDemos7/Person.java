package Module04.Week4ClassDemos7;

// Person

public class Person

{

    // composition has-a relationship

    private Job job;

    public Person()

    {

        this.job = new Job();

        job.setSalary(1000L);

    }

    public long getSalary()

    {

        return job.getSalary();

    }

}
