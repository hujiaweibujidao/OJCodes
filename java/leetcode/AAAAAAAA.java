import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * hujiawei - 15/3/20.
 * <p/>
 * 这个类只是用来测试用的
 */
public class AAAAAAAA {

    public static void main(String[] args) {

        int t = 0;
        if ((t & 0x1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //String str = "I love  alibaba ";
        //str = str.trim();
        //str = str.replaceAll(" +"," ");
        //System.out.println(str);

        //String a = "aaa";
        //String b = "aaa";
        //System.out.println(a == b);//true
        //System.out.println(a.hashCode() == b.hashCode());//true
        //System.out.println(a.intern() == b.intern());//true
        //System.out.println(a.equalsIgnoreCase(b));//true
        //
        //String c = "bbb";
        //String d = new String("bbb");
        //System.out.println(c == d);//false
        //System.out.println(c.hashCode() == d.hashCode());//true
        //System.out.println(c.intern() == d.intern());//true
        //System.out.println(c.equalsIgnoreCase(d));//true
        //
        //String e = "ccc";
        //String f = e;
        //System.out.println(e == f);//false
        //System.out.println(e.hashCode() == f.hashCode());//true
        //System.out.println(e.intern() == f.intern());//true
        //System.out.println(e.equalsIgnoreCase(f));//true

        //System.out.println(new String("2b37ddb1972061b91f24f3e1b9d84c66ad00dd14").length());
        //System.out.println(2%6);//2
        //String str = "01234567890";
        //int start = 0;
        //String tag = str.substring(start, start + 8);
        //System.out.println(tag);
    }

    private static void test3() {
        int n = 2147395599;
        int m = n / 2;
        int m2 = m * m;
        System.out.println(m2);
    }

    private static void test2() {
        List<String> list = new ArrayList<String>();
        list.add("china");
        list.add("test");
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void test1() {
        String tmp = "ghalshdg";
        char[] chars = tmp.toCharArray();
        Arrays.sort(chars);
        System.out.println(String.valueOf(chars));
    }

}
