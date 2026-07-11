package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class u1 extends c implements j1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u1 f56678d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f56679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56680c;

    public u1() {
        this.f56679b = new long[10];
        this.f56680c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f56680c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56680c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        long[] jArr = this.f56679b;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f56679b, i2, jArr2, i2 + 1, this.f56680c - i2);
            this.f56679b = jArr2;
        }
        this.f56679b[i2] = jLongValue;
        this.f56680c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return super.equals(obj);
        }
        u1 u1Var = (u1) obj;
        if (this.f56680c != u1Var.f56680c) {
            return false;
        }
        long[] jArr = u1Var.f56679b;
        for (int i2 = 0; i2 < this.f56680c; i2++) {
            if (this.f56679b[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f56680c; i3++) {
            long j2 = this.f56679b[i3];
            Charset charset = l1.f56612a;
            i2 = (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i2;
    }

    static {
        u1 u1Var = new u1(new long[0], 0);
        f56678d = u1Var;
        u1Var.f56537a = false;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f56680c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56680c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final u1 b(int i2) {
        if (i2 >= this.f56680c) {
            return new u1(Arrays.copyOf(this.f56679b, i2), this.f56680c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f56680c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f56679b[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        c(i2);
        long[] jArr = this.f56679b;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56680c;
    }

    public final void a(long j2) {
        c();
        int i2 = this.f56680c;
        long[] jArr = this.f56679b;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f56679b = jArr2;
        }
        long[] jArr3 = this.f56679b;
        int i3 = this.f56680c;
        this.f56680c = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f56612a;
        collection.getClass();
        if (!(collection instanceof u1)) {
            return super.addAll(collection);
        }
        u1 u1Var = (u1) collection;
        int i2 = u1Var.f56680c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f56680c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            long[] jArr = this.f56679b;
            if (i5 > jArr.length) {
                this.f56679b = Arrays.copyOf(jArr, i5);
            }
            System.arraycopy(u1Var.f56679b, 0, this.f56679b, this.f56680c, u1Var.f56680c);
            this.f56680c = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return Long.valueOf(this.f56679b[i2]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        c();
        c(i2);
        long[] jArr = this.f56679b;
        long j2 = jArr[i2];
        if (i2 < this.f56680c - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f56680c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            long[] jArr = this.f56679b;
            System.arraycopy(jArr, i3, jArr, i2, this.f56680c - i3);
            this.f56680c -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public u1(long[] jArr, int i2) {
        this.f56679b = jArr;
        this.f56680c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
