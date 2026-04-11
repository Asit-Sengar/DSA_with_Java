//here main idea is that we will keep track of the head variable
//if we are iteration left to right head will change otherwise if we are traversing from right to left then the remaining elements should be odd for head to change
//head will update as head = head + step 
//and step will step *2;
class Solution {
    public int lastRemaining(int n) {
        int remaining = n;
        int head = 1;
        int step = 1;
        boolean islefttoright = true;
        while(remaining >1)
        {//if it is left to right then update the head;
            if(islefttoright || (!islefttoright && remaining %2!=0))
            {//now we will update the head;
                head = head + step;
            }
            step = step * 2;
            remaining = remaining/2;
            islefttoright = !islefttoright;
        }
        return head;
    }
}
