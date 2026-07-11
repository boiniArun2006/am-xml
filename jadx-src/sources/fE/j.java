package fE;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC0924j f66802n;
    private final String rl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: fE.j$j, reason: collision with other inner class name */
    public static final class EnumC0924j {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f66803N;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private static final /* synthetic */ EnumC0924j[] f66806T;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0924j f66811n = new EnumC0924j("ServiceTimeout", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0924j f66814t = new EnumC0924j("FeatureNotSupported", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0924j f66804O = new EnumC0924j("ServiceDisconnected", 2);
        public static final EnumC0924j J2 = new EnumC0924j("UserCanceled", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0924j f66813r = new EnumC0924j("ServiceUnavailable", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0924j f66812o = new EnumC0924j("BillingUnavailable", 5);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final EnumC0924j f66808Z = new EnumC0924j("ItemUnavailable", 6);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final EnumC0924j f66805S = new EnumC0924j("DeveloperError", 7);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0924j f66810g = new EnumC0924j("Error", 8);
        public static final EnumC0924j E2 = new EnumC0924j("ItemAlreadyOwned", 9);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0924j f66809e = new EnumC0924j("ItemNotOwned", 10);

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final EnumC0924j f66807X = new EnumC0924j("Unknown", 11);

        static {
            EnumC0924j[] enumC0924jArrN = n();
            f66806T = enumC0924jArrN;
            f66803N = EnumEntriesKt.enumEntries(enumC0924jArrN);
        }

        private static final /* synthetic */ EnumC0924j[] n() {
            return new EnumC0924j[]{f66811n, f66814t, f66804O, J2, f66813r, f66812o, f66808Z, f66805S, f66810g, E2, f66809e, f66807X};
        }

        public static EnumC0924j valueOf(String str) {
            return (EnumC0924j) Enum.valueOf(EnumC0924j.class, str);
        }

        public static EnumC0924j[] values() {
            return (EnumC0924j[]) f66806T.clone();
        }

        private EnumC0924j(String str, int i2) {
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
        return this.f66802n == jVar.f66802n && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(EnumC0924j code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f66802n = code;
        this.rl = message;
    }

    public int hashCode() {
        return (this.f66802n.hashCode() * 31) + this.rl.hashCode();
    }

    public final EnumC0924j n() {
        return this.f66802n;
    }

    public final String rl() {
        return this.rl;
    }

    public String toString() {
        return "BillingClientError(code=" + this.f66802n + ", message=" + this.rl + ")";
    }
}
