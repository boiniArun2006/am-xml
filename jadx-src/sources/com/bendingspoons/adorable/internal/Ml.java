package com.bendingspoons.adorable.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f51190n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51193r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51192n = new j("ENABLED", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f51194t = new j("ENABLED_WITH_ALERT", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f51191O = new j("INVISIBLE", 2);

        private static final /* synthetic */ j[] n() {
            return new j[]{f51192n, f51194t, f51191O};
        }

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f51193r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        private j(String str, int i2) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && this.f51190n == ((Ml) obj).f51190n;
    }

    public int hashCode() {
        return this.f51190n.hashCode();
    }

    public final Ml n(j closeButtonState) {
        Intrinsics.checkNotNullParameter(closeButtonState, "closeButtonState");
        return new Ml(closeButtonState);
    }

    public String toString() {
        return "HardcodedAdState(closeButtonState=" + this.f51190n + ")";
    }

    public Ml(j closeButtonState) {
        Intrinsics.checkNotNullParameter(closeButtonState, "closeButtonState");
        this.f51190n = closeButtonState;
    }

    public final j rl() {
        return this.f51190n;
    }
}
