package androidx.profileinstaller;

import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class DexProfileData {
    final int J2;
    int[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f40924O;
    final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f40925n;
    long nr;
    final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final long f40926t;
    final TreeMap xMQ;

    DexProfileData(String str, String str2, long j2, long j3, int i2, int i3, int i5, int[] iArr, TreeMap treeMap) {
        this.f40925n = str;
        this.rl = str2;
        this.f40926t = j2;
        this.nr = j3;
        this.f40924O = i2;
        this.J2 = i3;
        this.Uo = i5;
        this.KN = iArr;
        this.xMQ = treeMap;
    }
}
