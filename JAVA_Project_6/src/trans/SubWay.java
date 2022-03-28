package trans;

public class SubWay extends Trans {
		private String lineNumber;
		
		SubWay(String lineNumber){
			this.lineNumber = lineNumber;
		}
		@Override
		public void showInfo() {
			System.out.println("지하철 노선 : "+lineNumber);
			super.showInfo();
		}

		@Override
		public String toString() {
			return "지하철";
		}
//		public void take(int money) {
//			super.take(money);
//		}
}
