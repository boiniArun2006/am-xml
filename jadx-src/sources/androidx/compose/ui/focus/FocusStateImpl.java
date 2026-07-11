package androidx.compose.ui.focus;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "<init>", "(Ljava/lang/String;I)V", "", c.f62177j, "()Z", "isFocused", "rl", "hasFocus", "t", "O", "J2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusStateImpl implements FocusState {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31347o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ FocusStateImpl[] f31348r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FocusStateImpl f31346n = new FocusStateImpl("Active", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final FocusStateImpl f31349t = new FocusStateImpl("ActiveParent", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final FocusStateImpl f31345O = new FocusStateImpl("Captured", 2);
    public static final FocusStateImpl J2 = new FocusStateImpl("Inactive", 3);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.f31345O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.f31346n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.f31349t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FocusStateImpl[] t() {
        return new FocusStateImpl[]{f31346n, f31349t, f31345O, J2};
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) f31348r.clone();
    }

    static {
        FocusStateImpl[] focusStateImplArrT = t();
        f31348r = focusStateImplArrT;
        f31347o = EnumEntriesKt.enumEntries(focusStateImplArrT);
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean n() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean rl() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private FocusStateImpl(String str, int i2) {
    }
}
