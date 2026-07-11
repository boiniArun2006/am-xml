package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f52287n = new Pl();
    private static final String rl = Pl.class.getName();

    public static final synchronized void n(j accessTokenAppIdPair, psW appEvents) {
        if (VmF.j.nr(Pl.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            UiE.fuX.rl();
            K kN = Wre.n();
            kN.n(accessTokenAppIdPair, appEvents.nr());
            Wre.rl(kN);
        } catch (Throwable th) {
            VmF.j.rl(th, Pl.class);
        }
    }

    public static final synchronized void rl(I28 eventsToPersist) {
        if (VmF.j.nr(Pl.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            UiE.fuX.rl();
            K kN = Wre.n();
            for (j jVar : eventsToPersist.J2()) {
                psW pswT = eventsToPersist.t(jVar);
                if (pswT == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                kN.n(jVar, pswT.nr());
            }
            Wre.rl(kN);
        } catch (Throwable th) {
            VmF.j.rl(th, Pl.class);
        }
    }

    private Pl() {
    }
}
