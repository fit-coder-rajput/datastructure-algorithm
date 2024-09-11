class Solution {
    public String simplifyPath(String path) {
        String[] str  = path.split("/+");
        Deque<String> stack =new ArrayDeque<>();
        for(String s: str){
           if(s.equals("..")){
            if(stack.isEmpty() == false)
             stack.pop();
           }else if(s.equals(".") == false){
            stack.push(s);
           }
        }
        String res = "";
        while(stack.size()>0){
            String ss = stack.pop();
            if("".equals(ss) == false)
            res = "/"+ss+res;
        }

        return res == ""?"/":res;
    }
}