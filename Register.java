package ExceptionHandling;

public class Register {


    public void Validate(String citizenship) throws InvalideAgeExceptaion {
        if (!("Indian").equalsIgnoreCase(citizenship))
            throw new InvalidCitizenshipException("...");
    }

    public void Validate(int age) throws InvalideAgeExceptaion {
        if (age <= 18)
            throw new InvalideAgeExceptaion(" You are Minor==>" + age);

    }


/*
    public void Validate(int age, String citizenship) throws InvalideAgeExceptaion {
        if (age <= 18)
            throw new InvalideAgeExceptaion(" You are Minor==>" + age);
        if (!("Indian").equalsIgnoreCase(citizenship))
            throw new InvalidCitizenshipException(" You are not Indian...");
    }

 */
}
