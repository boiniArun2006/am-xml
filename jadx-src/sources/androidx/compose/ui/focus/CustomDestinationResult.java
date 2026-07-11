package androidx.compose.ui.focus;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomDestinationResult {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31287o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ CustomDestinationResult[] f31288r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CustomDestinationResult f31286n = new CustomDestinationResult("None", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CustomDestinationResult f31289t = new CustomDestinationResult("Cancelled", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CustomDestinationResult f31285O = new CustomDestinationResult("Redirected", 2);
    public static final CustomDestinationResult J2 = new CustomDestinationResult("RedirectCancelled", 3);

    private static final /* synthetic */ CustomDestinationResult[] n() {
        return new CustomDestinationResult[]{f31286n, f31289t, f31285O, J2};
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f31288r.clone();
    }

    static {
        CustomDestinationResult[] customDestinationResultArrN = n();
        f31288r = customDestinationResultArrN;
        f31287o = EnumEntriesKt.enumEntries(customDestinationResultArrN);
    }

    private CustomDestinationResult(String str, int i2) {
    }
}
