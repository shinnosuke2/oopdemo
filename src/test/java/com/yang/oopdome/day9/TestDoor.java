package com.yang.oopdome.day9;

public class TestDoor {
    public static void main(String[] args) {
        TheftProofDoor door=new TheftProofDoor();
        door.close();
        door.lockUp();
        door.lockOpen();
        door.takePhoto();
        door.open();
    }
}
