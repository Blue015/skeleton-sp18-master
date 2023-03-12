public class Planet{
	public double xxPos,yyPos,xxVel,yyVel,mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV,double yV, double m, String img){
		this.xxPos=xP;
		this.yyPos=yP;
		this.xxVel=xV;
		this.yyVel=yV;
		this.mass=m;
		this.imgFileName=img;
	}

	public Planet(Planet p){
		this.xxPos=p.xxPos;
		this.yyPos=p.yyPos;
		this.xxVel=p.xxVel;
		this.yyVel=p.yyVel;
		this.mass=p.mass;
		this.imgFileName=p.imgFileName;
	}

	public double calcDistance(Planet p){
		double dx = this.xxPos-p.xxPos;
		double dy = this.yyPos-p.yyPos;
		double r = Math.sqrt(dx*dx+dy*dy);
		return r;
	}

	public double calcForceExertedBy(Planet p){
		double r = calcDistance(p);
		double G = 6.67e-11;
		double F = G*this.mass*p.mass/(r*r);
		return F;
	}

	public double calcForceExertedByX(Planet p){
		double r = calcDistance(p);
		double F = calcForceExertedBy(p);
		double Fx = F*(p.xxPos-this.xxPos)/r;
		return Fx;
	}

	public double calcForceExertedByY(Planet p){
		double r = calcDistance(p);
		double F = calcForceExertedBy(p);
		double Fy = F*(p.yyPos-this.yyPos)/r;
		return Fy;
	}

	public double calcNetForceExertedByX(Planet[] allPlanets){
		double Fnx=0;
		for(int i=0;i<allPlanets.length-1;i++){
			if(!this.equals(allPlanets[i])){
				Fnx=Fnx+this.calcForceExertedByX(allPlanets[i]);
			}
		}
		return Fnx;
	}

	public double calcNetForceExertedByY(Planet[] allPlanets){
		double Fny=0;
		for(int i=0;i<allPlanets.length-1;i++){
			if(!this.equals(allPlanets[i])){
				Fny=Fny+this.calcForceExertedByY(allPlanets[i]);
			}
		}
		return Fny;
	}

	public void update(double dt,double fX,double fY){
		double ax=fX/this.mass;
		double ay=fY/this.mass;
		this.xxVel=this.xxVel+dt*ax;
		this.yyVel=this.yyVel+dt*ay;
		this.xxPos=this.xxPos+dt*this.xxVel;
		this.yyPos=this.yyPos+dt*this.yyVel;
	}

	public void draw(){
		StdDraw.picture(xxPos,yyPos,"images/"+imgFileName);
	}
}