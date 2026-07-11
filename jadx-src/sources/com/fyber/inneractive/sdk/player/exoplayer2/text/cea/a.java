package com.fyber.inneractive.sdk.player.exoplayer2.text.cea;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class a {
    public static void a(long j2, n nVar, r[] rVarArr) {
        int i2;
        while (nVar.f56208c - nVar.f56207b > 1) {
            int i3 = 0;
            while (true) {
                if (nVar.f56208c - nVar.f56207b == 0) {
                    i2 = -1;
                    break;
                }
                int iJ = nVar.j();
                i3 += iJ;
                if (iJ != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i5 = 0;
            while (true) {
                if (nVar.f56208c - nVar.f56207b == 0) {
                    i5 = -1;
                    break;
                }
                int iJ2 = nVar.j();
                i5 += iJ2;
                if (iJ2 != 255) {
                    break;
                }
            }
            if (i5 != -1) {
                int i7 = nVar.f56208c;
                int i8 = nVar.f56207b;
                if (i5 <= i7 - i8) {
                    if (i2 == 4 && i5 >= 8) {
                        int iJ3 = nVar.j();
                        int iO = nVar.o();
                        int iB = nVar.b();
                        int iJ4 = nVar.j();
                        nVar.e(i8);
                        if (iJ3 == 181 && iO == 49 && iB == 1195456820 && iJ4 == 3) {
                            nVar.e(nVar.f56207b + 8);
                            int iJ5 = nVar.j() & 31;
                            nVar.e(nVar.f56207b + 1);
                            int i9 = iJ5 * 3;
                            int i10 = nVar.f56207b;
                            for (r rVar : rVarArr) {
                                nVar.e(i10);
                                rVar.a(i9, nVar);
                                rVar.a(j2, 1, i9, 0, null);
                            }
                            nVar.e(nVar.f56207b + (i5 - (i9 + 10)));
                        }
                    }
                    nVar.e(nVar.f56207b + i5);
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            nVar.e(nVar.f56208c);
        }
    }
}
