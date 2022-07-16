package office.model;

public class ColourPoints extends Point {
	
		private String color;
		static String [] colors;
		
		static
		{
			colors = new String [5];
			colors[0]="red";
			colors[1]="blue";
			colors[2]="orange";
			colors[3]="yellow";
			colors[4]="black";
		}

		public ColourPoints() {
			super();
			// TODO Auto-generated constructor stub
		}
public ColourPoints(int x, int y, String color ) throws InvalidcolorException {
			super(x, y);
			this.color = color;
			
			
			for(int i=0;i<colors.length;i++)
			{
				if(colors[i].equals(color))
				{
					this.color=color;
				break;	
				}
				throw new InvalidcolorException();
				
			}
		
		}

		@Override
		public void Display() {
			// TODO Auto-generated method stub
			System.out.println("---------The Data is------------");
			super.Display();
			System.out.println(color);
			System.out.println("------------------------");
		}
		
		
	}


