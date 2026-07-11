package com.caoccao.javet.enums;

import com.caoccao.javet.interfaces.IEnumBitset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum V8GCCallbackFlags implements IEnumBitset {
    NoGCCallbackFlags(0),
    GCCallbackFlagConstructRetainedObjectInfos(2),
    GCCallbackFlagForced(4),
    GCCallbackFlagSynchronousPhantomCallbackProcessing(8),
    GCCallbackFlagCollectAllAvailableGarbage(16),
    GCCallbackFlagCollectAllExternalMemory(32),
    GCCallbackScheduleIdleGarbageCollection(64);

    private final int value;

    @Override // com.caoccao.javet.interfaces.IEnumBitset
    public int getValue() {
        return this.value;
    }

    V8GCCallbackFlags(int i2) {
        this.value = i2;
    }
}
