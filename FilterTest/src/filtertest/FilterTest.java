
package filtertest;

import java.util.ArrayList;

public class FilterTest {

    public static void main(String[] args) {

        Filter chocolateFilter = new SimpleFilter("chocolate");
        Filter candyFilter = new SimpleFilter("candy");
        Filter noVeggies = new NotFilter(new SimpleFilter("vegetable"));

        AndFilter yummy = new AndFilter(chocolateFilter, candyFilter);
        yummy.add(noVeggies);

        Filter cakeFilter = new SimpleFilter("cake");
        Filter noHealthy = new NotFilter(new SimpleFilter("granola"));

        AndFilter cake = new AndFilter(cakeFilter, noHealthy);
        AndFilter bday = new AndFilter(yummy, cake);

        System.out.println(yummy.accept("vegetable soup with candy"));
        System.out.println(yummy.accept("vegetable soup with candy and chocolate"));
        System.out.println(yummy.accept("Dessert with candy and chocolate"));
        System.out.println(yummy.accept("candy"));
        System.out.println(bday.accept("chocolate cake with candy cane icing"));
        System.out.println(bday.accept("chocolate cake with candy cane icing and granola"));

    }

}

interface Filter {

    public boolean accept(String s);

    public String getString();

    public String getType();

}

class SimpleFilter implements Filter {

    private String s;

    public SimpleFilter(String s1) {
        s = s1;
    }

    public boolean accept(String s3) {
        if (s3.contains(s)) {
            return (true);
        }
        return (false);
    }

    public String getString() {
        return (s);
    }

    public String getType() {
        return ("SimpleFilter");
    }

}

class NotFilter implements Filter {

    private String check;

    public NotFilter(Filter sf) {
        check = sf.getString();
    }

    public boolean accept(String s3) {
        if (s3.contains(check)) {
            return (false);
        }
        return (true);
    }

    public String getString() {
        return (check);
    }

    public String getType() {
        return ("NotFilter");
    }

}

class OrFilter implements Filter {

    ArrayList mustContain = new ArrayList();
    ArrayList mustNotContain = new ArrayList();

    public OrFilter(Filter vF, Filter fF) {
        mustContain.add(vF.getString());
        mustContain.add(fF.getString());

    }

    public boolean accept(String s) {

        for (int i = 0; i < mustContain.size(); i++) {
            String temp = (String) mustContain.get(i);
            if (s.contains(temp)) {
                return (true);
            }

        }
        for (int i = 0; i < mustNotContain.size(); i++) {
            String temp = (String) mustNotContain.get(i);
            if (s.contains(temp)) {
                return (false);
            }
        }
        return (true);

    }

    public void add(Filter fi) {
        String k = fi.getType();
        if (k.equals("NotFilter")) {
            mustNotContain.add(fi.getString());
        }
        if (k.equals("SimpleFilter")) {
            mustContain.add(fi.getString());
        }

    }

    public String getString() {
        return ("");
    }

    public void mustC() {
        System.out.println(mustContain);
        System.out.println(mustNotContain);
    }

    public String getType() {
        return ("OrFilter");
    }

}

//AND FILTER------------
class AndFilter implements Filter {

    ArrayList filters = new ArrayList();

    public AndFilter(Filter vF, Filter fF) {
        filters.add(vF);
        filters.add(fF);

    }

    public boolean accept(String s) {
        int count = 0;
        int count2 = filters.size();
        for (int i = 0; i < filters.size(); i++) {
            Filter temp = (Filter) filters.get(i);
            if (temp.accept(s) == true) {

                count++;
            }
            if (count == count2) {
                return (true);
            }
        }
        return (false);
    }

    public void add(Filter fi) {
        filters.add(fi);

    }

    public String getString() {
        return ("");
    }

    public String getType() {
        return ("OrFilter");
    }

}
