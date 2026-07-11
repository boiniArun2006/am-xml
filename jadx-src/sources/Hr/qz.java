package Hr;

import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class qz {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3975Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ qz[] f3976o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f3979n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f3978t = new qz("PCM_SIGNED_16", 0, 2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qz f3974O = new qz(YjqZUJsVmhcjko.pPqri, 1, 4);
    public static final qz J2 = new qz("PCM_SIGNED_8", 2, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final qz f3977r = new qz("PCM_SIGNED_24", 3, 3);

    static {
        qz[] qzVarArrN = n();
        f3976o = qzVarArrN;
        f3975Z = EnumEntriesKt.enumEntries(qzVarArrN);
    }

    private static final /* synthetic */ qz[] n() {
        return new qz[]{f3978t, f3974O, J2, f3977r};
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) f3976o.clone();
    }

    public final int rl() {
        return this.f3979n;
    }

    private qz(String str, int i2, int i3) {
        this.f3979n = i3;
    }
}
