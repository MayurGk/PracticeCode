
public class NewClass {

	public static void main(String[] args) {

		String[] wordlist1 = {"abcd","hjekm","newclass","jhjwek"}; 
		String[] wordlist2={"nene","eeeee","fede"};
		String[] wordlist3={"fsd","sdf","wqq"};

		int len1=wordlist1.length;
		int len2=wordlist2.length;
		int len3=wordlist3.length;
		
		int rand1=(int)(Math.random() * len1);
        int rand2=(int)(Math.random() * len2);
        int rand3=(int)(Math.random() * len3);

        String phrase = wordlist1[rand1]+ " " + wordlist2[rand2] + " " + wordlist3[rand3];

        System.out.println(phrase);
	}

	
	

}



