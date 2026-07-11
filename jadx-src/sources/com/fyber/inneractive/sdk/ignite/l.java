package com.fyber.inneractive.sdk.ignite;

import android.content.Context;
import mc.CN3;
import mc.Dsr;
import mc.I28;
import mc.Wre;
import mc.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l extends u9n.j {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z2, boolean z3, boolean z4, h hVar) {
        l lVar;
        Wre dsr;
        super(kVar, aVar);
        I28 i28 = new I28(context);
        if (z2 && z3) {
            dsr = new fuX(new CN3(i28, hVar), true, z4, hVar, this);
            lVar = this;
        } else if (z2) {
            lVar = this;
            dsr = new fuX(i28, false, z4, hVar, lVar);
        } else {
            lVar = this;
            if (z3) {
                dsr = new CN3(i28, hVar);
            } else {
                dsr = new Dsr(i28, hVar);
            }
        }
        lVar.f74139a = dsr;
    }
}
