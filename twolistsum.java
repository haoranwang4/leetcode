public class twolistsum {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode a = l1;
            ListNode b = l2;
            ListNode dummyhead = new ListNode (0);
            ListNode tmp = dummyhead;
            int carry = 0 ;
            while (a != null || b != null){
                int n1 = (a!=null)? a.val:0;
                int n2 = (b!=null)? b.val:0;
                int sum = n1+n2+carry;
                carry = sum/10;
                tmp.next = new ListNode(sum%10);
                tmp=tmp.next;
                if(a!= null) a=a.next;
                if(b!= null) b=b.next;
            }
            if(carry ==1){
                tmp.next = new ListNode(carry);
            }
            return dummyhead.next;
        }
    }

