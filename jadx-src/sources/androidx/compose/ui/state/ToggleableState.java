package androidx.compose.ui.state;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ToggleableState {
    private static final /* synthetic */ ToggleableState[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33332r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ToggleableState f33331n = new ToggleableState("On", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ToggleableState f33333t = new ToggleableState("Off", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ToggleableState f33330O = new ToggleableState("Indeterminate", 2);

    private static final /* synthetic */ ToggleableState[] n() {
        return new ToggleableState[]{f33331n, f33333t, f33330O};
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) J2.clone();
    }

    static {
        ToggleableState[] toggleableStateArrN = n();
        J2 = toggleableStateArrN;
        f33332r = EnumEntriesKt.enumEntries(toggleableStateArrN);
    }

    private ToggleableState(String str, int i2) {
    }
}
