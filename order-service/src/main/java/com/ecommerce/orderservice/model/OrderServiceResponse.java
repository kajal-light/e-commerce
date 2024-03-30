package com.ecommerce.orderservice.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OrderServiceResponse implements List<OrderServiceResponse> {

    private String productId;
    private Integer stock;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<OrderServiceResponse> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(OrderServiceResponse orderServiceResponse) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends OrderServiceResponse> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends OrderServiceResponse> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public OrderServiceResponse get(int index) {
        return null;
    }

    @Override
    public OrderServiceResponse set(int index, OrderServiceResponse element) {
        return null;
    }

    @Override
    public void add(int index, OrderServiceResponse element) {

    }

    @Override
    public OrderServiceResponse remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<OrderServiceResponse> listIterator() {
        return null;
    }

    @Override
    public ListIterator<OrderServiceResponse> listIterator(int index) {
        return null;
    }

    @Override
    public List<OrderServiceResponse> subList(int fromIndex, int toIndex) {
        return null;
    }
}
