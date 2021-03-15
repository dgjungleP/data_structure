package com.jungle.ds.linked.demo;

public interface Linked {
    public void add(long data);

    public void add(int index, long data);

    public void remove(int index);

    public void remove(long data);

    public void set(int index, long data);

    public long get(int index);

    public int getSize();
}
