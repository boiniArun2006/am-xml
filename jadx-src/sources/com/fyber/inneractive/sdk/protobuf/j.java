package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j extends c implements b1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f56599d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f56600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56601c;

    public j() {
        this.f56600b = new boolean[10];
        this.f56601c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f56601c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56601c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        boolean[] zArr = this.f56600b;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f56600b, i2, zArr2, i2 + 1, this.f56601c - i2);
            this.f56600b = zArr2;
        }
        this.f56600b[i2] = zBooleanValue;
        this.f56601c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f56601c != jVar.f56601c) {
            return false;
        }
        boolean[] zArr = jVar.f56600b;
        for (int i2 = 0; i2 < this.f56601c; i2++) {
            if (this.f56600b[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f56601c; i3++) {
            int i5 = i2 * 31;
            boolean z2 = this.f56600b[i3];
            Charset charset = l1.f56612a;
            i2 = i5 + (z2 ? 1231 : 1237);
        }
        return i2;
    }

    static {
        j jVar = new j(new boolean[0], 0);
        f56599d = jVar;
        jVar.f56537a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j b(int i2) {
        if (i2 >= this.f56601c) {
            return new j(Arrays.copyOf(this.f56600b, i2), this.f56601c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 < this.f56601c) {
            return Boolean.valueOf(this.f56600b[i2]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56601c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f56601c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f56600b[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i2 < 0 || i2 >= this.f56601c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56601c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        boolean[] zArr = this.f56600b;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56601c;
    }

    public final void a(boolean z2) {
        c();
        int i2 = this.f56601c;
        boolean[] zArr = this.f56600b;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f56600b = zArr2;
        }
        boolean[] zArr3 = this.f56600b;
        int i3 = this.f56601c;
        this.f56601c = i3 + 1;
        zArr3[i3] = z2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f56612a;
        collection.getClass();
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i2 = jVar.f56601c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f56601c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            boolean[] zArr = this.f56600b;
            if (i5 > zArr.length) {
                this.f56600b = Arrays.copyOf(zArr, i5);
            }
            System.arraycopy(jVar.f56600b, 0, this.f56600b, this.f56601c, jVar.f56601c);
            this.f56601c = i5;
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
        if (i2 >= 0 && i2 < (i3 = this.f56601c)) {
            boolean[] zArr = this.f56600b;
            boolean z2 = zArr[i2];
            if (i2 < i3 - 1) {
                System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
            }
            this.f56601c--;
            ((AbstractList) this).modCount++;
            return Boolean.valueOf(z2);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56601c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            boolean[] zArr = this.f56600b;
            System.arraycopy(zArr, i3, zArr, i2, this.f56601c - i3);
            this.f56601c -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public j(boolean[] zArr, int i2) {
        this.f56600b = zArr;
        this.f56601c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }
}
