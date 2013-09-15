/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lineintersect;

/**
 *
 * @author admin
 */
public class function {
    public boolean intersect(int point[][]){
        int n=point.length;
        int k=0;
        int f_point[][]=new int[20][2];
        int s_point[][]=new int[20][2];
        
        
        for(int i=0;i<n;i++){
            f_point[k][0]=point[i][0];
            f_point[k][1]=point[i][1];
            for(int j=i+1;j<n;j++){
                s_point[k][0]=point[j][0];
                s_point[k][1]=point[j][1];
                k++;
            }
        }
        --k;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if()
            }
        }
        
        return false;
    }
}
