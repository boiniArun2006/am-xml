package androidx.compose.foundation.text;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Handle {
    private static final /* synthetic */ Handle[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19678r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Handle f19677n = new Handle("Cursor", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Handle f19679t = new Handle("SelectionStart", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Handle f19676O = new Handle("SelectionEnd", 2);

    private static final /* synthetic */ Handle[] n() {
        return new Handle[]{f19677n, f19679t, f19676O};
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) J2.clone();
    }

    static {
        Handle[] handleArrN = n();
        J2 = handleArrN;
        f19678r = EnumEntriesKt.enumEntries(handleArrN);
    }

    private Handle(String str, int i2) {
    }
}
