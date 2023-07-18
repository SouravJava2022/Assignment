package in.deb;

public class Q3 extends VersionControl {
	public int firstBadVersion(int n) {
        int low = 0, high = n , mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(firstBadVersion(mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

}