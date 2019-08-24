import java.util.ArrayList;
import java.util.Iterator;

public class Search {
    double distance;
    String restName;
    void search(RestMap []rs,User u){

        ArrayList rname= new ArrayList();
        ArrayList sname= new ArrayList();
//      rname=;
//      sname=;
        Iterator<String> ir= rname.iterator();
        Iterator<String> is=sname.iterator();
        int k=0;
        while (ir.hasNext()){
            rs[k++].name=ir.next();
        }k=0;
        while (is.hasNext()){
            rs[k++].street=is.next();
        }
        ArrayList distance= new ArrayList();
        for (int i=0;i<RestMap.restNo;i++){
            distance.add(Math.sqrt((Math.pow(rs[i].x-u.x,2)-(Math.pow(rs[i].y-u.y,2)))));
        }
    }
    void setDistance(ArrayList rname, ArrayList sname, ArrayList distance){
        ArrayList<ArrayList> distRest=new ArrayList<>();
        distRest.add(rname);
        distRest.add(sname);
        distRest.add(distance);


    }

}
