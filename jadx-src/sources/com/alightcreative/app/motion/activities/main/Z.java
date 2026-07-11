package com.alightcreative.app.motion.activities.main;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f45426n;
    public final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Fragment f45427t;

    public Z(FrameLayout container, Function0 makeFragment) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(makeFragment, "makeFragment");
        this.f45426n = container;
        this.rl = makeFragment;
    }

    public final FrameLayout n() {
        return this.f45426n;
    }

    public final void nr(Fragment fragment) {
        this.f45427t = fragment;
    }

    public final Fragment rl() {
        return this.f45427t;
    }

    public final Function0 t() {
        return this.rl;
    }
}
