class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        String day = arr[0].replaceAll("\\D", "");
        if (day.length() == 1) day = "0" + day; 

        // Map month string to its number
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        String month = monthMap.get(arr[1]);
        String year = arr[2];

        return year + "-" + month + "-" + day;
    }
}
