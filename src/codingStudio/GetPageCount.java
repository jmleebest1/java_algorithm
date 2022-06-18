package codingStudio;

public class GetPageCount {
	private int getPagingCount(int totalCnt, int pageCnt){

		int cnt = totalCnt / pageCnt;

		cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;

		return cnt;
		}
}
