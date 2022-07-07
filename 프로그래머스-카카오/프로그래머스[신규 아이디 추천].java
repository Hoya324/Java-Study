class Solution {
    public String solution(String new_id) {
        String answer = "";
        // Step 1
        new_id = new_id.toLowerCase();
        
        // Step 2
        new_id = new_id.replaceAll("[^-_.a-z0-9]","");
        System.out.println(new_id);
        
        // Step 3
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        // Step 4
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("[.]$", "");
        
        
        // Step 5
        if (new_id.length() == 0) {
            new_id = "a";
        }
        
        // Step 6
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        
        new_id = new_id.replaceAll("[.]$", "");
        
        // Step 7
        if (new_id.length() < 3) {
            while(new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length()-1);
                
            }
        }
        answer = new_id;
        
        System.out.println(new_id);
        return answer;
    }
}