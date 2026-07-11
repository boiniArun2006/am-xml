package okd;

import com.alightcreative.app.motion.project.ProjectInfo;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f71569Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ n[] f71571o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f71573t = new n("NOT_UPLOADED", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f71568O = new n("NOT_DOWNLOADED", 1);
    public static final n J2 = new n("SYNCED", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f71572r = new n("OUT_OF_SYNC", 3);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(ProjectInfo.n localProject) {
            Intrinsics.checkNotNullParameter(localProject, "localProject");
            return localProject.getLastModified() == com.alightcreative.app.motion.persist.j.INSTANCE.getCloudSyncTimeMillis().getOrDefault(localProject.getId(), 0L).longValue() ? n.J2 : n.f71572r;
        }
    }

    static {
        n[] nVarArrN = n();
        f71571o = nVarArrN;
        f71569Z = EnumEntriesKt.enumEntries(nVarArrN);
        f71570n = new j(null);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f71573t, f71568O, J2, f71572r};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f71571o.clone();
    }

    private n(String str, int i2) {
    }
}
