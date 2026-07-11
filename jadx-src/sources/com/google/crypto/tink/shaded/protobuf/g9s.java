package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class g9s extends w6 implements afx, RandomAccess {
    public static final afx J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final g9s f60006O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f60007t;

    public g9s() {
        this(10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    static {
        g9s g9sVar = new g9s();
        f60006O = g9sVar;
        g9sVar.makeImmutable();
        J2 = g9sVar;
    }

    public g9s(int i2) {
        this(new ArrayList(i2));
    }

    private static String nr(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof fuX ? ((fuX) obj).WPU() : SPz.xMQ((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f60007t.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fuX) {
            fuX fux = (fuX) obj;
            String strWPU = fux.WPU();
            if (fux.gh()) {
                this.f60007t.set(i2, strWPU);
            }
            return strWPU;
        }
        byte[] bArr = (byte[]) obj;
        String strXMQ = SPz.xMQ(bArr);
        if (SPz.Uo(bArr)) {
            this.f60007t.set(i2, strXMQ);
        }
        return strXMQ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection collection) {
        rl();
        if (collection instanceof afx) {
            collection = ((afx) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f60007t.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public Object getRaw(int i2) {
        return this.f60007t.get(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f60007t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f60007t.size();
    }

    private g9s(ArrayList arrayList) {
        this.f60007t = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.SPz.Ml
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public g9s mutableCopyWithCapacity(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f60007t);
            return new g9s(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public void K(fuX fux) {
        rl();
        this.f60007t.add(fux);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        rl();
        return nr(this.f60007t.set(i2, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        rl();
        Object objRemove = this.f60007t.remove(i2);
        ((AbstractList) this).modCount++;
        return nr(objRemove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        rl();
        this.f60007t.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.afx
    public afx getUnmodifiableView() {
        if (isModifiable()) {
            return new Mf(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, com.google.crypto.tink.shaded.protobuf.SPz.Ml
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        rl();
        this.f60007t.add(i2, str);
        ((AbstractList) this).modCount++;
    }
}
