package androidx.compose.material.internal;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.view.C1561ViewTreeLifecycleOwner;
import androidx.view.C1562ViewTreeViewModelStoreOwner;
import androidx.view.C1639ViewTreeSavedStateRegistryOwner;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.events.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0005¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u0005¢\u0006\u0004\b0\u0010\u001fJ\u0019\u00102\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0005H\u0016¢\u0006\u0004\b7\u0010\u001fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010U\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0016R/\u0010]\u001a\u0004\u0018\u00010\u001b2\b\u0010V\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R5\u0010d\u001a\u0004\u0018\u00010^2\b\u0010V\u001a\u0004\u0018\u00010^8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b_\u0010X\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010m\u001a\u00020j8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010oR(\u0010w\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020*0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vRA\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\"2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\"8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010X\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u007f\u001a\u00020*2\u0006\u0010V\u001a\u00020*8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b}\u0010-\u001a\u0004\b~\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/Function0;", "", "onDismissRequest", "", "testTag", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/window/PopupPositionProvider;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "r", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroid/view/WindowManager$LayoutParams;", "qie", "()Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/IntRect;", "o", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/IntRect;", "Ik", "()V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "HI", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "rl", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/KeyEvent;", a.f62811a, "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Z", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "XQ", "az", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "setLayoutDirection", "(I)V", "onGlobalLayout", "E2", "Lkotlin/jvm/functions/Function0;", "e", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/view/View;", "Landroid/view/WindowManager;", "N", "Landroid/view/WindowManager;", "windowManager", "v", "Landroid/view/WindowManager$LayoutParams;", "params", "Xw", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", "jB", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "parentLayoutDirection", "<set-?>", "U", "Landroidx/compose/runtime/MutableState;", "ty", "()Landroidx/compose/ui/unit/IntRect;", "ck", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds", "Landroidx/compose/ui/unit/IntSize;", "P5", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "M7", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/Dp;", "p5", "F", "maxSupportedElevation", "eF", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "E", "tmpWindowVisibleFrame", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "M", "Lkotlin/jvm/functions/Function2;", "dismissOnOutsideClick", "FX", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "B", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n149#2:460\n1#3:461\n85#4:462\n113#4,2:463\n85#4:465\n113#4,2:466\n85#4:468\n85#4:469\n113#4,2:470\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n237#1:460\n229#1:462\n229#1:463,2\n230#1:465\n230#1:466,2\n233#1:468\n288#1:469\n288#1:470,2\n*E\n"})
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Rect tmpWindowVisibleFrame;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Function0 onDismissRequest;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final MutableState content;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Function2 dismissOnOutsideClick;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final State canCalculatePosition;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final MutableState popupContentSize;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final MutableState parentBounds;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private PopupPositionProvider positionProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String testTag;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final WindowManager.LayoutParams params;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void az() {
        C1561ViewTreeLifecycleOwner.rl(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    private final Function2 getContent() {
        return (Function2) this.content.getValue();
    }

    private final IntRect o(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final WindowManager.LayoutParams qie() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.f31091O));
        return layoutParams;
    }

    private final void r(LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i3);
    }

    private final void setContent(Function2 function2) {
        this.content.setValue(function2);
    }

    public final void Ik() {
        this.windowManager.addView(this, this.params);
    }

    public final void Z(Function0 onDismissRequest, String testTag, LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        r(layoutDirection);
    }

    public final void ck(IntRect intRect) {
        this.parentBounds.setValue(intRect);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m4getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (Intrinsics.areEqual(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        XQ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (((java.lang.Boolean) r5.dismissOnOutsideClick.invoke((r6.getRawX() == 0.0f || r6.getRawY() == 0.0f) ? null : androidx.compose.ui.geometry.Offset.nr(androidx.compose.ui.geometry.OffsetKt.n(r6.getRawX(), r6.getRawY())), r0)).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        if ((event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) || event.getAction() == 4) {
            IntRect intRectTy = ty();
            if (intRectTy != null) {
            }
            Function0 function0 = this.onDismissRequest;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final IntRect ty() {
        return (IntRect) this.parentBounds.getValue();
    }

    public PopupLayout(Function0 function0, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = function0;
        this.testTag = str;
        this.composeView = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = qie();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.f34160n;
        this.parentBounds = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.popupContentSize = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.canCalculatePosition = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf((this.f23923n.ty() == null || this.f23923n.m4getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fKN = Dp.KN(8);
        this.maxSupportedElevation = fKN;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        this.dismissOnOutsideClick = new Function2<Offset, IntRect, Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Offset offset, IntRect intRect) {
                boolean z2 = false;
                if (offset != null && (Offset.az(offset.getPackedValue()) < intRect.getLeft() || Offset.az(offset.getPackedValue()) > intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() || Offset.ty(offset.getPackedValue()) < intRect.getTop() || Offset.ty(offset.getPackedValue()) > intRect.getBottom())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        };
        setId(android.R.id.content);
        C1561ViewTreeLifecycleOwner.rl(this, C1561ViewTreeLifecycleOwner.n(view));
        C1562ViewTreeViewModelStoreOwner.rl(this, C1562ViewTreeViewModelStoreOwner.n(view));
        C1639ViewTreeSavedStateRegistryOwner.rl(this, C1639ViewTreeSavedStateRegistryOwner.n(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.f31082T, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.l(fKN));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.content = SnapshotStateKt__SnapshotStateKt.O(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.f23882n.n(), null, 2, null);
    }

    public final void HI(CompositionContext parent, Function2 content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void XQ() {
        IntSize intSizeM4getPopupContentSizebOM6tXw;
        IntRect intRectTy = ty();
        if (intRectTy != null && (intSizeM4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) != null) {
            long packedValue = intSizeM4getPopupContentSizebOM6tXw.getPackedValue();
            Rect rect = this.previousWindowVisibleFrame;
            this.composeView.getWindowVisibleDisplayFrame(rect);
            IntRect intRectO = o(rect);
            long jN = this.positionProvider.n(intRectTy, IntSizeKt.n(intRectO.qie(), intRectO.J2()), this.parentLayoutDirection, packedValue);
            this.params.x = IntOffset.gh(jN);
            this.params.y = IntOffset.qie(jN);
            this.windowManager.updateViewLayout(this, this.params);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == 4 || event.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(event, this);
                return true;
            }
            if (event.getAction() == 1 && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0 function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void rl(Composer composer, int i2) {
        composer.eF(-864350873);
        if (ComposerKt.v()) {
            ComposerKt.p5(-864350873, i2, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:303)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
    }
}
