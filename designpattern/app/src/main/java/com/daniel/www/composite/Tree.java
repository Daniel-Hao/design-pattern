package com.daniel.www.composite;

/**
 * desc:Tree
 * Author: Daniel
 * Date: 2017-01-09 13:48
 */
public class Tree {

    public TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }
}
