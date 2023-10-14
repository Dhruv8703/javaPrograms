class characterLiteral{
    public static void main(String[]s){
    char a= 'h';
    char b= '"';
    char c= '5';
    //char c= '50'; //error
    char d= '\n';
    char e = '\t';
    char ee='\\';
    //char ee='\' error
    char eee= '/';
    char f=104;//character literal [ASCII codes 0-255]
    char g ='\u0068';//character literal [UNI codes 0-65535]\
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(ee);
    System.out.println(eee);
    System.out.println(f);
    System.out.println(g);
    
}
}