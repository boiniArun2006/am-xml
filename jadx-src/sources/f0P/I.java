package f0P;

import LdY.Ml;
import QmE.j;
import YgZ.uQga.IYJfqUyym;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.CameraType;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.widget.ValueSpinner;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import ep.oxM.esLNYym;
import f0P.I;
import f0P.Ny;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002P\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J-\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0018H\u0014¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00188\u0014X\u0094D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001aR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010H\u001a\u00020\u00128\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0I8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010L¨\u0006Q"}, d2 = {"Lf0P/I;", "Lyc/QhI;", "Lf0P/NO;", "<init>", "()V", "", "LPV", "waP", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "param", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "Fp", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)LoA/j;", "rxp", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/Keyable;", "", "H", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Z", "", "j", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Ljava/lang/String;", "", "t", "()I", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "tabId", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "LSJ0/Pmq;", "p5", "Lkotlin/Lazy;", "QgZ", "()LSJ0/Pmq;", "contentBinding", "eF", "I", "M7", "layoutResource", "LLdY/Ml$j;", "E", "LLdY/Ml$j;", "undoBatch", "M", "Ljava/lang/String;", "paramName", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "FX", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "guideDuration", "B", "Z", "gestureInProgress", "Lf0P/I$n;", "J", "Lf0P/I$n;", "interaction", "D", "v", "()Z", "setAutoTabSpacing", "(Z)V", "autoTabSpacing", "", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "Lf0P/Ny$j;", "tabs", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCameraOptionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraOptionsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/CameraOptionsFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,816:1\n148#2:817\n143#2:818\n124#2:819\n148#2:820\n143#2:821\n124#2:822\n148#2:823\n143#2:824\n124#2:825\n148#2:826\n143#2:827\n124#2:828\n148#2:829\n143#2:830\n124#2:831\n148#2:832\n143#2:833\n124#2:834\n148#2:835\n143#2:836\n124#2:837\n143#2:847\n124#2:848\n143#2:849\n124#2:850\n143#2:851\n124#2:852\n143#2:853\n124#2:854\n143#2:855\n124#2:856\n143#2:857\n124#2:858\n1863#3,2:838\n1863#3,2:841\n1863#3,2:843\n1863#3,2:845\n1#4:840\n61#5,30:859\n92#5,7:894\n61#5,30:901\n92#5,7:936\n30#6:889\n30#6:931\n53#7,3:890\n53#7,3:932\n33#8:893\n33#8:935\n*S KotlinDebug\n*F\n+ 1 CameraOptionsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/CameraOptionsFragment\n*L\n88#1:817\n88#1:818\n88#1:819\n95#1:820\n95#1:821\n95#1:822\n96#1:823\n96#1:824\n96#1:825\n97#1:826\n97#1:827\n97#1:828\n103#1:829\n103#1:830\n103#1:831\n104#1:832\n104#1:833\n104#1:834\n105#1:835\n105#1:836\n105#1:837\n484#1:847\n484#1:848\n485#1:849\n485#1:850\n486#1:851\n486#1:852\n492#1:853\n492#1:854\n493#1:855\n493#1:856\n494#1:857\n494#1:858\n146#1:838,2\n371#1:841,2\n372#1:843,2\n373#1:845,2\n218#1:859,30\n218#1:894,7\n286#1:901,30\n286#1:936,7\n218#1:889\n286#1:931\n218#1:890,3\n286#1:932,3\n218#1:893\n286#1:935\n*E\n"})
public final class I extends NO implements yc.QhI {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private String paramName;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.rrk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.NP(this.f66143n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final int layoutResource = 2131558591;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch = LdY.Ml.Ik.n();

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private EditActivity.Wre guideDuration = EditActivity.Wre.f44461t;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private n interaction = n.f64331n;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean autoTabSpacing = true;

    public static final class DAz implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f64278O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f64279n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ I f64280r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f64281t;

        public DAz(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, I i2) {
            this.f64279n = objectRef;
            this.f64281t = uGc;
            this.f64278O = obj;
            this.J2 = userParameter;
            this.f64280r = i2;
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
            Ref.ObjectRef objectRef = this.f64279n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f64281t);
            }
            Object obj = this.f64278O;
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
            I i2 = this.f64280r;
            HW.C.D(i2, i2.new Z(fFloatValue));
        }
    }

    static final class Ew implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f64284t;

        static final class j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Scene f64285n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ float f64286t;

            j(Scene scene, float f3) {
                this.f64285n = scene;
                this.f64286t = f3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(CameraElementKt.calcCameraFov(this.f64285n, this.f64286t));
            }
        }

        Ew(float f3) {
            this.f64284t = f3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            CameraProperties cameraProperties = el.getCameraProperties();
            Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(I.this), new j(scene, this.f64284t));
            Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
        }
    }

    static final class Z implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f64297t;

        static final class j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ float f64298n;

            j(float f3) {
                this.f64298n = f3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(this.f64298n);
            }
        }

        Z(float f3) {
            this.f64297t = f3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            CameraProperties cameraProperties = el.getCameraProperties();
            Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(I.this), new j(this.f64297t));
            Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I f64306O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f64307n;
        private View nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private TextView f64308t;

        /* JADX INFO: renamed from: f0P.I$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public final class C0861j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f64309n;
            final /* synthetic */ j rl;

            /* JADX INFO: renamed from: f0P.I$j$j$I28 */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            static final class I28 implements Function2 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ float f64310O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ oA.j f64311n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ I f64312t;

                /* JADX INFO: renamed from: f0P.I$j$j$I28$j, reason: collision with other inner class name */
                static final class C0862j implements Function1 {
                    final /* synthetic */ float J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ I f64313O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ Scene f64314n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ SceneElement f64315t;

                    C0862j(Scene scene, SceneElement sceneElement, I i2, float f3) {
                        this.f64314n = scene;
                        this.f64315t = sceneElement;
                        this.f64313O = i2;
                        this.J2 = f3;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Keyable invoke(Keyable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return KeyableKt.copyWithValueForTime(it, this.f64314n, this.f64315t, HW.C.aYN(this.f64313O), Float.valueOf(this.J2));
                    }
                }

                I28(oA.j jVar, I i2, float f3) {
                    this.f64311n = jVar;
                    this.f64312t = i2;
                    this.f64310O = f3;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final SceneElement invoke(Scene scene, SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    return (SceneElement) this.f64311n.t(el, new C0862j(scene, el, this.f64312t, this.f64310O));
                }
            }

            /* JADX INFO: renamed from: f0P.I$j$j$Ml */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Ml implements ColorPickerWidget.w6 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ I f64316n;

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void nr() {
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void rl() {
                }

                Ml(I i2) {
                    this.f64316n = i2;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void n() {
                    SceneHolder sceneHolderE = HW.C.e(this.f64316n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362629);
                    }
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void t() {
                    SceneHolder sceneHolderE = HW.C.e(this.f64316n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362630);
                    }
                }
            }

            /* JADX INFO: renamed from: f0P.I$j$j$Wre */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Wre implements Function1 {
                final /* synthetic */ TextView E2;
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f64317O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ I f64318S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ TextView f64319Z;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ C0861j f64320g;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f64321n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f64322o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ UserParameter f64323r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f64324t;

                public Wre(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, UserParameter userParameter2, oA.j jVar, TextView textView, I i2, C0861j c0861j, TextView textView2) {
                    this.f64321n = objectRef;
                    this.f64324t = uGc;
                    this.f64317O = obj;
                    this.J2 = userParameter;
                    this.f64323r = userParameter2;
                    this.f64322o = jVar;
                    this.f64319Z = textView;
                    this.f64318S = i2;
                    this.f64320g = c0861j;
                    this.E2 = textView2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v18, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Float fValueOf;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f64321n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f64324t);
                    }
                    Object obj = this.f64317O;
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
                    float fCoerceIn = RangesKt.coerceIn(fValueOf.floatValue(), ((UserParameter.Spinner) this.f64323r).getMinValue(), ((UserParameter.Spinner) this.f64323r).getMaxValue());
                    C0861j.iF(this.f64318S, this.f64323r, this.f64320g, this.E2, fCoerceIn);
                    oA.j jVar = this.f64322o;
                    if (jVar != null) {
                        I i2 = this.f64318S;
                        HW.C.D(i2, new I28(jVar, i2, fCoerceIn));
                    }
                    if (this.f64319Z.getVisibility() == 0) {
                        this.f64319Z.setText(this.f64318S.j(this.f64323r));
                    }
                }
            }

            /* JADX INFO: renamed from: f0P.I$j$j$n */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class n implements ColorPickerWidget.j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ View f64325n;
                final /* synthetic */ oA.j rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ I f64326t;

                n(View view, oA.j jVar, I i2) {
                    this.f64325n = view;
                    this.rl = jVar;
                    this.f64326t = i2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable O(Scene scene, SceneElement sceneElement, I i2, int i3, Keyable newColor) {
                    Intrinsics.checkNotNullParameter(newColor, "newColor");
                    return KeyableKt.copyWithValueForTime(newColor, scene, sceneElement, HW.C.aYN(i2), HI0.qf.t(i3));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement nr(oA.j jVar, final I i2, final int i3, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    return (SceneElement) jVar.t(el, new Function1() { // from class: f0P.din
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I.j.C0861j.n.O(scene, el, i2, i3, (Keyable) obj);
                        }
                    });
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
                public void n(final int i2) {
                    ((ColorView) this.f64325n).setColor(i2);
                    final oA.j jVar = this.rl;
                    if (jVar != null) {
                        final I i3 = this.f64326t;
                        HW.C.D(i3, new Function2() { // from class: f0P.dd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return I.j.C0861j.n.nr(jVar, i3, i2, (Scene) obj, (SceneElement) obj2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: renamed from: f0P.I$j$j$w6 */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class w6 implements ColorPickerWidget.n {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ I f64327n;
                final /* synthetic */ yU.Ml rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ oA.j f64328t;

                public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
                    Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
                    if (p1 == null) {
                        return;
                    }
                    p0.startActivityForResult(p1, p2);
                }

                w6(I i2, yU.Ml ml, oA.j jVar) {
                    this.f64327n = i2;
                    this.rl = ml;
                    this.f64328t = jVar;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
                public void n(int i2) {
                    I i3 = this.f64327n;
                    Pair[] pairArr = {TuplesKt.to("CURRENT_COLOR", Integer.valueOf(i2)), TuplesKt.to("ALLOW_ALPHA", Boolean.valueOf(this.rl.nr().getAllowAlpha())), TuplesKt.to("COLOR_LENS", String.valueOf(this.f64328t))};
                    FragmentActivity fragmentActivityRequireActivity = i3.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 3);
                    Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(i3, intent, 100);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Z(float f3, UserParameter userParameter, final oA.j jVar, TextView textView, final I i2, C0861j c0861j, TextView textView2, int i3) {
                float f4 = i3 * f3;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                final float fCoerceIn = RangesKt.coerceIn(f4, spinner.getMinValue(), spinner.getMaxValue());
                iF(i2, userParameter, c0861j, textView2, fCoerceIn);
                if (jVar != null) {
                    HW.C.D(i2, new Function2() { // from class: f0P.qfL
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return I.j.C0861j.XQ(jVar, i2, fCoerceIn, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
                if (textView.getVisibility() == 0) {
                    textView.setText(i2.j(userParameter));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: f0P.I$j$j$j, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public /* synthetic */ class C0863j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SliderType.values().length];
                    try {
                        iArr[SliderType.FLOAT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SliderType.RELATIVE_FLOAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SliderType.ANGLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SliderType.ANGLE_RANGE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SliderType.INTEGER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SliderType.RPM.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[SliderType.f46339HZ.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[SliderType.PERCENT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[SliderType.RELATIVE_PERCENT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[SliderType.SECONDS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[SliderType.FRAMES.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[SliderType.KELVIN.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0861j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f64309n = itemBinding;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable S(Scene scene, SceneElement sceneElement, I i2, float f3, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(i2), Float.valueOf(f3));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement XQ(oA.j jVar, final I i2, final float f3, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                return (SceneElement) jVar.t(el, new Function1() { // from class: f0P.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I.j.C0861j.S(scene, el, i2, f3, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void aYN(C0861j c0861j) {
                ((SJ0.kO4) c0861j.f64309n).nr.setColorWidget(null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(I i2, UserParameter userParameter, j jVar, TextView textView, View view, String str, oA.j jVar2, TextView textView2, C0861j c0861j, TextView textView3, View view2) {
                SceneElement sceneElementNHg;
                String string;
                boolean z2;
                CharSequence text;
                Keyable keyable;
                te(i2, userParameter, jVar, textView, view, str);
                if (i2.getContext() == null || (sceneElementNHg = HW.C.nHg(i2)) == null) {
                    return;
                }
                float defaultValue = (jVar2 == null || (keyable = (Keyable) jVar2.get(sceneElementNHg)) == null) ? ((UserParameter.Spinner) userParameter).getDefaultValue() : ((Number) KeyableKt.valueAtTime(keyable, HW.C.aYN(i2))).floatValue();
                Float fValueOf = Float.valueOf(defaultValue);
                TextView textViewTy = jVar.ty();
                if (textViewTy == null || (text = textViewTy.getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                List listListOf = CollectionsKt.listOf(string);
                ArrayList arrayList = new ArrayList();
                if (userParameter instanceof UserParameter.FloatValue) {
                    z2 = false;
                    arrayList.add(new C2348n(defaultValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                } else {
                    boolean z3 = false;
                    if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(defaultValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                        z2 = z3;
                    } else {
                        z2 = z3;
                        if (!(userParameter instanceof UserParameter.Point)) {
                            z2 = z3;
                            if (!(userParameter instanceof UserParameter.Orientation)) {
                                z2 = z3;
                                if (!(userParameter instanceof UserParameter.XYZ)) {
                                    if (userParameter instanceof UserParameter.Spinner) {
                                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                                        float fFloatValue = fValueOf.floatValue() * spinner.getMultiplier();
                                        SliderType sliderType = spinner.getSliderType();
                                        arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), listListOf.isEmpty() ? spinner.getLabel() : (String) listListOf.get(0), true));
                                        z2 = z3;
                                    } else {
                                        z2 = z3;
                                        if (userParameter instanceof UserParameter.Slider) {
                                            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), listListOf.isEmpty() ? slider.getLabel() : (String) listListOf.get(0), true));
                                            z2 = z3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                r.UGc uGc = new r.UGc();
                uGc.v(arrayList);
                boolean z4 = z2;
                uGc.bzg(new Wre(objectRef, uGc, fValueOf, userParameter, userParameter, jVar2, textView2, i2, c0861j, textView3));
                uGc.rV9(new r.Ln(objectRef));
                FragmentActivity activity = i2.getActivity();
                SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                if (surfaceView != null) {
                    Resources resources = i2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    int[] iArr = new int[2];
                    surfaceView.getLocationInWindow(iArr);
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                    float dimensionPixelSize = iArr[1];
                    if (identifier > 0) {
                        dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                    }
                    uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[z4 ? 1 : 0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                }
                i2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void iF(I i2, UserParameter userParameter, C0861j c0861j, TextView textView, float f3) {
                String strValueOf;
                double d2;
                String str;
                StringBuilder sb;
                Scene sceneIF = HW.C.iF(i2);
                int framesPerHundredSeconds = sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : 30;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float multiplier = spinner.getMultiplier() * f3;
                float step = spinner.getStep() * spinner.getMultiplier();
                AppCompatTextView appCompatTextView = ((SJ0.c7r) c0861j.f64309n).f9418O;
                switch (C0863j.$EnumSwitchMapping$0[spinner.getSliderType().ordinal()]) {
                    case 1:
                    case 2:
                        double d4 = step;
                        if (d4 < 9.0E-5d) {
                            strValueOf = String.format("%.5f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 9.0E-4d) {
                            strValueOf = String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.009d) {
                            strValueOf = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.09d) {
                            strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 >= 0.9d) {
                            strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        } else {
                            strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 3:
                    case 4:
                        SliderType sliderType = spinner.getSliderType();
                        SliderType sliderType2 = SliderType.ANGLE_RANGE;
                        String str2 = (sliderType != sliderType2 || multiplier < -360.0f || multiplier > 360.0f) ? "" : "±";
                        if (multiplier > 360.0f) {
                            float f4 = multiplier % 360;
                            d2 = 0.09d;
                            int iFloor = (int) Math.floor(multiplier / r10);
                            textView.setVisibility(0);
                            if (spinner.getSliderType() == sliderType2) {
                                sb = new StringBuilder();
                                sb.append("±");
                            } else {
                                sb = new StringBuilder();
                            }
                            sb.append(iFloor);
                            sb.append("× + ");
                            textView.setText(sb.toString());
                            multiplier = f4;
                        } else {
                            d2 = 0.09d;
                            if (multiplier < -360.0f) {
                                textView.setVisibility(0);
                                textView.setText("-" + ((int) Math.floor(r2 / r3)) + "×");
                                multiplier = -((-multiplier) % 360);
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                        double d5 = step;
                        if (d5 < 9.0E-5d) {
                            str = String.format("%.5fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 9.0E-4d) {
                            str = String.format("%.4fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 0.009d) {
                            str = String.format("%.3fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < d2) {
                            str = String.format("%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 0.9d) {
                            str = String.format("%.1fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else {
                            str = MathKt.roundToInt(multiplier) + "º";
                        }
                        strValueOf = str2 + str;
                        break;
                    case 5:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 6:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 7:
                        strValueOf = String.format("%.2fHz", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 8:
                    case 9:
                        double d6 = step;
                        if (d6 >= 0.009d) {
                            strValueOf = d6 >= 0.09d ? d6 >= 9.9d ? MathKt.roundToInt(multiplier) + "%" : MathKt.roundToInt(multiplier * 10.0f) + "%" : MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else {
                            strValueOf = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 10:
                        strValueOf = String.format("%.2fs", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 11:
                        strValueOf = TimeKt.formatFrameNumber(MathKt.roundToInt((multiplier * framesPerHundredSeconds) / 100.0f), framesPerHundredSeconds, "s:ff");
                        break;
                    case 12:
                        strValueOf = MathKt.roundToInt(multiplier * 1000.0f) + "K";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                appCompatTextView.setText(strValueOf);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String nY(float f3) {
                return "TESTTEST :: OOO :: " + f3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(Ref.ObjectRef objectRef, I i2) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                i2.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            public final void ck(final UserParameter userParameter) {
                Keyable keyable;
                SolidColor defaultValue;
                Keyable keyable2;
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                UserParameter userParameter2 = userParameter;
                Intrinsics.checkNotNullParameter(userParameter2, "userParameter");
                final TextView textView = (TextView) this.itemView.findViewById(2131363477);
                final View viewFindViewById = this.itemView.findViewById(2131363060);
                if (viewFindViewById != null) {
                    Keyable keyableRxp = this.rl.f64306O.rxp(userParameter2);
                    viewFindViewById.setVisibility((keyableRxp == null || !keyableRxp.getKeyed()) ? 4 : 0);
                }
                final String label = userParameter2.getLabel();
                Resources resources = this.rl.f64306O.getResources();
                int iQie = this.rl.qie();
                Context context = this.rl.f64306O.getContext();
                textView.setBackground(resources.getDrawable(iQie, context != null ? context.getTheme() : null));
                textView.setText(label);
                if (StringsKt.isBlank(label) && ((defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter2)) == null || (dataType = defaultKeyableUserParameterValue.getDataType()) == null || !dataType.getIsKeyable())) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
                if (Intrinsics.areEqual(userParameter2.getName(), this.rl.f64306O.paramName)) {
                    textView.setActivated(true);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(true);
                    }
                    this.rl.r(textView);
                    this.rl.Ik(viewFindViewById);
                } else {
                    textView.setActivated(false);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(false);
                    }
                    if (Intrinsics.areEqual(this.rl.ty(), textView)) {
                        this.rl.r(null);
                        this.rl.Ik(null);
                    }
                }
                if (this.rl.f64306O.paramName == null) {
                    j jVar = this.rl;
                    te(jVar.f64306O, userParameter, jVar, textView, viewFindViewById, label);
                    userParameter2 = userParameter;
                    textView = textView;
                    viewFindViewById = viewFindViewById;
                    label = label;
                }
                if (userParameter2 instanceof UserParameter.Color) {
                    ViewBinding viewBinding = this.f64309n;
                    Intrinsics.checkNotNull(viewBinding, gUxOLwRQBPPLC.QXziyjaZ);
                    final String str = label;
                    final j jVar2 = this.rl;
                    final TextView textView2 = textView;
                    final I i2 = jVar2.f64306O;
                    final View view = viewFindViewById;
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: f0P.g62
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            I.j.C0861j.Ik(i2, userParameter, jVar2, textView2, view, str, view2);
                        }
                    });
                    SceneElement sceneElementNHg = HW.C.nHg(this.rl.f64306O);
                    if (sceneElementNHg == null) {
                        return;
                    }
                    oA.j jVarFp = this.rl.f64306O.Fp(userParameter);
                    final oA.j jVar3 = jVarFp != null ? jVarFp : null;
                    if (jVar3 == null || (keyable2 = (Keyable) jVar3.get(sceneElementNHg)) == null || (defaultValue = (SolidColor) KeyableKt.valueAtTime(keyable2, HW.C.aYN(this.rl.f64306O))) == null) {
                        defaultValue = ((UserParameter.Color) userParameter).getDefaultValue();
                    }
                    ((SJ0.kO4) this.f64309n).nr.setColor(ColorKt.toInt(defaultValue));
                    float f3 = 255;
                    ((SJ0.kO4) this.f64309n).rl.setText(((int) (defaultValue.getR() * f3)) + " " + ((int) (defaultValue.getG() * f3)) + " " + ((int) (defaultValue.getB() * f3)));
                    ColorView colorView = ((SJ0.kO4) this.f64309n).nr;
                    final j jVar4 = this.rl;
                    final I i3 = jVar4.f64306O;
                    colorView.setOnClickListener(new View.OnClickListener() { // from class: f0P.rd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            I.j.C0861j.WPU(i3, this, userParameter, jVar4, textView2, view, str, jVar3, view2);
                        }
                    });
                    return;
                }
                if (userParameter2 instanceof UserParameter.Spinner) {
                    ViewBinding viewBinding2 = this.f64309n;
                    Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSpinnerBinding");
                    final j jVar5 = this.rl;
                    final I i5 = jVar5.f64306O;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.Il5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            I.j.C0861j.ViF(i5, userParameter, jVar5, textView, viewFindViewById, label, view2);
                        }
                    });
                    SceneElement sceneElementNHg2 = HW.C.nHg(this.rl.f64306O);
                    if (sceneElementNHg2 == null) {
                        return;
                    }
                    oA.j jVarFp2 = this.rl.f64306O.Fp(userParameter);
                    oA.j jVar6 = jVarFp2 != null ? jVarFp2 : null;
                    final float defaultValue2 = (jVar6 == null || (keyable = (Keyable) jVar6.get(sceneElementNHg2)) == null) ? ((UserParameter.Spinner) userParameter).getDefaultValue() : ((Number) KeyableKt.valueAtTime(keyable, HW.C.aYN(this.rl.f64306O))).floatValue();
                    XoT.C.Uo(this, new Function0() { // from class: f0P.eh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I.j.C0861j.nY(defaultValue2);
                        }
                    });
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final TextView textView3 = (TextView) this.itemView.findViewById(2131363485);
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                    if (spinner.getSliderType() != SliderType.ANGLE && spinner.getSliderType() != SliderType.ANGLE_RANGE) {
                        textView3.setVisibility(8);
                    }
                    final TextView textView4 = (TextView) this.itemView.findViewById(2131362899);
                    if (this.rl.f64306O.H(userParameter)) {
                        textView4.setVisibility(0);
                        textView4.setText(this.rl.f64306O.j(userParameter));
                    } else {
                        textView4.setVisibility(8);
                    }
                    iF(this.rl.f64306O, userParameter, this, textView3, defaultValue2);
                    final float step = spinner.getStep();
                    AppCompatTextView appCompatTextView = ((SJ0.c7r) this.f64309n).f9418O;
                    final j jVar7 = this.rl;
                    final I i7 = jVar7.f64306O;
                    final oA.j jVar8 = jVar6;
                    appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ji
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            I.j.C0861j.g(i7, userParameter, jVar7, textView, viewFindViewById, label, jVar8, textView4, this, textView3, view2);
                        }
                    });
                    ValueSpinner propertyValueSpinner = ((SJ0.c7r) this.f64309n).KN;
                    Intrinsics.checkNotNullExpressionValue(propertyValueSpinner, "propertyValueSpinner");
                    propertyValueSpinner.setValue(MathKt.roundToInt(defaultValue2 / step));
                    propertyValueSpinner.setMinValue(MathKt.roundToInt(spinner.getMinValue() / step));
                    propertyValueSpinner.setMaxValue(MathKt.roundToInt(spinner.getMaxValue() / step));
                    propertyValueSpinner.setLimitRange(true);
                    List<Float> tickMarks = spinner.getTickMarks();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks, 10));
                    Iterator<T> it = tickMarks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(MathKt.roundToInt(((Number) it.next()).floatValue() / step)));
                    }
                    propertyValueSpinner.setBrightMarks(arrayList);
                    final TextView textView5 = textView;
                    final j jVar9 = this.rl;
                    final I i8 = jVar9.f64306O;
                    final String str2 = label;
                    final View view2 = viewFindViewById;
                    propertyValueSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.iy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I.j.C0861j.r(objectRef, i8, userParameter, jVar9, textView5, view2, str2);
                        }
                    });
                    final I i9 = this.rl.f64306O;
                    propertyValueSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I.j.C0861j.o(objectRef, i9);
                        }
                    });
                    final I i10 = this.rl.f64306O;
                    propertyValueSpinner.setOnSpinAbs(new Function1() { // from class: f0P.Z5b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I.j.C0861j.Z(step, userParameter, jVar8, textView4, i10, this, textView3, ((Integer) obj).intValue());
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Ik(I i2, UserParameter userParameter, j jVar, TextView textView, View view, String str, View view2) {
                te(i2, userParameter, jVar, textView, view, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ViF(I i2, UserParameter userParameter, j jVar, TextView textView, View view, String str, View view2) {
                te(i2, userParameter, jVar, textView, view, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void WPU(I i2, final C0861j c0861j, UserParameter userParameter, j jVar, TextView textView, View view, String str, oA.j jVar2, View view2) {
                FragmentActivity activity = i2.getActivity();
                if (activity == null) {
                    return;
                }
                te(i2, userParameter, jVar, textView, view, str);
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorView");
                yU.Ml ml = new yU.Ml(activity, ((ColorView) view2).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                ml.nr().setOnColorChangeListener(new n(view2, jVar2, i2));
                ml.nr().setPalletteClickListener(new w6(i2, ml, jVar2));
                ml.nr().setSpoidEventListener(new Ml(i2));
                ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.Su
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        I.j.C0861j.aYN(this.f64725n);
                    }
                });
                ml.nr().setSceneHolder(HW.C.e(i2));
                ((SJ0.kO4) c0861j.f64309n).nr.setColorWidget(ml.nr());
                ml.KN(view2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit r(Ref.ObjectRef objectRef, I i2, UserParameter userParameter, j jVar, TextView textView, View view, String str) {
                te(i2, userParameter, jVar, textView, view, str);
                objectRef.element = HW.C.xMQ(i2);
                i2.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            private static final void te(I i2, UserParameter userParameter, j jVar, TextView textView, View view, String str) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                EditActivity editActivity;
                if (!Intrinsics.areEqual(i2.paramName, userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    i2.paramName = userParameter.getName();
                    TextView textViewTy = jVar.ty();
                    if (textViewTy != null) {
                        textViewTy.setActivated(false);
                    }
                    View viewAz = jVar.az();
                    if (viewAz != null) {
                        viewAz.setActivated(false);
                    }
                    jVar.r(textView);
                    jVar.Ik(view);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    textView.setActivated(true);
                    i2.W();
                    if (userParameter.getDataType() == DataType.VEC2) {
                        FragmentActivity activity = i2.getActivity();
                        if (activity instanceof EditActivity) {
                            editActivity = (EditActivity) activity;
                        } else {
                            editActivity = null;
                        }
                        if (editActivity != null) {
                            editActivity.vTq(str, i2.guideDuration);
                        }
                        i2.guideDuration = EditActivity.Wre.f44459n;
                    }
                }
            }
        }

        public j(I i2, List parameters, int i3) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f64306O = i2;
            this.f64307n = parameters;
            this.rl = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0861j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.ck((UserParameter) this.f64307n.get(i2));
        }

        public final void Ik(View view) {
            this.nr = view;
        }

        public final View az() {
            return this.nr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public C0861j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i2 == 2131558553) {
                viewBindingT = SJ0.kO4.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            } else {
                if (i2 != 2131558559) {
                    throw new UnsupportedOperationException();
                }
                viewBindingT = SJ0.c7r.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            }
            return new C0861j(this, viewBindingT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f64307n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            UserParameter userParameter = (UserParameter) this.f64307n.get(i2);
            if (userParameter instanceof UserParameter.Spinner) {
                return 2131558559;
            }
            if (userParameter instanceof UserParameter.Color) {
                return 2131558553;
            }
            throw new UnsupportedOperationException();
        }

        public final int qie() {
            return this.rl;
        }

        public final void r(TextView textView) {
            this.f64308t = textView;
        }

        public final TextView ty() {
            return this.f64308t;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f64332r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f64331n = new n("NONE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f64333t = new n("FOV", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f64330O = new n("ZOOM", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f64332r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f64331n, f64333t, f64330O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }

    public static final class nKK implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f64334O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f64335n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ I f64336r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f64337t;

        public nKK(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, I i2) {
            this.f64335n = objectRef;
            this.f64337t = uGc;
            this.f64334O = obj;
            this.J2 = userParameter;
            this.f64336r = i2;
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
            Ref.ObjectRef objectRef = this.f64335n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f64337t);
            }
            Object obj = this.f64334O;
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
            I i2 = this.f64336r;
            HW.C.D(i2, i2.new Ew(fFloatValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EN(int i2, float f3) {
        return i2 / 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float eo(Scene scene, int i2, float f3) {
        return CameraElementKt.calcCameraFov(scene, i2);
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        Scene sceneIF = HW.C.iF(this);
        if (sceneIF == null) {
            return;
        }
        float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(this));
        switch (getCurrentTabId()) {
            case 2131363808:
                if (!this.gestureInProgress) {
                    QgZ().ty.setChecked(el.getCameraProperties().getFocusBlurEnabled());
                    RecyclerView.Adapter adapter = QgZ().az.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                break;
            case 2131363809:
                if (!this.gestureInProgress) {
                    QgZ().Ik.setChecked(el.getCameraProperties().getFogEnabled());
                    RecyclerView.Adapter adapter2 = QgZ().ck.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                    }
                }
                break;
            case 2131363810:
                float fFloatValue = ((Number) KeyableKt.valueAtTime(el.getCameraProperties().getFov(), fFractionalTime)).floatValue();
                float fCalcCameraZoom = CameraElementKt.calcCameraZoom(sceneIF, fFloatValue);
                boolean z2 = el.getCameraProperties().getType() == CameraType.Perspective;
                QgZ().f9267o.setImageDrawable(getResources().getDrawable(z2 ? 2131231571 : 2131231570, null));
                List listListOf = CollectionsKt.listOf((Object[]) new View[]{QgZ().f9265Z, QgZ().nr, QgZ().gh, QgZ().mUb, QgZ().f9269t, QgZ().rl});
                QgZ().Uo.setPerspective(z2);
                Iterator it = listListOf.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(z2 ? 0 : 4);
                }
                if (this.interaction != n.f64333t) {
                    QgZ().f9269t.setValue((int) (10 * fFloatValue));
                }
                if (this.interaction != n.f64330O) {
                    QgZ().mUb.setValue((int) fCalcCameraZoom);
                }
                TextView textView = QgZ().nr;
                String str = String.format("%.1fº", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
                QgZ().gh.setText(String.valueOf((int) fCalcCameraZoom));
                QgZ().f9269t.invalidate();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement I4p(CameraType cameraType, Scene scene, SceneElement newEl) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(newEl, "newEl");
        return SceneElement.copy$default(newEl, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(newEl.getCameraProperties(), cameraType, null, false, null, null, null, false, null, null, null, 1022, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    private final void LPV() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFogColor(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this)));
        String string = getString(2132018077);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        UserParameter.Color color = new UserParameter.Color(TtmlNode.ATTR_TTS_COLOR, string, true, solidColor, true);
        String string2 = getString(2132019713);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SliderType sliderType = SliderType.INTEGER;
        UserParameter.Spinner spinner = new UserParameter.Spinner("near z", string2, true, -9999.0f, 9999.0f, 1.0f, 5.0f, 5.0f, sliderType, 1.0f, CollectionsKt.emptyList());
        String string3 = getString(2132019070);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        QgZ().ck.setAdapter(new j(this, CollectionsKt.listOf((Object[]) new UserParameter[]{color, spinner, new UserParameter.Spinner("far z", string3, true, -9999.0f, 9999.0f, 1.0f, 5.0f, 5.0f, sliderType, 1.0f, CollectionsKt.emptyList())}), 2131232235));
        RecyclerView.Adapter adapter = QgZ().ck.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        s7N();
    }

    private final SJ0.Pmq QgZ() {
        return (SJ0.Pmq) this.contentBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ro(final I i2, final int i3) {
        HW.C.D(i2, new Function2() { // from class: f0P.Dt
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.SR(this.f64156n, i3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement SR(I i2, final int i3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        CameraProperties cameraProperties = el.getCameraProperties();
        Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(i2), new Function1() { // from class: f0P.nH
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(I.EN(i3, ((Float) obj).floatValue()));
            }
        });
        Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement l(I i2, final int i3, final Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        CameraProperties cameraProperties = el.getCameraProperties();
        Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(i2), new Function1() { // from class: f0P.Lc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(I.eo(scene, i3, ((Float) obj).floatValue()));
            }
        });
        Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement lS(boolean z2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(el.getCameraProperties(), null, null, z2, null, null, null, false, null, null, null, 1019, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mx(I i2, CompoundButton compoundButton, final boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        HW.C.D(i2, new Function2() { // from class: f0P.Buf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.lS(z2, (Scene) obj, (SceneElement) obj2);
            }
        });
        QmE.iF iFVarJB = i2.jB();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z2);
        Unit unit = Unit.INSTANCE;
        iFVarJB.n(new j.fuX("camera_edit_focusblur", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q9(I i2) {
        i2.undoBatch.n();
        i2.interaction = n.f64331n;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uQ(I i2, CompoundButton compoundButton, final boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        HW.C.D(i2, new Function2() { // from class: f0P.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.wKY(z2, (Scene) obj, (SceneElement) obj2);
            }
        });
        QmE.iF iFVarJB = i2.jB();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z2);
        Unit unit = Unit.INSTANCE;
        iFVarJB.n(new j.fuX("camera_edit_fog", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement wKY(boolean z2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(el.getCameraProperties(), null, null, false, null, null, null, z2, null, null, null, 959, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    private final void waP() {
        String string = getString(2132019095);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SliderType sliderType = SliderType.INTEGER;
        UserParameter.Spinner spinner = new UserParameter.Spinner("focus distance", string, true, -9999.0f, 9999.0f, 1.0f, 5.0f, 5.0f, sliderType, 1.0f, CollectionsKt.emptyList());
        String string2 = getString(2132017675);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        UserParameter.Spinner spinner2 = new UserParameter.Spinner("depth of field", string2, true, 0.0f, 9999.0f, 1.0f, 5.0f, 5.0f, sliderType, 1.0f, CollectionsKt.emptyList());
        String string3 = getString(2132017354);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        QgZ().az.setAdapter(new j(this, CollectionsKt.listOf((Object[]) new UserParameter.Spinner[]{spinner, spinner2, new UserParameter.Spinner("blur strength", string3, true, 0.0f, 2.0f, 0.005f, 0.15f, 0.0f, SliderType.FLOAT, 1.0f, CollectionsKt.emptyList())}), 2131232235));
        RecyclerView.Adapter adapter = QgZ().az.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit yAc(I i2) {
        i2.undoBatch.n();
        i2.interaction = n.f64331n;
        return Unit.INSTANCE;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        QgZ().f9267o.setOnClickListener(new View.OnClickListener() { // from class: f0P.Kk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                I.iV(this.f64431n, view2);
            }
        });
        QgZ().nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.I7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                I.bZm(this.f64346n, view2);
            }
        });
        QgZ().f9269t.setMinValue(1);
        QgZ().f9269t.setMaxValue(1799);
        QgZ().f9269t.setLimitRange(true);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 50; i2 < QgZ().f9269t.getMaxValue(); i2 += 50) {
            arrayList.add(Integer.valueOf(i2));
        }
        QgZ().f9269t.setBrightMarks(arrayList);
        QgZ().f9269t.setOnStartTrackingTouch(new Function0() { // from class: f0P.giR
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.Co(this.f65587n);
            }
        });
        QgZ().f9269t.setOnStopTrackingTouch(new Function0() { // from class: f0P.FP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.q9(this.f64202n);
            }
        });
        QgZ().f9269t.setOnSpinAbs(new Function1() { // from class: f0P.QhI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.Ro(this.f64637n, ((Integer) obj).intValue());
            }
        });
        final Scene sceneIF = HW.C.iF(this);
        if (sceneIF != null) {
            final int iCalcCameraZoom = (int) CameraElementKt.calcCameraZoom(sceneIF, 179.9f);
            final int iCalcCameraZoom2 = (int) CameraElementKt.calcCameraZoom(sceneIF, 0.1f);
            QgZ().mUb.setMinValue(iCalcCameraZoom);
            QgZ().mUb.setMaxValue(iCalcCameraZoom2);
            QgZ().gh.setOnClickListener(new View.OnClickListener() { // from class: f0P.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    I.pS(this.f65567n, sceneIF, iCalcCameraZoom, iCalcCameraZoom2, view2);
                }
            });
        }
        QgZ().mUb.setLimitRange(true);
        QgZ().mUb.setOnStartTrackingTouch(new Function0() { // from class: f0P.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.tEO(this.f64250n);
            }
        });
        QgZ().mUb.setOnStopTrackingTouch(new Function0() { // from class: f0P.op
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.yAc(this.f66012n);
            }
        });
        QgZ().mUb.setOnSpinAbs(new Function1() { // from class: f0P.m8h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.h(this.f65767n, ((Integer) obj).intValue());
            }
        });
        if (sceneElementNHg != null) {
            QgZ().Ik.setChecked(sceneElementNHg.getCameraProperties().getFogEnabled());
            QgZ().Ik.jumpDrawablesToCurrentState();
            QgZ().ty.setChecked(sceneElementNHg.getCameraProperties().getFocusBlurEnabled());
            QgZ().ty.jumpDrawablesToCurrentState();
        }
        QgZ().Ik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f0P.Um
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                I.uQ(this.f64778n, compoundButton, z2);
            }
        });
        QgZ().ty.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f0P.nr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                I.mx(this.f65821n, compoundButton, z2);
            }
        });
        if (sceneElementNHg != null) {
            piY(sceneElementNHg);
        }
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: v, reason: from getter */
    protected boolean getAutoTabSpacing() {
        return this.autoTabSpacing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Co(I i2) {
        i2.undoBatch = HW.C.xMQ(i2);
        i2.interaction = n.f64333t;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oA.j Fp(UserParameter param) {
        switch (getCurrentTabId()) {
            case 2131363808:
                String name = param.getName();
                int iHashCode = name.hashCode();
                if (iHashCode != -970716611) {
                    if (iHashCode != 1255753262) {
                        if (iHashCode == 1437041626 && name.equals("blur strength")) {
                            aC aCVar = new PropertyReference1Impl() { // from class: f0P.I.aC
                                {
                                    String str = jhotmBbwMbr.spvJTOYi;
                                }

                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((SceneElement) obj).getCameraProperties();
                                }
                            };
                            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar.getReturnType(), aCVar);
                            C c2 = new PropertyReference1Impl() { // from class: f0P.I.C
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((CameraProperties) obj).getFocusBlurStrength();
                                }
                            };
                            return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), nVar, c2);
                        }
                    } else if (name.equals("depth of field")) {
                        fuX fux = new PropertyReference1Impl() { // from class: f0P.I.fuX
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((SceneElement) obj).getCameraProperties();
                            }
                        };
                        oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), fux);
                        Dsr dsr = new PropertyReference1Impl() { // from class: f0P.I.Dsr
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((CameraProperties) obj).getFocusDepthOfField();
                            }
                        };
                        return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), nVar2, dsr);
                    }
                } else if (name.equals("focus distance")) {
                    Wre wre = new PropertyReference1Impl() { // from class: f0P.I.Wre
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getCameraProperties();
                        }
                    };
                    oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), wre);
                    CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.I.CN3
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((CameraProperties) obj).getFocusDistance();
                        }
                    };
                    return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), nVar3, cn3);
                }
                return null;
            case 2131363809:
                String name2 = param.getName();
                int iHashCode2 = name2.hashCode();
                if (iHashCode2 != -1049484670) {
                    if (iHashCode2 != 94842723) {
                        if (iHashCode2 == 97199537 && name2.equals("far z")) {
                            Ml ml = new PropertyReference1Impl() { // from class: f0P.I.Ml
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((SceneElement) obj).getCameraProperties();
                                }
                            };
                            oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), ml);
                            I28 i28 = new PropertyReference1Impl() { // from class: f0P.I.I28
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((CameraProperties) obj).getFogFarZ();
                                }
                            };
                            return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), nVar4, i28);
                        }
                    } else if (name2.equals(TtmlNode.ATTR_TTS_COLOR)) {
                        o oVar = new PropertyReference1Impl() { // from class: f0P.I.o
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((SceneElement) obj).getCameraProperties();
                            }
                        };
                        oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), oVar);
                        qz qzVar = new PropertyReference1Impl() { // from class: f0P.I.qz
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((CameraProperties) obj).getFogColor();
                            }
                        };
                        return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), nVar5, qzVar);
                    }
                } else if (name2.equals("near z")) {
                    Pl pl = new PropertyReference1Impl() { // from class: f0P.I.Pl
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getCameraProperties();
                        }
                    };
                    oA.n nVar6 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), pl);
                    w6 w6Var = new PropertyReference1Impl() { // from class: f0P.I.w6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((CameraProperties) obj).getFogNearZ();
                        }
                    };
                    return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), nVar6, w6Var);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H(UserParameter param) {
        if (Intrinsics.areEqual(param.getName(), "focus distance")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.Pmq NP(I i2) {
        SJ0.Pmq pmqN = SJ0.Pmq.n(i2.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(pmqN, "bind(...)");
        return pmqN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bZm(I i2, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(i2);
        if (sceneElementNHg == null) {
            return;
        }
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFov(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(i2)))).floatValue();
        List listListOf = CollectionsKt.listOf(new C2348n(fFloatValue, 60.0f, 0.1f, 179.9f, "", true));
        Float fValueOf = Float.valueOf(fFloatValue);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new DAz(objectRef, uGc, fValueOf, null, i2));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = i2.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = i2.getResources();
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
        i2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(final I i2, final int i3) {
        i2.QgZ().gh.setText(String.valueOf(i3));
        HW.C.D(i2, new Function2() { // from class: f0P.MKd
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.l(this.f64476n, i3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iV(I i2, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(i2);
        if (sceneElementNHg == null) {
            return;
        }
        CameraType type = sceneElementNHg.getCameraProperties().getType();
        final CameraType cameraType = CameraType.Perspective;
        if (type == cameraType) {
            i2.QgZ().Uo.setPerspective(false);
            cameraType = CameraType.Orthographic;
            i2.QgZ().f9267o.setImageDrawable(i2.getResources().getDrawable(2131231570, null));
            i2.QgZ().f9265Z.setVisibility(4);
            i2.QgZ().nr.setVisibility(4);
            i2.QgZ().gh.setVisibility(4);
            i2.QgZ().mUb.setVisibility(4);
            i2.QgZ().f9269t.setVisibility(4);
            i2.QgZ().rl.setVisibility(4);
        } else {
            i2.QgZ().Uo.setPerspective(true);
            i2.QgZ().f9267o.setImageDrawable(i2.getResources().getDrawable(2131231571, null));
            i2.QgZ().f9265Z.setVisibility(0);
            i2.QgZ().nr.setVisibility(0);
            i2.QgZ().gh.setVisibility(0);
            i2.QgZ().mUb.setVisibility(0);
            i2.QgZ().f9269t.setVisibility(0);
            i2.QgZ().rl.setVisibility(0);
        }
        HW.C.D(i2, new Function2() { // from class: f0P.ya
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.I4p(cameraType, (Scene) obj, (SceneElement) obj2);
            }
        });
        i2.wTp(i2.getCurrentTabId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(UserParameter param) {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || !Intrinsics.areEqual(param.getName(), "focus distance")) {
            return "";
        }
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
        return String.valueOf(MathKt.roundToInt(((Number) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFocusDistance(), fFractionalTime)).floatValue() + ((Vector3D) KeyableKt.valueAtTime(sceneElementNHg.getTransform().getLocation(), fFractionalTime)).getZ()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pS(I i2, Scene scene, int i3, int i5, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(i2);
        if (sceneElementNHg == null) {
            return;
        }
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFov(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(i2)))).floatValue();
        List listListOf = CollectionsKt.listOf(new C2348n(CameraElementKt.calcCameraZoom(scene, fFloatValue), CameraElementKt.calcCameraZoom(scene, 60.0f), i3, i5, "", true));
        Float fValueOf = Float.valueOf(CameraElementKt.calcCameraZoom(scene, fFloatValue));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new nKK(objectRef, uGc, fValueOf, null, i2));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = i2.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = i2.getResources();
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
        i2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Keyable rxp(UserParameter param) {
        oA.j jVarFp;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (jVarFp = Fp(param)) == null) {
            return null;
        }
        return (Keyable) jVarFp.get(sceneElementNHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tEO(I i2) {
        i2.undoBatch = HW.C.xMQ(i2);
        i2.interaction = n.f64330O;
        return Unit.INSTANCE;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M */
    protected List getTabs() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && sceneElementNHg.getCameraProperties().getType() != CameraType.Perspective) {
            return CollectionsKt.listOf((Object[]) new Ny.j[]{new Ny.j(2131363810, 2131231575, 0, 0, 2131231576, false, 12, null), new Ny.j(2131363808, 2131231573, 0, 0, null, false, 60, null), new Ny.j(2131363809, 2131231574, 0, 0, null, false, 60, null)});
        }
        return CollectionsKt.listOf((Object[]) new Ny.j[]{new Ny.j(2131363810, 2131231577, 0, 0, 2131231576, false, 12, null), new Ny.j(2131363808, 2131231573, 0, 0, null, false, 60, null), new Ny.j(2131363809, 2131231574, 0, 0, null, false, 60, null)});
    }

    @Override // f0P.NO, f0P.Ny
    protected void a(int tabId) {
        super.a(tabId);
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(2131363810, CollectionsKt.listOf(QgZ().KN)), TuplesKt.to(2131363808, CollectionsKt.listOf(QgZ().f9264O)), TuplesKt.to(2131363809, CollectionsKt.listOf(QgZ().J2)));
        Iterator it = CollectionsKt.flatten(mapMapOf.values()).iterator();
        while (it.hasNext()) {
            ((ConstraintLayout) it.next()).setVisibility(4);
        }
        List list = (List) mapMapOf.get(Integer.valueOf(tabId));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((ConstraintLayout) it2.next()).setVisibility(0);
            }
        }
        List list2 = (List) mapMapOf.get(Integer.valueOf(tabId));
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((ConstraintLayout) it3.next()).setVisibility(0);
            }
        }
        switch (tabId) {
            case 2131363808:
                waP();
                break;
            case 2131363809:
                LPV();
                break;
        }
        W();
        s7N();
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        switch (getCurrentTabId()) {
            case 2131363808:
                String str = this.paramName;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -970716611) {
                        if (iHashCode != 1255753262) {
                            if (iHashCode == 1437041626 && str.equals("blur strength")) {
                                AnimatorOf animatorOf = AnimatorOf.Float;
                                ci ciVar = new PropertyReference1Impl() { // from class: f0P.I.ci
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj) {
                                        return ((SceneElement) obj).getCameraProperties();
                                    }
                                };
                                g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.I.g9s
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj) {
                                        return ((CameraProperties) obj).getFocusBlurStrength();
                                    }
                                };
                                return CollectionsKt.listOf(new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), ciVar), g9sVar), SetsKt.setOf(2131363808)));
                            }
                        } else if (str.equals("depth of field")) {
                            AnimatorOf animatorOf2 = AnimatorOf.Float;
                            r rVar = new PropertyReference1Impl() { // from class: f0P.I.r
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((SceneElement) obj).getCameraProperties();
                                }
                            };
                            SPz sPz = new PropertyReference1Impl() { // from class: f0P.I.SPz
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((CameraProperties) obj).getFocusDepthOfField();
                                }
                            };
                            return CollectionsKt.listOf(new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), rVar), sPz), SetsKt.setOf(2131363808)));
                        }
                    } else if (str.equals("focus distance")) {
                        AnimatorOf animatorOf3 = AnimatorOf.Float;
                        UGc uGc = new PropertyReference1Impl() { // from class: f0P.I.UGc
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((SceneElement) obj).getCameraProperties();
                            }
                        };
                        Q q2 = new PropertyReference1Impl() { // from class: f0P.I.Q
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((CameraProperties) obj).getFocusDistance();
                            }
                        };
                        return CollectionsKt.listOf(new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), uGc), q2), SetsKt.setOf(2131363808)));
                    }
                }
                return CollectionsKt.emptyList();
            case 2131363809:
                String str2 = this.paramName;
                if (str2 != null) {
                    int iHashCode2 = str2.hashCode();
                    if (iHashCode2 != -1049484670) {
                        if (iHashCode2 != 94842723) {
                            if (iHashCode2 == 97199537 && str2.equals("far z")) {
                                AnimatorOf animatorOf4 = AnimatorOf.Float;
                                QJ qj = new PropertyReference1Impl() { // from class: f0P.I.QJ
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj) {
                                        return ((SceneElement) obj).getCameraProperties();
                                    }
                                };
                                l3D l3d = new PropertyReference1Impl() { // from class: f0P.I.l3D
                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                    public Object get(Object obj) {
                                        return ((CameraProperties) obj).getFogFarZ();
                                    }
                                };
                                return CollectionsKt.listOf(new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), qj), l3d), SetsKt.setOf(2131363809)));
                            }
                        } else if (str2.equals(TtmlNode.ATTR_TTS_COLOR)) {
                            AnimatorOf animatorOf5 = AnimatorOf.Color;
                            afx afxVar = new PropertyReference1Impl() { // from class: f0P.I.afx
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((SceneElement) obj).getCameraProperties();
                                }
                            };
                            Xo xo = new PropertyReference1Impl() { // from class: f0P.I.Xo
                                {
                                    String str3 = esLNYym.HvhZUpfU;
                                }

                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                public Object get(Object obj) {
                                    return ((CameraProperties) obj).getFogColor();
                                }
                            };
                            return CollectionsKt.listOf(new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), afxVar), xo), SetsKt.setOf(2131363809)));
                        }
                    } else if (str2.equals("near z")) {
                        AnimatorOf animatorOf6 = AnimatorOf.Float;
                        eO eOVar = new PropertyReference1Impl() { // from class: f0P.I.eO
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((SceneElement) obj).getCameraProperties();
                            }
                        };
                        C1997z c1997z = new PropertyReference1Impl() { // from class: f0P.I.z
                            {
                                String str3 = gUxOLwRQBPPLC.oBPvbaTtyGmP;
                            }

                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((CameraProperties) obj).getFogNearZ();
                            }
                        };
                        return CollectionsKt.listOf(new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c1997z.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), eOVar), c1997z), SetsKt.setOf(2131363809)));
                    }
                }
                return CollectionsKt.emptyList();
            case 2131363810:
                SceneElement sceneElementNHg = HW.C.nHg(this);
                if (sceneElementNHg != null && sceneElementNHg.getCameraProperties().getType() == CameraType.Perspective) {
                    AnimatorOf animatorOf7 = AnimatorOf.Float;
                    C1996c c1996c = new PropertyReference1Impl() { // from class: f0P.I.c
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getCameraProperties();
                        }
                    };
                    s4 s4Var = new PropertyReference1Impl() { // from class: f0P.I.s4
                        {
                            String str3 = IYJfqUyym.ZlJlUy;
                        }

                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((CameraProperties) obj).getFov();
                        }
                    };
                    return CollectionsKt.listOf(new F8(animatorOf7, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c1996c.getReturnType(), c1996c), s4Var), SetsKt.setOf(2131363810)));
                }
                return CollectionsKt.emptyList();
            default:
                return CollectionsKt.emptyList();
        }
    }

    @Override // yc.QhI
    public int t() {
        return 2131362616;
    }
}
