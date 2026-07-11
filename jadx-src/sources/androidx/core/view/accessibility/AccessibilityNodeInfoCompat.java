package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class AccessibilityNodeInfoCompat {
    private static int nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AccessibilityNodeInfo f36846n;
    public int rl = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36847t = -1;

    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat E2;
        public static final AccessibilityActionCompat M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final AccessibilityActionCompat f36848N;
        public static final AccessibilityActionCompat P5;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final AccessibilityActionCompat f36851T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final AccessibilityActionCompat f36852U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final AccessibilityActionCompat f36853X;
        public static final AccessibilityActionCompat Xw;
        public static final AccessibilityActionCompat bzg;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AccessibilityActionCompat f36855e;
        public static final AccessibilityActionCompat eF;
        public static final AccessibilityActionCompat fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AccessibilityActionCompat f36856g;
        public static final AccessibilityActionCompat iF;
        public static final AccessibilityActionCompat jB;
        public static final AccessibilityActionCompat nHg;
        public static final AccessibilityActionCompat p5;
        public static final AccessibilityActionCompat rV9;
        public static final AccessibilityActionCompat s7N;
        public static final AccessibilityActionCompat te;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final AccessibilityActionCompat f36859v;
        public static final AccessibilityActionCompat wTp;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f36860n;
        protected final AccessibilityViewCommand nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Class f36861t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final AccessibilityActionCompat f36849O = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat J2 = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat Uo = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat KN = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat xMQ = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat mUb = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat gh = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat qie = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat az = new AccessibilityActionCompat(256, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ty = new AccessibilityActionCompat(512, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat HI = new AccessibilityActionCompat(1024, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ck = new AccessibilityActionCompat(2048, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat Ik = new AccessibilityActionCompat(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final AccessibilityActionCompat f36858r = new AccessibilityActionCompat(8192, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final AccessibilityActionCompat f36857o = new AccessibilityActionCompat(16384, null);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final AccessibilityActionCompat f36854Z = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat XQ = new AccessibilityActionCompat(65536, null);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final AccessibilityActionCompat f36850S = new AccessibilityActionCompat(131072, (CharSequence) null, AccessibilityViewCommand.SetSelectionArguments.class);
        public static final AccessibilityActionCompat WPU = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat aYN = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ViF = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat nY = new AccessibilityActionCompat(2097152, (CharSequence) null, AccessibilityViewCommand.SetTextArguments.class);

        public AccessibilityActionCompat(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f36860n;
            return obj2 == null ? accessibilityActionCompat.f36860n == null : obj2.equals(accessibilityActionCompat.f36860n);
        }

        static {
            int i2 = Build.VERSION.SDK_INT;
            f36856g = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            te = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            iF = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            fD = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E2 = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f36855e = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f36853X = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f36851T = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f36848N = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            nHg = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            s7N = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            wTp = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            f36859v = new AccessibilityActionCompat(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            rV9 = new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            bzg = new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            Xw = new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            jB = new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f36852U = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            P5 = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            M7 = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            p5 = new AccessibilityActionCompat(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            eF = new AccessibilityActionCompat(i2 >= 34 ? Api34Impl.n() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i2, charSequence, accessibilityViewCommand, null);
        }

        public int hashCode() {
            Object obj = this.f36860n;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public AccessibilityActionCompat n(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.rl, charSequence, accessibilityViewCommand, this.f36861t);
        }

        public boolean nr(View view, Bundle bundle) {
            AccessibilityViewCommand.CommandArguments commandArguments;
            if (this.nr == null) {
                return false;
            }
            Class cls = this.f36861t;
            AccessibilityViewCommand.CommandArguments commandArguments2 = null;
            if (cls != null) {
                try {
                    commandArguments = (AccessibilityViewCommand.CommandArguments) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    commandArguments.n(bundle);
                    commandArguments2 = commandArguments;
                } catch (Exception e3) {
                    e = e3;
                    commandArguments2 = commandArguments;
                    Class cls2 = this.f36861t;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? V8ValueNull.NULL : cls2.getName()), e);
                }
            }
            return this.nr.n(view, commandArguments2);
        }

        public int rl() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36860n).getId();
        }

        public CharSequence t() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36860n).getLabel();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strMUb = AccessibilityNodeInfoCompat.mUb(this.rl);
            if (strMUb.equals("ACTION_UNKNOWN") && t() != null) {
                strMUb = t().toString();
            }
            sb.append(strMUb);
            return sb.toString();
        }

        AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i2, CharSequence charSequence, Class cls) {
            this(null, i2, charSequence, null, cls);
        }

        AccessibilityActionCompat(Object obj, int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.rl = i2;
            this.nr = accessibilityViewCommand;
            if (obj == null) {
                this.f36860n = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f36860n = obj;
            }
            this.f36861t = cls;
        }
    }

    @RequiresApi
    private static class Api34Impl {
        public static AccessibilityNodeInfo.AccessibilityAction n() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static boolean nr(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void rl(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence t(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }
    }

    @RequiresApi
    private static class Api35Impl {
    }

    public static class CollectionInfoCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f36862n;

        public static final class Builder {
        }

        public static CollectionInfoCompat n(int i2, int i3, boolean z2) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2));
        }

        public static CollectionInfoCompat rl(int i2, int i3, boolean z2, int i5) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i5));
        }

        CollectionInfoCompat(Object obj) {
            this.f36862n = obj;
        }
    }

    public static class CollectionItemInfoCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f36863n;

        public static final class Builder {
        }

        public static CollectionItemInfoCompat n(int i2, int i3, int i5, int i7, boolean z2, boolean z3) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i5, i7, z2, z3));
        }

        CollectionItemInfoCompat(Object obj) {
            this.f36863n = obj;
        }
    }

    public static class RangeInfoCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f36864n;

        public static RangeInfoCompat n(int i2, float f3, float f4, float f5) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i2, f3, f4, f5));
        }

        RangeInfoCompat(Object obj) {
            this.f36864n = obj;
        }
    }

    public static final class TouchDelegateInfoCompat {
    }

    static String mUb(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public void ER(View view) {
        this.rl = -1;
        this.f36846n.setParent(view);
    }

    public void Nxk() {
    }

    public void VwL(View view) {
        this.f36847t = -1;
        this.f36846n.setSource(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36846n;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f36846n != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f36846n)) {
            return false;
        }
        return this.f36847t == accessibilityNodeInfoCompat.f36847t && this.rl == accessibilityNodeInfoCompat.rl;
    }

    @RequiresApi
    private static class Api30Impl {
        public static CharSequence n(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void rl(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    @RequiresApi
    private static class Api33Impl {
        public static String n(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean rl(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static AccessibilityNodeInfoCompat I(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return Zmq(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f36846n));
    }

    private List KN(String str) {
        ArrayList<Integer> integerArrayList = this.f36846n.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f36846n.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void O(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private int T(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i2)).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = nr;
        nr = i3 + 1;
        return i3;
    }

    private void Uo() {
        this.f36846n.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f36846n.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f36846n.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f36846n.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private boolean X() {
        return !KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static AccessibilityNodeInfoCompat Zmq(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    private SparseArray g(View view) {
        return (SparseArray) view.getTag(androidx.core.R.id.f36160U);
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean B() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.rl(this.f36846n) : qie(8388608);
    }

    public void Bu(CharSequence charSequence) {
        this.f36846n.setText(charSequence);
    }

    public void C(boolean z2) {
        this.f36846n.setClickable(z2);
    }

    public boolean E() {
        return this.f36846n.isScrollable();
    }

    public String E2() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.n(this.f36846n) : this.f36846n.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void EWS(View view) {
        this.f36846n.setLabelFor(view);
    }

    public void F(boolean z2) {
        this.f36846n.setScrollable(z2);
    }

    public boolean FX() {
        return Build.VERSION.SDK_INT >= 26 ? this.f36846n.isShowingHintText() : qie(4);
    }

    public void G7(Object obj) {
        this.f36846n.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).f36863n);
    }

    public void GD(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36846n.setHintText(charSequence);
        } else {
            this.f36846n.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public boolean GR(int i2, Bundle bundle) {
        return this.f36846n.performAction(i2, bundle);
    }

    public void HBN(String str) {
        this.f36846n.setViewIdResourceName(str);
    }

    public void HI(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.rl(this.f36846n, rect);
            return;
        }
        Rect rect2 = (Rect) this.f36846n.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void HV(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36846n.setHeading(z2);
        } else {
            piY(2, z2);
        }
    }

    public void How(CharSequence charSequence) {
        this.f36846n.setPackageName(charSequence);
    }

    public CharSequence Ik() {
        return this.f36846n.getClassName();
    }

    public boolean J() {
        return this.f36846n.isVisibleToUser();
    }

    public void J2(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            Uo();
            k(view);
            ClickableSpan[] clickableSpanArrR = r(charSequence);
            if (clickableSpanArrR == null || clickableSpanArrR.length <= 0) {
                return;
            }
            S().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", androidx.core.R.id.f36168n);
            SparseArray sparseArrayViF = ViF(view);
            for (int i2 = 0; i2 < clickableSpanArrR.length; i2++) {
                int iT = T(clickableSpanArrR[i2], sparseArrayViF);
                sparseArrayViF.put(iT, new WeakReference(clickableSpanArrR[i2]));
                O(clickableSpanArrR[i2], (Spanned) charSequence, iT);
            }
        }
    }

    public void Jk(boolean z2) {
        this.f36846n.setEnabled(z2);
    }

    public void K(int i2) {
        this.f36846n.setMovementGranularities(i2);
    }

    public boolean M() {
        return this.f36846n.isSelected();
    }

    public boolean M7() {
        return this.f36846n.isImportantForAccessibility();
    }

    public void Mx(Object obj) {
        this.f36846n.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).f36862n);
    }

    public boolean N() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.nr(this.f36846n) : qie(64);
    }

    public void Org(boolean z2) {
        piY(androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON, z2);
    }

    public boolean P5() {
        return qie(androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON);
    }

    public void Po6(boolean z2) {
        this.f36846n.setImportantForAccessibility(z2);
    }

    public void QZ6(boolean z2) {
        this.f36846n.setSelected(z2);
    }

    public void Qu(View view, int i2) {
        this.f36846n.setTraversalBefore(view, i2);
    }

    public void RQ(CharSequence charSequence) {
        this.f36846n.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void Rl(CharSequence charSequence) {
        this.f36846n.setError(charSequence);
    }

    public Bundle S() {
        return this.f36846n.getExtras();
    }

    public void T3L(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.rl(this.f36846n, charSequence);
        } else {
            this.f36846n.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean U() {
        return this.f36846n.isFocused();
    }

    public void UF(boolean z2) {
        this.f36846n.setVisibleToUser(z2);
    }

    public void Uf(View view) {
        this.f36846n.setTraversalAfter(view);
    }

    public void UhV(boolean z2) {
        this.f36846n.setLongClickable(z2);
    }

    public void W(RangeInfoCompat rangeInfoCompat) {
        this.f36846n.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.f36864n);
    }

    public int WPU() {
        return this.f36846n.getMaxTextLength();
    }

    public AccessibilityNodeInfo X4T() {
        return this.f36846n;
    }

    public CharSequence XQ() {
        return this.f36846n.getError();
    }

    public boolean Xw() {
        return this.f36846n.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public boolean Y(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f36846n.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f36860n);
    }

    public CharSequence Z() {
        return this.f36846n.getContentDescription();
    }

    public void a63(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36846n.setScreenReaderFocusable(z2);
        } else {
            piY(1, z2);
        }
    }

    public int aYN() {
        return this.f36846n.getMovementGranularities();
    }

    public void az(Rect rect) {
        this.f36846n.getBoundsInParent(rect);
    }

    public boolean bzg() {
        return this.f36846n.isEnabled();
    }

    public int ck() {
        return this.f36846n.getChildCount();
    }

    public void dR0(boolean z2) {
        this.f36846n.setAccessibilityFocused(z2);
    }

    public String e() {
        return this.f36846n.getViewIdResourceName();
    }

    public boolean eF() {
        return this.f36846n.isPassword();
    }

    public void eTf(boolean z2) {
        this.f36846n.setCanOpenPopup(z2);
    }

    public void eWT(boolean z2) {
        this.f36846n.setContentInvalid(z2);
    }

    public void f(View view, int i2) {
        this.f36846n.setTraversalAfter(view, i2);
    }

    public CharSequence fD() {
        return Build.VERSION.SDK_INT >= 28 ? this.f36846n.getTooltipText() : this.f36846n.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void fcU(CharSequence charSequence) {
        this.f36846n.setContentDescription(charSequence);
    }

    public int gh() {
        return this.f36846n.getActions();
    }

    public void hRu(int i2) {
        this.f36846n.setLiveRegion(i2);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36846n;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(int i2) {
        this.f36846n.setMaxTextLength(i2);
    }

    public void ijL(Rect rect) {
        this.f36846n.setBoundsInParent(rect);
    }

    public boolean jB() {
        return this.f36846n.isFocusable();
    }

    public void kSg(boolean z2) {
        this.f36846n.setPassword(z2);
    }

    public void lLA(View view, int i2) {
        this.rl = i2;
        this.f36846n.setParent(view, i2);
    }

    public void m(Rect rect) {
        this.f36846n.setBoundsInScreen(rect);
    }

    public void mI(View view, int i2) {
        this.f36847t = i2;
        this.f36846n.setSource(view, i2);
    }

    public void mYa(boolean z2) {
        this.f36846n.setFocused(z2);
    }

    public void n(int i2) {
        this.f36846n.addAction(i2);
    }

    public void n1(boolean z2) {
        this.f36846n.setEditable(z2);
    }

    public boolean nHg() {
        return this.f36846n.isAccessibilityFocused();
    }

    public CharSequence nY() {
        return this.f36846n.getPackageName();
    }

    public void nr(View view, int i2) {
        this.f36846n.addChild(view, i2);
    }

    public CharSequence o() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.t(this.f36846n) : this.f36846n.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void ofS(CharSequence charSequence) {
        this.f36846n.setClassName(charSequence);
    }

    public void p0N(int i2, int i3) {
        this.f36846n.setTextSelection(i2, i3);
    }

    public boolean p5() {
        return this.f36846n.isLongClickable();
    }

    public void pJg(boolean z2) {
        this.f36846n.setChecked(z2);
    }

    public void qm(boolean z2) {
        this.f36846n.setFocusable(z2);
    }

    public boolean rV9() {
        return this.f36846n.isContextClickable();
    }

    public void rl(AccessibilityActionCompat accessibilityActionCompat) {
        this.f36846n.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f36860n);
    }

    public boolean s7N() {
        return this.f36846n.isCheckable();
    }

    public void t(View view) {
        this.f36846n.addChild(view);
    }

    public void tFV(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36846n.setShowingHintText(z2);
        } else {
            piY(4, z2);
        }
    }

    public void tUK(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36846n.setPaneTitle(charSequence);
        } else {
            this.f36846n.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence te() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.n(this.f36846n) : this.f36846n.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        az(rect);
        sb.append("; boundsInParent: " + rect);
        ty(rect);
        sb.append("; boundsInScreen: " + rect);
        HI(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(nY());
        sb.append("; className: ");
        sb.append(Ik());
        sb.append("; text: ");
        sb.append(iF());
        sb.append("; error: ");
        sb.append(XQ());
        sb.append("; maxTextLength: ");
        sb.append(WPU());
        sb.append("; stateDescription: ");
        sb.append(te());
        sb.append("; contentDescription: ");
        sb.append(Z());
        sb.append("; tooltipText: ");
        sb.append(fD());
        sb.append("; viewIdResName: ");
        sb.append(e());
        sb.append("; uniqueId: ");
        sb.append(E2());
        sb.append("; checkable: ");
        sb.append(s7N());
        sb.append("; checked: ");
        sb.append(wTp());
        sb.append("; fieldRequired: ");
        sb.append(Xw());
        sb.append("; focusable: ");
        sb.append(jB());
        sb.append("; focused: ");
        sb.append(U());
        sb.append("; selected: ");
        sb.append(M());
        sb.append("; clickable: ");
        sb.append(v());
        sb.append("; longClickable: ");
        sb.append(p5());
        sb.append("; contextClickable: ");
        sb.append(rV9());
        sb.append("; enabled: ");
        sb.append(bzg());
        sb.append("; password: ");
        sb.append(eF());
        sb.append("; scrollable: " + E());
        sb.append("; containerTitle: ");
        sb.append(o());
        sb.append("; granularScrollingSupported: ");
        sb.append(P5());
        sb.append("; importantForAccessibility: ");
        sb.append(M7());
        sb.append("; visible: ");
        sb.append(J());
        sb.append("; isTextSelectable: ");
        sb.append(B());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(N());
        sb.append("; [");
        List listXMQ = xMQ();
        for (int i2 = 0; i2 < listXMQ.size(); i2++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) listXMQ.get(i2);
            String strMUb = mUb(accessibilityActionCompat.rl());
            if (strMUb.equals("ACTION_UNKNOWN") && accessibilityActionCompat.t() != null) {
                strMUb = accessibilityActionCompat.t().toString();
            }
            sb.append(strMUb);
            if (i2 != listXMQ.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void ty(Rect rect) {
        this.f36846n.getBoundsInScreen(rect);
    }

    public void ub(View view) {
        this.f36846n.setTraversalBefore(view);
    }

    public void ul(boolean z2) {
        this.f36846n.setDismissable(z2);
    }

    public boolean v() {
        return this.f36846n.isClickable();
    }

    public boolean wTp() {
        return this.f36846n.isChecked();
    }

    public List xMQ() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f36846n.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i2)));
        }
        return arrayList;
    }

    public void xg(boolean z2) {
        this.f36846n.setCheckable(z2);
    }

    public void z(List list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36846n.setAvailableExtraData(list);
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f36846n = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat D() {
        return Zmq(AccessibilityNodeInfo.obtain());
    }

    private SparseArray ViF(View view) {
        SparseArray sparseArrayG = g(view);
        if (sparseArrayG == null) {
            SparseArray sparseArray = new SparseArray();
            view.setTag(androidx.core.R.id.f36160U, sparseArray);
            return sparseArray;
        }
        return sparseArrayG;
    }

    public static AccessibilityNodeInfoCompat a(View view) {
        return Zmq(AccessibilityNodeInfo.obtain(view));
    }

    private void k(View view) {
        SparseArray sparseArrayG = g(view);
        if (sparseArrayG != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayG.size(); i2++) {
                if (((WeakReference) sparseArrayG.valueAt(i2)).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayG.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void piY(int i2, boolean z2) {
        Bundle bundleS = S();
        if (bundleS != null) {
            int i3 = bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            bundleS.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    private boolean qie(int i2) {
        Bundle bundleS = S();
        if (bundleS == null || (bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) != i2) {
            return false;
        }
        return true;
    }

    public CharSequence iF() {
        if (X()) {
            List listKN = KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List listKN2 = KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List listKN3 = KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List listKN4 = KN("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f36846n.getText(), 0, this.f36846n.getText().length()));
            for (int i2 = 0; i2 < listKN.size(); i2++) {
                spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) listKN4.get(i2)).intValue(), this, S().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listKN.get(i2)).intValue(), ((Integer) listKN2.get(i2)).intValue(), ((Integer) listKN3.get(i2)).intValue());
            }
            return spannableString;
        }
        return this.f36846n.getText();
    }
}
