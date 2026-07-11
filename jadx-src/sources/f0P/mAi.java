package f0P;

import LdY.Ml;
import QmE.j;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.FontBrowserActivity;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.fonts.AMTypefaceError;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.StyledText;
import com.alightcreative.app.motion.scene.StyledTextAlign;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.widget.EditTextEx;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ImagesContract;
import com.safedk.android.utils.Logger;
import f0P.mAi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000É\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001u\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010\"J\u001f\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J+\u00101\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010\u0006J)\u0010@\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\b\u0010?\u001a\u0004\u0018\u00010>H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010LR\u0016\u0010d\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010LR\u0016\u0010f\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010LR\u0016\u0010h\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010LR&\u0010n\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\bj0i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010mR&\u0010q\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\bj0i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010Y\u001a\u0004\bp\u0010mR&\u0010t\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\bj0i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\bs\u0010mR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010zR\u0016\u0010\u007f\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010LR.\u0010\u0083\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020G8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"Lf0P/mAi;", "Lyc/QhI;", "Lyc/H;", "Lyc/Buf;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "", "mYa", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/view/View;", "view", "Po6", "(Landroid/view/View;)V", "", TtmlNode.ATTR_TTS_COLOR, "", "lens", "W", "(ILjava/lang/String;)V", "Org", "Lcom/alightcreative/app/motion/fonts/w6;", "amTypeface", "pJg", "(Lcom/alightcreative/app/motion/fonts/w6;)V", "Lcom/alightcreative/app/motion/fonts/Ml;", "selectedFont", "a63", "(Lcom/alightcreative/app/motion/fonts/Ml;)V", "", "height", "GD", "(F)V", "tFV", "qm", "Y", "dx", "ul", "dy", "fcU", "(FF)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "t", "()I", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onStop", "onDestroy", "nr", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lyc/a;", "motionEvent", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "LSJ0/OA;", "o", "LSJ0/OA;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "ijL", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "Landroid/widget/FrameLayout;", "S", "Landroid/widget/FrameLayout;", "topBarContainer", "LSJ0/KH;", "g", "Lkotlin/Lazy;", "xg", "()LSJ0/KH;", "topBarBinding", "", "E2", "[I", "fontSizes", "e", "analyticsAlignReported", "X", "analyticsFontSpinnerReported", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "analyticsFontSizeReported", "N", "popupOpen", "", "Lkotlin/jvm/internal/EnhancedNullability;", "v", "piY", "()Ljava/util/List;", "colorPopupViews", "Xw", "eTf", "sizePopupViews", "jB", "m", "fontPopupViews", "f0P/mAi$fuX", "U", "Lf0P/mAi$fuX;", "topBarLayoutChangelistener", "P5", "F", "prevTouchX", "M7", "prevTouchY", "p5", "inGesture", "Lkotlin/Function2;", "eF", "Lkotlin/jvm/functions/Function2;", "gestureHandler", "LLdY/Ml$j;", "E", "LLdY/Ml$j;", "undoBatch", "z", "()LSJ0/OA;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/TextEditFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,763:1\n1718#2,6:764\n110#3:770\n93#3,3:771\n111#3:774\n110#3:792\n93#3,3:793\n111#3:796\n1#4:775\n1557#5:776\n1628#5,3:777\n1053#5:780\n1557#5:781\n1628#5,3:782\n774#5:785\n865#5,2:786\n1863#5,2:788\n1863#5,2:790\n1863#5,2:797\n1863#5,2:799\n1863#5,2:801\n1863#5,2:803\n1863#5,2:805\n1863#5,2:807\n1863#5,2:809\n*S KotlinDebug\n*F\n+ 1 TextEditFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/TextEditFragment\n*L\n128#1:764,6\n341#1:770\n341#1:771,3\n341#1:774\n239#1:792\n239#1:793,3\n239#1:796\n401#1:776\n401#1:777,3\n401#1:780\n403#1:781\n403#1:782,3\n403#1:785\n403#1:786,2\n232#1:788,2\n238#1:790,2\n248#1:797,2\n253#1:799,2\n257#1:801,2\n258#1:803,2\n259#1:805,2\n305#1:807,2\n308#1:809,2\n*E\n"})
public final class mAi extends AbstractC2033dC implements yc.QhI, yc.H, yc.Buf {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private float prevTouchY;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean popupOpen;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private float prevTouchX;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private FrameLayout topBarContainer;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean analyticsFontSizeReported;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean analyticsFontSpinnerReported;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean analyticsAlignReported;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function2 gestureHandler;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.OA _binding;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean inGesture;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy topBarBinding = LazyKt.lazy(new Function0() { // from class: f0P.Zy
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mAi.RQ(this.f65341n);
        }
    });

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final int[] fontSizes = {5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 20, 24, 28, 32, 36, 40, 48, 56, 64, 72, 80, 96, 112, 144};

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy colorPopupViews = LazyKt.lazy(new Function0() { // from class: f0P.r4r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mAi.k(this.f66087n);
        }
    });

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Lazy sizePopupViews = LazyKt.lazy(new Function0() { // from class: f0P.Wq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mAi.kSg(this.f64952n);
        }
    });

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Lazy fontPopupViews = LazyKt.lazy(new Function0() { // from class: f0P.lEo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return mAi.dR0(this.f65755n);
        }
    });

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final fuX topBarLayoutChangelistener = new fuX();

    public static final class CN3 implements ColorPickerWidget.j {
        CN3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement t(mAi mai, int i2, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, KeyableKt.copyWithValueForTime(el.getFillColor(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(mai)), HI0.qf.t(i2)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -129, 127, null);
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(final int i2) {
            final mAi mai = mAi.this;
            HW.C.D(mai, new Function2() { // from class: f0P.IlB
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return mAi.CN3.t(mai, i2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    public static final class I28 implements ColorPickerWidget.n {
        I28() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            mAi mai = mAi.this;
            j jVar = new PropertyReference1Impl() { // from class: f0P.mAi.I28.j
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getFillColor();
                }
            };
            mai.W(i2, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar).toString());
        }
    }

    public static final class Ml implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(com.alightcreative.app.motion.fonts.CN3.HI((com.alightcreative.app.motion.fonts.w6) obj), com.alightcreative.app.motion.fonts.CN3.HI((com.alightcreative.app.motion.fonts.w6) obj2));
        }
    }

    public static final class Wre implements SeekBar.OnSeekBarChangeListener {
        Wre() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement rl(mAi mai, int i2, Scene scene, SceneElement elt) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(elt, "elt");
            return SceneElement.copy$default(elt, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(elt.getText(), null, mai.fontSizes[i2], null, 0, null, 29, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, final int i2, boolean z2) {
            SceneElement sceneElementNHg = HW.C.nHg(mAi.this);
            if (sceneElementNHg == null || !z2 || MathKt.roundToInt(sceneElementNHg.getText().getFontSize()) == i2) {
                return;
            }
            final mAi mai = mAi.this;
            HW.C.D(mai, new Function2() { // from class: f0P.Swk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return mAi.Wre.rl(mai, i2, (Scene) obj, (SceneElement) obj2);
                }
            });
            mAi.this.mYa(sceneElementNHg);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            mAi mai = mAi.this;
            mai.undoBatch = HW.C.xMQ(mai);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Ml.j jVar = mAi.this.undoBatch;
            if (jVar != null) {
                jVar.n();
            }
            mAi.this.undoBatch = null;
        }
    }

    public static final class fuX implements View.OnLayoutChangeListener {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(FrameLayout frameLayout, int i2, final mAi mai) {
            frameLayout.setPadding(0, i2, 0, 0);
            frameLayout.requestLayout();
            frameLayout.post(new Runnable() { // from class: f0P.Wg9
                @Override // java.lang.Runnable
                public final void run() {
                    mAi.fuX.J2(mai);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(int i2, int i3, int i5, int i7, int[] iArr, int[] iArr2, Rect rect, FrameLayout frameLayout, int i8) {
            return "topBarLayout: " + i2 + " " + i3 + " " + i5 + " " + i7 + " s=" + iArr[0] + "," + iArr[1] + " s=" + iArr2[0] + "," + iArr2[1] + " wframe=" + rect.top + " topPadding=" + frameLayout.getPaddingTop() + "->" + i8;
        }

        fuX() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, final int i2, final int i3, final int i5, final int i7, int i8, int i9, int i10, int i11) {
            Window window;
            View decorView;
            final FrameLayout frameLayout = mAi.this.topBarContainer;
            if (frameLayout == null) {
                return;
            }
            final int[] iArr = new int[2];
            final int[] iArr2 = new int[2];
            final Rect rect = new Rect();
            frameLayout.getLocationOnScreen(iArr);
            frameLayout.getLocationInWindow(iArr2);
            FragmentActivity activity = mAi.this.getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            final int i12 = rect.top - iArr[1];
            XoT.C.Uo(this, new Function0() { // from class: f0P.zTb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mAi.fuX.nr(i2, i3, i5, i7, iArr, iArr2, rect, frameLayout, i12);
                }
            });
            if (frameLayout.getPaddingTop() != i12) {
                final mAi mai = mAi.this;
                frameLayout.post(new Runnable() { // from class: f0P.zHc
                    @Override // java.lang.Runnable
                    public final void run() {
                        mAi.fuX.O(frameLayout, i12, mai);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(mAi mai) {
            mai.tFV();
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {
        n(Object obj) {
            super(2, obj, mAi.class, "onTextMoveGesture", "onTextMoveGesture(FF)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return Unit.INSTANCE;
        }

        public final void n(float f3, float f4) {
            ((mAi) this.receiver).fcU(f3, f4);
        }
    }

    public static final class w6 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement rl(Editable editable, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(el.getText(), editable.toString(), 0.0f, null, 0, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable s2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            HW.C.D(mAi.this, new Function2() { // from class: f0P.lC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return mAi.w6.rl(s2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    private final void Y() {
        this.popupOpen = false;
        tFV();
    }

    private final void qm() {
        this.popupOpen = true;
        tFV();
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String stringExtra;
        if (requestCode == 1) {
            HW.C.wTp(this, resultCode, data, true);
        } else if (requestCode == 2) {
            HW.C.wTp(this, resultCode, data, false);
        } else if (requestCode != 3) {
            super.onActivityResult(requestCode, resultCode, data);
        } else {
            if (resultCode == -1 && data != null && (stringExtra = data.getStringExtra("selectedFont")) != null) {
                pJg(com.alightcreative.app.motion.fonts.w6.f45792t.rl(stringExtra));
            }
            Org();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyledTextAlign.values().length];
            try {
                iArr[StyledTextAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyledTextAlign.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyledTextAlign.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyledTextAlign.JUSTIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement ER(StyledTextAlign styledTextAlign, Scene scene, SceneElement elt) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(elt, "elt");
        return SceneElement.copy$default(elt, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(elt.getText(), null, 0.0f, styledTextAlign, 0, null, 27, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
    }

    private final void GD(float height) {
        Context context;
        Window window;
        View decorView;
        FrameLayout frameLayout = this.topBarContainer;
        if (frameLayout == null || (context = getContext()) == null) {
            return;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        Rect rect = new Rect();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i3 = rect.top;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(layoutParams2);
        layoutParams3.height = ((int) HI0.afx.rl(context, height)) + (i3 - i2);
        HI0.afx.ck(context).updateViewLayout(frameLayout, layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HV(mAi mai, com.alightcreative.app.motion.fonts.w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mai.pJg(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Jk(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(el.getText(), null, 0.0f, null, i2, null, 23, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
    }

    private final void Org() {
        StyledText text;
        String font;
        StyledText text2;
        String font2;
        if (this.topBarContainer == null) {
            return;
        }
        SceneElement sceneElementNHg = HW.C.nHg(this);
        com.alightcreative.app.motion.fonts.w6 w6VarRl = null;
        com.alightcreative.app.motion.fonts.w6 w6VarRl2 = (sceneElementNHg == null || (text2 = sceneElementNHg.getText()) == null || (font2 = text2.getFont()) == null) ? null : com.alightcreative.app.motion.fonts.w6.f45792t.rl(font2);
        Set<String> favoriteFonts = com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteFonts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(favoriteFonts, 10));
        Iterator<T> it = favoriteFonts.iterator();
        while (it.hasNext()) {
            arrayList.add(com.alightcreative.app.motion.fonts.w6.f45792t.rl((String) it.next()));
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Ml());
        List listTake = CollectionsKt.take(listSortedWith, 3);
        List listT = com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedFonts().t();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT, 10));
        Iterator it2 = listT.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.alightcreative.app.motion.fonts.w6.f45792t.rl((String) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!listTake.contains((com.alightcreative.app.motion.fonts.w6) obj)) {
                arrayList3.add(obj);
            }
        }
        int size = listSortedWith.isEmpty() ? arrayList3.size() : RangesKt.coerceAtLeast(6 - listSortedWith.size(), 3);
        List listTake2 = (w6VarRl2 == null || CollectionsKt.plus((Collection) CollectionsKt.take(arrayList3, size), (Iterable) listTake).contains(w6VarRl2)) ? CollectionsKt.take(arrayList3, size) : CollectionsKt.plus((Collection) CollectionsKt.listOf(w6VarRl2), (Iterable) CollectionsKt.take(arrayList3, RangesKt.coerceAtLeast(size - 1, 0)));
        List listPlus = CollectionsKt.plus((Collection) listTake2, (Iterable) listSortedWith);
        RecyclerView recyclerView = xg().f9173O;
        int size2 = listTake2.size();
        SceneElement sceneElementNHg2 = HW.C.nHg(this);
        if (sceneElementNHg2 != null && (text = sceneElementNHg2.getText()) != null && (font = text.getFont()) != null) {
            w6VarRl = com.alightcreative.app.motion.fonts.w6.f45792t.rl(font);
        }
        recyclerView.setAdapter(new ydh(listPlus, size2, w6VarRl, new Function1() { // from class: f0P.w4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return mAi.HV(this.f66284n, (com.alightcreative.app.motion.fonts.w6) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.KH RQ(mAi mai) {
        FrameLayout frameLayout = mai.topBarContainer;
        Intrinsics.checkNotNull(frameLayout);
        return SJ0.KH.n(frameLayout.findViewById(2131363924));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Rl(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.translatedBy(el.getTransform(), (-(i2 - el.getText().getWrapWidth())) / 2.0f, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(el.getText(), null, 0.0f, null, i2, null, 23, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097217, 127, null);
    }

    private final void a63(com.alightcreative.app.motion.fonts.Ml selectedFont) {
        String missingTypefaceDisplayName;
        String strHI;
        if (this.topBarContainer == null) {
            return;
        }
        String str = "?";
        if (selectedFont == null) {
            xg().Uo.setText("?");
            return;
        }
        com.alightcreative.app.motion.fonts.w6 w6VarRl = selectedFont.rl();
        if (w6VarRl == null || (strHI = com.alightcreative.app.motion.fonts.CN3.HI(w6VarRl)) == null) {
            AMTypefaceError aMTypefaceErrorN = selectedFont.n();
            AMTypefaceError.AMMissingTypefaceError aMMissingTypefaceError = aMTypefaceErrorN instanceof AMTypefaceError.AMMissingTypefaceError ? (AMTypefaceError.AMMissingTypefaceError) aMTypefaceErrorN : null;
            if (aMMissingTypefaceError != null && (missingTypefaceDisplayName = aMMissingTypefaceError.getMissingTypefaceDisplayName()) != null) {
                str = "⚠️" + missingTypefaceDisplayName;
            }
        } else {
            str = strHI;
        }
        xg().Uo.setText(str);
        xg().J2.setText(str);
        com.alightcreative.app.motion.fonts.w6 w6VarRl2 = selectedFont.rl();
        Typeface typefaceS = w6VarRl2 != null ? com.alightcreative.app.motion.fonts.CN3.S(w6VarRl2, 15L) : null;
        if (typefaceS != null) {
            xg().Uo.setTypeface(typefaceS);
            xg().J2.setTypeface(typefaceS);
            return;
        }
        xg().Uo.setTypeface(null);
        xg().J2.setTypeface(null);
        com.alightcreative.app.motion.fonts.w6 w6VarRl3 = selectedFont.rl();
        if (w6VarRl3 != null) {
            com.alightcreative.app.motion.fonts.CN3.Z(w6VarRl3, new Function1() { // from class: f0P.L2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return mAi.F(this.f64439n, (Result) obj);
                }
            });
        }
    }

    private final List eTf() {
        return (List) this.sizePopupViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement eWT(float f3, float f4, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.translatedBy(el.getTransform(), f3, f4), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fcU(final float dx, final float dy) {
        HW.C.D(this, new Function2() { // from class: f0P.gs
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return mAi.eWT(dx, dy, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hRu(mAi mai, View view) {
        if (!mai.analyticsFontSizeReported) {
            mai.analyticsFontSizeReported = true;
            mai.ijL().n(new j.fuX("text_size", null, 2, null));
        }
        mai.qm();
        Iterator it = mai.eTf().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lLA(mAi mai, View view) {
        if (!mai.analyticsFontSpinnerReported) {
            mai.analyticsFontSpinnerReported = true;
            mai.ijL().n(new j.fuX("text_font_spinner", null, 2, null));
        }
        Iterator it = mai.m().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        mai.qm();
    }

    private final List m() {
        return (List) this.fontPopupViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mYa(SceneElement el) {
        if (this.topBarContainer == null) {
            return;
        }
        xg().Ik.setColor(ColorKt.toInt((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), SceneElementKt.fractionalTime(el, HW.C.WPU(this)))));
        xg().HI.setText(MathKt.roundToInt(el.getText().getFontSize()) + "pt");
        xg().ty.setText(MathKt.roundToInt(el.getText().getFontSize()) + "pt");
        xg().az.setMax(this.fontSizes.length + (-1));
        SeekBar seekBar = xg().az;
        int[] iArr = this.fontSizes;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] >= MathKt.roundToInt(el.getText().getFontSize())) {
                break;
            } else {
                i2++;
            }
        }
        seekBar.setProgress(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement n1(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.translatedBy(el.getTransform(), (i2 - el.getText().getWrapWidth()) / 2.0f, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(el.getText(), null, 0.0f, null, i2, null, 23, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097217, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement ofS(String str, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(el.getText(), null, 0.0f, null, 0, str, 15, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
    }

    private final List piY() {
        return (List) this.colorPopupViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tFV() {
        if (this.popupOpen) {
            GD(170.0f);
        } else {
            GD(42.0f);
        }
    }

    private final SJ0.KH xg() {
        return (SJ0.KH) this.topBarBinding.getValue();
    }

    private final SJ0.OA z() {
        SJ0.OA oa = this._binding;
        Intrinsics.checkNotNull(oa);
        return oa;
    }

    public final QmE.iF ijL() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // yc.Buf
    public boolean n(yc.a motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return false;
        }
        Vector2D vector2DRl = motionEvent.rl();
        float x2 = vector2DRl.getX();
        float y2 = vector2DRl.getY();
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            this.undoBatch = HW.C.xMQ(this);
            this.prevTouchX = x2;
            this.prevTouchY = y2;
            this.inGesture = true;
            final Vector2D vector2DTransformPoint = TransformKt.transformPoint(sceneElementNHg.getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this))), new Vector2D((sceneElementNHg.getText().getAlign() == StyledTextAlign.RIGHT ? -sceneElementNHg.getText().getWrapWidth() : sceneElementNHg.getText().getWrapWidth()) / 2.0f, 0.0f));
            final Vector2D vector2D = new Vector2D(x2, y2);
            XoT.C.Uo(this, new Function0() { // from class: f0P.qw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mAi.C(vector2DTransformPoint, vector2D);
                }
            });
            if (GeometryKt.getLength(GeometryKt.minus(vector2DTransformPoint, vector2D)) < 100.0f) {
                this.gestureHandler = new Function2() { // from class: f0P.ca1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mAi.Mx(this.f65455n, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    }
                };
                SceneHolder sceneHolderE = HW.C.e(this);
                if (sceneHolderE != null) {
                    sceneHolderE.setEditMode(2131362633);
                }
            } else {
                this.gestureHandler = new n(this);
                SceneHolder sceneHolderE2 = HW.C.e(this);
                if (sceneHolderE2 != null) {
                    sceneHolderE2.setEditMode(2131362632);
                }
            }
        } else if (actionMasked == 1) {
            this.inGesture = false;
            this.gestureHandler = null;
            Ml.j jVar = this.undoBatch;
            if (jVar != null) {
                jVar.n();
            }
            this.undoBatch = null;
            SceneHolder sceneHolderE3 = HW.C.e(this);
            if (sceneHolderE3 != null) {
                sceneHolderE3.setEditMode(2131362631);
            }
        } else if (actionMasked == 2 && this.inGesture) {
            float f3 = x2 - this.prevTouchX;
            float f4 = y2 - this.prevTouchY;
            this.prevTouchX = x2;
            this.prevTouchY = y2;
            Function2 function2 = this.gestureHandler;
            if (function2 != null) {
                function2.invoke(Float.valueOf(f3), Float.valueOf(f4));
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.OA.t(inflater, container, false);
        ConstraintLayout root = z().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        WindowManager windowManagerCk;
        if (this.topBarContainer != null) {
            Context context = getContext();
            if (context != null && (windowManagerCk = HI0.afx.ck(context)) != null) {
                windowManagerCk.removeView(this.topBarContainer);
            }
            this.topBarContainer = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        Po6(view);
        z().rl.setText(sceneElementNHg.getText().getText());
        z().rl.addTextChangedListener(new w6());
        mYa(sceneElementNHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C(Vector2D vector2D, Vector2D vector2D2) {
        return "onPreviewViewTouch: handlePos=" + vector2D + " touchPos=" + vector2D2 + " dist=" + GeometryKt.getLength(GeometryKt.minus(vector2D, vector2D2)) + " diff=" + GeometryKt.minus(vector2D, vector2D2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EWS(mAi mai, View view) {
        mai.Y();
        Iterator it = mai.m().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        FragmentActivity fragmentActivityRequireActivity = mai.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
        Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) FontBrowserActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(mai, intent, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(final mAi mai, final Result result) {
        mai.xg().Uo.post(new Runnable() { // from class: f0P.FD
            @Override // java.lang.Runnable
            public final void run() {
                mAi.QZ6(this.f64195n, result);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(mAi mai, View view) {
        mai.Po6(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void How(mAi mai, View view) {
        if (mai.xg().f9176r.getVisibility() == 0) {
            mai.Y();
            Iterator it = mai.piY().iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
            return;
        }
        mai.qm();
        Iterator it2 = mai.piY().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(mAi mai, View view) {
        if (mai.isAdded()) {
            mai.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mx(mAi mai, float f3, float f4) {
        mai.ul(f3);
        return Unit.INSTANCE;
    }

    private final void Po6(View view) {
        Context context;
        int i2;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (context = getContext()) != null && getActivity() != null && this.topBarContainer == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.topBarContainer = frameLayout;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000, R.attr.checkMark, -3);
            layoutParams.gravity = 8388659;
            layoutParams.width = -1;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams.height = (int) HI0.afx.rl(context2, 42.0f);
            HI0.afx.ck(context).addView(this.topBarContainer, layoutParams);
            HI0.o7q.xMQ(frameLayout, 2131558537, true);
            frameLayout.addOnLayoutChangeListener(this.topBarLayoutChangelistener);
            ImageButton imageButton = xg().f9177t;
            int i3 = j.$EnumSwitchMapping$0[sceneElementNHg.getText().getAlign().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new NotImplementedError(null, 1, null);
                    }
                    i2 = 2131231069;
                } else {
                    i2 = 2131231067;
                }
            } else {
                i2 = 2131231068;
            }
            imageButton.setImageResource(i2);
            xg().f9177t.setOnClickListener(new View.OnClickListener() { // from class: f0P.BDy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.tUK(this.f64082n, view2);
                }
            });
            a63(com.alightcreative.app.motion.fonts.w6.f45792t.t(sceneElementNHg.getText().getFont()));
            xg().f9173O.setLayoutManager(new LinearLayoutManager(context, 0, false));
            Org();
            xg().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.At8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.lLA(this.f64080n, view2);
                }
            });
            xg().KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.exX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.EWS(this.f65529n, view2);
                }
            });
            xg().HI.setOnClickListener(new View.OnClickListener() { // from class: f0P.f4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.hRu(this.f65535n, view2);
                }
            });
            xg().ty.setOnClickListener(new View.OnClickListener() { // from class: f0P.mV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.UhV(this.f65785n, view2);
                }
            });
            xg().gh.setOnClickListener(new View.OnClickListener() { // from class: f0P.ONK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.i(this.f64554n, view2);
                }
            });
            xg().az.setOnSeekBarChangeListener(new Wre());
            xg().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.rJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.K(this.f66105n, view2);
                }
            });
            xg().f9176r.setOnColorChangeListener(new CN3());
            xg().f9176r.setSceneHolder(HW.C.e(this));
            xg().f9176r.setPalletteClickListener(new I28());
            xg().Ik.setColorWidget(xg().f9176r);
            xg().Ik.setOnClickListener(new View.OnClickListener() { // from class: f0P.JK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    mAi.How(this.f64392n, view2);
                }
            });
            mYa(sceneElementNHg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QZ6(mAi mai, Result result) {
        TextView textView = mai.xg().Uo;
        Object value = result.getValue();
        Object obj = null;
        if (Result.m319isFailureimpl(value)) {
            value = null;
        }
        textView.setTypeface((Typeface) value);
        TextView textView2 = mai.xg().J2;
        Object value2 = result.getValue();
        if (!Result.m319isFailureimpl(value2)) {
            obj = value2;
        }
        textView2.setTypeface((Typeface) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UhV(mAi mai, View view) {
        mai.Y();
        Iterator it = mai.eTf().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(int color, String lens) {
        Pair[] pairArr = {TuplesKt.to("CURRENT_COLOR", Integer.valueOf(color)), TuplesKt.to("COLOR_LENS", lens)};
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 2);
        Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dR0(mAi mai) {
        return CollectionsKt.listOf((Object[]) new View[]{mai.xg().gh, mai.xg().f9173O, mai.xg().nr, mai.xg().J2, mai.xg().KN});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(mAi mai, View view) {
        Iterator it = mai.eTf().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        Iterator it2 = mai.m().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(4);
        }
        Iterator it3 = mai.piY().iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(4);
        }
        mai.Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(mAi mai) {
        return CollectionsKt.listOf((Object[]) new View[]{mai.xg().f9176r, mai.xg().gh});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List kSg(mAi mai) {
        return CollectionsKt.listOf((Object[]) new View[]{mai.xg().mUb, mai.xg().qie, mai.xg().az, mai.xg().ty, mai.xg().gh});
    }

    private final void pJg(com.alightcreative.app.motion.fonts.w6 amTypeface) {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            final String string = amTypeface.toString();
            if (!Intrinsics.areEqual(sceneElementNHg.getText().getFont(), string)) {
                QmE.iF iFVarIjL = ijL();
                Bundle bundle = new Bundle();
                gP.o oVarT = amTypeface.n().t();
                if (Intrinsics.areEqual(oVarT, gP.qz.f67557n)) {
                    bundle.putString("source", "gfont");
                    bundle.putString("typeface", com.alightcreative.app.motion.fonts.CN3.HI(amTypeface));
                } else if (oVarT instanceof gP.Pl) {
                    bundle.putString("source", ImagesContract.LOCAL);
                    byte[] bArrAz = HI0.gnv.az(com.alightcreative.app.motion.fonts.CN3.HI(amTypeface) + ImagesContract.LOCAL);
                    Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
                    bundle.putString("typeface", "import_" + StringsKt.take(HI0.gnv.o(bArrAz), 6));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.INSTANCE;
                iFVarIjL.n(new j.fuX("text_font_change", bundle));
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                jVar.setRecentlyUsedFonts(com.alightcreative.app.motion.persist.n.J2(jVar.getRecentlyUsedFonts(), string));
                a63(com.alightcreative.app.motion.fonts.Ml.f45785t.rl(amTypeface));
                HW.C.D(this, new Function2() { // from class: f0P.zm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mAi.ofS(string, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tUK(mAi mai, View view) {
        final StyledTextAlign styledTextAlign;
        int i2;
        SceneElement sceneElementNHg = HW.C.nHg(mai);
        if (sceneElementNHg == null) {
            return;
        }
        if (!mai.analyticsAlignReported) {
            mai.analyticsAlignReported = true;
            mai.ijL().n(new j.fuX("text_align", null, 2, null));
        }
        StyledTextAlign align = sceneElementNHg.getText().getAlign();
        int[] iArr = j.$EnumSwitchMapping$0;
        int i3 = iArr[align.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new NotImplementedError(null, 1, null);
                }
                styledTextAlign = StyledTextAlign.LEFT;
            } else {
                styledTextAlign = StyledTextAlign.RIGHT;
            }
        } else {
            styledTextAlign = StyledTextAlign.CENTER;
        }
        HW.C.D(mai, new Function2() { // from class: f0P.wE
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return mAi.ER(styledTextAlign, (Scene) obj, (SceneElement) obj2);
            }
        });
        ImageButton imageButton = mai.xg().f9177t;
        int i5 = iArr[styledTextAlign.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new NotImplementedError(null, 1, null);
                }
                i2 = 2131231069;
            } else {
                i2 = 2131231067;
            }
        } else {
            i2 = 2131231068;
        }
        imageButton.setImageResource(i2);
    }

    private final void ul(float dx) {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            int i2 = j.$EnumSwitchMapping$0[sceneElementNHg.getText().getAlign().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new NotImplementedError(null, 1, null);
                    }
                    final int iRoundToInt = MathKt.roundToInt(RangesKt.coerceAtLeast(sceneElementNHg.getText().getWrapWidth() - dx, 50.0f));
                    if (iRoundToInt != sceneElementNHg.getText().getWrapWidth()) {
                        HW.C.D(this, new Function2() { // from class: f0P.FMq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return mAi.Rl(iRoundToInt, (Scene) obj, (SceneElement) obj2);
                            }
                        });
                        return;
                    }
                    return;
                }
                final int iRoundToInt2 = MathKt.roundToInt(RangesKt.coerceAtLeast(sceneElementNHg.getText().getWrapWidth() + (dx * 2), 50.0f));
                if (iRoundToInt2 != sceneElementNHg.getText().getWrapWidth()) {
                    HW.C.D(this, new Function2() { // from class: f0P.WO
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return mAi.Jk(iRoundToInt2, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                    return;
                }
                return;
            }
            final int iRoundToInt3 = MathKt.roundToInt(RangesKt.coerceAtLeast(sceneElementNHg.getText().getWrapWidth() + dx, 50.0f));
            if (iRoundToInt3 != sceneElementNHg.getText().getWrapWidth()) {
                HW.C.D(this, new Function2() { // from class: f0P.zK
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mAi.n1(iRoundToInt3, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }
        }
    }

    @Override // yc.H
    public void nr() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            mYa(sceneElementNHg);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final View view = getView();
        if (view != null) {
            z().rl.requestFocus();
            EditTextEx editText = z().rl;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            HI0.o7q.ck(editText);
            view.post(new Runnable() { // from class: f0P.NXM
                @Override // java.lang.Runnable
                public final void run() {
                    mAi.G7(this.f64516n, view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (getView() != null) {
            EditTextEx editText = z().rl;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            HI0.o7q.KN(editText);
        }
        super.onStop();
    }

    @Override // yc.QhI
    public int t() {
        return 2131362631;
    }
}
