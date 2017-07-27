import java.util.*;

/**
 * Created by Mew on 2017/7/23.
 */
public class Test {
    /*
    * 5
    * 0 7
    * 9 11
    * 12 14
    * 14 16
    * 17 22
    * 3
    * 1 12
    * 13 17
    * 18 24
    *测试用例
    * */
    public static void main(String[] args) {
        Map<Integer, Integer> a = new HashMap<Integer, Integer>(), b = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        for (int i = 0; i < an; i++) {
            int t1 = scanner.nextInt(), t2 = scanner.nextInt();
//            System.out.println("!!"+t1+" "+t2);
            a.put(t1, t2);
        }
        int bn = scanner.nextInt();
        for (int i = 0; i < bn; i++) {
            int t1 = scanner.nextInt(), t2 = scanner.nextInt();
            b.put(t1, t2);
//            System.out.println("!!"+t1+" "+t2);
        }
//        System.out.println(s+" "+e);
        int max=0,temp=0;//最长活动时间
        boolean flag =false;
        Set set =null,pset =null;

        if(an>bn){
            flag=true;
            set =a.keySet();
        }
        else{
            flag=false;
            set = b.keySet();
        }
        if(flag){
            pset = b.keySet();
        }
        else {
            pset = a.keySet();
        }
        for(Iterator iter = set.iterator(); iter.hasNext();)
            {
                int key = (Integer) iter.next();
                int value = 0;
                if(flag){
                    value = (int)a.get(key);
                }
                else{
                    value = (int)b.get(key);
                }
                System.out.println("a"+key+"===="+value);
                for(Iterator piter = pset.iterator(); piter.hasNext();){
                    int pkey = (Integer) piter.next();
                    int pvalue=0;
                    if(flag){
                        pvalue = (int)b.get(pkey);
                    }
                    else{
                        pvalue = (int)a.get(pkey);
                    }
                    if(pkey>value){
                        break;
                    }
                    if(key>pvalue){
                        break;
                    }
                    int s,e;
                    if(pkey<key){
                        s=pkey;
                    }
                    else {
                        s=key;
                    }
                    if(pvalue>value){
                        e=pvalue;
                    }
                    else {
                        e=value;
                    }
                    temp = s+e-Math.abs(pkey-key)-Math.abs(pvalue-value);
                    if(temp>max){
                        max=temp;
                    }

                    System.out.println("b"+pkey+"===="+pvalue);
                }
            }
                    System.out.println(max);

    }
}
