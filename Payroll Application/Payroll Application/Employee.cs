using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Payroll_Application
{
        
    
    //[XMLInclude(typeof(HourlyEmployee))]
    //[XMLInclude(typeof(SalaryEmployee))]
    //[XMLInclude(typeof(CommissionEmployee))]
    [Serializable()]

    [XmlInclude(typeof(HourlyEmployee)), XmlInclude(typeof(SalaryEmployee)), XmlInclude(typeof(CommissionEmployee)),
                XmlInclude(typeof(Employee))]
    public abstract class Employee : object
    {
        //public float rate = 30.0f;
        public float taxrate = 0.2f;
        //public float hours = 45;
        public float gross = 0.0f;
        public float tax = 0.05f;
        public float net = 0.0f;
        public float net_percent = 0.0f;

        //Employee[] emp = new Employee[3];
        //HourlyEmployee HE = new HourlyEmployee(0, 0, 0, 0, 0, 0, 0, 0);
        //SalaryEmployee SE = new SalaryEmployee(0, 0, 0, 0, 0, 0);
        //CommissionEmployee CE = new CommissionEmployee(0, 0, 0, 0, 0, 0, 0);

        //Payroll save = new Payroll();

        public Employee() { }

        public Employee(float gross, float taxrate, float tax, float net, float net_percent)
        {
            this.gross = gross;
            this.taxrate = taxrate;                                                   
            this.tax = tax;            
            this.net = net;         
            this.net_percent = net_percent;            
        }


        public void menu()
        {

            string sEinput = null;
            int input = -2;

            while (input != 6)
            {
                Console.WriteLine("What would you like to do:\n 1) Calc. Gross Pay \n 2) Calc. Tax " +
      "\n 3) Calc. Net Pay \n 4) Calc. Net % \n 5)Display Employee \n 6 to quit.");
                Console.Write("\n Selection: ");

                sEinput = Console.ReadLine();
                input = Convert.ToInt32(sEinput);

                if (input == 1)
                {
                    computeGross();
                                  
                }
                if (input == 2)
                {
                    computeTax();
                }
                if (input == 3)
                {
                    computeNet();
                }
                if (input == 4)
                {
                    computeNetperc();
                }
                if (input == 5)
                {
                    displayEmployee();
                }
                if (input ==6)
                {
                    //save.saveEmployee();
                    


                }
            }
            

        }

        public void computeTax()
        {
            tax = gross * taxrate;
        }

        public void computeNet()
        {
            net = gross - tax;
        }

        public void computeNetperc()
        {
            net_percent = (net / gross) * 100;
        }

        public abstract float computeGross();

        public void displayEmployee()
        {
            //Console.WriteLine("Hours: " + hours);
            //Console.WriteLine("Rate: " + rate);
            Console.WriteLine("Gross: " + gross);
            Console.WriteLine("Net: " + net);
            Console.WriteLine("Net%: " + net_percent + "%");
        }

    }
}
