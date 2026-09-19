class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xi = 0;
        int yi = 0;
         if(x1>xCenter) xi = x1;
         else if(xCenter>x2) xi = x2;
         else xi = xCenter;

          if(y1>yCenter) yi = y1;
         else if(yCenter>y2) yi = y2;
         else yi = yCenter;
         int dis =(int) Math.sqrt((xCenter-xi) * (xCenter-xi) +( yCenter-yi) * (yCenter-yi));
         if(dis<=radius) return true;
         else return false;
             }
}