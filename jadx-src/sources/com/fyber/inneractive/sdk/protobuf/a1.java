package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a1 extends c implements g1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f56524d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f56525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56526c;

    public a1() {
        this.f56525b = new int[10];
        this.f56526c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f56526c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56526c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        int[] iArr = this.f56525b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f56525b, i2, iArr2, i2 + 1, this.f56526c - i2);
            this.f56525b = iArr2;
        }
        this.f56525b[i2] = iIntValue;
        this.f56526c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return super.equals(obj);
        }
        a1 a1Var = (a1) obj;
        if (this.f56526c != a1Var.f56526c) {
            return false;
        }
        int[] iArr = a1Var.f56525b;
        for (int i2 = 0; i2 < this.f56526c; i2++) {
            if (this.f56525b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f56526c; i3++) {
            i2 = (i2 * 31) + this.f56525b[i3];
        }
        return i2;
    }

    static {
        a1 a1Var = new a1(new int[0], 0);
        f56524d = a1Var;
        a1Var.f56537a = false;
    }

    public final void d(int i2) {
        if (i2 < 0 || i2 >= this.f56526c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56526c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a1 b(int i2) {
        if (i2 >= this.f56526c) {
            return new a1(Arrays.copyOf(this.f56525b, i2), this.f56526c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f56526c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f56525b[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        d(i2);
        int[] iArr = this.f56525b;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56526c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f56612a;
        collection.getClass();
        if (!(collection instanceof a1)) {
            return super.addAll(collection);
        }
        a1 a1Var = (a1) collection;
        int i2 = a1Var.f56526c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f56526c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            int[] iArr = this.f56525b;
            if (i5 > iArr.length) {
                this.f56525b = Arrays.copyOf(iArr, i5);
            }
            System.arraycopy(a1Var.f56525b, 0, this.f56525b, this.f56526c, a1Var.f56526c);
            this.f56526c = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i2) {
        c();
        int i3 = this.f56526c;
        int[] iArr = this.f56525b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f56525b = iArr2;
        }
        int[] iArr3 = this.f56525b;
        int i5 = this.f56526c;
        this.f56526c = i5 + 1;
        iArr3[i5] = i2;
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
        d(i2);
        return Integer.valueOf(this.f56525b[i2]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        c();
        d(i2);
        int[] iArr = this.f56525b;
        int i3 = iArr[i2];
        if (i2 < this.f56526c - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f56526c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            int[] iArr = this.f56525b;
            System.arraycopy(iArr, i3, iArr, i2, this.f56526c - i3);
            this.f56526c -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public a1(int[] iArr, int i2) {
        this.f56525b = iArr;
        this.f56526c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
