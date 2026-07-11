package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class SPz {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Consumer f58113t;
    private final SparseArray rl = new SparseArray();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58112n = -1;

    public void nr(int i2) {
        int i3 = 0;
        while (i3 < this.rl.size() - 1) {
            int i5 = i3 + 1;
            if (i2 < this.rl.keyAt(i5)) {
                return;
            }
            this.f58113t.accept(this.rl.valueAt(i3));
            this.rl.removeAt(i3);
            int i7 = this.f58112n;
            if (i7 > 0) {
                this.f58112n = i7 - 1;
            }
            i3 = i5;
        }
    }

    public void rl() {
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            this.f58113t.accept(this.rl.valueAt(i2));
        }
        this.f58112n = -1;
        this.rl.clear();
    }

    public Object J2() {
        return this.rl.valueAt(r0.size() - 1);
    }

    public Object O(int i2) {
        if (this.f58112n == -1) {
            this.f58112n = 0;
        }
        while (true) {
            int i3 = this.f58112n;
            if (i3 <= 0 || i2 >= this.rl.keyAt(i3)) {
                break;
            }
            this.f58112n--;
        }
        while (this.f58112n < this.rl.size() - 1 && i2 >= this.rl.keyAt(this.f58112n + 1)) {
            this.f58112n++;
        }
        return this.rl.valueAt(this.f58112n);
    }

    public boolean Uo() {
        return this.rl.size() == 0;
    }

    public void n(int i2, Object obj) {
        if (this.f58112n == -1) {
            Assertions.checkState(this.rl.size() == 0);
            this.f58112n = 0;
        }
        if (this.rl.size() > 0) {
            SparseArray sparseArray = this.rl;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.checkArgument(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                Consumer consumer = this.f58113t;
                SparseArray sparseArray2 = this.rl;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.rl.append(i2, obj);
    }

    public void t(int i2) {
        for (int size = this.rl.size() - 1; size >= 0 && i2 < this.rl.keyAt(size); size--) {
            this.f58113t.accept(this.rl.valueAt(size));
            this.rl.removeAt(size);
        }
        this.f58112n = this.rl.size() > 0 ? Math.min(this.f58112n, this.rl.size() - 1) : -1;
    }

    public SPz(Consumer consumer) {
        this.f58113t = consumer;
    }
}
