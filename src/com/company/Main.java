package com.company;
import java.util.Scanner;
public class Main {
    static Node creation()
    {
       int data;
       Scanner sc=new Scanner(System.in);
       Node root=null;
       System.out.print("enter value:");
       data=sc.nextInt();
       if(data==-1)
           return null;
       root=new Node(data);
       System.out.print("enter left child of"+root);
       root.left=creation();
       System.out.print("enter right child of"+root);
       root.right=creation();
       return root;
       }
    public static void main(String[] args) {
	Node root=creation();
    }
}
class Node
{
    Node left,right;
    int data;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
