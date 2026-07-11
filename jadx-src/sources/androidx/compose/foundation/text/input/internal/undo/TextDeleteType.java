package androidx.compose.foundation.text.input.internal.undo;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextDeleteType {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20578o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ TextDeleteType[] f20579r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextDeleteType f20577n = new TextDeleteType("Start", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextDeleteType f20580t = new TextDeleteType("End", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TextDeleteType f20576O = new TextDeleteType("Inner", 2);
    public static final TextDeleteType J2 = new TextDeleteType("NotByUser", 3);

    private static final /* synthetic */ TextDeleteType[] n() {
        return new TextDeleteType[]{f20577n, f20580t, f20576O, J2};
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) f20579r.clone();
    }

    static {
        TextDeleteType[] textDeleteTypeArrN = n();
        f20579r = textDeleteTypeArrN;
        f20578o = EnumEntriesKt.enumEntries(textDeleteTypeArrN);
    }

    private TextDeleteType(String str, int i2) {
    }
}
