package leetcode.editor.cn;//Add Two Numbers
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学
/**
 * @author Steven
 */


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sumListNode = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode pSum = sumListNode;
        int sum = 0;
        while (p1 != null || p2 != null) {

            if (p1 == null) {
                sum += p2.val;
                p2 = p2.next;
            } else if (p2 == null) {
                sum += p1.val;
                p1 = p1.next;
            } else {
                sum += p1.val + p2.val;
                p1 = p1.next;
                p2 = p2.next;
            }
            pSum.next = new ListNode(sum%10);
            pSum = pSum.next;
            sum /= 10;
        }
        if (sum == 1) {
            pSum.next = new ListNode(0);
        }
        return sumListNode.next;
    }

    public static void main(String[] args) {
        int[] array1 = {2,4,3};
        int[] array2 = {5,6,4};
        Solution2 solution2 = new Solution2();
        ListNode number1 = solution2.buildListNode(array1);
        ListNode number2 = solution2.buildListNode(array2);

        ListNode result = solution2.addTwoNumbers(number1, number2);
        System.out.println();
    }

    private ListNode buildListNode(int[] array){

        ListNode head = new ListNode();
        ListNode p = null;
        p = head;

        for (int number : array) {
            p.next = new ListNode(number);
            p = p.next;
        }
        return head.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(){}
}
//leetcode submit region end(Prohibit modification and deletion)
