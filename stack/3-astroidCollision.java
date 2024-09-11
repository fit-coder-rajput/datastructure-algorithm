class Solution {
    public int[] asteroidCollision(int[] aes) {

            Deque<Integer> stack = new ArrayDeque<>();
            for(int i=0; i<aes.length; i++){
                int as = aes[i];
                while(!stack.isEmpty() && (as < 0 && stack.peek()>0)){
                    if(stack.peek() > Math.abs(as)){
                        as = 0;
                    }else if(stack.peek() == Math.abs(as)){
                        stack.pop();
                        as=0;
                    }else{
                        stack.pop();
                    }
                }
                if(as != 0)
                    stack.push(as);
                    
            }
            int n = stack.size()-1;
            int[] ans = new int[n+1];

            while(!stack.isEmpty()){
                ans[n--] = stack.pop();
            }
            return ans;
    }
}