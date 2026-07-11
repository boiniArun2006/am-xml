package androidx.compose.foundation.text.input.internal.undo;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextEditType {
    private static final /* synthetic */ TextEditType[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20583r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextEditType f20582n = new TextEditType("Insert", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextEditType f20584t = new TextEditType("Delete", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TextEditType f20581O = new TextEditType("Replace", 2);

    private static final /* synthetic */ TextEditType[] n() {
        return new TextEditType[]{f20582n, f20584t, f20581O};
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) J2.clone();
    }

    static {
        TextEditType[] textEditTypeArrN = n();
        J2 = textEditTypeArrN;
        f20583r = EnumEntriesKt.enumEntries(textEditTypeArrN);
    }

    private TextEditType(String str, int i2) {
    }
}
