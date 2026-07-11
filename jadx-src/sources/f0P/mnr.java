package f0P;

import LdY.Ml;
import QmE.j;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\b8\u0014X\u0094D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\nR \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R3\u0010;\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u0005\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lf0P/mnr;", "Lf0P/NO;", "Lyc/DAz;", "<init>", "()V", "", "Mh", "o9", "", "p5", "()I", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "LSJ0/Mo;", "Lkotlin/Lazy;", "Aum", "()LSJ0/Mo;", "binding", "LSJ0/HcS;", "eF", CmcdData.STREAMING_FORMAT_SS, "()LSJ0/HcS;", "contentBinding", "E", "I", "M7", "layoutResource", "", "Lf0P/F8;", "M", "Ljava/util/List;", "lLA", "()Ljava/util/List;", "keyableSettings", "Landroid/animation/ValueAnimator;", "FX", "Landroid/animation/ValueAnimator;", "revealAnimation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animated", "B", "Lkotlin/jvm/functions/Function1;", "panelCloser", "J", "Z", "isClosed", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVolumeEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VolumeEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/VolumeEditFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 4 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n143#2:226\n109#3,11:227\n61#4,30:238\n92#4,7:273\n30#5:268\n53#6,3:269\n33#7:272\n*S KotlinDebug\n*F\n+ 1 VolumeEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/VolumeEditFragment\n*L\n45#1:226\n134#1:227,11\n109#1:238,30\n109#1:273,7\n109#1:268\n109#1:269,3\n109#1:272\n*E\n"})
public final class mnr extends NO implements yc.DAz {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Function1 panelCloser;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator revealAnimation;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final List keyableSettings;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy binding = LazyKt.lazy(new Function0() { // from class: f0P.G3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mnr.v0j(this.f64225n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.v9r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mnr.n7b(this.f66255n);
        }
    });

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558611;

    public static final class Ml implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f65792O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f65793n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ mnr f65794r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f65795t;

        public Ml(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, mnr mnrVar) {
            this.f65793n = objectRef;
            this.f65795t = uGc;
            this.f65792O = obj;
            this.J2 = userParameter;
            this.f65794r = mnrVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            SceneHolder sceneHolderE;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f65793n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f65795t);
            }
            Object obj = this.f65792O;
            UserParameter userParameter = this.J2;
            if (obj instanceof Quaternion) {
                Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                if (objFromEulerAngles == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) objFromEulerAngles;
            } else if (obj instanceof Vector2D) {
                fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
            } else if (obj instanceof Vector3D) {
                fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
            } else if (!(obj instanceof Float)) {
                Object obj2 = valueList.get(0);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj2;
            } else if (userParameter instanceof UserParameter.Spinner) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
            } else if (userParameter instanceof UserParameter.Slider) {
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
            } else {
                Object obj3 = valueList.get(0);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj3;
            }
            float fFloatValue = fValueOf.floatValue();
            SceneElement sceneElementNHg = HW.C.nHg(this.f65794r);
            if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this.f65794r)) == null) {
                return;
            }
            Keyable<Float> gain = sceneElementNHg.getGain();
            Scene sceneIF = HW.C.iF(this.f65794r);
            Intrinsics.checkNotNull(sceneIF);
            sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, KeyableKt.copyWithValueForTime(gain, sceneIF, sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f65794r)), Float.valueOf(fFloatValue / 100.0f)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1048577, 127, null));
        }
    }

    public static final class n implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f65797n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mnr f65798t;

        public n(View view, mnr mnrVar) {
            this.f65797n = view;
            this.f65798t = mnrVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f65797n.getMeasuredWidth() <= 0 || this.f65797n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f65797n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f65798t.Mh();
        }
    }

    public static final class w6 implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Ml.j f65799n;

        w6() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            mnr mnrVar;
            SceneHolder sceneHolderE;
            if (z2) {
                float progress = mnr.this.s().rl.getProgress() / 100.0f;
                mnr.this.s().f9142t.setText(String.valueOf(MathKt.roundToInt(100.0f * progress)));
                SceneElement sceneElementNHg = HW.C.nHg(mnr.this);
                if (sceneElementNHg == null || (sceneHolderE = HW.C.e((mnrVar = mnr.this))) == null) {
                    return;
                }
                Keyable<Float> gain = sceneElementNHg.getGain();
                Scene sceneIF = HW.C.iF(mnrVar);
                Intrinsics.checkNotNull(sceneIF);
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, KeyableKt.copyWithValueForTime(gain, sceneIF, sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(mnrVar)), Float.valueOf(progress)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1048577, 127, null));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f65799n = HW.C.xMQ(mnr.this);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Ml.j jVar = this.f65799n;
            if (jVar != null) {
                jVar.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toy(mnr mnrVar, boolean z2) {
        mnrVar.revealAnimation = null;
        mnrVar.panelCloser = null;
        mnrVar.isClosed = true;
        FragmentActivity activity = mnrVar.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xzo(mnr mnrVar, boolean z2) {
        mnrVar.revealAnimation = null;
        return Unit.INSTANCE;
    }

    private final SJ0.Mo Aum() {
        return (SJ0.Mo) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mh() {
        if (this.isClosed) {
            return;
        }
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, Aum().ViF.getWidth());
        final ConstraintLayout volumeFragHolder = Aum().ViF;
        Intrinsics.checkNotNullExpressionValue(volumeFragHolder, "volumeFragHolder");
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.f9M
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                mnr.Th(this.f65536n, volumeFragHolder, valueAnimator2);
            }
        });
        valueAnimatorOfInt.setDuration(200L);
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        PD.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.XOw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mnr.xzo(this.f65088n, ((Boolean) obj).booleanValue());
            }
        });
        valueAnimatorOfInt.start();
        this.revealAnimation = valueAnimatorOfInt;
        this.panelCloser = new Function1() { // from class: f0P.Bn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mnr.jO(this.f64100n, volumeFragHolder, ((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Th(mnr mnrVar, ConstraintLayout constraintLayout, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!mnrVar.isAdded()) {
            it.cancel();
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        constraintLayout.setClipBounds(new Rect(constraintLayout.getWidth() - iIntValue, 0, constraintLayout.getWidth(), (constraintLayout.getHeight() * iIntValue) / constraintLayout.getWidth()));
        if (constraintLayout.getVisibility() != 4 || iIntValue <= 0) {
            return;
        }
        constraintLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jO(final mnr mnrVar, final ConstraintLayout constraintLayout, boolean z2) {
        ValueAnimator valueAnimator = mnrVar.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        mnrVar.revealAnimation = null;
        if (z2) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(constraintLayout.getWidth(), 0);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.si
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    mnr.wKp(constraintLayout, valueAnimator2);
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfInt);
            PD.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.ECI
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return mnr.Toy(this.f64168n, ((Boolean) obj).booleanValue());
                }
            });
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.start();
            mnrVar.revealAnimation = valueAnimatorOfInt;
        }
        return Unit.INSTANCE;
    }

    private final void o9() {
        if (this.isClosed || this.panelCloser == null) {
            return;
        }
        this.isClosed = false;
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
        Function1 function1 = this.panelCloser;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        this.panelCloser = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.HcS s() {
        return (SJ0.HcS) this.contentBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wKp(ConstraintLayout constraintLayout, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        constraintLayout.setClipBounds(new Rect(constraintLayout.getWidth() - iIntValue, 0, constraintLayout.getWidth(), (constraintLayout.getHeight() * iIntValue) / constraintLayout.getWidth()));
        if (iIntValue <= 2) {
            constraintLayout.setVisibility(4);
        }
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA, reason: from getter */
    protected List getKeyableSettings() {
        return this.keyableSettings;
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_volume", null, 2, null));
    }

    @Override // yc.DAz
    public boolean onBackPressed() {
        if (this.panelCloser != null) {
            o9();
        }
        return !this.isClosed;
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        if (!SceneElementKt.hasAnyAudio(sceneElementNHg)) {
            s().f9140O.setVisibility(0);
            s().rl.setVisibility(8);
            s().f9142t.setVisibility(8);
            s().nr.setVisibility(8);
        }
        Aum().ViF.setVisibility(4);
        s().rl.setOnSeekBarChangeListener(new w6());
        s().f9142t.setOnClickListener(new View.OnClickListener() { // from class: f0P.Nf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mnr.Lp6(this.f64522n, view2);
            }
        });
        ConstraintLayout constraintLayout = Aum().ViF;
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new n(constraintLayout, this));
        Aum().f9231O.setOnClickListener(new View.OnClickListener() { // from class: f0P.VmZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mnr.g6(this.f64929n, view2);
            }
        });
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        float fFloatValue = ((Number) KeyableKt.valueAtTime(el.getGain(), SceneElementKt.fractionalTime(el, HW.C.WPU(this)))).floatValue();
        s().rl.setMax(150);
        float f3 = fFloatValue * 100.0f;
        s().rl.setProgress(MathKt.roundToInt(f3));
        s().f9142t.setText(String.valueOf(MathKt.roundToInt(f3)));
        if (SceneElementKt.hasAnyAudio(el)) {
            return;
        }
        HV().setEnabled(false);
        How().setEnabled(false);
    }

    public mnr() {
        AnimatorOf animatorOf = AnimatorOf.Gain;
        j jVar = new PropertyReference1Impl() { // from class: f0P.mnr.j
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getGain();
            }
        };
        this.keyableSettings = CollectionsKt.listOf(new F8(animatorOf, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar), null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lp6(mnr mnrVar, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(mnrVar);
        if (sceneElementNHg == null) {
            return;
        }
        float fFloatValue = 100.0f * ((Number) KeyableKt.valueAtTime(sceneElementNHg.getGain(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(mnrVar)))).floatValue();
        List listListOf = CollectionsKt.listOf(new C2348n(fFloatValue, 100.0f, 0.0f, 150.0f, "", true));
        Float fValueOf = Float.valueOf(fFloatValue);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new Ml(objectRef, uGc, fValueOf, null, mnrVar));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = mnrVar.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = mnrVar.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            float dimensionPixelSize = iArr[1];
            if (identifier > 0) {
                dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
            }
            uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
        }
        mnrVar.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g6(mnr mnrVar, View view) {
        mnrVar.o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.HcS n7b(mnr mnrVar) {
        SJ0.HcS hcSN = SJ0.HcS.n(mnrVar.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(hcSN, "bind(...)");
        return hcSN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.Mo v0j(mnr mnrVar) {
        SJ0.Mo moN = SJ0.Mo.n(mnrVar.requireView());
        Intrinsics.checkNotNullExpressionValue(moN, "bind(...)");
        return moN;
    }

    @Override // f0P.Ny
    public int p5() {
        return 2131558610;
    }
}
