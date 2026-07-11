package com.facebook.imagepipeline.producers;

import android.util.Pair;
import bA.C1653C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class r extends psW {
    private final FSZ.aC J2;

    public r(FSZ.aC aCVar, boolean z2, l4Z l4z) {
        super(l4z, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z2);
        this.J2 = aCVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.psW
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public Pair mUb(mz mzVar) {
        return Pair.create(this.J2.nr(mzVar.M(), mzVar.n()), mzVar.Mx());
    }

    @Override // com.facebook.imagepipeline.producers.psW
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public C1653C Uo(C1653C c1653c) {
        return C1653C.rl(c1653c);
    }
}
