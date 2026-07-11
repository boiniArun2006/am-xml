package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f58326O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f58327n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f58328t;

    public static j n(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), gUxOLwRQBPPLC.NIMuRwomOIS);
        int i2 = -1;
        int i3 = -1;
        int i5 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String strO = AbstractC2372w6.O(strArrSplit[i8].trim());
            strO.getClass();
            switch (strO) {
                case "end":
                    i3 = i8;
                    break;
                case "text":
                    i7 = i8;
                    break;
                case "start":
                    i2 = i8;
                    break;
                case "style":
                    i5 = i8;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i7 == -1) {
            return null;
        }
        return new j(i2, i3, i5, i7, strArrSplit.length);
    }

    private j(int i2, int i3, int i5, int i7, int i8) {
        this.f58327n = i2;
        this.rl = i3;
        this.f58328t = i5;
        this.nr = i7;
        this.f58326O = i8;
    }
}
