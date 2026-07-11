package com.alightcreative.widget;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class nSC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final aO.Pl f47454n;

    static {
        Context applicationContext = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        HI0.Q q2 = new HI0.Q(applicationContext2);
        Context applicationContext3 = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        f47454n = new aO.Pl(applicationContext, q2, HI0.afx.HI(applicationContext3), 0, 0, 24, null);
    }
}
