package androidx.compose.foundation.text.selection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DownResolution {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20742o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ DownResolution[] f20743r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DownResolution f20741n = new DownResolution("Up", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DownResolution f20744t = new DownResolution("Drag", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final DownResolution f20740O = new DownResolution("Timeout", 2);
    public static final DownResolution J2 = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] n() {
        return new DownResolution[]{f20741n, f20744t, f20740O, J2};
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) f20743r.clone();
    }

    static {
        DownResolution[] downResolutionArrN = n();
        f20743r = downResolutionArrN;
        f20742o = EnumEntriesKt.enumEntries(downResolutionArrN);
    }

    private DownResolution(String str, int i2) {
    }
}
