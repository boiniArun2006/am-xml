package f0P;

import LdY.Ml;
import QmE.j;
import android.R;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.TrimmingKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import r.C2348n;
import yc.InterfaceC2452g;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001lB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\bJ\u000f\u0010&\u001a\u00020\tH\u0017¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\bJ!\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00107R\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR3\u0010Y\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lf0P/tC;", "Lyc/Buf;", "Lyc/QhI;", "Lyc/DAz;", "Lyc/g;", "Lyc/H;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "X4T", "Lf0P/tC$j;", "panel", "Uf", "(Lf0P/tC$j;)V", "", "animated", "eTf", "(Z)Z", "", "t", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "nr", "gh", "onBackPressed", "()Z", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lyc/a;", "motionEvent", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "LSJ0/nSC;", "o", "LSJ0/nSC;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "ofS", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LnYs/Ml;", "S", "LnYs/Ml;", "C", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LWK/I28;", "g", "LWK/I28;", "Mx", "()LWK/I28;", "setNewFeatureManager", "(LWK/I28;)V", "newFeatureManager", "E2", "showedMissingNotice", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "revealAnimation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "X", "Lkotlin/jvm/functions/Function1;", "panelCloser", "LLdY/Ml$j;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LLdY/Ml$j;", "undoBatch", "N", "Lf0P/tC$j;", "currentPanel", "Lcom/alightcreative/app/motion/scene/SceneElement;", "v", "Lcom/alightcreative/app/motion/scene/SceneElement;", "initialElementState", "Lyc/Ji;", "Xw", "Lyc/Ji;", "shapeEditHelper", "pJg", "()LSJ0/nSC;", "binding", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElementEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ElementEditFragment\n+ 2 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 3 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,745:1\n25#2:746\n25#2:747\n25#2:748\n25#2:749\n25#2:750\n24#2:751\n61#3,30:752\n92#3,7:787\n30#4:782\n53#5,3:783\n33#6:786\n*S KotlinDebug\n*F\n+ 1 ElementEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ElementEditFragment\n*L\n178#1:746\n179#1:747\n180#1:748\n181#1:749\n182#1:750\n251#1:751\n695#1:752,30\n695#1:787,7\n695#1:782\n695#1:783,3\n695#1:786\n*E\n"})
public final class tC extends fGM implements yc.Buf, yc.QhI, yc.DAz, InterfaceC2452g, yc.H {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean showedMissingNotice;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private j currentPanel;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private Function1 panelCloser;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final yc.Ji shapeEditHelper = new yc.Ji(this, false, null, 6, null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator revealAnimation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public WK.I28 newFeatureManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.nSC _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private SceneElement initialElementState;

    public static final class Ml implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f66204O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f66205n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ tC f66206o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SceneElement f66207r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f66208t;

        public Ml(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, SceneElement sceneElement, tC tCVar) {
            this.f66205n = objectRef;
            this.f66208t = uGc;
            this.f66204O = obj;
            this.J2 = userParameter;
            this.f66207r = sceneElement;
            this.f66206o = tCVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f66205n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f66208t);
            }
            Object obj = this.f66204O;
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
            HW.C.D(this.f66206o, new w6(this.f66207r, fValueOf.floatValue()));
            this.f66206o.nr();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f66209O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f66210n = new j("SPEED_CONTROL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f66211t = new j("VOLUME", 1);

        static {
            j[] jVarArrN = n();
            f66209O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f66210n, f66211t};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f66209O.clone();
        }

        private j(String str, int i2) {
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SceneElement f66212n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f66213t;

        w6(SceneElement sceneElement, float f3) {
            this.f66212n = sceneElement;
            this.f66213t = f3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            float nestedSceneSpeedFactor = this.f66212n.getNestedSceneSpeedFactor() / this.f66213t;
            return SceneElement.copy$default(el, null, 0, MathKt.roundToInt(this.f66212n.getStartTime() + ((this.f66212n.getEndTime() - this.f66212n.getStartTime()) * nestedSceneSpeedFactor)), 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable(this.f66213t), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float How(float f3, float f4, float f5) {
        return (f5 * f3) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float hRu(float f3, float f4, float f5) {
        return (f5 * f3) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f3, float f4) {
        return f4 * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(tC tCVar, View view) {
        xg(tCVar, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qm(tC tCVar, int i2) {
        final float f3 = i2 / 1000.0f;
        final SceneElement sceneElement = tCVar.initialElementState;
        if (sceneElement == null) {
            return Unit.INSTANCE;
        }
        HW.C.D(tCVar, new Function2() { // from class: f0P.ynZ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return tC.mYa(sceneElement, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float tUK(float f3, float f4) {
        return f4 * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ub(tC tCVar, boolean z2) {
        tCVar.revealAnimation = null;
        return Unit.INSTANCE;
    }

    static /* synthetic */ boolean xg(tC tCVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return tCVar.eTf(z2);
    }

    @Override // yc.DAz
    public boolean onBackPressed() {
        return xg(this, false, 1, null);
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f66210n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f66211t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SceneElementType.values().length];
            try {
                iArr2[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SceneElementType.Camera.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SceneElementType.Scene.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SceneElementType.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SceneElementType.Drawing.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SceneElementType.Audio.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HBN(tC tCVar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        tCVar.pJg().fD.setClipBounds(new Rect(0, 0, iIntValue, (tCVar.pJg().fD.getHeight() * iIntValue) / Math.max(1, tCVar.pJg().fD.getWidth())));
        if (iIntValue <= 2) {
            tCVar.pJg().fD.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Qu(final tC tCVar, boolean z2) {
        ValueAnimator valueAnimator = tCVar.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        tCVar.revealAnimation = null;
        if (z2) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tCVar.pJg().fD.getWidth(), 0);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.Zd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    tC.HBN(this.f65333n, valueAnimator2);
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfInt);
            w6O.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.IQ
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tC.UF(this.f64354n, ((Boolean) obj).booleanValue());
                }
            });
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.start();
            tCVar.revealAnimation = valueAnimatorOfInt;
        } else {
            tCVar.pJg().fD.setVisibility(4);
            tCVar.pJg().WPU.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rl(tC tCVar) {
        Ml.j jVar = tCVar.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        tCVar.undoBatch = null;
        tCVar.initialElementState = null;
        return Unit.INSTANCE;
    }

    private final void Uf(j panel) {
        if (this.currentPanel == panel) {
            return;
        }
        eTf(false);
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
        int i2 = n.$EnumSwitchMapping$0[panel.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.currentPanel = j.f66211t;
            if (isAdded()) {
                getParentFragmentManager().o().o(pJg().E2.getId(), new mnr()).KN(null).mUb();
                return;
            }
            return;
        }
        this.currentPanel = j.f66210n;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, pJg().fD.getWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.SZ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                tC.f(this.f64698n, valueAnimator2);
            }
        });
        valueAnimatorOfInt.setDuration(200L);
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        w6O.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.kuQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tC.ub(this.f65746n, ((Boolean) obj).booleanValue());
            }
        });
        valueAnimatorOfInt.start();
        this.revealAnimation = valueAnimatorOfInt;
        this.panelCloser = new Function1() { // from class: f0P.Zb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tC.Qu(this.f65332n, ((Boolean) obj).booleanValue());
            }
        };
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null) {
            sceneHolderE.setEditMode(2131362628);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VwL(tC tCVar, View view) {
        tCVar.Uf(j.f66211t);
    }

    private final boolean eTf(boolean animated) {
        LiveShapeRef liveShape;
        j jVar = this.currentPanel;
        if (jVar == null) {
            return false;
        }
        boolean z2 = jVar != j.f66211t;
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        String id = null;
        this.revealAnimation = null;
        Function1 function1 = this.panelCloser;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(animated));
        }
        this.panelCloser = null;
        this.currentPanel = null;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null) {
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg != null && (liveShape = sceneElementNHg.getLiveShape()) != null) {
                id = liveShape.getId();
            }
            sceneHolderE.setEditMode(id != null ? 2131362617 : 0);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(tC tCVar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        tCVar.pJg().fD.setClipBounds(new Rect(0, 0, iIntValue, (tCVar.pJg().fD.getHeight() * iIntValue) / Math.max(1, tCVar.pJg().fD.getWidth())));
        if (tCVar.pJg().fD.getVisibility() != 4 || iIntValue <= 0) {
            return;
        }
        tCVar.pJg().fD.setVisibility(0);
        tCVar.pJg().WPU.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement mYa(SceneElement sceneElement, float f3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        float nestedSceneSpeedFactor = sceneElement.getNestedSceneSpeedFactor() / f3;
        return SceneElement.copy$default(el, null, 0, MathKt.roundToInt(sceneElement.getStartTime() + ((sceneElement.getEndTime() - sceneElement.getStartTime()) * nestedSceneSpeedFactor)), 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable(f3), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null);
    }

    private final SJ0.nSC pJg() {
        SJ0.nSC nsc = this._binding;
        Intrinsics.checkNotNull(nsc);
        return nsc;
    }

    public final nYs.Ml C() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public final WK.I28 Mx() {
        WK.I28 i28 = this.newFeatureManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newFeatureManager");
        return null;
    }

    @Override // yc.Buf
    public boolean n(yc.a motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.n().getActionMasked() == 0) {
            yc.Ji ji = this.shapeEditHelper;
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            ji.HI(jVar.getLiveShapeLockAspect());
            this.shapeEditHelper.ty(jVar.getLiveShapeSizeFromCenter());
        }
        return this.shapeEditHelper.Uo(motionEvent);
    }

    public final QmE.iF ofS() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // f0P.fGM, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ofS().n(new j.fuX("edit_element", null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.nSC.t(inflater, container, false);
        ConstraintLayout root = pJg().s7N;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null) {
            sceneHolderE.setEditMode(sceneElementNHg.getLiveShape().getId() != null ? 2131362617 : 0);
        }
        nYs.j jVarInvoke = C().invoke();
        if (jVarInvoke != null && jVarInvoke.te()) {
            pJg().f9566o.setVisibility(0);
            pJg().f9563e.setAnimation(2131951648);
        }
        X4T();
        pJg().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.waf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.T3L(this.f66297n, view2);
            }
        });
        pJg().J2.setOnClickListener(new View.OnClickListener() { // from class: f0P.ea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.Bu(this.f65524n, view2);
            }
        });
        pJg().HI.setOnClickListener(new View.OnClickListener() { // from class: f0P.ls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.p0N(this.f65765n, view2);
            }
        });
        pJg().xMQ.setOnClickListener(new View.OnClickListener() { // from class: f0P.ge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.fcU(this.f65586n, view2);
            }
        });
        pJg().KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.En
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.eWT(this.f64182n, view2);
            }
        });
        FrameLayout panelSpeedControl = pJg().fD;
        Intrinsics.checkNotNullExpressionValue(panelSpeedControl, "panelSpeedControl");
        HI0.o7q.gh(panelSpeedControl);
        if (Mx().rl(WK.Ml.f11453S) && sceneElementNHg.getType() != SceneElementType.Scene && sceneElementNHg.getType() != SceneElementType.Audio) {
            pJg().aYN.setVisibility(0);
        }
        SceneElement sceneElementNHg2 = HW.C.nHg(this);
        if ((sceneElementNHg2 != null ? sceneElementNHg2.getType() : null) == SceneElementType.Scene) {
            pJg().f9559S.setVisibility(0);
        } else {
            pJg().f9559S.setVisibility(4);
        }
        pJg().XQ.setOnClickListener(new View.OnClickListener() { // from class: f0P.cDb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.ul(this.f65409n, view2);
            }
        });
        pJg().WPU.setOnClickListener(new View.OnClickListener() { // from class: f0P.wVR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.n1(this.f66296n, view2);
            }
        });
        pJg().f9569v.setOnStartTrackingTouch(new Function0() { // from class: f0P.DaM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tC.Jk(this.f64146n);
            }
        });
        pJg().f9569v.setOnStopTrackingTouch(new Function0() { // from class: f0P.vF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tC.Rl(this.f66257n);
            }
        });
        pJg().f9569v.setOnValueChangeFromUser(new Function1() { // from class: f0P.aTw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tC.qm(this.f65350n, ((Integer) obj).intValue());
            }
        });
        pJg().f9561X.setOnClickListener(new View.OnClickListener() { // from class: f0P.AY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.Org(this.f64069n, view2);
            }
        });
        pJg().f9557N.setOnClickListener(new View.OnClickListener() { // from class: f0P.EjB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.HV(this.f64181n, view2);
            }
        });
        pJg().nHg.setOnClickListener(new View.OnClickListener() { // from class: f0P.MA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.GD(this.f64475n, view2);
            }
        });
        pJg().f9560T.setOnClickListener(new View.OnClickListener() { // from class: f0P.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.Po6(this.f65478n, view2);
            }
        });
        pJg().nY.setOnClickListener(new View.OnClickListener() { // from class: f0P.Gk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.EWS(this.f64246n, view2);
            }
        });
        pJg().f9564g.setOnClickListener(new View.OnClickListener() { // from class: f0P.v0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.UhV(this.f66254n, view2);
            }
        });
        pJg().ViF.setOnClickListener(new View.OnClickListener() { // from class: f0P.CAG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.K(this.f64107n, view2);
            }
        });
        pJg().ck.setOnClickListener(new View.OnClickListener() { // from class: f0P.fic
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.ER(this.f65563n, view2);
            }
        });
        pJg().Ik.setOnClickListener(new View.OnClickListener() { // from class: f0P.cj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.lLA(this.f65467n, view2);
            }
        });
        pJg().f9558O.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ee7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.kSg(this.f64177n, view2);
            }
        });
        pJg().qie.setOnClickListener(new View.OnClickListener() { // from class: f0P.V44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.W(this.f64913n, view2);
            }
        });
        pJg().gh.setOnClickListener(new View.OnClickListener() { // from class: f0P.Fsa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.RQ(this.f64223n, view2);
            }
        });
        pJg().az.setOnClickListener(new View.OnClickListener() { // from class: f0P.DzF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.a63(this.f64158n, view2);
            }
        });
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getShowNewTagForPresetEditButton()) {
            pJg().f9562Z.setVisibility(0);
        }
        pJg().f9567r.setOnClickListener(new View.OnClickListener() { // from class: f0P.jx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.F(this.f65701n, view2);
            }
        });
        pJg().mUb.setOnClickListener(new View.OnClickListener() { // from class: f0P.SzA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.QZ6(this.f64736n, view2);
            }
        });
        pJg().ty.setOnClickListener(new View.OnClickListener() { // from class: f0P.c1j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.tFV(this.f65403n, view2);
            }
        });
        pJg().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.n2z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.VwL(this.f65806n, view2);
            }
        });
        pJg().rV9.setOnClickListener(new View.OnClickListener() { // from class: f0P.FqE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tC.mI(this.f64222n, view2);
            }
        });
        gh();
    }

    @Override // yc.QhI
    public int t() {
        LiveShapeRef liveShape;
        j jVar = this.currentPanel;
        int i2 = jVar == null ? -1 : n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == -1) {
            SceneElement sceneElementNHg = HW.C.nHg(this);
            return ((sceneElementNHg == null || (liveShape = sceneElementNHg.getLiveShape()) == null) ? null : liveShape.getId()) != null ? 2131362617 : 0;
        }
        if (i2 == 1) {
            return 2131362628;
        }
        if (i2 == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(tC tCVar, View view) {
        tCVar.ofS().n(new j.C(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361883);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ER(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int iWPU = HW.C.WPU(tCVar);
            int startTime = sceneElementNHg.getStartTime();
            if (iWPU < startTime) {
                int iZ = startTime - HW.C.Z(tCVar);
                int startTime2 = sceneElementNHg.getStartTime() - iZ;
                int endTime = sceneElementNHg.getEndTime() - iZ;
                SceneHolder sceneHolderE = HW.C.e(tCVar);
                if (sceneHolderE != null) {
                    sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, startTime2, endTime, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                    return;
                }
                return;
            }
            tCVar.pJg().f9564g.callOnClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EWS(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(tCVar);
            float f3 = endTime2;
            final float startTime = (sceneElementNHg.getStartTime() - HW.C.Z(tCVar)) / f3;
            int iRecomputeInTime = TrimmingKt.recomputeInTime(sceneElementNHg, HW.C.Z(tCVar));
            if (endTime2 >= 1) {
                final float f4 = endTime / f3;
                SceneHolder sceneHolderE = HW.C.e(tCVar);
                if (sceneHolderE != null) {
                    sceneHolderE.update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElementNHg, new Function1() { // from class: f0P.EH
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(tC.hRu(f4, startTime, ((Float) obj).floatValue()));
                        }
                    }), null, HW.C.Z(tCVar), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, iRecomputeInTime, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -131075, 127, null));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(tC tCVar, View view) {
        rWZ.C cRl;
        QmE.iF iFVarOfS = tCVar.ofS();
        String strViF = HW.C.ViF(tCVar);
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            cRl = rWZ.j.rl(sceneElementNHg);
        } else {
            cRl = null;
        }
        iFVarOfS.n(new j.tpM(strViF, cRl));
        if (tCVar.pJg().f9562Z.getVisibility() == 0) {
            tCVar.pJg().f9562Z.setVisibility(4);
            com.alightcreative.app.motion.persist.j.INSTANCE.setShowNewTagForPresetEditButton(false);
        }
        HW.C.mUb(tCVar, 2131361948);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GD(tC tCVar, View view) {
        SceneHolder sceneHolderE;
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(tCVar);
            if (endTime2 >= 1 && (sceneHolderE = HW.C.e(tCVar)) != null) {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, HW.C.Z(tCVar), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable((sceneElementNHg.getNestedSceneSpeedFactor() * endTime) / endTime2), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32771, 127, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HV(tC tCVar, View view) {
        SceneHolder sceneHolderE;
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int iR = HW.C.r(tCVar) - sceneElementNHg.getStartTime();
            if (iR >= 1 && (sceneHolderE = HW.C.e(tCVar)) != null) {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, HW.C.r(tCVar), 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable((sceneElementNHg.getNestedSceneSpeedFactor() * endTime) / iR), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Jk(tC tCVar) {
        tCVar.initialElementState = HW.C.nHg(tCVar);
        tCVar.undoBatch = HW.C.xMQ(tCVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(tCVar);
            float f3 = endTime2;
            final float startTime = (sceneElementNHg.getStartTime() - HW.C.Z(tCVar)) / f3;
            if (endTime2 >= 1) {
                float f4 = endTime;
                final float f5 = f4 / f3;
                SceneElement sceneElementCopy$default = SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElementNHg, new Function1() { // from class: f0P.bfp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(tC.How(f5, startTime, ((Float) obj).floatValue()));
                    }
                }), null, HW.C.Z(tCVar), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, TrimmingKt.recomputeInTime(sceneElementNHg, HW.C.Z(tCVar)), 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -131075, 127, null);
                int iR = HW.C.r(tCVar) - sceneElementNHg.getStartTime();
                if (iR >= 1) {
                    final float f6 = f4 / iR;
                    SceneElement sceneElementCopy$default2 = SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElementNHg, new Function1() { // from class: f0P.tMG
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(tC.tUK(f6, ((Float) obj).floatValue()));
                        }
                    }), null, 0, HW.C.r(tCVar), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, TrimmingKt.recomputeOutTime(sceneElementNHg, HW.C.r(tCVar)), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -262149, 127, null);
                    Ml.j jVarXMQ = HW.C.xMQ(tCVar);
                    SceneHolder sceneHolderE = HW.C.e(tCVar);
                    if (sceneHolderE != null) {
                        sceneHolderE.update(sceneElementCopy$default2);
                    }
                    SceneHolder sceneHolderE2 = HW.C.e(tCVar);
                    if (sceneHolderE2 != null) {
                        SceneHolder.DefaultImpls.add$default(sceneHolderE2, SceneElementKt.recreateEngineState(sceneElementCopy$default), 0, 2, null);
                    }
                    jVarXMQ.n();
                    while (tCVar.isAdded() && tCVar.getParentFragmentManager().uG()) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Org(tC tCVar, View view) {
        SceneHolder sceneHolderE;
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int iR = HW.C.r(tCVar) - sceneElementNHg.getStartTime();
            if (iR >= 1 && (sceneHolderE = HW.C.e(tCVar)) != null) {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, HW.C.r(tCVar), 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable((sceneElementNHg.getNestedSceneSpeedFactor() * endTime) / iR), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Po6(tC tCVar, View view) {
        SceneHolder sceneHolderE;
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(tCVar);
            if (endTime2 >= 1 && (sceneHolderE = HW.C.e(tCVar)) != null) {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, HW.C.Z(tCVar), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableKt.keyable((sceneElementNHg.getNestedSceneSpeedFactor() * endTime) / endTime2), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32771, 127, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QZ6(tC tCVar, View view) {
        tCVar.ofS().n(new j.rv6(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361904);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(tC tCVar, View view) {
        tCVar.ofS().n(new j.C1440h(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361906);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3L(tC tCVar, View view) {
        tCVar.ofS().n(new j.Q(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361889);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UF(tC tCVar, boolean z2) {
        tCVar.pJg().fD.setVisibility(4);
        tCVar.pJg().WPU.setVisibility(4);
        tCVar.revealAnimation = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UhV(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int iR = HW.C.r(tCVar) - sceneElementNHg.getStartTime();
            if (iR >= 1) {
                int iRecomputeOutTime = TrimmingKt.recomputeOutTime(sceneElementNHg, HW.C.r(tCVar));
                final float f3 = endTime / iR;
                SceneHolder sceneHolderE = HW.C.e(tCVar);
                if (sceneHolderE != null) {
                    sceneHolderE.update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElementNHg, new Function1() { // from class: f0P.Yvs
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(tC.i(f3, ((Float) obj).floatValue()));
                        }
                    }), null, 0, HW.C.r(tCVar), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, iRecomputeOutTime, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -262149, 127, null));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(tC tCVar, View view) {
        tCVar.ofS().n(new j.Lu(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361910);
    }

    private final void X4T() {
        SceneElement sceneElementNHg;
        int i2;
        int i3;
        int i5;
        boolean z2;
        int i7;
        int i8;
        Resources.Theme theme;
        Resources.Theme theme2;
        Resources.Theme theme3;
        Resources.Theme theme4;
        Resources.Theme theme5;
        if (getView() != null && (sceneElementNHg = HW.C.nHg(this)) != null) {
            pJg().az.setVisibility(4);
            pJg().qie.setVisibility(4);
            pJg().xMQ.setVisibility(4);
            pJg().mUb.setVisibility(4);
            pJg().gh.setVisibility(4);
            pJg().KN.setVisibility(4);
            int i9 = n.$EnumSwitchMapping$1[sceneElementNHg.getType().ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 == 5) {
                                pJg().mUb.setVisibility(0);
                            }
                        } else {
                            pJg().az.setVisibility(0);
                        }
                    } else {
                        pJg().xMQ.setVisibility(0);
                        if (sceneElementNHg.getLinkedSceneUUID() != null) {
                            pJg().xMQ.setText(getString(2132018942));
                        } else {
                            pJg().xMQ.setText(getString(2132017745));
                        }
                    }
                } else {
                    pJg().KN.setVisibility(0);
                }
            } else if (sceneElementNHg.getLiveShape().getId() == null) {
                pJg().qie.setVisibility(0);
            } else {
                pJg().gh.setVisibility(0);
            }
            AppCompatButton buttonColorAndFill = pJg().Uo;
            Intrinsics.checkNotNullExpressionValue(buttonColorAndFill, "buttonColorAndFill");
            if (SceneElementKt.getHasFill(sceneElementNHg.getType())) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            buttonColorAndFill.setVisibility(i2);
            AppCompatButton buttonBorderAndShadow = pJg().J2;
            Intrinsics.checkNotNullExpressionValue(buttonBorderAndShadow, "buttonBorderAndShadow");
            if (sceneElementNHg.getType().getHasBorderAndShadow()) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            buttonBorderAndShadow.setVisibility(i3);
            LinearLayout buttonMoveAndTransform = pJg().HI;
            Intrinsics.checkNotNullExpressionValue(buttonMoveAndTransform, "buttonMoveAndTransform");
            if (sceneElementNHg.getType().getHasTransform()) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            buttonMoveAndTransform.setVisibility(i5);
            AppCompatButton buttonBlendingAndOpacity = pJg().f9558O;
            Intrinsics.checkNotNullExpressionValue(buttonBlendingAndOpacity, "buttonBlendingAndOpacity");
            if (!sceneElementNHg.getType().getHasBlendingMode() && !sceneElementNHg.getType().getHasOpacity()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            buttonBlendingAndOpacity.setVisibility(i7);
            LinearLayout buttonEffects = pJg().ty;
            Intrinsics.checkNotNullExpressionValue(buttonEffects, "buttonEffects");
            if (sceneElementNHg.getType().getHasVisualEffects()) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            buttonEffects.setVisibility(i8);
            Resources.Theme theme6 = null;
            if (!SceneElementKt.hasAnyAudio(sceneElementNHg)) {
                ImageView imageView = pJg().nr;
                Resources resources = getResources();
                Context context = getContext();
                if (context != null) {
                    theme3 = context.getTheme();
                } else {
                    theme3 = null;
                }
                imageView.setImageDrawable(resources.getDrawable(2131231844, theme3));
                if (sceneElementNHg.getGain().getKeyframes().size() <= 1) {
                    pJg().rl.setEnabled(false);
                    ImageView imageView2 = pJg().nr;
                    Resources resources2 = getResources();
                    Context context2 = getContext();
                    if (context2 != null) {
                        theme4 = context2.getTheme();
                    } else {
                        theme4 = null;
                    }
                    imageView2.setColorFilter(resources2.getColor(2131099741, theme4));
                    ImageView imageView3 = pJg().f9568t;
                    Resources resources3 = getResources();
                    Context context3 = getContext();
                    if (context3 != null) {
                        theme5 = context3.getTheme();
                    } else {
                        theme5 = null;
                    }
                    imageView3.setColorFilter(resources3.getColor(2131099741, theme5));
                }
            }
            if (sceneElementNHg.getType() == SceneElementType.NullObject && pJg().qie.getVisibility() == 4) {
                ViewGroup.LayoutParams layoutParams = pJg().HI.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (layoutParams2.XQ == pJg().qie.getId()) {
                    layoutParams2.XQ = pJg().f9566o.getId();
                    layoutParams2.setMarginEnd(getResources().getDimensionPixelOffset(2131165970));
                }
                ViewGroup.LayoutParams layoutParams3 = pJg().f9566o.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                if (layoutParams4.f35944o == pJg().qie.getId()) {
                    layoutParams4.f35944o = pJg().HI.getId();
                    layoutParams4.setMarginStart(getResources().getDimensionPixelOffset(2131165970));
                }
            }
            if (pJg().J2.getVisibility() == 4 && pJg().Uo.getVisibility() == 4 && pJg().f9558O.getVisibility() == 4) {
                ViewGroup.LayoutParams layoutParams5 = pJg().KN.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                if (layoutParams6.xMQ != pJg().J2.getId()) {
                    layoutParams6.xMQ = pJg().J2.getId();
                }
                ViewGroup.LayoutParams layoutParams7 = pJg().HI.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                if (layoutParams8.xMQ != pJg().J2.getId()) {
                    layoutParams8.xMQ = pJg().J2.getId();
                    ((ViewGroup.MarginLayoutParams) layoutParams8).height = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = 0;
                }
                ViewGroup.LayoutParams layoutParams9 = pJg().f9566o.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                if (layoutParams10.xMQ != pJg().J2.getId()) {
                    layoutParams10.xMQ = pJg().J2.getId();
                    ((ViewGroup.MarginLayoutParams) layoutParams10).height = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = 0;
                }
                ViewGroup.LayoutParams layoutParams11 = pJg().ty.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
                if (layoutParams12.xMQ != pJg().J2.getId()) {
                    layoutParams12.xMQ = pJg().J2.getId();
                    ((ViewGroup.MarginLayoutParams) layoutParams12).height = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = 0;
                }
            }
            if (!SceneElementKt.hasAnyAudio(sceneElementNHg)) {
                ImageView imageView4 = pJg().nr;
                Resources resources4 = getResources();
                Context context4 = getContext();
                if (context4 != null) {
                    theme = context4.getTheme();
                } else {
                    theme = null;
                }
                imageView4.setImageDrawable(resources4.getDrawable(2131231844, theme));
                if (sceneElementNHg.getGain().getKeyframes().size() <= 1) {
                    pJg().rl.setEnabled(false);
                    ImageView imageView5 = pJg().nr;
                    Resources resources5 = getResources();
                    Context context5 = getContext();
                    if (context5 != null) {
                        theme2 = context5.getTheme();
                    } else {
                        theme2 = null;
                    }
                    imageView5.setColorFilter(resources5.getColor(2131099741, theme2));
                    ImageView imageView6 = pJg().f9568t;
                    Resources resources6 = getResources();
                    Context context6 = getContext();
                    if (context6 != null) {
                        theme6 = context6.getTheme();
                    }
                    imageView6.setColorFilter(resources6.getColor(2131099741, theme6));
                }
            } else {
                pJg().rl.setEnabled(true);
                ImageView imageView7 = pJg().nr;
                Resources resources7 = getResources();
                Context context7 = getContext();
                if (context7 != null) {
                    theme6 = context7.getTheme();
                }
                imageView7.setImageDrawable(resources7.getDrawable(2131231003, theme6));
            }
            if (sceneElementNHg.getType() == SceneElementType.Audio) {
                ConstraintLayout buttonPresetsContainer = pJg().f9566o;
                Intrinsics.checkNotNullExpressionValue(buttonPresetsContainer, "buttonPresetsContainer");
                if (buttonPresetsContainer.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams13 = pJg().f9566o.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams13, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
                    if (layoutParams14.xMQ != pJg().J2.getId()) {
                        layoutParams14.xMQ = pJg().J2.getId();
                        ((ViewGroup.MarginLayoutParams) layoutParams14).height = 0;
                        ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = 0;
                    }
                    if (layoutParams14.f35932S != pJg().rl.getId()) {
                        layoutParams14.f35932S = pJg().rl.getId();
                        layoutParams14.XQ = -1;
                        layoutParams14.setMarginEnd(0);
                    }
                    if (layoutParams14.f35937Z != pJg().WPU.getId()) {
                        layoutParams14.f35937Z = pJg().WPU.getId();
                        layoutParams14.setMarginStart(0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a63(tC tCVar, View view) {
        tCVar.ofS().n(new j.K(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361912);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eWT(tC tCVar, View view) {
        HW.C.mUb(tCVar, 2131361884);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg == null) {
            return;
        }
        if (sceneElementNHg.getLinkedSceneUUID() != null) {
            tCVar.ofS().n(new j.o7q(HW.C.ViF(tCVar)));
            HW.C.mUb(tCVar, 2131361905);
        } else {
            tCVar.ofS().n(new j.vd(HW.C.ViF(tCVar)));
            HW.C.mUb(tCVar, 2131361908);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kSg(tC tCVar, View view) {
        tCVar.ofS().n(new j.aC(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361882);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lLA(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg != null) {
            int iWPU = HW.C.WPU(tCVar);
            SceneElement sceneElementNHg2 = HW.C.nHg(tCVar);
            if (sceneElementNHg2 != null) {
                if (iWPU < sceneElementNHg2.getStartTime()) {
                    tCVar.pJg().nY.callOnClick();
                    return;
                }
                int iR = HW.C.r(tCVar) - sceneElementNHg.getEndTime();
                int startTime = sceneElementNHg.getStartTime() + iR;
                int endTime = sceneElementNHg.getEndTime() + iR;
                SceneHolder sceneHolderE = HW.C.e(tCVar);
                if (sceneHolderE != null) {
                    sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, startTime, endTime, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mI(tC tCVar, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg == null) {
            return;
        }
        List listListOf = CollectionsKt.listOf(new C2348n(sceneElementNHg.getNestedSceneSpeedFactor(), 1.0f, 0.0f, 4.0f, "", true));
        Float fValueOf = Float.valueOf(sceneElementNHg.getNestedSceneSpeedFactor());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new Ml(objectRef, uGc, fValueOf, null, sceneElementNHg, tCVar));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = tCVar.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = tCVar.getResources();
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
        tCVar.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(tC tCVar, View view) {
        tCVar.ofS().n(new j.Qik(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361937);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(tC tCVar, View view) {
        tCVar.ofS().n(new j.iF(HW.C.ViF(tCVar)));
        HW.C.mUb(tCVar, 2131361913);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ul(tC tCVar, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(tCVar);
        if (sceneElementNHg == null) {
            return;
        }
        tCVar.ofS().n(new j.afV(HW.C.ViF(tCVar), rWZ.j.rl(sceneElementNHg)));
        if (tCVar.pJg().aYN.getVisibility() == 0) {
            tCVar.pJg().aYN.setVisibility(4);
            tCVar.Mx().n(WK.Ml.f11453S);
        }
        if (sceneElementNHg.getType() == SceneElementType.Scene) {
            tCVar.Uf(j.f66210n);
        } else {
            HW.C.mUb(tCVar, 2131361985);
        }
    }

    @Override // yc.InterfaceC2452g
    public void gh() {
        boolean z2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        int iWPU = HW.C.WPU(this);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            int startTime = sceneElementNHg.getStartTime();
            SceneElement sceneElementNHg2 = HW.C.nHg(this);
            if (sceneElementNHg2 != null) {
                int endTime = sceneElementNHg2.getEndTime();
                if (isAdded() && getView() != null) {
                    ImageButton imageButton = pJg().f9561X;
                    boolean z5 = true;
                    if (iWPU > endTime) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    imageButton.setEnabled(z2);
                    ImageButton imageButton2 = pJg().f9557N;
                    int i5 = startTime + 1;
                    if (i5 <= iWPU && iWPU < endTime) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    imageButton2.setEnabled(z3);
                    ImageButton imageButton3 = pJg().nHg;
                    if (i5 <= iWPU && iWPU < endTime) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    imageButton3.setEnabled(z4);
                    ImageButton imageButton4 = pJg().f9560T;
                    if (iWPU >= startTime) {
                        z5 = false;
                    }
                    imageButton4.setEnabled(z5);
                    ImageButton imageButton5 = pJg().f9561X;
                    float f6 = 0.35f;
                    if (pJg().f9561X.isEnabled()) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.35f;
                    }
                    imageButton5.setAlpha(f3);
                    ImageButton imageButton6 = pJg().f9557N;
                    if (pJg().f9557N.isEnabled()) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.35f;
                    }
                    imageButton6.setAlpha(f4);
                    ImageButton imageButton7 = pJg().nHg;
                    if (pJg().nHg.isEnabled()) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.35f;
                    }
                    imageButton7.setAlpha(f5);
                    ImageButton imageButton8 = pJg().f9560T;
                    if (pJg().f9560T.isEnabled()) {
                        f6 = 1.0f;
                    }
                    imageButton8.setAlpha(f6);
                    if (iWPU >= startTime && iWPU <= endTime) {
                        pJg().nY.setVisibility(0);
                        pJg().ViF.setVisibility(0);
                        pJg().f9564g.setVisibility(0);
                        pJg().ck.setVisibility(4);
                        pJg().Ik.setVisibility(4);
                        return;
                    }
                    pJg().nY.setVisibility(4);
                    pJg().ViF.setVisibility(4);
                    pJg().f9564g.setVisibility(4);
                    pJg().ck.setVisibility(0);
                    pJg().Ik.setVisibility(0);
                    ImageButton imageButton9 = pJg().ck;
                    if (iWPU < startTime) {
                        i2 = 2131231798;
                    } else {
                        i2 = 2131231938;
                    }
                    imageButton9.setImageResource(i2);
                    ImageButton imageButton10 = pJg().Ik;
                    if (iWPU < startTime) {
                        i3 = 2131231797;
                    } else {
                        i3 = 2131231939;
                    }
                    imageButton10.setImageResource(i3);
                }
            }
        }
    }

    @Override // yc.H
    public void nr() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && isAdded() && getView() != null) {
            gh();
            if (sceneElementNHg.getType() == SceneElementType.Scene) {
                TextView textView = pJg().rV9;
                String str = String.format("%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(sceneElementNHg.getNestedSceneSpeedFactor())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
                pJg().f9569v.setValue((int) (sceneElementNHg.getNestedSceneSpeedFactor() * 1000.0f));
            }
            X4T();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        FragmentActivity activity;
        super.onCreate(savedInstanceState);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && SceneElementKt.getMissingMedia(sceneElementNHg) && !this.showedMissingNotice && (activity = getActivity()) != null) {
            new AlertDialog.Builder(activity).setMessage("The original media file used for this layer is missing or has been moved from its original location.").setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: f0P.L
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    tC.G7(dialogInterface, i2);
                }
            }).create().show();
            this.showedMissingNotice = true;
            ofS().n(j.nSC.f8536n);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
    }
}
