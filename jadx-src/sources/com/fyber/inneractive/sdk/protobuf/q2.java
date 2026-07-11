package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class q2 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q2 f56643d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f56644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56645c;

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i2 = this.f56645c;
        Object[] objArr = this.f56644b;
        if (i2 == objArr.length) {
            this.f56644b = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f56644b;
        int i3 = this.f56645c;
        this.f56645c = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    static {
        q2 q2Var = new q2(new Object[0], 0);
        f56643d = q2Var;
        q2Var.f56537a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i2) {
        if (i2 >= this.f56645c) {
            return new q2(Arrays.copyOf(this.f56644b, i2), this.f56645c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 < this.f56645c) {
            return this.f56644b[i2];
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56645c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56645c;
    }

    public q2(Object[] objArr, int i2) {
        this.f56644b = objArr;
        this.f56645c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3;
        c();
        if (i2 >= 0 && i2 < (i3 = this.f56645c)) {
            Object[] objArr = this.f56644b;
            Object obj = objArr[i2];
            if (i2 < i3 - 1) {
                System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
            }
            this.f56645c--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56645c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        c();
        if (i2 >= 0 && i2 < this.f56645c) {
            Object[] objArr = this.f56644b;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            ((AbstractList) this).modCount++;
            return obj2;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56645c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        c();
        if (i2 >= 0 && i2 <= (i3 = this.f56645c)) {
            Object[] objArr = this.f56644b;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f56644b, i2, objArr2, i2 + 1, this.f56645c - i2);
                this.f56644b = objArr2;
            }
            this.f56644b[i2] = obj;
            this.f56645c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56645c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
