package com.caoccao.javet.enums;

import com.caoccao.javet.interfaces.IEnumBitset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum V8GCType implements IEnumBitset {
    GCTypeScavenge(1),
    GCTypeMarkSweepCompact(2),
    GCTypeIncrementalMarking(4),
    GCTypeProcessWeakCallbacks(8);

    private final int value;

    @Override // com.caoccao.javet.interfaces.IEnumBitset
    public int getValue() {
        return this.value;
    }

    V8GCType(int i2) {
        this.value = i2;
    }
}
