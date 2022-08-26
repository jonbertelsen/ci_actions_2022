package ci;

import java.util.Objects;

public class MyFunctionality {
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof MyFunctionality)) return false;
        MyFunctionality that = (MyFunctionality) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId());
    }

    public int id;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String name;

    public MyFunctionality() {
    }
    
    public int getTen(){

        return 10;
    }

  }

