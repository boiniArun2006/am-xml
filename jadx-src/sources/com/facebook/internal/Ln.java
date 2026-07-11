package com.facebook.internal;

import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum Ln {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final EnumSet f52677O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52681t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f52682n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final EnumSet n(long j2) {
            EnumSet result = EnumSet.noneOf(Ln.class);
            for (Ln ln2 : Ln.f52677O) {
                if ((ln2.t() & j2) != 0) {
                    result.add(ln2);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }
    }

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(Ln.class);
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f52677O = enumSetAllOf;
    }

    public final long t() {
        return this.f52682n;
    }

    Ln(long j2) {
        this.f52682n = j2;
    }
}
