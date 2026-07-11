package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextToolbarStatus {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ TextToolbarStatus[] f33060O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextToolbarStatus f33061n = new TextToolbarStatus("Shown", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextToolbarStatus f33062t = new TextToolbarStatus("Hidden", 1);

    private static final /* synthetic */ TextToolbarStatus[] n() {
        return new TextToolbarStatus[]{f33061n, f33062t};
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f33060O.clone();
    }

    static {
        TextToolbarStatus[] textToolbarStatusArrN = n();
        f33060O = textToolbarStatusArrN;
        J2 = EnumEntriesKt.enumEntries(textToolbarStatusArrN);
    }

    private TextToolbarStatus(String str, int i2) {
    }
}
