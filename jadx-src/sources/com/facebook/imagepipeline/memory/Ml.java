package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import fJf.DAz;
import fJf.nKK;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml extends BasePool implements A72.j {
    private final int[] gh;

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int HI(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mUb(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(A72.Ml memoryTrimmableRegistry, nKK poolParams, DAz poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f66892t;
        if (sparseIntArray != null) {
            this.gh = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.gh[i2] = sparseIntArray.keyAt(i2);
            }
        } else {
            this.gh = new int[0];
        }
        r();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public byte[] J2(int i2) {
        return new byte[i2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public int ty(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }
}
