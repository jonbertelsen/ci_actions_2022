package ci;

import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        String s1 = "Mary Anna";
        String s2 = "Mary Anna";
        System.out.println("sammenlign to strenge: " + s1.equals(s2));
        Set<Person> personSet = new HashSet<>();
        Person p1 = new Person("121285-1212", "Mary Anna");
        Person p2 = new Person("121285-1212", "Mary Anna");

        personSet.add(p1);
        personSet.add(p2);

        for (Person person : personSet)
        {
            System.out.println(person.getCpr() + ": " + person.getName());
        }

        System.out.println("Er de ens?");
        System.out.println(p1.equals(p2));
    }
}
