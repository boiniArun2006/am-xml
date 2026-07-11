package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\tR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", c.f62177j, "I", "rl", "()I", "t", "order", "nr", "titleResource", "O", "J2", "r", "o", "Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MenuItemOption {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ MenuItemOption[] f33167S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33169g;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int order;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final MenuItemOption f33166O = new MenuItemOption("Copy", 0, 0);
    public static final MenuItemOption J2 = new MenuItemOption("Paste", 1, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final MenuItemOption f33171r = new MenuItemOption("Cut", 2, 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final MenuItemOption f33170o = new MenuItemOption("SelectAll", 3, 3);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final MenuItemOption f33168Z = new MenuItemOption("Autofill", 4, 4);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.f33166O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.f33171r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.f33170o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.f33168Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MenuItemOption[] n() {
        return new MenuItemOption[]{f33166O, J2, f33171r, f33170o, f33168Z};
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) f33167S.clone();
    }

    static {
        MenuItemOption[] menuItemOptionArrN = n();
        f33167S = menuItemOptionArrN;
        f33169g = EnumEntriesKt.enumEntries(menuItemOptionArrN);
    }

    public final int nr() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return R.string.copy;
        }
        if (i2 == 2) {
            return R.string.paste;
        }
        if (i2 == 3) {
            return R.string.cut;
        }
        if (i2 == 4) {
            return R.string.selectAll;
        }
        if (i2 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? androidx.compose.ui.R.string.f31092n : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    private MenuItemOption(String str, int i2, int i3) {
        this.id = i3;
        this.order = i3;
    }
}
