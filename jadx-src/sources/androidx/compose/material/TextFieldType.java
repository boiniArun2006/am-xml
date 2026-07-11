package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/TextFieldType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldType {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ TextFieldType[] f23748O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextFieldType f23749n = new TextFieldType("Filled", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextFieldType f23750t = new TextFieldType("Outlined", 1);

    private static final /* synthetic */ TextFieldType[] n() {
        return new TextFieldType[]{f23749n, f23750t};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f23748O.clone();
    }

    static {
        TextFieldType[] textFieldTypeArrN = n();
        f23748O = textFieldTypeArrN;
        J2 = EnumEntriesKt.enumEntries(textFieldTypeArrN);
    }

    private TextFieldType(String str, int i2) {
    }
}
