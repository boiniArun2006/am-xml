package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModalBottomSheetValue {
    private static final /* synthetic */ ModalBottomSheetValue[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f22292r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ModalBottomSheetValue f22291n = new ModalBottomSheetValue("Hidden", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ModalBottomSheetValue f22293t = new ModalBottomSheetValue("Expanded", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ModalBottomSheetValue f22290O = new ModalBottomSheetValue("HalfExpanded", 2);

    private static final /* synthetic */ ModalBottomSheetValue[] n() {
        return new ModalBottomSheetValue[]{f22291n, f22293t, f22290O};
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) J2.clone();
    }

    static {
        ModalBottomSheetValue[] modalBottomSheetValueArrN = n();
        J2 = modalBottomSheetValueArrN;
        f22292r = EnumEntriesKt.enumEntries(modalBottomSheetValueArrN);
    }

    private ModalBottomSheetValue(String str, int i2) {
    }
}
