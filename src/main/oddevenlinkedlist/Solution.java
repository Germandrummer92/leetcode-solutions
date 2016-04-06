package oddevenlinkedlist;

/**
 * @author Daniel Draper <a href="mailto:Germandrummer92@gmail.com">
 * @version 1.0
 *          Created on ${Date}
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddHead = head;
        ListNode oddCurrent = head;
        ListNode evenHead = head.next;
        ListNode evenCurrent = head.next;
        head = evenHead.next;
        int i = 3;
        while (head != null) {
            if (i % 2 == 1) {
                oddCurrent.next = head;
                oddCurrent = oddCurrent.next;
            } else {
                evenCurrent.next = head;
                evenCurrent = evenCurrent.next;
            }
            i++;
            head = head.next;
        }
        oddCurrent.next = evenHead;
        evenCurrent.next = null;
        return oddHead;
    }
}
