package com.google.android.gms.internal.fido;

import java.util.Comparator;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
enum zzgk implements Comparator {
    INSTANCE;

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = (bArr[i2] & UByte.MAX_VALUE) - (bArr2[i2] & UByte.MAX_VALUE);
            if (i3 != 0) {
                return i3;
            }
        }
        return bArr.length - bArr2.length;
    }
}
