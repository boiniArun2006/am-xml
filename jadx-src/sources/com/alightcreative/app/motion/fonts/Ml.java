package com.alightcreative.app.motion.fonts;

import com.alightcreative.app.motion.fonts.AMTypefaceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f45786n;
    private final AMTypefaceError rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f45785t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Ml n(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Ml(null, new AMTypefaceError.AMMissingTypefaceError(name));
        }

        public final Ml rl(w6 typeface) {
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            return new Ml(typeface, null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f45786n, ml.f45786n) && Intrinsics.areEqual(this.rl, ml.rl);
    }

    public int hashCode() {
        w6 w6Var = this.f45786n;
        int iHashCode = (w6Var == null ? 0 : w6Var.hashCode()) * 31;
        AMTypefaceError aMTypefaceError = this.rl;
        return iHashCode + (aMTypefaceError != null ? aMTypefaceError.hashCode() : 0);
    }

    public String toString() {
        return "AMTypefaceResult(typeface=" + this.f45786n + ", error=" + this.rl + ")";
    }

    public final AMTypefaceError n() {
        return this.rl;
    }

    public final w6 rl() {
        return this.f45786n;
    }

    public Ml(w6 w6Var, AMTypefaceError aMTypefaceError) {
        this.f45786n = w6Var;
        this.rl = aMTypefaceError;
    }
}
