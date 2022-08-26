package ci;

import java.util.Objects;

public class Person
{
    private String cpr;
    private String name;

    public Person(String cpr, String name)
    {
        this.cpr = cpr;
        this.name = name;
    }

    public String getCpr()
    {
        return cpr;
    }

    public String getName()
    {
        return name;
    }


}
