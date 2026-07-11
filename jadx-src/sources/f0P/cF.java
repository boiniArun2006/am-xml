package f0P;

import LdY.Ml;
import QmE.j;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.GradientFill;
import com.alightcreative.app.motion.scene.GradientType;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneElementTypeKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.safedk.android.utils.Logger;
import f0P.Ny;
import f0P.cF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001`B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u0004R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R!\u00105\u001a\b\u0012\u0004\u0012\u000201008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u00104R,\u0010=\u001a\u0013\u0012\t\u0012\u000707¢\u0006\u0002\b8\u0012\u0004\u0012\u000209068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010<R,\u0010B\u001a\u0013\u0012\t\u0012\u00070>¢\u0006\u0002\b8\u0012\u0004\u0012\u00020?068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010<R\u001a\u0010G\u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010O\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR\u0016\u0010Q\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010JR\u0016\u0010S\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010RR\u001b\u0010V\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bU\u0010FR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020]008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u00104¨\u0006a"}, d2 = {"Lf0P/cF;", "Lf0P/NO;", "Lyc/Buf;", "<init>", "()V", "", "requestCode", TtmlNode.ATTR_TTS_COLOR, "", "lens", "", CmcdData.STREAMING_FORMAT_HLS, "(IILjava/lang/String;)V", "startColor", "endColor", "eo", "(II)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lyc/a;", "motionEvent", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "onDestroyView", "LSJ0/mrQ;", "p5", "Lkotlin/Lazy;", "xzo", "()LSJ0/mrQ;", "contentBinding", "", "Lf0P/cF$j;", "eF", "XNZ", "()Ljava/util/List;", "fillTypeViewInfo", "", "Landroid/widget/ImageButton;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lcom/alightcreative/app/motion/scene/GradientType;", "E", "lNy", "()Ljava/util/Map;", "gradationTypeView", "Landroid/widget/Button;", "Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;", "M", "I9f", "mediaFillModeView", "FX", "I", "M7", "()I", "layoutResource", "", "B", "F", "dragStartRawX", "J", "dragStartRawY", "D", "dragStartX", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "dragStartY", "Z", "recognizedDrag", "GR", "D76", "touchSlop", "LLdY/Ml$j;", "Nxk", "LLdY/Ml$j;", "undoBatch", "Y", "touchedStartPoint", "Lf0P/F8;", "lLA", "keyableSettings", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorAndFillFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorAndFillFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ColorAndFillFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n*L\n1#1,447:1\n143#2:448\n1557#3:449\n1628#3,3:450\n1863#3,2:453\n1368#3:455\n1454#3,5:456\n1863#3,2:461\n230#3,2:463\n1863#3,2:465\n1863#3,2:467\n1863#3,2:471\n1863#3,2:473\n216#4,2:469\n216#4,2:475\n1#5:477\n110#6:478\n93#6,3:479\n111#6:482\n110#6:483\n93#6,3:484\n111#6:487\n*S KotlinDebug\n*F\n+ 1 ColorAndFillFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ColorAndFillFragment\n*L\n110#1:448\n110#1:449\n110#1:450,3\n180#1:453,2\n181#1:455\n181#1:456,5\n181#1:461,2\n182#1:463,2\n182#1:465,2\n183#1:467,2\n204#1:471,2\n225#1:473,2\n190#1:469,2\n298#1:475,2\n357#1:478\n357#1:479,3\n357#1:482\n290#1:483\n290#1:484,3\n290#1:487\n*E\n"})
public final class cF extends NO implements yc.Buf {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float dragStartRawX;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float dragStartX;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean recognizedDrag;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private float dragStartRawY;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private boolean touchedStartPoint;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float dragStartY;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.pIF
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cF.wKp(this.f66029n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final Lazy fillTypeViewInfo = LazyKt.lazy(new Function0() { // from class: f0P.qhS
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cF.Th(this.f66073n);
        }
    });

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy gradationTypeView = LazyKt.lazy(new Function0() { // from class: f0P.H9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cF.NP(this.f64251n);
        }
    });

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy mediaFillModeView = LazyKt.lazy(new Function0() { // from class: f0P.Mje
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cF.QgZ(this.f64490n);
        }
    });

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558592;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final Lazy touchSlop = LazyKt.lazy(new Function0() { // from class: f0P.bwY
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(cF.l(this.f65401n));
        }
    });

    public static final class CN3 implements ColorPickerWidget.n {
        CN3() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            cF cFVar = cF.this;
            j jVar = new PropertyReference1Impl() { // from class: f0P.cF.CN3.j
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillGradient();
                }
            };
            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar);
            n nVar2 = new PropertyReference1Impl() { // from class: f0P.cF.CN3.n
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((GradientFill) obj).getStartColor();
                }
            };
            cFVar.h(200, i2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar2.getReturnType(), nVar, nVar2).toString());
        }
    }

    public static final class Dsr implements ColorPickerWidget.n {
        Dsr() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            cF cFVar = cF.this;
            j jVar = new PropertyReference1Impl() { // from class: f0P.cF.Dsr.j
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillGradient();
                }
            };
            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar);
            n nVar2 = new PropertyReference1Impl() { // from class: f0P.cF.Dsr.n
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((GradientFill) obj).getEndColor();
                }
            };
            cFVar.h(com.safedk.android.internal.d.f62986a, i2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar2.getReturnType(), nVar, nVar2).toString());
        }
    }

    public static final class I28 implements ColorPickerWidget.n {
        I28() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            cF cFVar = cF.this;
            j jVar = new PropertyReference1Impl() { // from class: f0P.cF.I28.j
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillColor();
                }
            };
            cFVar.h(100, i2, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar).toString());
        }
    }

    public static final class Ml implements ColorPickerWidget.j {
        Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement t(cF cFVar, int i2, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, KeyableKt.copyWithValueForTime(el.getFillColor(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(cFVar)), HI0.qf.t(i2)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -129, 127, null);
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(final int i2) {
            final cF cFVar = cF.this;
            HW.C.D(cFVar, new Function2() { // from class: f0P.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return cF.Ml.t(cFVar, i2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    public static final class Wre implements ColorPickerWidget.j {
        Wre() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(int i2) {
            cF.this.xzo().qie.setStartColor(i2);
            cF cFVar = cF.this;
            cFVar.eo(i2, cFVar.xzo().Uo.getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
        }
    }

    public static final class fuX implements ColorPickerWidget.j {
        fuX() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(int i2) {
            cF.this.xzo().qie.setEndColor(i2);
            cF cFVar = cF.this;
            cFVar.eo(cFVar.xzo().xMQ.getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String(), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FillType f65442n;
        private final View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f65443t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f65442n == jVar.f65442n && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f65443t, jVar.f65443t);
        }

        public j(FillType fillType, View button, List views) {
            Intrinsics.checkNotNullParameter(fillType, "fillType");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(views, "views");
            this.f65442n = fillType;
            this.rl = button;
            this.f65443t = views;
        }

        public int hashCode() {
            return (((this.f65442n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f65443t.hashCode();
        }

        public final View n() {
            return this.rl;
        }

        public final FillType rl() {
            return this.f65442n;
        }

        public final List t() {
            return this.f65443t;
        }

        public String toString() {
            return "FillTypeViews(fillType=" + this.f65442n + ", button=" + this.rl + ", views=" + this.f65443t + ")";
        }
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FillType.values().length];
            try {
                iArr[FillType.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SceneElementType.values().length];
            try {
                iArr2[SceneElementType.Drawing.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[SceneElementType.Scene.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final int D76() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    private final Map I9f() {
        return (Map) this.mediaFillModeView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LPV(final cF cFVar, final View view) {
        HW.C.D(cFVar, new Function2() { // from class: f0P.ZX7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cF.rxp(this.f65328n, view, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SR(final cF cFVar, View view) {
        Intrinsics.checkNotNull(view);
        yU.Ml ml = new yU.Ml(view, ((ColorView) view).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
        ml.nr().setOnColorChangeListener(cFVar.new fuX());
        ml.nr().setPalletteClickListener(cFVar.new Dsr());
        ml.nr().setSceneHolder(HW.C.e(cFVar));
        cFVar.xzo().Uo.setColorWidget(ml.nr());
        ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.yht
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                cF.EN(this.f66377n);
            }
        });
        ml.KN(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Th(cF cFVar) {
        FillType fillType = FillType.NONE;
        ImageButton btnNone = cFVar.xzo().J2;
        Intrinsics.checkNotNullExpressionValue(btnNone, "btnNone");
        j jVar = new j(fillType, btnNone, CollectionsKt.listOf(cFVar.xzo().f9531g));
        FillType fillType2 = FillType.COLOR;
        ImageButton btnFill = cFVar.xzo().rl;
        Intrinsics.checkNotNullExpressionValue(btnFill, "btnFill");
        j jVar2 = new j(fillType2, btnFill, CollectionsKt.listOf(cFVar.xzo().KN));
        FillType fillType3 = FillType.GRADIENT;
        ImageButton btnGradation = cFVar.xzo().f9535t;
        Intrinsics.checkNotNullExpressionValue(btnGradation, "btnGradation");
        j jVar3 = new j(fillType3, btnGradation, CollectionsKt.listOf(cFVar.xzo().az));
        FillType fillType4 = FillType.MEDIA;
        ImageButton btnMedia = cFVar.xzo().f9528O;
        Intrinsics.checkNotNullExpressionValue(btnMedia, "btnMedia");
        j jVar4 = new j(fillType4, btnMedia, CollectionsKt.listOf(cFVar.xzo().aYN));
        FillType fillType5 = FillType.INTRINSIC;
        ImageButton btnIntrinsic = cFVar.xzo().nr;
        Intrinsics.checkNotNullExpressionValue(btnIntrinsic, "btnIntrinsic");
        return CollectionsKt.listOf((Object[]) new j[]{jVar, jVar2, jVar3, jVar4, new j(fillType5, btnIntrinsic, CollectionsKt.listOf(cFVar.xzo().XQ))});
    }

    private final List XNZ() {
        return (List) this.fillTypeViewInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(int i2, Intent intent) {
        return "[onActivityResult] " + i2 + " " + intent;
    }

    private final Map lNy() {
        return (Map) this.gradationTypeView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement rxp(cF cFVar, View view, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        GradientFill fillGradient = el.getFillGradient();
        Object obj = cFVar.lNy().get(view);
        Intrinsics.checkNotNull(obj);
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, GradientFill.copy$default(fillGradient, (GradientType) obj, null, null, null, null, 30, null), null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1025, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tEO(cF cFVar, final TextureCropMode textureCropMode, View view) {
        HW.C.D(cFVar, new Function2() { // from class: f0P.ZhI
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cF.yAc(textureCropMode, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement uQ(int i2, int i3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, GradientFill.copy$default(el.getFillGradient(), null, HI0.qf.t(i2), HI0.qf.t(i3), null, null, 25, null), null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1025, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement waP(j jVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, jVar.rl(), null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2049, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.mrQ xzo() {
        return (SJ0.mrQ) this.contentBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement yAc(TextureCropMode textureCropMode, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, textureCropMode, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4097, 127, null);
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // yc.Buf
    public boolean n(yc.a motionEvent) {
        Scene sceneIF;
        SceneHolder sceneHolderE;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneIF = HW.C.iF(this)) == null || (sceneHolderE = HW.C.e(this)) == null || sceneElementNHg.getFillType() != FillType.GRADIENT) {
            return false;
        }
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementNHg, sceneIF, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this)), HW.C.ck(this), sceneHolderE.get_scene().getFramesPerHundredSeconds());
        float left = rectangleBoundsAtTime.getLeft() + (rectangleBoundsAtTime.getWidth() * sceneElementNHg.getFillGradient().getStartLocation().getX());
        float top = rectangleBoundsAtTime.getTop() + (rectangleBoundsAtTime.getHeight() * sceneElementNHg.getFillGradient().getStartLocation().getY());
        float left2 = rectangleBoundsAtTime.getLeft() + (rectangleBoundsAtTime.getWidth() * sceneElementNHg.getFillGradient().getEndLocation().getX());
        float top2 = rectangleBoundsAtTime.getTop() + (rectangleBoundsAtTime.getHeight() * sceneElementNHg.getFillGradient().getEndLocation().getY());
        Vector2D vector2D = new Vector2D(left, top);
        Vector2D vector2D2 = new Vector2D(left2, top2);
        Vector2D vector2DRl = motionEvent.rl();
        float x2 = vector2DRl.getX();
        float y2 = vector2DRl.getY();
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            Vector2D vector2D3 = new Vector2D(x2, y2);
            this.touchedStartPoint = GeometryKt.getLength(GeometryKt.minus(vector2D, vector2D3)) < GeometryKt.getLength(GeometryKt.minus(vector2D2, vector2D3));
            this.dragStartX = x2;
            this.dragStartY = y2;
            this.dragStartRawX = motionEvent.n().getRawX();
            this.dragStartRawY = motionEvent.n().getRawY();
            this.recognizedDrag = false;
            return true;
        }
        if (actionMasked == 1) {
            Ml.j jVar = this.undoBatch;
            if (jVar != null) {
                jVar.n();
            }
            this.undoBatch = null;
            return true;
        }
        if (actionMasked != 2) {
            return true;
        }
        if (this.recognizedDrag) {
            float f3 = x2 - this.dragStartX;
            float f4 = y2 - this.dragStartY;
            this.dragStartX = x2;
            this.dragStartY = y2;
            Vector2D vector2D4 = new Vector2D(f3 / rectangleBoundsAtTime.getWidth(), f4 / rectangleBoundsAtTime.getHeight());
            if (this.touchedStartPoint) {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, GradientFill.copy$default(sceneElementNHg.getFillGradient(), null, null, null, GeometryKt.plus(sceneElementNHg.getFillGradient().getStartLocation(), vector2D4), null, 23, null), null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1025, 127, null));
            } else {
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, GradientFill.copy$default(sceneElementNHg.getFillGradient(), null, null, null, null, GeometryKt.plus(sceneElementNHg.getFillGradient().getEndLocation(), vector2D4), 15, null), null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1025, 127, null));
            }
        } else {
            float rawX = this.dragStartRawX - motionEvent.n().getRawX();
            float rawY = this.dragStartRawY - motionEvent.n().getRawY();
            if (Math.abs(rawX) > D76() || Math.abs(rawY) > D76()) {
                this.recognizedDrag = true;
                SceneHolder sceneHolderE2 = HW.C.e(this);
                if (sceneHolderE2 != null) {
                    sceneHolderE2.setEditMode(2131362616);
                }
                this.undoBatch = HW.C.xMQ(this);
                this.dragStartX = x2;
                this.dragStartY = y2;
                return true;
            }
        }
        return true;
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_color_and_fill", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        for (final j jVar : XNZ()) {
            jVar.n().setOnClickListener(new View.OnClickListener() { // from class: f0P.afV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cF.H(this.f65357n, jVar, view2);
                }
            });
        }
        xzo().KN.setOnColorChangeListener(new Ml());
        xzo().KN.setPalletteClickListener(new I28());
        xzo().KN.setSceneHolder(HW.C.e(this));
        Iterator it = lNy().keySet().iterator();
        while (it.hasNext()) {
            ((ImageButton) it.next()).setOnClickListener(new View.OnClickListener() { // from class: f0P.OB3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cF.LPV(this.f64542n, view2);
                }
            });
        }
        xzo().xMQ.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cF.Fp(this.f64116n, view2);
            }
        });
        xzo().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.tQj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cF.SR(this.f66221n, view2);
            }
        });
        xzo().te.setOnClickListener(new View.OnClickListener() { // from class: f0P.epX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cF.pS(this.f65526n, view2);
            }
        });
        for (Map.Entry entry : I9f().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            final TextureCropMode textureCropMode = (TextureCropMode) entry.getValue();
            ((Button) key).setOnClickListener(new View.OnClickListener() { // from class: f0P.VY8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cF.tEO(this.f64923n, textureCropMode, view2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    @Override // f0P.Ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void piY(SceneElement el) {
        SceneHolder sceneHolderE;
        SceneHolder sceneHolderE2;
        FragmentActivity activity;
        ContentResolver contentResolver;
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(el, "el");
        SceneHolder sceneHolderE3 = HW.C.e(this);
        if (sceneHolderE3 == null || sceneHolderE3.getEditMode() != 2131362629) {
            SceneHolder sceneHolderE4 = HW.C.e(this);
            if (sceneHolderE4 == null || sceneHolderE4.getEditMode() != 2131362630) {
                xzo().KN.setColor(ColorKt.toInt((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), SceneElementKt.fractionalTime(el, HW.C.WPU(this)))));
                xzo().xMQ.setColor(ColorKt.toInt(el.getFillGradient().getStartColor()));
                xzo().Uo.setColor(ColorKt.toInt(el.getFillGradient().getEndColor()));
                xzo().qie.setStartColor(xzo().xMQ.getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                xzo().qie.setEndColor(xzo().Uo.getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                Uri fillImage = el.getFillImage();
                if (fillImage == null) {
                    fillImage = el.getFillVideo();
                }
                Uri uri = fillImage;
                if (uri != null) {
                    MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
                    if (mediaUriInfoFromCache != null) {
                        TextView textView = xzo().nY;
                        String title = mediaUriInfoFromCache.getTitle();
                        if (title == null && (title = mediaUriInfoFromCache.getFilename()) == null && (title = uri.getLastPathSegment()) == null) {
                            title = uri.getSchemeSpecificPart();
                        }
                        textView.setText(title);
                        xzo().nY.setTextColor(-1);
                    } else {
                        try {
                            activity = getActivity();
                        } catch (SecurityException e2) {
                            FirebaseCrashlytics.getInstance().recordException(e2);
                            if (isAdded()) {
                            }
                        }
                        if (activity != null && (contentResolver = activity.getContentResolver()) != null && (cursorQuery = contentResolver.query(uri, null, null, null, null)) != null) {
                            try {
                                if (!isAdded()) {
                                    CloseableKt.closeFinally(cursorQuery, null);
                                    return;
                                }
                                if (cursorQuery.getCount() < 1) {
                                    xzo().nY.setText(getString(2132019598));
                                } else {
                                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                                    cursorQuery.moveToFirst();
                                    xzo().nY.setText(cursorQuery.getString(columnIndex));
                                    xzo().nY.setTextColor(-1);
                                }
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(cursorQuery, null);
                            } finally {
                            }
                            FirebaseCrashlytics.getInstance().recordException(e2);
                            if (isAdded()) {
                                return;
                            }
                            xzo().nY.setText(getString(2132019598));
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
                HV().setEnabled(el.getFillType() == FillType.COLOR);
                if (SceneElementTypeKt.getSupportsIntrinsicFill(el.getType())) {
                    int i2 = n.$EnumSwitchMapping$1[el.getType().ordinal()];
                    if (i2 == 1) {
                        ImageView imageView = xzo().XQ;
                        Resources resources = getResources();
                        Context context = getContext();
                        imageView.setImageDrawable(ResourcesCompat.J2(resources, 2131231487, context != null ? context.getTheme() : null));
                        ImageButton imageButton = xzo().nr;
                        Resources resources2 = getResources();
                        Context context2 = getContext();
                        imageButton.setImageDrawable(ResourcesCompat.J2(resources2, 2131231487, context2 != null ? context2.getTheme() : null));
                    } else if (i2 == 2) {
                        if (SceneElementKt.isElementOrLinkedProject(el)) {
                            ImageView imageView2 = xzo().XQ;
                            Resources resources3 = getResources();
                            Context context3 = getContext();
                            imageView2.setImageDrawable(ResourcesCompat.J2(resources3, 2131231486, context3 != null ? context3.getTheme() : null));
                            ImageButton imageButton2 = xzo().nr;
                            Resources resources4 = getResources();
                            Context context4 = getContext();
                            imageButton2.setImageDrawable(ResourcesCompat.J2(resources4, 2131231486, context4 != null ? context4.getTheme() : null));
                        } else {
                            ImageView imageView3 = xzo().XQ;
                            Resources resources5 = getResources();
                            Context context5 = getContext();
                            imageView3.setImageDrawable(ResourcesCompat.J2(resources5, 2131231032, context5 != null ? context5.getTheme() : null));
                            ImageButton imageButton3 = xzo().nr;
                            Resources resources6 = getResources();
                            Context context6 = getContext();
                            imageButton3.setImageDrawable(ResourcesCompat.J2(resources6, 2131231032, context6 != null ? context6.getTheme() : null));
                        }
                    }
                    xzo().f9528O.setVisibility(8);
                } else {
                    xzo().nr.setVisibility(8);
                }
                for (j jVar : XNZ()) {
                    jVar.n().setActivated(jVar.rl() == el.getFillType());
                }
                List listXNZ = XNZ();
                ArrayList arrayList = new ArrayList();
                Iterator it = listXNZ.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((j) it.next()).t());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setVisibility(4);
                }
                for (j jVar2 : XNZ()) {
                    if (jVar2.rl() == el.getFillType()) {
                        Iterator it3 = jVar2.t().iterator();
                        while (it3.hasNext()) {
                            ((View) it3.next()).setVisibility(0);
                        }
                        for (ImageButton imageButton4 : lNy().keySet()) {
                            imageButton4.setActivated(lNy().get(imageButton4) == el.getFillGradient().getType());
                        }
                        SceneHolder sceneHolderE5 = HW.C.e(this);
                        if ((sceneHolderE5 == null || sceneHolderE5.getEditMode() != 2131362629) && (((sceneHolderE = HW.C.e(this)) == null || sceneHolderE.getEditMode() != 2131362630) && (sceneHolderE2 = HW.C.e(this)) != null)) {
                            sceneHolderE2.setEditMode(el.getFillType() == FillType.GRADIENT ? 2131362615 : 0);
                        }
                        for (Map.Entry entry : I9f().entrySet()) {
                            Object key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                            ((Button) key).setActivated(((TextureCropMode) entry.getValue()) == el.getMediaFillMode());
                        }
                        xzo().WPU.setVisibility(uri == null ? 4 : 0);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EN(cF cFVar) {
        if (cFVar.isAdded()) {
            cFVar.xzo().Uo.setColorWidget(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fp(final cF cFVar, View view) {
        FragmentActivity activity = cFVar.getActivity();
        if (activity == null) {
            return;
        }
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorView");
        yU.Ml ml = new yU.Ml(activity, ((ColorView) view).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
        ml.nr().setOnColorChangeListener(cFVar.new Wre());
        ml.nr().setPalletteClickListener(cFVar.new CN3());
        ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.Fo
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                cF.Ro(this.f64217n);
            }
        });
        ml.nr().setSceneHolder(HW.C.e(cFVar));
        cFVar.xzo().xMQ.setColorWidget(ml.nr());
        ml.KN(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(cF cFVar, final j jVar, View view) {
        SceneHolder sceneHolderE = HW.C.e(cFVar);
        if (sceneHolderE != null && sceneHolderE.getEditMode() == 2131362629) {
            return;
        }
        SceneHolder sceneHolderE2 = HW.C.e(cFVar);
        if (sceneHolderE2 != null && sceneHolderE2.getEditMode() == 2131362630) {
            return;
        }
        HW.C.D(cFVar, new Function2() { // from class: f0P.fhj
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cF.waP(jVar, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map NP(cF cFVar) {
        return MapsKt.mapOf(TuplesKt.to(cFVar.xzo().ck, GradientType.LINEAR), TuplesKt.to(cFVar.xzo().Ik, GradientType.RADIAL), TuplesKt.to(cFVar.xzo().f9534r, GradientType.SWEEP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map QgZ(cF cFVar) {
        return MapsKt.mapOf(TuplesKt.to(cFVar.xzo().mUb, TextureCropMode.FILL), TuplesKt.to(cFVar.xzo().gh, TextureCropMode.FIT), TuplesKt.to(cFVar.xzo().iF, TextureCropMode.STRETCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ro(cF cFVar) {
        if (cFVar.isAdded()) {
            cFVar.xzo().xMQ.setColorWidget(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eo(final int startColor, final int endColor) {
        xzo().xMQ.setColor(startColor);
        xzo().Uo.setColor(endColor);
        HW.C.D(this, new Function2() { // from class: f0P.dc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cF.uQ(startColor, endColor, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int requestCode, int color, String lens) {
        Pair[] pairArr = {TuplesKt.to("CURRENT_COLOR", Integer.valueOf(color)), TuplesKt.to("COLOR_LENS", lens)};
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 2);
        Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, requestCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(cF cFVar) {
        return ViewConfiguration.get(cFVar.requireContext()).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pS(cF cFVar, View view) {
        int framesPerHundredSeconds;
        Scene sceneIF = HW.C.iF(cFVar);
        if (sceneIF != null) {
            framesPerHundredSeconds = sceneIF.getFramesPerHundredSeconds() / 100;
        } else {
            framesPerHundredSeconds = 30;
        }
        Pair[] pairArr = {TuplesKt.to("projectFPS", Integer.valueOf(framesPerHundredSeconds)), TuplesKt.to("MediaFillMode", Boolean.TRUE), TuplesKt.to("projectId", String.valueOf(HW.C.ViF(cFVar)))};
        FragmentActivity fragmentActivityRequireActivity = cFVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 3);
        Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) MediaBrowser.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(cFVar, intent, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.mrQ wKp(cF cFVar) {
        SJ0.mrQ mrqN = SJ0.mrQ.n(cFVar.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(mrqN, "bind(...)");
        return mrqN;
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        FillType fillType;
        int i2;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            fillType = sceneElementNHg.getFillType();
        } else {
            fillType = null;
        }
        if (fillType == null) {
            i2 = -1;
        } else {
            i2 = n.$EnumSwitchMapping$0[fillType.ordinal()];
        }
        if (i2 == 1) {
            AnimatorOf animatorOf = AnimatorOf.Color;
            w6 w6Var = new PropertyReference1Impl() { // from class: f0P.cF.w6
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillColor();
                }
            };
            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), w6Var);
            List tabs = getTabs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tabs, 10));
            Iterator it = tabs.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Ny.j) it.next()).J2()));
            }
            return CollectionsKt.listOf(new F8(animatorOf, nVar, CollectionsKt.toSet(arrayList)));
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, final int resultCode, final Intent data) {
        tu.Ew ew;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (requestCode != 11) {
                if (requestCode != 100) {
                    if (requestCode != 200 && requestCode != 300) {
                        super.onActivityResult(requestCode, resultCode, data);
                        return;
                    } else {
                        HW.C.wTp(this, resultCode, data, false);
                        return;
                    }
                }
                HW.C.v(this, resultCode, data, false, 4, null);
                return;
            }
            XoT.C.Uo(this, new Function0() { // from class: f0P.tZ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cF.j(resultCode, data);
                }
            });
            if (data != null) {
                Uri uri = (Uri) data.getParcelableExtra("selectedUri");
                String stringExtra = data.getStringExtra("mediaType");
                Scene scene = null;
                if (stringExtra != null) {
                    ew = (tu.Ew) HI0.Ew.n(tu.Ew.values(), stringExtra);
                } else {
                    ew = null;
                }
                if (resultCode == -1 && uri != null && ew != null) {
                    xzo().nY.setTextColor(-1);
                    SceneElement sceneElementNHg = HW.C.nHg(this);
                    SceneHolder sceneHolderE = HW.C.e(this);
                    if (sceneHolderE != null) {
                        scene = sceneHolderE.get_scene();
                    }
                    if (sceneElementNHg != null && scene != null) {
                        Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Scene sceneWithUpdatedMediaFillOf = MediaOrientationUpdaterKt.withUpdatedMediaFillOf(scene, sceneElementNHg, uri, ew, new HI0.Q(contextRequireContext));
                        SceneHolder sceneHolderE2 = HW.C.e(this);
                        if (sceneHolderE2 != null) {
                            sceneHolderE2.setScene(sceneWithUpdatedMediaFillOf);
                        }
                    }
                    MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
                    if (mediaUriInfoFromCache != null) {
                        TextView textView = xzo().nY;
                        String title = mediaUriInfoFromCache.getTitle();
                        if (title == null && (title = mediaUriInfoFromCache.getFilename()) == null && (title = uri.getLastPathSegment()) == null) {
                            title = uri.getSchemeSpecificPart();
                        }
                        textView.setText(title);
                        return;
                    }
                    Cursor cursorQuery = activity.getContentResolver().query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        cursorQuery.moveToFirst();
                        xzo().nY.setText(cursorQuery.getString(columnIndex));
                        cursorQuery.close();
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getActivity() instanceof EditActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.EditActivity");
            ((EditActivity) activity).rnX(null);
        }
        super.onDestroyView();
    }
}
