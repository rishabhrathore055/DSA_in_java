class Solution {
    public int largestAltitude(int[] gain) {
        int highest_altitude ;
        if(0>gain[0])
            highest_altitude = 0;
        else 
            highest_altitude=gain[0];
        int curr_peak=gain[0];
        for(int i=1; i<gain.length; i++){
            curr_peak += gain[i];
            if(curr_peak>highest_altitude)
            highest_altitude=curr_peak;
        }
        return highest_altitude; 
    }
}