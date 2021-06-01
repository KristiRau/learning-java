public class StringsFive {

    public static void main(String[] args) {


        String s = "abcdefghij abcd defg";


        char c = s.charAt(9);
        System.out.println(c);

        System.out.println(s.indexOf( 'j' ));//indeks, järjekorra number, j indeks on 9
        System.out.println(s.indexOf( 'X' ));//doesnt exist

        System.out.println( "===============" );

        System.out.println(s.indexOf( 'd' )); //1st occurrence
        System.out.println(s.lastIndexOf( 'd' )); //last occurrence
        System.out.println(s.indexOf('d', s.indexOf('d') + 1)); //2nd occurrence
        // ch: and fromIndex: no need to write these out, they appear automatically

        int x = s.indexOf('d');
        int y = s.indexOf('d', x+1);

        System.out.println("VALUE y: " + y);



        //how many times did it occur
        int count = 0;
        for(int i=0; i < s.length(); i++)
        {    if(s.charAt(i) == 'd')
            count++;
        }
        System.out.println("Letter d occurred: " + count); //tee kodus





        System.out.println("===============" );

        String str = "JAVA is a Language, is a Coffee, is an Island. ";
        String find_str = "is";
        System.out.println(str.indexOf(find_str));
        System.out.println(str.lastIndexOf(find_str));
        System.out.println(str.length());
        System.out.println(str.indexOf("is", str.indexOf("is") + 1));
        System.out.println(str.indexOf("is", str.indexOf("is") + 1));


        //2nd occurrence ???


        //count number of times word appears in string java





    }
}

/*
    int first = s.indexOf('d');
    int second = s.indexOf('d', first + 1);
        System.out.println(second);*/