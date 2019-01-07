package com.huahuan.Algoritmo;

public class RebuildTwoForkTree {

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		 if(pre.length == 0){return null;}//当长度为0直接返回空树
		    TreeNode root=new TreeNode(pre[0]);//pre[0]是根值
			int len=pre.length;
			//len=1 说明是只有根的树
			if(len==1){
		        root.left=null;
		        root.right=null;
				return root;
			}
			//找到中序根位置index
			int rootnode=root.val;
			int i;
			for(i=0;i<len;i++){
				if(rootnode==in[i])
					break;
			}
		        
		    /**
		        按照根的搜索方式，建立子树的前序遍历和中序遍历，并进行递归调用
		        */
		        
			//创建左子树
			if(i>0){
		        
				int[] pre_left=new int[i];
				int[] in_left=new int[i];
				for(int j=0;j<i;j++){
					pre_left[j]=pre[j+1];
				}
				for(int j=0;j<i;j++){
					in_left[j]=in[j];
				}
				root.left=reConstructBinaryTree(pre_left,in_left);
			}else{
				root.left=null;
			}
			//创建右子树
			if(len-i-1>0){
				int[] pre_right=new int[len-i-1];
				int[] in_right=new int[len-i-1];
				for(int j=i+1;j<len;j++){            //j=i+1,因为i为中序根节点位置，也为前序遍历左子树的最后一个节点的位置
					pre_right[j-i-1]=pre[j];
					in_right[j-i-1]=in[j];
				}
				root.right=reConstructBinaryTree(pre_right,in_right);
			}else{
				root.right=null;
			}
			
			
		    return root;

    }
	
}


 class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}