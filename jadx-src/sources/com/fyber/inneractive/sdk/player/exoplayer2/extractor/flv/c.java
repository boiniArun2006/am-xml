package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f54771b;

    public c() {
        super(null);
        this.f54771b = -9223372036854775807L;
    }

    public final void a(n nVar, long j2) throws r {
        if (nVar.j() != 2) {
            throw new r();
        }
        int iO = nVar.o();
        int i2 = nVar.f56207b;
        nVar.e(i2 + iO);
        if ("onMetaData".equals(new String(nVar.f56206a, i2, iO)) && nVar.j() == 8) {
            HashMap mapA = a(nVar);
            if (mapA.containsKey("duration")) {
                double dDoubleValue = ((Double) mapA.get("duration")).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f54771b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    public static Serializable a(int i2, n nVar) {
        if (i2 == 8) {
            return a(nVar);
        }
        if (i2 == 10) {
            int iM = nVar.m();
            ArrayList arrayList = new ArrayList(iM);
            for (int i3 = 0; i3 < iM; i3++) {
                arrayList.add(a(nVar.j(), nVar));
            }
            return arrayList;
        }
        if (i2 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(nVar.g()));
            nVar.e(nVar.f56207b + 2);
            return date;
        }
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(nVar.g()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(nVar.j() == 1);
        }
        if (i2 == 2) {
            int iO = nVar.o();
            int i5 = nVar.f56207b;
            nVar.e(i5 + iO);
            return new String(nVar.f56206a, i5, iO);
        }
        if (i2 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iO2 = nVar.o();
            int i7 = nVar.f56207b;
            nVar.e(i7 + iO2);
            String str = new String(nVar.f56206a, i7, iO2);
            int iJ = nVar.j();
            if (iJ == 9) {
                return map;
            }
            map.put(str, a(iJ, nVar));
        }
    }

    public static HashMap a(n nVar) {
        int iM = nVar.m();
        HashMap map = new HashMap(iM);
        for (int i2 = 0; i2 < iM; i2++) {
            int iO = nVar.o();
            int i3 = nVar.f56207b;
            nVar.e(i3 + iO);
            map.put(new String(nVar.f56206a, i3, iO), a(nVar.j(), nVar));
        }
        return map;
    }
}
