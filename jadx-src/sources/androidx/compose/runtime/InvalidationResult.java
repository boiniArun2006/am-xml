package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidationResult {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30190o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ InvalidationResult[] f30191r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InvalidationResult f30189n = new InvalidationResult("IGNORED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InvalidationResult f30192t = new InvalidationResult("SCHEDULED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final InvalidationResult f30188O = new InvalidationResult("DEFERRED", 2);
    public static final InvalidationResult J2 = new InvalidationResult("IMMINENT", 3);

    private static final /* synthetic */ InvalidationResult[] n() {
        return new InvalidationResult[]{f30189n, f30192t, f30188O, J2};
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f30191r.clone();
    }

    static {
        InvalidationResult[] invalidationResultArrN = n();
        f30191r = invalidationResultArrN;
        f30190o = EnumEntriesKt.enumEntries(invalidationResultArrN);
    }

    private InvalidationResult(String str, int i2) {
    }
}
