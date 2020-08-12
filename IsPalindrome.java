class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		char[] ch = s.toCharArray();
		String ss = "";
		boolean d = false;
		for(int i= ch.length -1; i >= 0; i--){
			ss = ss + ch[i];
		}
		if(ss.equalsIgnoreCase(s)){
			d = true;
		}
		return d;
	}
}