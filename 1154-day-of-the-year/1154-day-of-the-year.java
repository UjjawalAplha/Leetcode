class Solution {
    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        int feb = (isLeap(year))? 29 : 28;
        int[] days = {0,31,feb,31,30,31,30,31,31,30,31,30,31};
        for(int i = 1; i < month; i++){
            day += days[i];
        }
        return day;
    }
    public boolean isLeap(int year){
        return(year%400==0) || ((year%100!=0) && (year%4==0));
    }
}