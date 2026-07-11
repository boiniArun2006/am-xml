package androidx.compose.ui.window;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SecureFlagPolicy {
    private static final /* synthetic */ SecureFlagPolicy[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f34375r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SecureFlagPolicy f34374n = new SecureFlagPolicy("Inherit", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SecureFlagPolicy f34376t = new SecureFlagPolicy("SecureOn", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final SecureFlagPolicy f34373O = new SecureFlagPolicy("SecureOff", 2);

    private static final /* synthetic */ SecureFlagPolicy[] n() {
        return new SecureFlagPolicy[]{f34374n, f34376t, f34373O};
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) J2.clone();
    }

    static {
        SecureFlagPolicy[] secureFlagPolicyArrN = n();
        J2 = secureFlagPolicyArrN;
        f34375r = EnumEntriesKt.enumEntries(secureFlagPolicyArrN);
    }

    private SecureFlagPolicy(String str, int i2) {
    }
}
