package com.telusuko.DemoHib;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App1 
{
  public static void create()
  {
	  Alien a=new Alien();
	 Scanner scan=new Scanner(System.in);
	 System.out.println("please enter the details ");
      a.setAid(scan.nextInt());
      a.setAname(scan.next());
      a.setAcolor(scan.next());
      Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
      SessionFactory sf=con.buildSessionFactory(reg);
      Session session=sf.openSession();
      Transaction tx=session.beginTransaction();
      System.out.println();
      session.save(a);
      tx.commit();
  }
  public static void updateData()
  {
      Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
         System.out.println("works");
         SessionFactory factory = configuration.buildSessionFactory();
         Session session = factory.openSession();
    
         Transaction tx = session.beginTransaction();
         Scanner scan= new Scanner(System.in);
         System.out.println("enter studet id to update:");
         Alien a=(Alien) session.get(Alien.class,scan.nextInt());
        if(a != null)
        {
            System.out.println("Enter new name to update:");
            a.setAname(scan.next());
            session.update(a);
             tx.commit();
             session.close();
             System.out.println("one record is updated..");
        }
        else {
            System.out.println("no records are found enter correct student id: ");
        }
         
  }
  public static void deleteData()
  {
      Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
         System.out.println("works");
         SessionFactory factory = configuration.buildSessionFactory();
         Session session = factory.openSession();
    
         Transaction tx = session.beginTransaction();
         Scanner scan= new Scanner(System.in);
         System.out.println("enter studet id to delete:");
         Alien student=(Alien) session.get(Alien.class,scan.nextInt());
        if(student != null)
        {
           
            session.delete(student);
             tx.commit();
             session.close();
             System.out.println("one record is deleted..");
        }
        else {
            System.out.println("no records are found enter correct student id: ");
        }
  }     
  }

