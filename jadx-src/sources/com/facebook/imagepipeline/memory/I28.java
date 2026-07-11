package com.facebook.imagepipeline.memory;

import Hh.C;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import fJf.DAz;
import fJf.UGc;
import fJf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 extends BasePool {
    private final int[] gh;

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int HI(int i2) {
        return i2;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int az(int i2) {
        if (i2 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i2));
        }
        for (int i3 : this.gh) {
            if (i3 >= i2) {
                return i3;
            }
        }
        return i2;
    }

    int te() {
        return this.gh[0];
    }

    I28(A72.Ml ml, nKK nkk, DAz dAz) {
        super(ml, nkk, dAz);
        SparseIntArray sparseIntArray = (SparseIntArray) C.Uo(nkk.f66892t);
        this.gh = new int[sparseIntArray.size()];
        int i2 = 0;
        while (true) {
            int[] iArr = this.gh;
            if (i2 < iArr.length) {
                iArr[i2] = sparseIntArray.keyAt(i2);
                i2++;
            } else {
                r();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int ty(UGc uGc) {
        C.Uo(uGc);
        return uGc.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public boolean Z(UGc uGc) {
        C.Uo(uGc);
        return !uGc.isClosed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public void mUb(UGc uGc) {
        C.Uo(uGc);
        uGc.close();
    }
}
