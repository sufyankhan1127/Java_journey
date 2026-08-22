package leetcode150;

public class l11 {

	public int hIndex(int[] citations) {

		for(int i=0;i<citations.length;i++){
			for(int j=0;j<citations.length-1-i;j++){
				if(citations[j]>citations[j+1]){
					int temp=citations[j];
					citations[j]=citations[j+1];
					citations[j+1]=temp;
				}
			}
		}

//		int res=0;
//
//		if((citations.length%2)!=0){
//			res=citations[(citations.length/2)];
//
//		}
//		else if(citations.length<2){
//			return citations[0];
//		}
//
//		else{
//			res=citations[(citations.length/2)-1];
//
//		}
//
//
//		return res;
		
		
		int res = 0;

        for (int i = citations.length - 1; i >= 0; i--) {

            int papers = citations.length - i;

            if (citations[i] >= papers) {
                res = papers;
            } else {
             break;
            }
        }

        return res;
        

	}


}

