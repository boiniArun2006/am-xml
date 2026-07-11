package com.bendingspoons.secretmenu.ui.overlay.view;

import GJW.Lu;
import GJW.OU;
import GJW.vd;
import GJW.xuv;
import TFv.Wre;
import TFv.fuX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import bH.I28;
import com.bendingspoons.secretmenu.ui.overlay.view.InvisibleOverlayView;
import com.bendingspoons.secretmenu.ui.overlay.view.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/bendingspoons/secretmenu/ui/overlay/view/j;", "newConfig", "", "O", "(Lcom/bendingspoons/secretmenu/ui/overlay/view/j;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView$j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTouchListener", "(Lcom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView$j;)V", "LTFv/Wre;", "newState", "setUpFloatingButton", "(LTFv/Wre;)V", "nr", "()V", c.f62177j, "Lcom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView$j;", "Landroid/view/View;", "t", "Landroid/view/View;", "floatingButton", "LGJW/vd;", "LGJW/vd;", "scope", "LGJW/xuv;", "J2", "LGJW/xuv;", "buttonObservingJob", "j", "secretmenu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvisibleOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvisibleOverlayView.kt\ncom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n67#2,4:129\n37#2,2:133\n55#2:135\n72#2:136\n1#3:137\n*S KotlinDebug\n*F\n+ 1 InvisibleOverlayView.kt\ncom/bendingspoons/secretmenu/ui/overlay/view/InvisibleOverlayView\n*L\n103#1:129,4\n103#1:133,2\n103#1:135\n103#1:136\n*E\n"})
public final class InvisibleOverlayView extends FrameLayout {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private xuv buttonObservingJob;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final vd scope;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private j listener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private View floatingButton;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface j {
        boolean onTouch(MotionEvent motionEvent);
    }

    public static final class w6 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.bendingspoons.secretmenu.ui.overlay.view.j f51562n;
        final /* synthetic */ InvisibleOverlayView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ImageButton f51563t;

        public w6(com.bendingspoons.secretmenu.ui.overlay.view.j jVar, InvisibleOverlayView invisibleOverlayView, ImageButton imageButton) {
            this.f51562n = jVar;
            this.rl = invisibleOverlayView;
            this.f51563t = imageButton;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
            view.removeOnLayoutChangeListener(this);
            Pair pairN = VA.j.n(((j.n) this.f51562n).n(), this.rl);
            VA.j.t(this.f51563t, ((Number) pairN.component1()).floatValue(), ((Number) pairN.component2()).floatValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InvisibleOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51560n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51561t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = InvisibleOverlayView.this.new n(continuation);
            nVar.f51561t = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.bendingspoons.secretmenu.ui.overlay.view.j jVar, Continuation continuation) {
            return ((n) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51560n == 0) {
                ResultKt.throwOnFailure(obj);
                InvisibleOverlayView.this.O((com.bendingspoons.secretmenu.ui.overlay.view.j) this.f51561t);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ InvisibleOverlayView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(com.bendingspoons.secretmenu.ui.overlay.view.j jVar, View view) {
        ((j.n) jVar).rl().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(final com.bendingspoons.secretmenu.ui.overlay.view.j newConfig) {
        if (!(newConfig instanceof j.n)) {
            if (!(newConfig instanceof j.C0737j)) {
                throw new NoWhenBranchMatchedException();
            }
            View view = this.floatingButton;
            if (view != null) {
                removeView(view);
            }
            this.floatingButton = null;
            return;
        }
        if (this.floatingButton != null) {
            return;
        }
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setContentDescription(getContext().getString(I28.f43236t));
        imageButton.setBackgroundResource(bH.n.f43254n);
        imageButton.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        imageButton.setElevation(getContext().getResources().getDimension(bH.j.f43253n));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Gn.w6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InvisibleOverlayView.J2(newConfig, view2);
            }
        });
        imageButton.setOnTouchListener(new Gn.n(new Function2() { // from class: Gn.Ml
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InvisibleOverlayView.Uo(newConfig, this, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }));
        addView(imageButton, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w6(newConfig, this, imageButton));
        } else {
            Pair pairN = VA.j.n(((j.n) newConfig).n(), this);
            VA.j.t(imageButton, ((Number) pairN.component1()).floatValue(), ((Number) pairN.component2()).floatValue());
        }
        this.floatingButton = imageButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(com.bendingspoons.secretmenu.ui.overlay.view.j jVar, InvisibleOverlayView invisibleOverlayView, float f3, float f4) {
        ((j.n) jVar).t().invoke(VA.j.rl(invisibleOverlayView, f3, f4));
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        int childCount;
        Intrinsics.checkNotNullParameter(event, "event");
        if (super.dispatchTouchEvent(event)) {
            return true;
        }
        j jVar = this.listener;
        if (jVar != null) {
            jVar.onTouch(event);
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i2);
                if (!Intrinsics.areEqual(childAt, this) && childAt != null) {
                    childAt.dispatchTouchEvent(event);
                }
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final void nr() {
        xuv xuvVar = this.buttonObservingJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.buttonObservingJob = null;
        View view = this.floatingButton;
        if (view != null) {
            removeView(view);
        }
        this.floatingButton = null;
    }

    public final void setTouchListener(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setUpFloatingButton(Wre newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        xuv xuvVar = this.buttonObservingJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.buttonObservingJob = fuX.T(fuX.s7N(newState, new n(null)), this.scope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvisibleOverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scope = Lu.n(OU.t());
    }
}
