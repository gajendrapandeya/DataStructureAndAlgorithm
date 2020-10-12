package com.codermonkeys.linkedlist

class LinkedList {

    inner class Node(val value: Int) {
        lateinit var next: Node
        constructor(no)
    }

    lateinit var first: Node
    lateinit var last: Node

    fun addLast(item: Int) {

        val node = Node(item)
    }
}