import java.util.ArrayList;
import java.util.Iterator;

public class Execute {
    public static void main(String[] args) {
        BlockMap bm= new BlockMap();
        bm.createMap();
        User u=new User("Shubham","Tilak Road");
        u.x=bm.getX(u.street);
        u.y=bm.getY(u.street);
        RestMap []rs=new RestMap[RestMap.restNo];
        for (int i=0;i<RestMap.restNo;i++){
            rs[i]=new RestMap();
        }
        Search search= new Search();
        search.search(rs,u);

//        {//USE FOR LOOP HERE
//            rs[0].index = 1;
//            rs[0].name = "Ravi Rice";
//            rs[0].street = "Patel Road";
//            rs[0].x = bm.getX(rs[0].street);
//            rs[0].y = bm.getY(rs[0].street);
//            rs[1].index = 2;
//            rs[1].name = "Jay Sandwich";
//            rs[1].street = "Talmaki Road";
//            rs[1].x = bm.getX(rs[1].street);
//            rs[1].y = bm.getY(rs[1].street);
//        }

    }
}
