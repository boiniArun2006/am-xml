package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "stringId", "<init>", "(Ljava/lang/String;II)V", "", "rl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", c.f62177j, "I", "t", "O", "J2", "r", "o", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextContextMenuItems {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19810S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ TextContextMenuItems[] f19811Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TextContextMenuItems f19812o;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int stringId;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextContextMenuItems f19814t = new TextContextMenuItems("Cut", 0, R.string.cut);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TextContextMenuItems f19809O = new TextContextMenuItems("Copy", 1, R.string.copy);
    public static final TextContextMenuItems J2 = new TextContextMenuItems("Paste", 2, R.string.paste);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TextContextMenuItems f19813r = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);

    private static final /* synthetic */ TextContextMenuItems[] n() {
        return new TextContextMenuItems[]{f19814t, f19809O, J2, f19813r, f19812o};
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) f19811Z.clone();
    }

    static {
        f19812o = new TextContextMenuItems("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? androidx.compose.foundation.R.string.f16264n : R.string.autofill);
        TextContextMenuItems[] textContextMenuItemsArrN = n();
        f19811Z = textContextMenuItemsArrN;
        f19810S = EnumEntriesKt.enumEntries(textContextMenuItemsArrN);
    }

    private TextContextMenuItems(String str, int i2, int i3) {
        this.stringId = i3;
    }

    public final String rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-309609081, i2, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
        }
        String strT = StringResources_androidKt.t(this.stringId, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return strT;
    }
}
