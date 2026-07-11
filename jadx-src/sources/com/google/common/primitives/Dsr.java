package com.google.common.primitives;

import kotlin.UByte;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {
    public static int rl(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    public static byte n(long j2) {
        Xo.mUb((j2 >> 8) == 0, "out of range: %s", j2);
        return (byte) j2;
    }
}
