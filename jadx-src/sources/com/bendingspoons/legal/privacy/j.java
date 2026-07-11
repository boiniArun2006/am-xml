package com.bendingspoons.legal.privacy;

import K0.aC;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f51389n;
    private final Pr.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0724j f51388t = new C0724j(null);
    private static final j nr = new j(-1, Pr.n.J2);

    /* JADX INFO: renamed from: com.bendingspoons.legal.privacy.j$j, reason: collision with other inner class name */
    public static final class C0724j {
        public /* synthetic */ C0724j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0724j() {
        }

        public final j n() {
            return j.nr;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pr.n.values().length];
            try {
                iArr[Pr.n.f7852t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pr.n.f7848O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pr.n.f7849n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pr.n.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f51389n == jVar.f51389n && this.rl == jVar.rl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f51389n) * 31) + this.rl.hashCode();
    }

    public String toString() {
        return "RetentionDuration(value=" + this.f51389n + ", timeUnit=" + this.rl + ")";
    }

    public j(int i2, Pr.n timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f51389n = i2;
        this.rl = timeUnit;
    }

    public final String rl(Composer composer, int i2) {
        int i3;
        composer.eF(-1100617824);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1100617824, i2, -1, "com.bendingspoons.legal.privacy.RetentionDuration.toLocalizedString (RetentionTimeUnit.kt:18)");
        }
        int i5 = n.$EnumSwitchMapping$0[this.rl.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        i3 = aC.aYN;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i3 = aC.f4817n;
                }
            } else {
                i3 = aC.f4820t;
            }
        } else {
            i3 = aC.rl;
        }
        String strNr = StringResources_androidKt.nr(i3, new Object[]{Integer.valueOf(this.f51389n)}, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }
}
