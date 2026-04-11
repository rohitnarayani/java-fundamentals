package exception;

public class HospitalPatientSystem {
    public static void main(String []args){
        Hospital iris = new Hospital("Iris",40);

        try{
            iris.admitPatient("",-7);
        }
        catch(InvalidPatientException o){
            System.out.println(o);
        }
        catch(BedNotAvailableException o){
            System.out.println(o);
        }
    }
}

class Hospital{
    private String name;
    private int bedsAvailable;

    Hospital(String name,int bedsAvailable){
        this.name = name;
        this.bedsAvailable = bedsAvailable;
    }

    public void admitPatient(String patientName, int age) throws InvalidPatientException,BedNotAvailableException{
        if(patientName.isBlank()){
            throw new InvalidPatientException("Patient name cannot be blank!");
        }
        if(age < 0){
            throw new InvalidPatientException("Age cannot be negative!");
        }
        if(bedsAvailable == 0){
            throw new BedNotAvailableException("No beds available! Please try another hospital.\n");
        }
        this.bedsAvailable -= 1;
        System.out.println("✅ Patient "+patientName+" (Age: "+age+") admitted successfully! Beds left: "+bedsAvailable);
    }
}

class InvalidPatientException extends Exception{
    InvalidPatientException(String msg){
        super(msg);
    }
}

class BedNotAvailableException extends Exception{
    BedNotAvailableException(String msg){
    super(msg);
    }
}