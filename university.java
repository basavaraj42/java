


public class university {
	school [] b=new school[8];	
	
	class school extends university
	{
		private String sProgramcode;
		private String sProgramCoordinator;
		private int inoofstudents;
		private int inofstaffs;
		public String getsProgramcode() {
			return sProgramcode;
		}
		public String getsProgramCoordinator() {
			return sProgramCoordinator;
		}
		public int getInoofstudents() {
			return inoofstudents;
		}
		public int getInofstaffs() {
			return inofstaffs;
		}
		public school(String sProgramcode, String sProgramCoordinator,
				int inoofstudents, int inofstaffs) {
			super();
			this.sProgramcode = sProgramcode;
			this.sProgramCoordinator = sProgramCoordinator;
			this.inoofstudents = inoofstudents;
			this.inofstaffs = inofstaffs;
		}
	}
	
	void create()
	{
		b[0]=new school("cs","ron",125,23);
		b[1]=new school("mech","suresh",56,28);
		b[2]=new school("ec","ramesh",189,56);
		b[3]=new school("ee","rocky",87,45);
		
		b[4]=new school("automation","rohit",152,23);
		b[5]=new school("archi","shyam",89,56);
		b[6]=new school("civil","ram",75,42);
		b[7]=new school("biotech","raj",96,44);
		
	}
	
	void calc()
	{
		int j;
		for(j=0;j<8;j++)
		{
			if(b[j].getInoofstudents() > 120)
				System.out.println( b[j].getsProgramcode() + "Has reached the maximunm limit");
			else
			{
				System.out.println("Total strength of " + b[j].getsProgramcode() + " is " + b[j].getInoofstudents());
			}
		}
	}
}
	
		
		
	
	

