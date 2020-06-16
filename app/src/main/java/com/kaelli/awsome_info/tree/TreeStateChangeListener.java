package com.kaelli.awsome_info.tree;

/**
 * Created by KaelLi on 2018/11/26.
 */
public interface TreeStateChangeListener {
    void onOpen(TreeItem treeItem, int position);
    void onClose(TreeItem treeItem, int position);
}
