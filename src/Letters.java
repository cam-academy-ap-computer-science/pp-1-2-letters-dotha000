
public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letter1();
		System.out.println();
		letter2();
		System.out.println();
		letter3();
	}
	
	//LETTER 1
	public static void letter1() {
		System.out.println("Dear Michael,");
		opening();
			//BODY 1
			System.out.println("\tSince the last time I saw you I've found multiple\nthings inside myself I didn't know were there before. Specifically,\nthree new interests of mine. First I found myself enjoy\nplaying basketball. It's really fun to play with friends after\neating your lunch. I also enjoy playing soccer. It's a sport\nthat requires lots of skill and is really fun. Last of\nall I really like eating food! Of course anyone likes\nfood but I have an addiction to it.");
				//CLOSING 1
				System.out.println("\tI really wish you were here so that I could\nshare these interests with you. All of this would be\nso much better with you in the picture. Hope to see you soon.\n\tSincerely,\n\tThanh");
	}
	
	//LETTER 2
	public static void letter2() {
		System.out.println("Dear Ashton,");
		opening();
			//BODY 2
			System.out.println("\tI've been dying to talk to you since the last\ntime we met. I really want to tell you about\nmy new classes in my new school. One of my\nclass is AP computer science. So far it hasn't been\nto difficult but maybe soon it will get more challenging.\nAnother one of my class is AP biology. I'm really\nexcited about this class because we get to learn about\nlife and disecting animals. Lastly I have honors pre-calculus.\nIt's nothing too hard yet but it's still a subject I enjoy.");
				//CLOSING 2
				System.out.println("\tIf only you were here to be in these classes\nwith me. We could be gliding through assignments and eating\nlunch together. Anyways I hope to see you soon.\n\tSincerely\n\tThanh");
	}
	
	//LETTER 3
	public static void letter3() {
		System.out.println("Dear Noah,");
		opening();
			//BODY 3
			System.out.println("\tI have so much to tell you right now. Over\nthe summer I went to exciting new places that were\nreally cool. One place I went to was Vietnam which\nwas really hot. Another place was Disney Land. Even though\nI'm old I still enjoy seeing the magic happen. These\nplaces were cool and all but it was nothing compared\nto when I came back home.");
				//CLOSING 3
				System.out.println("\tI really wished that you were there with me on\nvacation. I hope to hear from you soon.\n\tSincerely,\n\tThanh");
	}
	
	//THE SIMILAR PARAGRAPH
	public static void opening() {
		System.out.println("\tI have a lot of things to tell you. I don't\neven know where to start! I guess to start I could\nsay that I've been doing well. That was only\nthe beginning, now let me tell you about the main thing.");
	}

}
