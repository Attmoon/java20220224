package chap09.book.exercise.p06;

public class Chatting {
	void statrChat(String chatId) {
		String nickName = null;
//		nickName = chatId; // 문제의 코드
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + nickName;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
