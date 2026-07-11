package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class cA extends AbstractList implements rv6, RandomAccess {
    private final rv6 list;

    class j implements ListIterator {
        ListIterator<String> iter;
        final /* synthetic */ int val$index;

        j(int i2) {
            this.val$index = i2;
            this.iter = cA.this.list.listIterator(i2);
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.iter.nextIndex();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.iter.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.iter.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    class n implements Iterator {
        Iterator<String> iter;

        n() {
            this.iter = cA.this.list.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.rv6
    public void add(C c2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public rv6 getUnmodifiableView() {
        return this;
    }

    @Override // com.google.protobuf.rv6
    public void set(int i2, C c2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public boolean addAllByteString(Collection<? extends C> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.rv6, com.google.protobuf.YzO
    public List<C> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i2) {
        return (String) this.list.get(i2);
    }

    @Override // com.google.protobuf.rv6
    public byte[] getByteArray(int i2) {
        return this.list.getByteArray(i2);
    }

    @Override // com.google.protobuf.rv6
    public C getByteString(int i2) {
        return this.list.getByteString(i2);
    }

    @Override // com.google.protobuf.rv6
    public Object getRaw(int i2) {
        return this.list.getRaw(i2);
    }

    @Override // com.google.protobuf.rv6
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new n();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new j(i2);
    }

    @Override // com.google.protobuf.rv6
    public void mergeFrom(rv6 rv6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.rv6
    public void set(int i2, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public cA(rv6 rv6Var) {
        this.list = rv6Var;
    }
}
