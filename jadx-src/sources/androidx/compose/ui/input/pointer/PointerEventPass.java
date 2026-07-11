package androidx.compose.ui.input.pointer;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerEventPass {
    private static final /* synthetic */ PointerEventPass[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f32079r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PointerEventPass f32078n = new PointerEventPass("Initial", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final PointerEventPass f32080t = new PointerEventPass("Main", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final PointerEventPass f32077O = new PointerEventPass("Final", 2);

    private static final /* synthetic */ PointerEventPass[] n() {
        return new PointerEventPass[]{f32078n, f32080t, f32077O};
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) J2.clone();
    }

    static {
        PointerEventPass[] pointerEventPassArrN = n();
        J2 = pointerEventPassArrN;
        f32079r = EnumEntriesKt.enumEntries(pointerEventPassArrN);
    }

    private PointerEventPass(String str, int i2) {
    }
}
