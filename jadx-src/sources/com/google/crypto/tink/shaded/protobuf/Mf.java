package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Mf extends AbstractList implements afx, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f59909n;

    class j implements ListIterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ListIterator f59911n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f59912t;

        j(int i2) {
            this.f59912t = i2;
            this.f59911n = Mf.this.f59909n.listIterator(i2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f59911n.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f59911n.hasPrevious();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f59911n.nextIndex();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f59911n.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f59911n.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f59911n.previous();
        }
    }

    class n implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Iterator f59913n;

        n() {
            this.f59913n = Mf.this.f59909n.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59913n.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f59913n.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public afx getUnmodifiableView() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public void K(fuX fux) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public Object getRaw(int i2) {
        return this.f59909n.getRaw(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public List getUnderlyingElements() {
        return this.f59909n.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new n();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i2) {
        return new j(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f59909n.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        return (String) this.f59909n.get(i2);
    }

    public Mf(afx afxVar) {
        this.f59909n = afxVar;
    }
}
