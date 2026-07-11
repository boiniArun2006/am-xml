package com.facebook.imagepipeline.memory;

import fJf.DAz;
import fJf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Hh.Ml
public class NativeMemoryChunkPool extends I28 {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: fD, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk J2(int i2) {
        return new NativeMemoryChunk(i2);
    }

    @Hh.Ml
    public NativeMemoryChunkPool(A72.Ml ml, nKK nkk, DAz dAz) {
        super(ml, nkk, dAz);
    }
}
