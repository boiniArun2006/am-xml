package f0P;

import LdY.Ml;
import QmE.j;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
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
import com.safedk.android.analytics.AppLovinBridge;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lf0P/M5;", "Lyc/QhI;", "Lf0P/NO;", "<init>", "()V", "", "t", "()I", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "LSJ0/lS;", "p5", "Lkotlin/Lazy;", "y", "()LSJ0/lS;", "contentBinding", "eF", "I", "M7", "layoutResource", "", "Lf0P/F8;", "E", "Ljava/util/List;", "lLA", "()Ljava/util/List;", "keyableSettings", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlendingOpacityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlendingOpacityFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/BlendingOpacityFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,339:1\n148#2:340\n143#2:341\n124#2:342\n61#3,30:343\n92#3,7:378\n30#4:373\n53#5,3:374\n33#6:377\n*S KotlinDebug\n*F\n+ 1 BlendingOpacityFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/BlendingOpacityFragment\n*L\n58#1:340\n58#1:341\n58#1:342\n98#1:343,30\n98#1:378,7\n98#1:373\n98#1:374,3\n98#1:377\n*E\n"})
public final class M5 extends NO implements yc.QhI {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final List keyableSettings;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.fg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return M5.Vvq(this.f65558n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final int layoutResource = 2131558589;

    public static final class Ml implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f64468O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f64469n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ M5 f64470r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f64471t;

        public Ml(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, M5 m5) {
            this.f64469n = objectRef;
            this.f64471t = uGc;
            this.f64468O = obj;
            this.J2 = userParameter;
            this.f64470r = m5;
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
            Ref.ObjectRef objectRef = this.f64469n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f64471t);
            }
            Object obj = this.f64468O;
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
            SceneElement sceneElementNHg = HW.C.nHg(this.f64470r);
            if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this.f64470r)) == null) {
                return;
            }
            KeyableTransform transform = sceneElementNHg.getTransform();
            Keyable<Float> opacity = sceneElementNHg.getTransform().getOpacity();
            Scene sceneIF = HW.C.iF(this.f64470r);
            Intrinsics.checkNotNull(sceneIF);
            sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, null, null, null, null, 0.0f, 0.0f, KeyableKt.copyWithValueForTime(opacity, sceneIF, sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f64470r)), Float.valueOf(fFloatValue / 100.0f)), null, false, 447, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
        }
    }

    public static final class w6 implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Ml.j f64474n;

        w6() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            M5 m5;
            SceneHolder sceneHolderE;
            if (z2) {
                float progress = M5.this.y().nr.getProgress() / 512.0f;
                TextView textView = M5.this.y().f9518O;
                String str = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(100.0f * progress)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(StringsKt.padStart(str, 4, (char) 8199));
                SceneElement sceneElementNHg = HW.C.nHg(M5.this);
                if (sceneElementNHg == null || (sceneHolderE = HW.C.e((m5 = M5.this))) == null) {
                    return;
                }
                KeyableTransform transform = sceneElementNHg.getTransform();
                Keyable<Float> opacity = sceneElementNHg.getTransform().getOpacity();
                Scene sceneIF = HW.C.iF(m5);
                Intrinsics.checkNotNull(sceneIF);
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, null, null, null, null, 0.0f, 0.0f, KeyableKt.copyWithValueForTime(opacity, sceneIF, sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(m5)), Float.valueOf(progress)), null, false, 447, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f64474n = HW.C.xMQ(M5.this);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Ml.j jVar = this.f64474n;
            if (jVar != null) {
                jVar.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nO(M5 m5, OU ou2, int i2) {
        Intrinsics.checkNotNullParameter(ou2, "<unused var>");
        Intrinsics.checkNotNull(m5.y().rl.getAdapter());
        if (i2 == r3.getItemCount() - 1) {
            RecyclerView.LayoutManager layoutManager = m5.y().rl.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).rR(i2, m5.getResources().getDimensionPixelOffset(2131165570) - m5.getResources().getDimensionPixelOffset(2131165571));
        } else {
            RecyclerView.LayoutManager layoutManager2 = m5.y().rl.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager2).rR(i2, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement v0j(BlendingMode blendingMode, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, blendingMode, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4194305, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit vl(M5 m5, final BlendingMode newMode) {
        Intrinsics.checkNotNullParameter(newMode, "newMode");
        HW.C.D(m5, new Function2() { // from class: f0P.xZD
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return M5.v0j(newMode, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.lS y() {
        return (SJ0.lS) this.contentBinding.getValue();
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
        jB().n(new j.fuX("edit_blending_opacity", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        BlendingMode blendingMode;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        y().nr.setOnSeekBarChangeListener(new w6());
        y().f9518O.setOnClickListener(new View.OnClickListener() { // from class: f0P.KH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M5.Zn(this.f64423n, view2);
            }
        });
        RecyclerView recyclerView = y().rl;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (blendingMode = sceneElementNHg.getBlendingMode()) == null) {
            blendingMode = BlendingMode.NORMAL;
        }
        recyclerView.setAdapter(new LEl(blendingMode, new Function2() { // from class: f0P.Mf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return M5.nO(this.f64489n, (OU) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: f0P.o7q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return M5.vl(this.f65823n, (BlendingMode) obj);
            }
        }));
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        float fFloatValue = ((Number) KeyableKt.valueAtTime(el.getTransform().getOpacity(), SceneElementKt.fractionalTime(el, HW.C.WPU(this)))).floatValue();
        y().nr.setMax(512);
        y().nr.setProgress(MathKt.roundToInt(512.0f * fFloatValue));
        TextView textView = y().f9518O;
        String str = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue * 100.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(StringsKt.padStart(str, 4, (char) 8199));
        RecyclerView.Adapter adapter = y().rl.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BlendModeCategoryAdapter");
        ((LEl) adapter).XQ(el.getBlendingMode());
    }

    public M5() {
        AnimatorOf animatorOf = AnimatorOf.Opacity;
        j jVar = new PropertyReference1Impl() { // from class: f0P.M5.j
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTransform();
            }
        };
        n nVar = new PropertyReference1Impl() { // from class: f0P.M5.n
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getOpacity();
            }
        };
        this.keyableSettings = CollectionsKt.listOf(new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar), nVar), null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.lS Vvq(M5 m5) {
        SJ0.lS lSVarN = SJ0.lS.n(m5.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(lSVarN, "bind(...)");
        return lSVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(M5 m5, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(m5);
        if (sceneElementNHg == null) {
            return;
        }
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getTransform().getOpacity(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(m5)))).floatValue() * 100.0f;
        List listListOf = CollectionsKt.listOf(new C2348n(fFloatValue, 100.0f, 0.0f, 100.0f, "", true));
        Float fValueOf = Float.valueOf(fFloatValue);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new Ml(objectRef, uGc, fValueOf, null, m5));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = m5.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = m5.getResources();
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
        m5.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    @Override // yc.QhI
    public int t() {
        return 2131362616;
    }
}
