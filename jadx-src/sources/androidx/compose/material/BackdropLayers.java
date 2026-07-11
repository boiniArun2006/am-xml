package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/BackdropLayers;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BackdropLayers {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ BackdropLayers[] f21253O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BackdropLayers f21254n = new BackdropLayers("Back", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BackdropLayers f21255t = new BackdropLayers("Front", 1);

    private static final /* synthetic */ BackdropLayers[] n() {
        return new BackdropLayers[]{f21254n, f21255t};
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) f21253O.clone();
    }

    static {
        BackdropLayers[] backdropLayersArrN = n();
        f21253O = backdropLayersArrN;
        J2 = EnumEntriesKt.enumEntries(backdropLayersArrN);
    }

    private BackdropLayers(String str, int i2) {
    }
}
