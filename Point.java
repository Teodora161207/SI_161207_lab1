class Point {
	String id;
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	Point (String id, double x, double y, String color) {
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
	
	}

	//TODO setters and getters

	String getID() {
		return this.id;
	}
	
	double getX() {
		return this.x;
	}
	
	double getY() {
		return this.y;
	}

	String getColor() {
		return this.color;
	}


	void setID(String id) {
		this.id=id;
	}

	void setX(double x) {
		this.x=x;
	}
	
	void setY(double y) {
		this.y=y;
	}

	void setColor(String color) {
		this.color=color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO

		if (xDirection=="L")
			this.x+=1;
		else this.x-=1;

		if (yDirection=="U")
			this.y+=1;
		else this.y-=1;
	}

	public void draw () {
		//TODO

		System.out.println("(",+this.x+","+this.y+")");
		
	}



}