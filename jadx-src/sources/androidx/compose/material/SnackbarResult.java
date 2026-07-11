package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/SnackbarResult;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackbarResult {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ SnackbarResult[] f23099O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SnackbarResult f23100n = new SnackbarResult("Dismissed", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SnackbarResult f23101t = new SnackbarResult("ActionPerformed", 1);

    private static final /* synthetic */ SnackbarResult[] n() {
        return new SnackbarResult[]{f23100n, f23101t};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f23099O.clone();
    }

    static {
        SnackbarResult[] snackbarResultArrN = n();
        f23099O = snackbarResultArrN;
        J2 = EnumEntriesKt.enumEntries(snackbarResultArrN);
    }

    private SnackbarResult(String str, int i2) {
    }
}
