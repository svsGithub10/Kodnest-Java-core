package com.kodnest.methods2;

class MessageDecoder {
char ch;
int decodeCharacter(char ch) {
	return ch;
}
}

 class MessageDecoderApp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageDecoder decoder = new MessageDecoder();

		System.out.println(decoder.decodeCharacter('A'));
	}

}
