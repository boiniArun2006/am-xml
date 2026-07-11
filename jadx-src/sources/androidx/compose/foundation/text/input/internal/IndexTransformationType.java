package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "O", "J2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IndexTransformationType {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20144o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ IndexTransformationType[] f20145r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final IndexTransformationType f20143n = new IndexTransformationType("Untransformed", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final IndexTransformationType f20146t = new IndexTransformationType("Insertion", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final IndexTransformationType f20142O = new IndexTransformationType("Replacement", 2);
    public static final IndexTransformationType J2 = new IndexTransformationType("Deletion", 3);

    private static final /* synthetic */ IndexTransformationType[] n() {
        return new IndexTransformationType[]{f20143n, f20146t, f20142O, J2};
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) f20145r.clone();
    }

    static {
        IndexTransformationType[] indexTransformationTypeArrN = n();
        f20145r = indexTransformationTypeArrN;
        f20144o = EnumEntriesKt.enumEntries(indexTransformationTypeArrN);
    }

    private IndexTransformationType(String str, int i2) {
    }
}
