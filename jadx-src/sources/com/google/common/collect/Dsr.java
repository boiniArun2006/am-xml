package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr extends aC {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    transient int f59600Z;

    private Dsr() {
        this(12, 3);
    }

    private Dsr(int i2, int i3) {
        super(yg.t(i2));
        Pl.rl(i3, "expectedValuesPerKey");
        this.f59600Z = i3;
    }

    public static Dsr E2() {
        return new Dsr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Ml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List XQ() {
        return new ArrayList(this.f59600Z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f59600Z = 3;
        int iO = AbstractC1899p.O(objectInputStream);
        g(eO.XQ());
        AbstractC1899p.rl(this, objectInputStream, iO);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC1899p.J2(this, objectOutputStream);
    }

    @Override // com.google.common.collect.Ml, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.w6, com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.w6, com.google.common.collect.Ml, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ boolean gh(Object obj, Iterable iterable) {
        return super.gh(obj, iterable);
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ Set mUb() {
        return super.mUb();
    }

    @Override // com.google.common.collect.Ml, com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ Collection n() {
        return super.n();
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ boolean nr(Object obj) {
        return super.nr(obj);
    }

    @Override // com.google.common.collect.w6, com.google.common.collect.Ml, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.w6, com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ Map rl() {
        return super.rl();
    }

    @Override // com.google.common.collect.Ml, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean t(Object obj, Object obj2) {
        return super.t(obj, obj2);
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.Ml, com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
