package androidx.compose.ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010.R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010.R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010.¨\u00067"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/Menu;", "menu", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "item", "callback", "rl", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ActionMode;", "mode", "", "O", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "Uo", "Landroid/view/MenuItem;", "nr", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "J2", "()V", "ty", "(Landroid/view/Menu;)V", c.f62177j, "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/geometry/Rect;", "t", "()Landroidx/compose/ui/geometry/Rect;", "az", "(Landroidx/compose/ui/geometry/Rect;)V", "getOnCopyRequested", "xMQ", "(Lkotlin/jvm/functions/Function0;)V", "getOnPasteRequested", "gh", "getOnCutRequested", "mUb", "getOnSelectAllRequested", "qie", "getOnAutofillRequested", "KN", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class TextActionModeCallback {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 onSelectAllRequested;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function0 onCutRequested;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Function0 onAutofillRequested;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 onActionModeDestroy;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Function0 onPasteRequested;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Rect rect;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function0 onCopyRequested;

    public TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
        this.onAutofillRequested = function06;
    }

    private final void rl(Menu menu, MenuItemOption item, Function0 callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            n(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void J2() {
        Function0 function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void KN(Function0 function0) {
        this.onAutofillRequested = function0;
    }

    public final boolean O(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            n(menu, MenuItemOption.f33166O);
        }
        if (this.onPasteRequested != null) {
            n(menu, MenuItemOption.J2);
        }
        if (this.onCutRequested != null) {
            n(menu, MenuItemOption.f33171r);
        }
        if (this.onSelectAllRequested != null) {
            n(menu, MenuItemOption.f33170o);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        n(menu, MenuItemOption.f33168Z);
        return true;
    }

    public final boolean Uo(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        ty(menu);
        return true;
    }

    public final void az(Rect rect) {
        this.rect = rect;
    }

    public final void gh(Function0 function0) {
        this.onPasteRequested = function0;
    }

    public final void mUb(Function0 function0) {
        this.onCutRequested = function0;
    }

    public final void qie(Function0 function0) {
        this.onSelectAllRequested = function0;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Rect getRect() {
        return this.rect;
    }

    public final void ty(Menu menu) {
        rl(menu, MenuItemOption.f33166O, this.onCopyRequested);
        rl(menu, MenuItemOption.J2, this.onPasteRequested);
        rl(menu, MenuItemOption.f33171r, this.onCutRequested);
        rl(menu, MenuItemOption.f33170o, this.onSelectAllRequested);
        rl(menu, MenuItemOption.f33168Z, this.onAutofillRequested);
    }

    public final void xMQ(Function0 function0) {
        this.onCopyRequested = function0;
    }

    public final void n(Menu menu, MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.nr()).setShowAsAction(1);
    }

    public final boolean nr(ActionMode mode, MenuItem item) {
        Intrinsics.checkNotNull(item);
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.f33166O.getId()) {
            Function0 function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.J2.getId()) {
            Function0 function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.f33171r.getId()) {
            Function0 function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == MenuItemOption.f33170o.getId()) {
            Function0 function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        } else if (itemId == MenuItemOption.f33168Z.getId()) {
            Function0 function05 = this.onAutofillRequested;
            if (function05 != null) {
                function05.invoke();
            }
        } else {
            return false;
        }
        if (mode != null) {
            mode.finish();
            return true;
        }
        return true;
    }

    public /* synthetic */ TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : function0, (i2 & 2) != 0 ? Rect.INSTANCE.n() : rect, (i2 & 4) != 0 ? null : function02, (i2 & 8) != 0 ? null : function03, (i2 & 16) != 0 ? null : function04, (i2 & 32) != 0 ? null : function05, (i2 & 64) != 0 ? null : function06);
    }
}
