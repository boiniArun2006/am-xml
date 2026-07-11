package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/material/ScaffoldLayoutContent;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScaffoldLayoutContent {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f22692Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ ScaffoldLayoutContent[] f22694o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ScaffoldLayoutContent f22693n = new ScaffoldLayoutContent("TopBar", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ScaffoldLayoutContent f22696t = new ScaffoldLayoutContent("MainContent", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ScaffoldLayoutContent f22691O = new ScaffoldLayoutContent("Snackbar", 2);
    public static final ScaffoldLayoutContent J2 = new ScaffoldLayoutContent("Fab", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ScaffoldLayoutContent f22695r = new ScaffoldLayoutContent("BottomBar", 4);

    private static final /* synthetic */ ScaffoldLayoutContent[] n() {
        return new ScaffoldLayoutContent[]{f22693n, f22696t, f22691O, J2, f22695r};
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f22694o.clone();
    }

    static {
        ScaffoldLayoutContent[] scaffoldLayoutContentArrN = n();
        f22694o = scaffoldLayoutContentArrN;
        f22692Z = EnumEntriesKt.enumEntries(scaffoldLayoutContentArrN);
    }

    private ScaffoldLayoutContent(String str, int i2) {
    }
}
