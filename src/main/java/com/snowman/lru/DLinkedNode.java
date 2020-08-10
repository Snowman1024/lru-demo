package com.snowman.lru;

/**
 * @Description 双向链表节点
 * @Author Snowman1024
 * @Date 2020/5/9 11:22
 * @Version 1.0
 **/
public class DLinkedNode {
    String key;
    String value;

    DLinkedNode pre;
    DLinkedNode post;
}
