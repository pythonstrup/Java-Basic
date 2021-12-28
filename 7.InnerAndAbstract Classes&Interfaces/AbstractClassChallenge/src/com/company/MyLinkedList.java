package com.company;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparision = (currentItem.compareTo(item));
            if(comparision < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if(comparision > 0) {
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    item.setNext(this.root).setNext(item);
                    this.root = item;
                }
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparision = currentItem.compareTo(item);
            if(comparision == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparision < 0 ){
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        } else {
            while(root != null){
                root = root.next();
            }
        }
    }
}
