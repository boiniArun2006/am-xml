package com.alightcreative.app.motion.activities;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I7a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static List f44576n;
    private static com.alightcreative.widget.h6y rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f44577t = com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration();

    public static final void J2(List list) {
        f44576n = list;
    }

    public static final void O(int i2) {
        f44577t = i2;
    }

    public static final void Uo(com.alightcreative.widget.h6y h6yVar) {
        rl = h6yVar;
    }

    public static final int n() {
        return f44577t;
    }

    public static final void nr(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        while (fragmentManager.uG()) {
        }
    }

    public static final List rl() {
        return f44576n;
    }

    public static final com.alightcreative.widget.h6y t() {
        return rl;
    }
}
