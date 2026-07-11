package b;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface InterfaceC1648Ml extends q3M.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43127n = j.f43128n;

    /* JADX INFO: renamed from: b.Ml$j */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43128n = new j();

        public final InterfaceC1648Ml n(long j2, q3M.n networkErrorUploadDelayProvider) {
            Intrinsics.checkNotNullParameter(networkErrorUploadDelayProvider, "networkErrorUploadDelayProvider");
            return new kk.n(j2, networkErrorUploadDelayProvider);
        }

        private j() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: b.Ml$n */
    public static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f43131r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f43130n = new n("SUCCESS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f43132t = new n("REPOSITORY_ERROR", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f43129O = new n("NETWORK_ERROR", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f43131r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f43130n, f43132t, f43129O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }
}
