using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Payroll_Application
{

    [Serializable()]

    public class CommissionEmployee : Employee
    {
        public int unitSold;
        public float unitPrice;
        //public float gross;

        private CommissionEmployee() { }

        public CommissionEmployee(float gross, float taxrate, float tax, float net, float net_percent,
            int unitSold, float unitPrice)
            : base(gross, taxrate, tax, net, net_percent)
        {
            
        }

        //public int UnitSold
        //{
        //    get
        //    {
        //        return unitSold;
        //    }
        //    set
        //    {
        //        string usInput = null;
        //        int input = 0;
        //        Console.Write("Units sold: ");

        //        usInput = Console.ReadLine();
        //        input = Convert.ToInt32(usInput);
        //        unitSold = input;
        //    }

        //}

        //public float UnitPrice
        //{
        //    get
        //    {
        //        return unitPrice;
        //    }
        //    set
        //    {
        //        string upInput = null;
        //        int input = 0;
        //        Console.Write("Rate: ");

        //        upInput = Console.ReadLine();
        //        input = Convert.ToInt32(upInput);
        //        unitPrice = input;
        //    }
        //}


        public override float computeGross()
        {
            string usInput = null;
            int input = 0;
            Console.Write("Units sold: ");

            usInput = Console.ReadLine();
            input = Convert.ToInt32(usInput);
            unitSold = input;

          
            float inputx = 0;
            Console.Write("Rate: ");

            inputx = float.Parse(Console.ReadLine());
            unitPrice = inputx;



            gross = (unitSold * unitPrice) * 0.5f;
            return gross;     
        }

    }
}
