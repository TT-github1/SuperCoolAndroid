package com.tthappy.supercoolandroid.Internet.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lucas
 */
public class PageBaseResult<T> {
    public int total;
    public int pagesize;
    public int page;
    public List<T> list = new ArrayList<>();
}
