/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/3/31 20:20
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class Erfenfa {
    static int bsearch( String[] a, String v ) {
        	  int l, r;
        	  l = 0; r = a.length-1;
        	  while ( l <= r ) {
            	  int m = (l+r)/2;
            	  if ( a[m].compareTo(v)==0 ) return m; else
                	  if ( a[m].compareTo(v)>0 ) r = m-1; else
                	  if ( a[m].compareTo(v)<0 ) l = m+1;
            	  }
        	  return -1;
        	  }
	 public static void main(String[] args) {
        	    String str[] = {"a","b","c","d","e","f","g","h"};
        	    int bsearch = bsearch(str, "g");
        	    System.out.println(bsearch);
        	 }

}
