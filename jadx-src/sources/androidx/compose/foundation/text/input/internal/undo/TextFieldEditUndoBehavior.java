package androidx.compose.foundation.text.input.internal.undo;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldEditUndoBehavior {
    private static final /* synthetic */ TextFieldEditUndoBehavior[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20587r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f20586n = new TextFieldEditUndoBehavior("MergeIfPossible", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f20588t = new TextFieldEditUndoBehavior("ClearHistory", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f20585O = new TextFieldEditUndoBehavior("NeverMerge", 2);

    private static final /* synthetic */ TextFieldEditUndoBehavior[] n() {
        return new TextFieldEditUndoBehavior[]{f20586n, f20588t, f20585O};
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) J2.clone();
    }

    static {
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArrN = n();
        J2 = textFieldEditUndoBehaviorArrN;
        f20587r = EnumEntriesKt.enumEntries(textFieldEditUndoBehaviorArrN);
    }

    private TextFieldEditUndoBehavior(String str, int i2) {
    }
}
