package com.bendingspoons.secretmenu.ui.mainscreen;

import TFv.rv6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Dsr {
    private static Dsr nr;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f51511t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f51512n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void rl(rv6 showDeveloperOptions) {
            Intrinsics.checkNotNullParameter(showDeveloperOptions, "showDeveloperOptions");
            if (n() != null) {
                return;
            }
            t(new Dsr(showDeveloperOptions));
        }

        public final Dsr n() {
            return Dsr.nr;
        }

        public final void t(Dsr dsr) {
            Dsr.nr = dsr;
        }
    }

    public Dsr(rv6 showDeveloperOptions) {
        Intrinsics.checkNotNullParameter(showDeveloperOptions, "showDeveloperOptions");
        this.f51512n = showDeveloperOptions;
    }

    public final rv6 t() {
        return this.f51512n;
    }
}
