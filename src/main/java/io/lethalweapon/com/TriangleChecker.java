package io.lethalweapon.com;

/**
 * Created by brianabbott on 6/10/16.
 */
public class TriangleChecker implements Checker {

    Triangle currentTriangle;



    public int outputAnswer(int x1, int y1, int x2, int y2, int x3, int y3,int p1, int q1, int p2, int q2){

        if(check(x1,y1,x2,y2,x3,y3) == false){
            return 0;
        }
        boolean pIsInside = pointChecker(p1,q1);
        boolean qIsInside = pointChecker(p2,q2);

        if(pIsInside && qIsInside){
            return 3;
        } else if(pIsInside){
            return 1;
        } else if(qIsInside){
            return 2;
        }
        return 4;
    }


    public boolean check(int x1, int y1, int x2, int y2, int x3, int y3) {

        if(x1 == x2 && x1 == x3) return false;

        if(y1 == y2 && y1 == y3) return false;

        currentTriangle = makeTriangle(x1,y1,x2,y2,x3,y3);
        return true;
    }

    public Triangle makeTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        return new Triangle(x1,y1,x2,y2,x3,y3);
    }


    public boolean pointChecker(int px, int py){
        double triangleArea = area(currentTriangle.getX1(),currentTriangle.getY1(),currentTriangle.getX2(),currentTriangle.getY2(),
                currentTriangle.getX3(),currentTriangle.getY3());
        double aArea = area(px,py,currentTriangle.getX2(),currentTriangle.getY2(),currentTriangle.getX3(),currentTriangle.getY3());
        double bArea = area(currentTriangle.getX1(),currentTriangle.getY1(),px,py,currentTriangle.getX3(),currentTriangle.getY3());
        double cArea = area(currentTriangle.getX1(),currentTriangle.getY1(),currentTriangle.getX2(),currentTriangle.getY2(),px,py);

        return (triangleArea == aArea + bArea + cArea);
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs(x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0;
    }

}
