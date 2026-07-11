package gwe;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pj0.j f67918n;
    private final j rl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f67921r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f67920n = new j("SUCCESS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f67922t = new j("NEAREST", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f67919O = new j("MISSING", 2);

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f67921r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f67920n, f67922t, f67919O};
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

    public o(Pj0.j jVar, j type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f67918n = jVar;
        this.rl = type;
    }

    public final Pj0.j n() {
        return this.f67918n;
    }

    public final j rl() {
        return this.rl;
    }
}
