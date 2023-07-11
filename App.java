//Create a simple hospital management system using inheritance in Java
import java.util.*;
abstract class Hospital
{
	static String hospital_name="Apollo";
	abstract void getdoctorsList();
	abstract void getpatientsList();
}
class Doctors extends Hospital
{
	String doctor_name,speciality;
	Doctors(String doctor_name,String speciality)
	{
		this.doctor_name=doctor_name;
		this.speciality=speciality;
	}
	void getdoctorsList()
	{
		System.out.println("Doctor's name:"+doctor_name);
		System.out.println("Doctor's Specialization:"+speciality);
	}
	void getpatientsList(){}
}
class Patients extends Hospital
{
	String patient_name,disease;
	Patients(String patient_name,String disease)
	{
		this.patient_name=patient_name;
		this.disease=disease;
	}
	void getpatientsList()
	{
		System.out.println("Patient's name:"+patient_name);
		System.out.println("Patient's disease:"+disease);
	}
	void getdoctorsList(){}
	
}
public class App
{
	public static void main(String args[])
	{
		System.out.println("enter no of Doctors in the hospital");
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		n1=sc.nextInt();
		sc.nextLine();//you have to add this...consumes \n leftover after int 
		Doctors d[]=new Doctors[n1];
		for(int i=0;i<n1;i++)
		{
			String doctor_name,speciality;
			System.out.println("enter doctor's name:");
			doctor_name=sc.nextLine();
			System.out.println("enter doctor's Speciality:");
			speciality=sc.nextLine();
			d[i]=new Doctors(doctor_name,speciality);
		}
		System.out.println("enter no of patients in the hospital");
		n2=sc.nextInt();
		Patients p[]=new Patients[n2];
		sc.nextLine();
		for(int i=0;i<n2;i++)
		{
			String patient_name,disease;
			System.out.println("enter patient's name:");
			patient_name=sc.nextLine();
			System.out.println("enter patient's disease:");
			disease=sc.nextLine();
			p[i]=new Patients(patient_name,disease);
		}
		System.out.println("If you want to change the name of the hospital...type 'y' or 'Y'");
		String change;
		change=sc.nextLine();
		if((change.equals("y")) || (change.equals("Y")))
		{
			System.out.println("enter Hospital's name:");
			change=sc.nextLine();
			Doctors.hospital_name=change;
		}
		System.out.println(String.format("%30s", Hospital.hospital_name));//giving set width 
		System.out.println();
		System.out.println(String.format("%30s", "Doctors list in the Hospital"));
		System.out.println();
		for(int i=0;i<n1;i++)
		{
			d[i].getdoctorsList();
		}
		System.out.println();
		System.out.println(String.format("%30s", "Patients list in the Hospital"));
		System.out.println();
		for(int i=0;i<n2;i++)
		{
			p[i].getpatientsList();
		}
	}
}                                                                                  