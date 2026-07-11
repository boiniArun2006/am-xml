package PF;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j implements Iterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f7650n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7651t = 0;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7651t < Array.getLength(this.f7650n);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f7650n;
        int i2 = this.f7651t;
        this.f7651t = i2 + 1;
        return Array.get(obj, i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }

    public j(Object obj) {
        if (obj.getClass().isArray()) {
            this.f7650n = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }
}
