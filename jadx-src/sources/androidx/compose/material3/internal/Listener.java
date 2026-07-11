package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\b\f*\u0002\u0018\u001c\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001&B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000bR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u00020\u0003*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "<init>", "(ZZ)V", "enabled", "", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "am", "iF", "(Landroid/view/accessibility/AccessibilityManager;)V", "E2", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableState;", "ck", "()Z", "fD", "accessibilityEnabled", "androidx/compose/material3/internal/Listener$touchExplorationListener$1", "t", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "touchExplorationListener", "androidx/compose/material3/internal/Listener$switchAccessListener$1", "O", "Landroidx/compose/material3/internal/Listener$switchAccessListener$1;", "switchAccessListener", "XQ", "(Landroid/view/accessibility/AccessibilityManager;)Z", "switchAccessEnabled", "te", "()Ljava/lang/Boolean;", "value", "Api33Impl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n81#2:184\n107#2,2:185\n101#3,2:187\n33#3,6:189\n103#3:195\n1#4:196\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n*L\n91#1:184\n91#1:185,2\n121#1:187,2\n121#1:189,6\n121#1:195\n*E\n"})
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Listener$switchAccessListener$1 switchAccessListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState accessibilityEnabled = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/material3/internal/Listener$Api33Impl;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "am", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", c.f62177j, "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "rl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api33Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api33Impl f29219n = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        @DoNotInline
        public static final void n(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.addAccessibilityServicesStateChangeListener(listener);
        }

        @JvmStatic
        @DoNotInline
        public static final void rl(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean XQ(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.contains$default((CharSequence) settingsActivityName, (CharSequence) "SwitchAccess", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final boolean ck() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    private final void fD(boolean z2) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z2));
    }

    public Listener(boolean z2, boolean z3) {
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1;
        Listener$switchAccessListener$1 listener$switchAccessListener$1 = null;
        if (z2) {
            listener$touchExplorationListener$1 = new Listener$touchExplorationListener$1();
        } else {
            listener$touchExplorationListener$1 = null;
        }
        this.touchExplorationListener = listener$touchExplorationListener$1;
        if (z3 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$1 = new Listener$switchAccessListener$1(this);
        }
        this.switchAccessListener = listener$switchAccessListener$1;
    }

    public final void E2(AccessibilityManager am) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        am.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            am.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT >= 33 && (listener$switchAccessListener$1 = this.switchAccessListener) != null) {
            Api33Impl.rl(am, n.n(listener$switchAccessListener$1));
        }
    }

    public final void iF(AccessibilityManager am) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        fD(am.isEnabled());
        am.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.rl(am.isTouchExplorationEnabled());
            am.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT >= 33 && (listener$switchAccessListener$1 = this.switchAccessListener) != null) {
            listener$switchAccessListener$1.rl(XQ(am));
            Api33Impl.n(am, n.n(listener$switchAccessListener$1));
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        fD(enabled);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean getValue() {
        boolean zN;
        boolean zN2;
        boolean z2 = false;
        if (ck()) {
            Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
            if (listener$touchExplorationListener$1 != null) {
                zN = listener$touchExplorationListener$1.n();
            } else {
                zN = false;
            }
            if (!zN) {
                Listener$switchAccessListener$1 listener$switchAccessListener$1 = this.switchAccessListener;
                if (listener$switchAccessListener$1 != null) {
                    zN2 = listener$switchAccessListener$1.n();
                } else {
                    zN2 = false;
                }
                if (zN2) {
                }
            } else {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
