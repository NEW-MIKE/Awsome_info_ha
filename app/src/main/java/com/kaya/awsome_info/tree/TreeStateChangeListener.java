package com.kaya.awsome_info.tree;


public interface TreeStateChangeListener {
    void onOpen(TreeItem treeItem, int position);
    void onClose(TreeItem treeItem, int position);
}
