package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d0 extends c implements c1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f56545d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f56546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56547c;

    public d0() {
        this.f56546b = new double[10];
        this.f56547c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f56547c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56547c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f56546b;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f56546b, i2, dArr2, i2 + 1, this.f56547c - i2);
            this.f56546b = dArr2;
        }
        this.f56546b[i2] = dDoubleValue;
        this.f56547c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.f56547c != d0Var.f56547c) {
            return false;
        }
        double[] dArr = d0Var.f56546b;
        for (int i2 = 0; i2 < this.f56547c; i2++) {
            if (Double.doubleToLongBits(this.f56546b[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f56547c; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f56546b[i3]);
            Charset charset = l1.f56612a;
            i2 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i2;
    }

    static {
        d0 d0Var = new d0(new double[0], 0);
        f56545d = d0Var;
        d0Var.f56537a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d0 b(int i2) {
        if (i2 >= this.f56547c) {
            return new d0(Arrays.copyOf(this.f56546b, i2), this.f56547c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 < this.f56547c) {
            return Double.valueOf(this.f56546b[i2]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56547c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f56547c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f56546b[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i2 < 0 || i2 >= this.f56547c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56547c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f56546b;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56547c;
    }

    public final void a(double d2) {
        c();
        int i2 = this.f56547c;
        double[] dArr = this.f56546b;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f56546b = dArr2;
        }
        double[] dArr3 = this.f56546b;
        int i3 = this.f56547c;
        this.f56547c = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f56612a;
        collection.getClass();
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i2 = d0Var.f56547c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f56547c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            double[] dArr = this.f56546b;
            if (i5 > dArr.length) {
                this.f56546b = Arrays.copyOf(dArr, i5);
            }
            System.arraycopy(d0Var.f56546b, 0, this.f56546b, this.f56547c, d0Var.f56547c);
            this.f56547c = i5;
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

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3;
        c();
        if (i2 >= 0 && i2 < (i3 = this.f56547c)) {
            double[] dArr = this.f56546b;
            double d2 = dArr[i2];
            if (i2 < i3 - 1) {
                System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
            }
            this.f56547c--;
            ((AbstractList) this).modCount++;
            return Double.valueOf(d2);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56547c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            double[] dArr = this.f56546b;
            System.arraycopy(dArr, i3, dArr, i2, this.f56547c - i3);
            this.f56547c -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public d0(double[] dArr, int i2) {
        this.f56546b = dArr;
        this.f56547c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
