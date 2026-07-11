package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class fuX extends psW {
    private final FSZ.aC J2;

    public fuX(FSZ.aC aCVar, l4Z l4z) {
        super(l4z, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.J2 = aCVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.psW
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public Pair mUb(mz mzVar) {
        return Pair.create(this.J2.n(mzVar.M(), mzVar.n()), mzVar.Mx());
    }

    @Override // com.facebook.imagepipeline.producers.psW
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Pj0.j Uo(Pj0.j jVar) {
        return Pj0.j.T(jVar);
    }
}
