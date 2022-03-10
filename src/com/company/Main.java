package com.company;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static  class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.value = value;
        }
    }
    public void preorder(TreeNode root)
    {
        if (root == null) return;

        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(TreeNode root){
        if (root == null) return;

        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }
    public void postorder(TreeNode root){
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }
    public static void printList(ListNode head){
        ListNode currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
    public ListNode insertNodeAtHead(ListNode listNode,int data){
        ListNode newNode = new ListNode(data);
        newNode.next =  listNode;
        listNode = newNode;
        return listNode;
    }
    public static boolean isUniq(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int el:nums){
            if (set.contains(el)) return false;
            set.add(el);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        //int[] nums = new int[] {3,4,2,1,9,6};
        //System.out.println(isUniq(nums));
    }
}
