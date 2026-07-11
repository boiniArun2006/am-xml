package f0P;

import LdY.Ml;
import QmE.j;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.PointType;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.XYZType;
import com.alightcreative.widget.ValueSpinner;
import com.safedk.android.analytics.AppLovinBridge;
import com.vungle.ads.internal.protos.Sdk;
import f0P.D9M;
import f0P.Ny;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001V\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0007H\u0015¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0012H\u0014¢\u0006\u0004\b0\u0010\u0016J\u0017\u00101\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010HR\u0016\u0010K\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010JR\u0016\u0010L\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010O\u001a\u00020\u00128\u0014X\u0094D¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010!R\"\u0010U\u001a\u00020\u00198\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010JR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u0010^R\u0014\u0010c\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bb\u0010RR\u0014\u0010e\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bd\u0010R¨\u0006f"}, d2 = {"Lf0P/oC;", "Lyc/QhI;", "Lf0P/NO;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Lcom/alightcreative/app/motion/scene/SceneElement;", "originalElement", "", "Lb1P/n;", "tdZ", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/List;", "ex", "GRh", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "iV", "()Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "", "inputFieldNumber", "", "Of6", "(I)V", "jX", "Qg8", "", "isWidth", "Lf0P/D9M;", "scaleSnapBuilder", "iu", "(ZLf0P/D9M;)V", "JI", "t", "()I", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "tabId", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "D", "(Landroid/view/View;)V", "LSJ0/S;", "M", "Lkotlin/Lazy;", "mx", "()LSJ0/S;", "contentBinding", "LkgE/fuX;", "FX", "LkgE/fuX;", "lS", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LLdY/Ml$j;", "B", "LLdY/Ml$j;", "undoBatch", "J", "Ljava/lang/Boolean;", "showingLinkedScaleUI", "Z", "trackingTouch", "I", "touchSlop", "logAdjustZ", "GR", "M7", "layoutResource", "Nxk", "v", "()Z", "setAutoTabSpacing", "(Z)V", "autoTabSpacing", "f0P/oC$qz", "Y", "Lf0P/oC$qz;", "locationLabelTouchListener", "k", "animSerial", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "Lf0P/Ny$j;", "tabs", "eF", "showOverflow", "tUK", "enableOverflow", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMoveTransformFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveTransformFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/MoveTransformFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 5 UserParameter.kt\ncom/alightcreative/app/motion/scene/userparam/UserParameterKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1356:1\n148#2:1357\n143#2:1358\n124#2:1359\n148#2:1360\n143#2:1361\n124#2:1362\n148#2:1363\n143#2:1364\n124#2:1365\n148#2:1366\n143#2:1367\n124#2:1368\n148#2:1369\n143#2:1370\n124#2:1371\n148#2:1372\n143#2:1373\n124#2:1374\n774#3:1375\n865#3,2:1376\n774#3:1378\n865#3,2:1379\n1557#3:1381\n1628#3,3:1382\n774#3:1385\n865#3,2:1386\n1863#3,2:1388\n1863#3,2:1390\n1863#3,2:2026\n1863#3,2:2028\n1863#3,2:2030\n1863#3,2:2032\n1863#3,2:2034\n1863#3,2:2036\n1368#3:2040\n1454#3,5:2041\n1368#3:2046\n1454#3,5:2047\n1368#3:2052\n1454#3,5:2053\n50#4,9:1392\n68#4,23:1556\n92#4,7:1584\n59#4:1591\n50#4,9:1592\n68#4,23:1756\n92#4,7:1784\n59#4:1791\n58#4:1792\n68#4,23:1948\n92#4,7:1976\n59#4:1983\n61#4,30:1984\n92#4,7:2019\n513#5,31:1401\n556#5:1432\n544#5,25:1433\n588#5:1458\n569#5,33:1459\n624#5:1492\n602#5,63:1493\n513#5,31:1601\n556#5:1632\n544#5,25:1633\n588#5:1658\n569#5,33:1659\n624#5:1692\n602#5,63:1693\n513#5,31:1793\n556#5:1824\n544#5,25:1825\n588#5:1850\n569#5,33:1851\n624#5:1884\n602#5,63:1885\n30#6:1579\n30#6:1779\n30#6:1971\n30#6:2014\n53#7,3:1580\n53#7,3:1780\n53#7,3:1972\n53#7,3:2015\n33#8:1583\n33#8:1783\n33#8:1975\n33#8:2018\n114#9:2038\n105#9:2039\n1#10:2058\n*S KotlinDebug\n*F\n+ 1 MoveTransformFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/MoveTransformFragment\n*L\n122#1:1357\n122#1:1358\n122#1:1359\n123#1:1360\n123#1:1361\n123#1:1362\n126#1:1363\n126#1:1364\n126#1:1365\n128#1:1366\n128#1:1367\n128#1:1368\n131#1:1369\n131#1:1370\n131#1:1371\n136#1:1372\n136#1:1373\n136#1:1374\n183#1:1375\n183#1:1376,2\n222#1:1378\n222#1:1379,2\n255#1:1381\n255#1:1382,3\n255#1:1385\n255#1:1386,2\n526#1:1388,2\n542#1:1390,2\n968#1:2026,2\n982#1:2028,2\n1002#1:2030,2\n1042#1:2032,2\n1043#1:2034,2\n1168#1:2036,2\n422#1:2040\n422#1:2041,5\n451#1:2046\n451#1:2047,5\n480#1:2052\n480#1:2053,5\n755#1:1392,9\n755#1:1556,23\n755#1:1584,7\n755#1:1591\n777#1:1592,9\n777#1:1756,23\n777#1:1784,7\n777#1:1791\n800#1:1792\n800#1:1948,23\n800#1:1976,7\n800#1:1983\n845#1:1984,30\n845#1:2019,7\n755#1:1401,31\n755#1:1432\n755#1:1433,25\n755#1:1458\n755#1:1459,33\n755#1:1492\n755#1:1493,63\n777#1:1601,31\n777#1:1632\n777#1:1633,25\n777#1:1658\n777#1:1659,33\n777#1:1692\n777#1:1693,63\n800#1:1793,31\n800#1:1824\n800#1:1825,25\n800#1:1850\n800#1:1851,33\n800#1:1884\n800#1:1885,63\n755#1:1579\n777#1:1779\n800#1:1971\n845#1:2014\n755#1:1580,3\n777#1:1780,3\n800#1:1972,3\n845#1:2015,3\n755#1:1583\n777#1:1783\n800#1:1975\n845#1:2018\n319#1:2038\n330#1:2039\n*E\n"})
public final class oC extends com.alightcreative.app.motion.activities.edit.fragments.w6 implements yc.QhI {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean trackingTouch;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean logAdjustZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int touchSlop;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int animSerial;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.xH
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return oC.wKY(this.f66325n);
        }
    });

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Boolean showingLinkedScaleUI = Boolean.FALSE;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558604;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private boolean autoTabSpacing = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final qz locationLabelTouchListener = new qz();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    /* synthetic */ class Pl extends FunctionReferenceImpl implements Function2 {
        Pl(Object obj) {
            super(2, obj, oC.class, "snapHandler", "snapHandler(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(Scene p0, SceneElement p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((oC) this.receiver).tdZ(p0, p1);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class QJ implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f65839O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f65840n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ oC f65841r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f65842t;

        public QJ(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, oC oCVar) {
            this.f65840n = objectRef;
            this.f65842t = uGc;
            this.f65839O = obj;
            this.J2 = userParameter;
            this.f65841r = oCVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f65840n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f65842t);
            }
            Object obj = this.f65839O;
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
            SceneElement sceneElementNHg = HW.C.nHg(this.f65841r);
            if (sceneElementNHg != null) {
                float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f65841r));
                SceneHolder sceneHolderE = HW.C.e(this.f65841r);
                if (sceneHolderE != null) {
                    KeyableTransform transform = sceneElementNHg.getTransform();
                    Keyable<Float> rotation = sceneElementNHg.getTransform().getRotation();
                    Scene sceneIF = HW.C.iF(this.f65841r);
                    Intrinsics.checkNotNull(sceneIF);
                    sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, null, null, null, KeyableKt.copyWithValueForTime(rotation, sceneIF, sceneElementNHg, fFractionalTime, Float.valueOf(-fFloatValue)), 0.0f, 0.0f, null, null, false, 503, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                }
                this.f65841r.s7N();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class UGc implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Vector2D f65844t;

        static final class j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Vector2D f65845n;

            j(Vector2D vector2D) {
                this.f65845n = vector2D;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Vector2D invoke(Vector2D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Vector2D vector2D = new Vector2D(this.f65845n.getX() * 0.017453292f, this.f65845n.getY() * 0.017453292f);
                if (Math.abs(vector2D.getX()) < 0.01f) {
                    vector2D = Vector2D.copy$default(vector2D, 0.0f, 0.0f, 2, null);
                }
                return Math.abs(vector2D.getY()) < 0.01f ? Vector2D.copy$default(vector2D, 0.0f, 0.0f, 1, null) : vector2D;
            }
        }

        UGc(Vector2D vector2D) {
            this.f65844t = vector2D;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, null, 0.0f, 0.0f, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getSkew(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oC.this)), new j(this.f65844t)), false, 383, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Xo extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f65847n;
        final /* synthetic */ oC rl;

        Xo(int i2, oC oCVar) {
            this.f65847n = i2;
            this.rl = oCVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.f65847n == this.rl.animSerial) {
                this.rl.mx().aYN.setVisibility(4);
                this.rl.mx().WPU.setVisibility(4);
                this.rl.mx().f9300S.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: f0P.oC$c, reason: case insensitive filesystem */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class C2063c implements Function2 {
        final /* synthetic */ float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ float f65849O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f65850Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Vector2D f65852o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f65853r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f65854t;

        /* JADX INFO: renamed from: f0P.oC$c$j */
        static final class j implements Function1 {
            final /* synthetic */ float J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ float f65855O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ SceneElement f65856n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ float f65857o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f65858r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ oC f65859t;

            /* JADX INFO: renamed from: f0P.oC$c$j$j, reason: collision with other inner class name */
            static final class C0897j implements Function0 {
                final /* synthetic */ float J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ float f65860O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ float f65861n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ float f65862r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ float f65863t;

                C0897j(float f3, float f4, float f5, float f6, float f7) {
                    this.f65861n = f3;
                    this.f65863t = f4;
                    this.f65860O = f5;
                    this.J2 = f6;
                    this.f65862r = f7;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    float f3 = this.f65861n;
                    float f4 = this.f65863t;
                    float f5 = this.f65860O;
                    float f6 = this.J2;
                    float f7 = this.f65862r;
                    return "cameraUpdate: oldValue=" + f3 + ", newValue=" + f4 + ", zoom=" + f5 + " largeDim=" + f6 + " newFov=" + f7 + " newLargeDim=" + CameraElementKt.calcCameraLargeDimension(f7, f5);
                }
            }

            j(SceneElement sceneElement, oC oCVar, float f3, float f4, float f5, float f6) {
                this.f65856n = sceneElement;
                this.f65859t = oCVar;
                this.f65855O = f3;
                this.J2 = f4;
                this.f65858r = f5;
                this.f65857o = f6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).floatValue());
            }

            public final Float n(float f3) {
                float f4 = -((Vector3D) KeyableKt.valueAtTime(this.f65856n.getTransform().getLocation(), HW.C.aYN(this.f65859t))).getZ();
                float fCalcCameraLargeDimension = CameraElementKt.calcCameraLargeDimension(this.f65855O, f4);
                float fCalcCameraFovForSize = CameraElementKt.calcCameraFovForSize(f4, ((this.J2 - this.f65858r) * this.f65857o) + fCalcCameraLargeDimension);
                XoT.C.Uo(this.f65859t, new C0897j(this.f65858r, this.J2, f4, fCalcCameraLargeDimension, fCalcCameraFovForSize));
                return Float.valueOf(fCalcCameraFovForSize);
            }
        }

        /* JADX INFO: renamed from: f0P.oC$c$n */
        static final class n implements Function1 {
            final /* synthetic */ float J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Vector2D f65864O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ SceneElement f65865n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ float f65866o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f65867r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Scene f65868t;

            n(SceneElement sceneElement, Scene scene, Vector2D vector2D, float f3, float f4, float f5) {
                this.f65865n = sceneElement;
                this.f65868t = scene;
                this.f65864O = vector2D;
                this.J2 = f3;
                this.f65867r = f4;
                this.f65866o = f5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Vector2D invoke(Vector2D vector2D) {
                Intrinsics.checkNotNullParameter(vector2D, "<unused var>");
                Vector2D vector2DTimes = GeometryKt.times(SceneElementKt.boundsInScene(this.f65865n, this.f65868t).getSize(), this.f65864O);
                float x2 = vector2DTimes.getX();
                float y2 = vector2DTimes.getY();
                float f3 = this.J2 - this.f65867r;
                return GeometryKt.coerceAtLeast(GeometryKt.times(this.f65864O, x2 > y2 ? MathKt.roundToInt((f3 * this.f65866o) + x2) / x2 : MathKt.roundToInt((f3 * this.f65866o) + y2) / y2), 1.0E-7f, 1.0E-7f);
            }
        }

        /* JADX INFO: renamed from: f0P.oC$c$w6 */
        static final class w6 implements Function1 {
            final /* synthetic */ float J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Vector2D f65869O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ SceneElement f65870n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f65871o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f65872r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Scene f65873t;

            w6(SceneElement sceneElement, Scene scene, Vector2D vector2D, float f3, float f4, boolean z2) {
                this.f65870n = sceneElement;
                this.f65873t = scene;
                this.f65869O = vector2D;
                this.J2 = f3;
                this.f65872r = f4;
                this.f65871o = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Vector2D invoke(Vector2D vector2D) {
                Intrinsics.checkNotNullParameter(vector2D, "<unused var>");
                Vector2D vector2DTimes = GeometryKt.times(SceneElementKt.boundsInScene(this.f65870n, this.f65873t).getSize(), this.f65869O);
                float x2 = vector2DTimes.getX();
                float y2 = vector2DTimes.getY();
                float f3 = this.J2 - this.f65872r;
                boolean z2 = this.f65871o;
                float f4 = z2 ? f3 + x2 : f3 + y2;
                return GeometryKt.coerceAtLeast(GeometryKt.times(this.f65869O, z2 ? new Vector2D(f4 / x2, 1.0f) : new Vector2D(1.0f, f4 / y2)), 1.0E-7f, 1.0E-7f);
            }
        }

        C2063c(float f3, float f4, float f5, float f6, Vector2D vector2D, boolean z2) {
            this.f65854t = f3;
            this.f65849O = f4;
            this.J2 = f5;
            this.f65853r = f6;
            this.f65852o = vector2D;
            this.f65850Z = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(el, "el");
            if (!el.getTransform().getLockAspectRatio()) {
                return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getScale(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oC.this)), new w6(el, scene, this.f65852o, this.f65849O, this.J2, this.f65850Z)), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
            if (el.getType() != SceneElementType.Camera) {
                return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getScale(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oC.this)), new n(el, scene, this.f65852o, this.f65849O, this.J2, this.f65853r)), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
            CameraProperties cameraProperties = el.getCameraProperties();
            Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(oC.this), new j(el, oC.this, this.f65854t, this.f65849O, this.J2, this.f65853r));
            Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class eO implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f65874O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f65875n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ oC f65876r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f65877t;

        public eO(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, oC oCVar) {
            this.f65875n = objectRef;
            this.f65877t = uGc;
            this.f65874O = obj;
            this.J2 = userParameter;
            this.f65876r = oCVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Vector3D vector3D;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f65875n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f65877t);
            }
            Object obj = this.f65874O;
            UserParameter userParameter = this.J2;
            if (obj instanceof Quaternion) {
                Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                if (objFromEulerAngles == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                }
                vector3D = (Vector3D) objFromEulerAngles;
            } else if (obj instanceof Vector2D) {
                vector3D = (Vector3D) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
            } else if (obj instanceof Vector3D) {
                vector3D = new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
            } else if (!(obj instanceof Float)) {
                Object obj2 = valueList.get(0);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                }
                vector3D = (Vector3D) obj2;
            } else if (userParameter instanceof UserParameter.Spinner) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                vector3D = (Vector3D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
            } else if (userParameter instanceof UserParameter.Slider) {
                vector3D = (Vector3D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
            } else {
                Object obj3 = valueList.get(0);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                }
                vector3D = (Vector3D) obj3;
            }
            SceneElement sceneElementNHg = HW.C.nHg(this.f65876r);
            if (sceneElementNHg != null) {
                float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f65876r));
                KeyableKt.valueAtTime(sceneElementNHg.getTransform().getLocation(), fFractionalTime);
                SceneHolder sceneHolderE = HW.C.e(this.f65876r);
                if (sceneHolderE != null) {
                    KeyableTransform transform = sceneElementNHg.getTransform();
                    Keyable<Vector3D> location = sceneElementNHg.getTransform().getLocation();
                    Scene sceneIF = HW.C.iF(this.f65876r);
                    Intrinsics.checkNotNull(sceneIF);
                    sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, KeyableKt.copyWithComputedValueForTime(location, sceneIF, sceneElementNHg, fFractionalTime, new z(vector3D)), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                }
                this.f65876r.s7N();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class l3D implements Function1 {
        final /* synthetic */ boolean E2;
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f65880O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ float f65881S;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Scene f65882X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ float f65883Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ D9M f65884e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Vector2D f65885g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f65886n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f65887o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ oC f65888r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f65889t;

        public l3D(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, oC oCVar, float f3, float f4, float f5, Vector2D vector2D, boolean z2, D9M d9m, Scene scene) {
            this.f65886n = objectRef;
            this.f65889t = uGc;
            this.f65880O = obj;
            this.J2 = userParameter;
            this.f65888r = oCVar;
            this.f65887o = f3;
            this.f65883Z = f4;
            this.f65881S = f5;
            this.f65885g = vector2D;
            this.E2 = z2;
            this.f65884e = d9m;
            this.f65882X = scene;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v15, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            SceneElement sceneElementNHg;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f65886n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f65889t);
            }
            Object obj = this.f65880O;
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
            oC oCVar = this.f65888r;
            HW.C.D(oCVar, oCVar.new C2063c(this.f65887o, fFloatValue, this.f65883Z, this.f65881S, this.f65885g, this.E2));
            SceneHolder sceneHolderE = HW.C.e(this.f65888r);
            if (sceneHolderE == null || (sceneElementNHg = HW.C.nHg(this.f65888r)) == null) {
                return;
            }
            List listN = this.f65884e.n(D9M.n.f64130n, this.f65882X, sceneElementNHg, HW.C.aYN(this.f65888r), HW.C.ck(this.f65888r));
            SceneSelection selection = sceneHolderE.getSelection();
            ArrayList arrayList = new ArrayList();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((b1P.n) it.next()).t());
            }
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, arrayList, null, null, 3583, null));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class qz implements View.OnTouchListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f65893n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Pair f65894t;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f65893n = false;
                this.f65894t = new Pair(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                oC.this.mx().f9304e.onTouchEvent(motionEvent);
            } else if (actionMasked == 1) {
                if (this.f65893n) {
                    oC.this.mx().f9304e.onTouchEvent(motionEvent);
                }
                this.f65893n = false;
                this.f65894t = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else if (actionMasked == 2) {
                float fAbs = Math.abs(motionEvent.getRawX() - ((Number) this.f65894t.getFirst()).floatValue());
                float fAbs2 = Math.abs(motionEvent.getRawY() - ((Number) this.f65894t.getSecond()).floatValue());
                if (fAbs > oC.this.touchSlop || fAbs2 > oC.this.touchSlop) {
                    oC.this.mx().f9304e.onTouchEvent(motionEvent);
                    this.f65893n = true;
                }
            }
            return false;
        }

        qz() {
            Float fValueOf = Float.valueOf(0.0f);
            this.f65894t = new Pair(fValueOf, fValueOf);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class s4 implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f65895O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f65896n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ oC f65897r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f65898t;

        public s4(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, oC oCVar) {
            this.f65896n = objectRef;
            this.f65898t = uGc;
            this.f65895O = obj;
            this.J2 = userParameter;
            this.f65897r = oCVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Vector2D vector2D;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f65896n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f65898t);
            }
            Object obj = this.f65895O;
            UserParameter userParameter = this.J2;
            if (obj instanceof Quaternion) {
                Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                if (objFromEulerAngles == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                }
                vector2D = (Vector2D) objFromEulerAngles;
            } else if (obj instanceof Vector2D) {
                vector2D = new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
            } else if (obj instanceof Vector3D) {
                vector2D = (Vector2D) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
            } else if (!(obj instanceof Float)) {
                Object obj2 = valueList.get(0);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                }
                vector2D = (Vector2D) obj2;
            } else if (userParameter instanceof UserParameter.Spinner) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
            } else if (userParameter instanceof UserParameter.Slider) {
                vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
            } else {
                Object obj3 = valueList.get(0);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                }
                vector2D = (Vector2D) obj3;
            }
            oC oCVar = this.f65897r;
            HW.C.D(oCVar, oCVar.new UGc(vector2D));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class z implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Vector3D f65900n;

        z(Vector3D vector3D) {
            this.f65900n = vector3D;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Vector3D invoke(Vector3D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f65900n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HFS(oC oCVar) {
        oCVar.trackingTouch = false;
        Ml.j jVar = oCVar.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null) {
            sceneHolderE.setEditMode(oCVar.t());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XUb(oC oCVar, D9M d9m, View view) {
        oCVar.iu(false, d9m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YiW(oC oCVar, View view) {
        oCVar.Qg8(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eb(oC oCVar, ValueSpinner valueSpinner, D9M d9m) {
        D9M.n nVar;
        oCVar.trackingTouch = true;
        oCVar.undoBatch = HW.C.xMQ(oCVar);
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null) {
            int currentTabId = oCVar.getCurrentTabId();
            int i2 = 2131362621;
            if (currentTabId != 2131363817) {
                if (currentTabId == 2131363819) {
                    i2 = 2131362627;
                } else if (currentTabId != 2131363823) {
                    i2 = 2131362616;
                }
            }
            sceneHolderE.setEditMode(i2);
        }
        if (HW.C.iF(oCVar) != null && HW.C.nHg(oCVar) != null) {
            if (Intrinsics.areEqual(valueSpinner, oCVar.mx().f9300S)) {
                nVar = D9M.n.f64130n;
            } else if (Intrinsics.areEqual(valueSpinner, oCVar.mx().aYN)) {
                nVar = D9M.n.f64132t;
            } else {
                if (!Intrinsics.areEqual(valueSpinner, oCVar.mx().WPU)) {
                    return Unit.INSTANCE;
                }
                nVar = D9M.n.f64129O;
            }
            D9M.n nVar2 = nVar;
            Scene sceneIF = HW.C.iF(oCVar);
            Intrinsics.checkNotNull(sceneIF);
            SceneElement sceneElementNHg = HW.C.nHg(oCVar);
            Intrinsics.checkNotNull(sceneElementNHg);
            d9m.rl(nVar2, sceneIF, sceneElementNHg, HW.C.WPU(oCVar), HW.C.ck(oCVar));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxH(oC oCVar, View view) {
        oCVar.Qg8(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(oC oCVar) {
        oCVar.trackingTouch = true;
        oCVar.undoBatch = HW.C.xMQ(oCVar);
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null) {
            int currentTabId = oCVar.getCurrentTabId();
            sceneHolderE.setEditMode(currentTabId != 2131363817 ? currentTabId != 2131363819 ? 2131362616 : 2131362627 : 2131362621);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(oC oCVar, D9M d9m, View view) {
        oCVar.iu(true, d9m);
    }

    @Override // f0P.Ny
    protected boolean eF() {
        return true;
    }

    @Override // f0P.NO
    protected boolean tUK() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C7B(oC oCVar, View view) {
        HW.C.D(oCVar, new Function2() { // from class: f0P.Sg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.wYi((Scene) obj, (SceneElement) obj2);
            }
        });
        oCVar.s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Co(final oC oCVar, D9M d9m, final float f3) {
        SceneElement sceneElementNHg;
        HW.C.D(oCVar, new Function2() { // from class: f0P.bb7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.q9(this.f65377n, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(oCVar)) != null) {
            List listN = d9m.n(D9M.n.f64130n, sceneHolderE.getScene(), sceneElementNHg, HW.C.aYN(oCVar), HW.C.ck(oCVar));
            SceneSelection selection = sceneHolderE.getSelection();
            ArrayList arrayList = new ArrayList();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((b1P.n) it.next()).t());
            }
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, arrayList, null, null, 3583, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D GH3(float f3, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Vector2D vector2DPlus = GeometryKt.plus(it, new Vector2D(0.0f, f3 * 0.0017453292f));
        return Math.abs(vector2DPlus.getY()) < 0.001f ? Vector2D.copy$default(it, 0.0f, 0.0f, 1, null) : vector2DPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D HE(SceneElement sceneElement, Scene scene, float f3, Vector2D prevScale) {
        Intrinsics.checkNotNullParameter(prevScale, "prevScale");
        float y2 = SceneElementKt.boundsInScene(sceneElement, scene).getSize().getY() * Math.abs(prevScale.getY());
        return GeometryKt.coerceAtLeastAbs(GeometryKt.times(prevScale, new Vector2D(1.0f, (f3 + y2) / y2)), 1.0E-7f, 1.0E-7f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I4p(FragmentActivity fragmentActivity, int i2) {
        EditActivity editActivity = fragmentActivity instanceof EditActivity ? (EditActivity) fragmentActivity : null;
        if (editActivity != null) {
            editActivity.rV9(i2);
        }
        return Unit.INSTANCE;
    }

    private final void JI() {
        Scene sceneIF;
        FragmentActivity activity;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneIF = HW.C.iF(this)) == null || (activity = getActivity()) == null) {
            return;
        }
        if (getCurrentTabId() != 2131363823) {
            this.showingLinkedScaleUI = null;
            return;
        }
        if (sceneElementNHg.getType() == SceneElementType.Camera) {
            mx().KN.setImageResource(2131231967);
            mx().KN.setBackgroundColor(0);
            mx().aYN.setVisibility(4);
            mx().WPU.setVisibility(4);
            mx().f9300S.setVisibility(0);
            mx().f9303Z.setVisibility(0);
            float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFov(), HW.C.aYN(this))).floatValue();
            mx().f9303Z.setText(getString(2132017394, Float.valueOf(CameraElementKt.calcCameraZoom(sceneIF, fFloatValue)), Float.valueOf(fFloatValue)));
            return;
        }
        if (this.showingLinkedScaleUI == null) {
            this.showingLinkedScaleUI = Boolean.valueOf(sceneElementNHg.getTransform().getLockAspectRatio());
            if (!sceneElementNHg.getTransform().getLockAspectRatio()) {
                mx().KN.setImageResource(2131231968);
                mx().aYN.setVisibility(0);
                mx().WPU.setVisibility(0);
                mx().f9300S.setVisibility(4);
                mx().f9303Z.setVisibility(8);
                mx().Uo.setTextColor(-1);
                return;
            }
            mx().KN.setImageResource(2131231967);
            mx().aYN.setVisibility(4);
            mx().WPU.setVisibility(4);
            mx().f9300S.setVisibility(0);
            mx().f9303Z.setVisibility(8);
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(2130968731, typedValue, true);
            mx().Uo.setTextColor(typedValue.data);
            return;
        }
        if (!sceneElementNHg.getTransform().getLockAspectRatio() && Intrinsics.areEqual(this.showingLinkedScaleUI, Boolean.TRUE)) {
            this.showingLinkedScaleUI = Boolean.valueOf(sceneElementNHg.getTransform().getLockAspectRatio());
            mx().KN.setImageResource(2131231968);
            mx().aYN.setVisibility(0);
            mx().WPU.setVisibility(0);
            mx().f9300S.setVisibility(4);
            mx().f9303Z.setVisibility(8);
            mx().aYN.setAbsPos(mx().f9300S.getAbsPos());
            mx().WPU.setAbsPos(mx().f9300S.getAbsPos());
            mx().Uo.setTextColor(-1);
            mx().aYN.setPivotY(mx().aYN.getPaddingTop());
            mx().WPU.setPivotY(mx().WPU.getHeight() - mx().WPU.getPaddingBottom());
            mx().aYN.setScaleY(1.1f);
            mx().WPU.setScaleY(1.1f);
            mx().aYN.animate().scaleY(1.0f).setDuration(120L).start();
            mx().WPU.animate().scaleY(1.0f).setDuration(120L).start();
            this.animSerial++;
            return;
        }
        if (sceneElementNHg.getTransform().getLockAspectRatio() && Intrinsics.areEqual(this.showingLinkedScaleUI, Boolean.FALSE)) {
            this.showingLinkedScaleUI = Boolean.valueOf(sceneElementNHg.getTransform().getLockAspectRatio());
            mx().KN.setImageResource(2131231967);
            mx().aYN.setVisibility(0);
            mx().WPU.setVisibility(0);
            mx().f9300S.setVisibility(4);
            mx().f9303Z.setVisibility(8);
            TypedValue typedValue2 = new TypedValue();
            activity.getTheme().resolveAttribute(2130968731, typedValue2, true);
            mx().Uo.setTextColor(typedValue2.data);
            mx().aYN.setPivotY(mx().aYN.getPaddingTop());
            mx().WPU.setPivotY(mx().WPU.getHeight() - mx().WPU.getPaddingBottom());
            mx().f9300S.setAbsPos(mx().aYN.getAbsPos());
            mx().aYN.setScaleY(1.0f);
            mx().WPU.setScaleY(1.0f);
            int i2 = this.animSerial + 1;
            this.animSerial = i2;
            mx().aYN.animate().scaleY(1.1f).setDuration(120L).start();
            mx().WPU.animate().scaleY(1.1f).setDuration(120L).setListener(new Xo(i2, this)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(final oC oCVar, D9M d9m, final float f3) {
        SceneElement sceneElementNHg;
        HW.C.D(oCVar, new Function2() { // from class: f0P.xf0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.Lu(this.f66337n, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(oCVar)) != null) {
            List listN = d9m.n(D9M.n.f64130n, sceneHolderE.getScene(), sceneElementNHg, HW.C.aYN(oCVar), HW.C.ck(oCVar));
            SceneSelection selection = sceneHolderE.getSelection();
            ArrayList arrayList = new ArrayList();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((b1P.n) it.next()).t());
            }
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, arrayList, null, null, 3583, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Lu(oC oCVar, final float f3, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, pTYaLzzmJSGAPQ.aFpBcWWYNdiWcKW);
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getScale(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oCVar)), new Function1() { // from class: f0P.Kc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.HE(el, scene, f3, (Vector2D) obj);
            }
        }), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector3D MPw(oC oCVar, Vector2D vector2D, Vector3D vector3D, Vector3D vector3D2, Scene scene, SceneElement sceneElement, Vector3D it) {
        yc.nKE nkeN;
        Intrinsics.checkNotNullParameter(it, "it");
        if (oCVar.mx().HI.isActivated()) {
            return GeometryKt.coerceIn(GeometryKt.plus(it, new Vector3D(0.0f, 0.0f, -vector2D.getY())), vector3D, vector3D2);
        }
        int iWPU = HW.C.WPU(oCVar);
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE == null || (nkeN = sceneHolderE.getUserPreviewMode()) == null) {
            nkeN = yc.nKE.ck.n();
        }
        return GeometryKt.coerceIn(GeometryKt.plus(it, yc.LIz.n(vector2D, scene, sceneElement, iWPU, nkeN, false)), vector3D, vector3D2);
    }

    static /* synthetic */ void NC9(Transform transform, List list, float f3, float f4, b1P.Wre wre, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f4 = transform.getLocation().getY();
        }
        if ((i2 & 16) != 0) {
            wre = b1P.Wre.f43137n;
        }
        W5k(transform, list, f3, f4, wre);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Of6(int inputFieldNumber) {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(HW.C.aYN(this));
        UserParameter userParameterIV = iV();
        if (userParameterIV == null) {
            return;
        }
        Vector3D location = transformValueAtTime.getLocation();
        List listEmptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        if (userParameterIV instanceof UserParameter.FloatValue) {
            Intrinsics.checkNotNull(location, "null cannot be cast to non-null type kotlin.Float");
            arrayList.add(new C2348n(((Float) location).floatValue(), ((UserParameter.FloatValue) userParameterIV).getValue(), -1.0f, -1.0f, listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), inputFieldNumber == 1));
        } else if (userParameterIV instanceof UserParameter.Angle) {
            Intrinsics.checkNotNull(location, "null cannot be cast to non-null type kotlin.Float");
            UserParameter.Angle angle = (UserParameter.Angle) userParameterIV;
            arrayList.add(new C2348n(((Float) location).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), inputFieldNumber == 1));
        } else {
            if (!(userParameterIV instanceof UserParameter.Point) && !(userParameterIV instanceof UserParameter.Orientation)) {
                if (userParameterIV instanceof UserParameter.XYZ) {
                    if (location != 0) {
                        UserParameter.XYZ xyz = (UserParameter.XYZ) userParameterIV;
                        arrayList.add(new C2348n(location.getX(), xyz.getDefaultValue().getX(), xyz.getMinOffset().getX(), xyz.getMaxOffset().getX(), listEmptyList.isEmpty() ? "X" : (String) listEmptyList.get(0), inputFieldNumber == 1));
                        arrayList.add(new C2348n(location.getY(), xyz.getDefaultValue().getY(), xyz.getMinOffset().getY(), xyz.getMaxOffset().getY(), listEmptyList.size() >= 2 ? (String) listEmptyList.get(1) : "Y", inputFieldNumber == 2));
                        arrayList.add(new C2348n(location.getZ(), xyz.getDefaultValue().getZ(), xyz.getMinOffset().getZ(), xyz.getMaxOffset().getZ(), listEmptyList.size() < 3 ? "Z" : (String) listEmptyList.get(2), inputFieldNumber == 3));
                    }
                } else if (!(userParameterIV instanceof UserParameter.Spinner)) {
                    boolean z2 = userParameterIV instanceof UserParameter.Slider;
                }
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(arrayList);
        uGc.bzg(new eO(objectRef, uGc, location, userParameterIV, this));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = getActivity();
        SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
        if (surfaceView != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            float dimensionPixelSize = iArr[1];
            if (identifier > 0) {
                dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
            }
            uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(surfaceView.getHeight()))))));
        }
        getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Om(final oC oCVar, final float f3) {
        HW.C.D(oCVar, new Function2() { // from class: f0P.R7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.t1J(this.f64647n, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Qg8(int inputFieldNumber) {
        UserParameter userParameterIV;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (userParameterIV = iV()) == null) {
            return;
        }
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(HW.C.aYN(this));
        Vector2D vector2D = new Vector2D((float) ((((double) transformValueAtTime.getSkew().getX()) * 360.0d) / 6.283185307179586d), (float) ((((double) transformValueAtTime.getSkew().getY()) * 360.0d) / 6.283185307179586d));
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(2132020450), getString(2132020453)});
        ArrayList arrayList = new ArrayList();
        if (userParameterIV instanceof UserParameter.FloatValue) {
            arrayList.add(new C2348n(((Float) vector2D).floatValue(), ((UserParameter.FloatValue) userParameterIV).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), inputFieldNumber == 1));
        } else if (userParameterIV instanceof UserParameter.Angle) {
            UserParameter.Angle angle = (UserParameter.Angle) userParameterIV;
            arrayList.add(new C2348n(((Float) vector2D).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), inputFieldNumber == 1));
        } else {
            if (userParameterIV instanceof UserParameter.Point) {
                UserParameter.Point point = (UserParameter.Point) userParameterIV;
                arrayList.add(new C2348n(vector2D.getX(), point.getDefaultValue().getX(), point.getMinOffset().getX(), point.getMaxOffset().getX(), listListOf.isEmpty() ? "X" : (String) listListOf.get(0), inputFieldNumber == 1));
                arrayList.add(new C2348n(vector2D.getY(), point.getDefaultValue().getY(), point.getMinOffset().getY(), point.getMaxOffset().getY(), listListOf.size() >= 2 ? (String) listListOf.get(1) : "Y", inputFieldNumber == 2));
            } else if (!(userParameterIV instanceof UserParameter.Orientation) && !(userParameterIV instanceof UserParameter.XYZ) && !(userParameterIV instanceof UserParameter.Spinner)) {
                boolean z2 = userParameterIV instanceof UserParameter.Slider;
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(arrayList);
        uGc.bzg(new s4(objectRef, uGc, vector2D, userParameterIV, this));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = getActivity();
        SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
        if (surfaceView != null) {
            Resources resources = getResources();
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
        getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    private static final void Rc(Transform transform, List list, float f3, float f4, b1P.Wre wre) {
        list.add(b1P.I28.t(b1P.w6.f43148n, f3 - f4, f3, wre));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TVk(oC oCVar) {
        Rect rect = new Rect();
        oCVar.mx().KN.getHitRect(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        rect.left -= iWidth;
        rect.top -= iHeight;
        rect.right += iWidth;
        rect.bottom += iHeight / 2;
        Object parent = oCVar.mx().KN.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, oCVar.mx().KN));
    }

    static /* synthetic */ void UR(Transform transform, List list, float f3, float f4, b1P.Wre wre, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f4 = transform.getLocation().getX();
        }
        if ((i2 & 16) != 0) {
            wre = b1P.Wre.f43137n;
        }
        Rc(transform, list, f3, f4, wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement V5F(oC oCVar, Scene scene, SceneElement el, Vector2D accumDist) {
        yc.nKE nkeN;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(accumDist, "accumDist");
        Transform transformValueAtTime = LayerParentingKt.applyLayerParenting(el, scene, HW.C.aYN(oCVar)).getTransform().valueAtTime(HW.C.aYN(oCVar));
        int iWPU = HW.C.WPU(oCVar);
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE == null || (nkeN = sceneHolderE.getUserPreviewMode()) == null) {
            nkeN = yc.nKE.ck.n();
        }
        final Vector2D vector2DRot = GeometryKt.rot(yc.LIz.n(accumDist, scene, el, iWPU, nkeN, false), -transformValueAtTime.getRotation());
        Transform transformValueAtTime2 = el.getTransform().valueAtTime(HW.C.aYN(oCVar));
        Transform transformCopy$default = Transform.copy$default(transformValueAtTime2, null, GeometryKt.plus(transformValueAtTime.getPivot(), vector2DRot), null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 509, null);
        Vector2D.Companion companion = Vector2D.INSTANCE;
        Vector2D vector2DMinus = GeometryKt.minus(TransformKt.transformPoint(transformValueAtTime2, companion.getZERO()), TransformKt.transformPoint(transformCopy$default, companion.getZERO()));
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), KeyableKt.translatedBy(el.getTransform().getLocation(), new Vector3D(vector2DMinus.getX(), vector2DMinus.getY(), 0.0f)), KeyableKt.copyWithComputedValueForTime(el.getTransform().getPivot(), scene, el, HW.C.aYN(oCVar), new Function1() { // from class: f0P.uu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.sFO(vector2DRot, (Vector2D) obj);
            }
        }), null, null, 0.0f, 0.0f, null, null, false, 508, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    static /* synthetic */ void W1c(Transform transform, List list, float f3, float f4, b1P.Wre wre, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f4 = transform.getLocation().getZ();
        }
        if ((i2 & 16) != 0) {
            wre = b1P.Wre.f43137n;
        }
        poH(transform, list, f3, f4, wre);
    }

    private static final void W5k(Transform transform, List list, float f3, float f4, b1P.Wre wre) {
        list.add(b1P.I28.t(b1P.w6.f43149t, f3 - f4, f3, wre));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xli(oC oCVar, D9M d9m) {
        oCVar.trackingTouch = false;
        Ml.j jVar = oCVar.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null) {
            sceneHolderE.setEditMode(oCVar.t());
        }
        d9m.t();
        SceneHolder sceneHolderE2 = HW.C.e(oCVar);
        if (sceneHolderE2 != null) {
            sceneHolderE2.setSelection(SceneSelection.copy$default(sceneHolderE2.getSelection(), null, null, null, null, null, null, null, null, false, CollectionsKt.emptyList(), null, null, 3583, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bZm(oC oCVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(el, scene, HW.C.aYN(oCVar), HW.C.ck(oCVar), scene.getFramesPerHundredSeconds());
        Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), HW.C.aYN(oCVar));
        Rectangle rectangleMinus = GeometryKt.minus(rectangleBoundsAtTime, new Vector2D(vector3D.getX(), vector3D.getY()));
        b1P.w6 w6Var = b1P.w6.f43148n;
        float f3 = -((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getX();
        float x2 = ((Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), HW.C.aYN(oCVar))).getX();
        b1P.Wre wre = b1P.Wre.f43137n;
        b1P.n nVarT = b1P.I28.t(w6Var, f3, x2, wre);
        b1P.w6 w6Var2 = b1P.w6.f43149t;
        return CollectionsKt.listOf((Object[]) new b1P.n[]{nVarT, b1P.I28.t(w6Var2, -((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getY(), ((Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), HW.C.aYN(oCVar))).getY(), wre), b1P.I28.t(w6Var, rectangleMinus.getLeft() - ((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getX(), rectangleBoundsAtTime.getLeft(), wre), b1P.I28.t(w6Var, rectangleMinus.getRight() - ((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getX(), rectangleBoundsAtTime.getRight(), wre), b1P.I28.t(w6Var2, rectangleMinus.getTop() - ((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getY(), rectangleBoundsAtTime.getTop(), wre), b1P.I28.t(w6Var2, rectangleMinus.getBottom() - ((Vector2D) KeyableKt.valueAtTime(el.getTransform().getPivot(), HW.C.aYN(oCVar))).getY(), rectangleBoundsAtTime.getBottom(), wre)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement c32(oC oCVar, final float f3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, null, 0.0f, 0.0f, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getSkew(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oCVar)), new Function1() { // from class: f0P.ex
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.l2(f3, (Vector2D) obj);
            }
        }), false, 383, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement d(oC oCVar, final float f3, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getScale(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oCVar)), new Function1() { // from class: f0P.WTj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.rT(el, scene, f3, (Vector2D) obj);
            }
        }), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fW(final oC oCVar, final float f3) {
        HW.C.D(oCVar, new Function2() { // from class: f0P.ik
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.c32(this.f65657n, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D l2(float f3, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Vector2D vector2DPlus = GeometryKt.plus(it, new Vector2D(f3 * 0.0017453292f, 0.0f));
        return Math.abs(vector2DPlus.getX()) < 0.001f ? Vector2D.copy$default(it, 0.0f, 0.0f, 2, null) : vector2DPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.S mx() {
        return (SJ0.S) this.contentBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n7u(oC oCVar) {
        Ml.j jVar = oCVar.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D oz(SceneElement sceneElement, Scene scene, float f3, Vector2D prevScale) {
        Intrinsics.checkNotNullParameter(prevScale, "prevScale");
        Vector2D vector2DTimes = GeometryKt.times(SceneElementKt.boundsInScene(sceneElement, scene).getSize(), prevScale);
        Pair pair = TuplesKt.to(Float.valueOf(Math.abs(vector2DTimes.getX())), Float.valueOf(Math.abs(vector2DTimes.getY())));
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        return GeometryKt.coerceAtLeastAbs(GeometryKt.times(prevScale, fFloatValue > fFloatValue2 ? MathKt.roundToInt(f3 + fFloatValue) / fFloatValue : MathKt.roundToInt(f3 + fFloatValue2) / fFloatValue2), 1.0E-7f, 1.0E-7f);
    }

    private static final void poH(Transform transform, List list, float f3, float f4, b1P.Wre wre) {
        list.add(b1P.I28.t(b1P.w6.f43149t, f3 - f4, f3, wre));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement q9(final oC oCVar, final float f3, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        if (el.getType() != SceneElementType.Camera) {
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getScale(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oCVar)), new Function1() { // from class: f0P.OGb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return oC.oz(el, scene, f3, (Vector2D) obj);
                }
            }), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
        }
        CameraProperties cameraProperties = el.getCameraProperties();
        Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(el.getCameraProperties().getFov(), scene, el, HW.C.aYN(oCVar), new Function1() { // from class: f0P.Xe2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(oC.A(el, oCVar, f3, ((Float) obj).floatValue()));
            }
        });
        Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableCopyWithComputedValueForTime, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qva(final oC oCVar, D9M d9m, final float f3) {
        SceneElement sceneElementNHg;
        HW.C.D(oCVar, new Function2() { // from class: f0P.cd
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.d(this.f65462n, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        SceneHolder sceneHolderE = HW.C.e(oCVar);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(oCVar)) != null) {
            List listN = d9m.n(D9M.n.f64130n, sceneHolderE.getScene(), sceneElementNHg, HW.C.aYN(oCVar), HW.C.ck(oCVar));
            SceneSelection selection = sceneHolderE.getSelection();
            ArrayList arrayList = new ArrayList();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((b1P.n) it.next()).t());
            }
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, arrayList, null, null, 3583, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement rR(final oC oCVar, final Vector3D vector3D, final Vector3D vector3D2, final Scene scene, final SceneElement el, final Vector2D accumDist) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(accumDist, "accumDist");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), KeyableKt.copyWithComputedValueForTime(el.getTransform().getLocation(), scene, el, HW.C.aYN(oCVar), new Function1() { // from class: f0P.vu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.MPw(this.f66279n, accumDist, vector3D, vector3D2, scene, el, (Vector3D) obj);
            }
        }), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D rT(SceneElement sceneElement, Scene scene, float f3, Vector2D prevScale) {
        Intrinsics.checkNotNullParameter(prevScale, "prevScale");
        float x2 = SceneElementKt.boundsInScene(sceneElement, scene).getSize().getX() * Math.abs(prevScale.getX());
        return GeometryKt.coerceAtLeastAbs(GeometryKt.times(prevScale, new Vector2D((f3 + x2) / x2, 1.0f)), 1.0E-7f, 1.0E-7f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D sFO(Vector2D vector2D, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.plus(it, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement t1J(oC oCVar, final float f3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, null, 0.0f, 0.0f, null, KeyableKt.copyWithComputedValueForTime(el.getTransform().getSkew(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(oCVar)), new Function1() { // from class: f0P.Wv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.GH3(f3, (Vector2D) obj);
            }
        }), false, 383, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement wYi(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, null, 0.0f, 0.0f, null, null, !el.getTransform().getLockAspectRatio(), 255, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    @Override // f0P.Ny
    protected void D(View view) {
        ArrayList<Pair> arrayListArrayListOf;
        Intrinsics.checkNotNullParameter(view, "view");
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        switch (getCurrentTabId()) {
            case 2131363817:
                arrayListArrayListOf = CollectionsKt.arrayListOf(TuplesKt.to(2131361957, 2132020040));
                break;
            case 2131363818:
            case 2131363820:
            case 2131363821:
            case 2131363824:
            default:
                arrayListArrayListOf = new ArrayList();
                break;
            case 2131363819:
                arrayListArrayListOf = CollectionsKt.arrayListOf(TuplesKt.to(2131361958, 2132020041));
                break;
            case 2131363822:
                arrayListArrayListOf = CollectionsKt.arrayListOf(TuplesKt.to(2131361959, 2132020042));
                break;
            case 2131363823:
                arrayListArrayListOf = CollectionsKt.arrayListOf(TuplesKt.to(2131361960, 2132020043));
                break;
            case 2131363825:
                arrayListArrayListOf = CollectionsKt.arrayListOf(TuplesKt.to(2131361961, 2132020044));
                break;
        }
        arrayListArrayListOf.add(TuplesKt.to(2131361962, 2132020046));
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(activity, lS(), false, 4, null);
        for (Pair pair : arrayListArrayListOf) {
            com.alightcreative.widget.nKK.ty(nkk, ((Number) pair.component2()).intValue(), ((Number) pair.component1()).intValue(), 0, false, null, 28, null);
        }
        nkk.fD(new Function1() { // from class: f0P.yn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.I4p(activity, ((Integer) obj).intValue());
            }
        });
        nkk.X(getResources().getDimensionPixelSize(2131166272));
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        super.D(view);
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M */
    protected List getTabs() {
        List listListOf = CollectionsKt.listOf((Object[]) new Ny.j[]{new Ny.j(2131363817, 2131231043, 2131363819, 2131231044, null, false, 48, null), new Ny.j(2131363822, 2131231056, 0, 0, null, false, 60, null), new Ny.j(2131363823, 2131231057, 0, 0, null, false, 60, null)});
        SceneElement sceneElementNHg = HW.C.nHg(this);
        return CollectionsKt.plus((Collection) listListOf, (Iterable) ((sceneElementNHg != null ? sceneElementNHg.getType() : null) == SceneElementType.Camera ? CollectionsKt.emptyList() : CollectionsKt.listOf(new Ny.j(2131363825, 2131231061, 0, 0, null, false, 60, null))));
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        F8 f8;
        List listListOf;
        AnimatorOf animatorOf = AnimatorOf.Location;
        Ml ml = new PropertyReference1Impl() { // from class: f0P.oC.Ml
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTransform();
            }
        };
        I28 i28 = new PropertyReference1Impl() { // from class: f0P.oC.I28
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getLocation();
            }
        };
        F8 f82 = new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), ml), i28), SetsKt.setOf(2131363817));
        AnimatorOf animatorOf2 = AnimatorOf.Rotate;
        Wre wre = new PropertyReference1Impl() { // from class: f0P.oC.Wre
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTransform();
            }
        };
        CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.oC.CN3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getRotation();
            }
        };
        F8 f83 = new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), wre), cn3), SetsKt.setOf(2131363822));
        SceneElement sceneElementNHg = HW.C.nHg(this);
        SceneElementType type = sceneElementNHg != null ? sceneElementNHg.getType() : null;
        SceneElementType sceneElementType = SceneElementType.Camera;
        if (type == sceneElementType) {
            AnimatorOf animatorOf3 = AnimatorOf.Scale;
            fuX fux = new PropertyReference1Impl() { // from class: f0P.oC.fuX
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getCameraProperties();
                }
            };
            Dsr dsr = new PropertyReference1Impl() { // from class: f0P.oC.Dsr
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((CameraProperties) obj).getFov();
                }
            };
            f8 = new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), fux), dsr), SetsKt.setOf(2131363823));
        } else {
            AnimatorOf animatorOf4 = AnimatorOf.Scale;
            aC aCVar = new PropertyReference1Impl() { // from class: f0P.oC.aC
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getTransform();
                }
            };
            C c2 = new PropertyReference1Impl() { // from class: f0P.oC.C
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableTransform) obj).getScale();
                }
            };
            f8 = new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar.getReturnType(), aCVar), c2), SetsKt.setOf(2131363823));
        }
        AnimatorOf animatorOf5 = AnimatorOf.Skew;
        o oVar = new PropertyReference1Impl() { // from class: f0P.oC.o
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTransform();
            }
        };
        j jVar = new PropertyReference1Impl() { // from class: f0P.oC.j
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getSkew();
            }
        };
        List listListOf2 = CollectionsKt.listOf((Object[]) new F8[]{f82, f83, f8, new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), oVar), jVar), SetsKt.setOf(2131363825))});
        SceneElement sceneElementNHg2 = HW.C.nHg(this);
        if ((sceneElementNHg2 != null ? sceneElementNHg2.getType() : null) == sceneElementType) {
            listListOf = CollectionsKt.emptyList();
        } else {
            AnimatorOf animatorOf6 = AnimatorOf.Pivot;
            n nVar = new PropertyReference1Impl() { // from class: f0P.oC.n
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getTransform();
                }
            };
            w6 w6Var = new PropertyReference1Impl() { // from class: f0P.oC.w6
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableTransform) obj).getPivot();
                }
            };
            listListOf = CollectionsKt.listOf(new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), nVar), w6Var), SetsKt.setOf(2131363819)));
        }
        return CollectionsKt.plus((Collection) listListOf2, (Iterable) listListOf);
    }

    public final kgE.fuX lS() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // com.alightcreative.app.motion.activities.edit.fragments.w6, f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_move_and_transform", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.touchSlop = ViewConfiguration.get(requireContext()).getScaledTouchSlop();
        mx().f9304e.setSnapHandler(new Pl(this));
        final Vector3D vector3D = new Vector3D(-9999999.0f, -9999999.0f, -9999999.0f);
        final Vector3D vector3D2 = new Vector3D(9999999.0f, 9999999.0f, 9999999.0f);
        mx().f9304e.setMotionHandler(new Function3() { // from class: f0P.Ma
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return oC.rR(this.f64485n, vector3D, vector3D2, (Scene) obj, (SceneElement) obj2, (Vector2D) obj3);
            }
        });
        mx().f9308r.setMotionHandler(new Function3() { // from class: f0P.okF
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return oC.V5F(this.f66011n, (Scene) obj, (SceneElement) obj2, (Vector2D) obj3);
            }
        });
        mx().f9308r.setSnapHandler(new Function2() { // from class: f0P.vW
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return oC.bZm(this.f66267n, (Scene) obj, (SceneElement) obj2);
            }
        });
        final D9M d9m = new D9M();
        mx().f9300S.setOnSpin(new Function1() { // from class: f0P.rZ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.Co(this.f66124n, d9m, ((Float) obj).floatValue());
            }
        });
        mx().aYN.setOnSpin(new Function1() { // from class: f0P.FAn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.qva(this.f64193n, d9m, ((Float) obj).floatValue());
            }
        });
        mx().WPU.setOnSpin(new Function1() { // from class: f0P.kqp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.L(this.f65744n, d9m, ((Float) obj).floatValue());
            }
        });
        mx().te.setOnSpin(new Function1() { // from class: f0P.PR
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.fW(this.f64599n, ((Float) obj).floatValue());
            }
        });
        mx().iF.setOnSpin(new Function1() { // from class: f0P.Cm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.Om(this.f64117n, ((Float) obj).floatValue());
            }
        });
        for (ValueSpinner valueSpinner : CollectionsKt.listOf((Object[]) new ValueSpinner[]{mx().te, mx().iF})) {
            valueSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.rDR
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return oC.w(this.f66103n);
                }
            });
            valueSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.aol
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return oC.HFS(this.f65361n);
                }
            });
        }
        for (final ValueSpinner valueSpinner2 : CollectionsKt.listOf((Object[]) new ValueSpinner[]{mx().f9300S, mx().aYN, mx().WPU})) {
            valueSpinner2.setOnStartTrackingTouch(new Function0() { // from class: f0P.Gs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return oC.eb(this.f64248n, valueSpinner2, d9m);
                }
            });
            valueSpinner2.setOnStopTrackingTouch(new Function0() { // from class: f0P.Bo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return oC.Xli(this.f64102n, d9m);
                }
            });
        }
        mx().f9307o.setMinAngle(Float.valueOf(-3600000.0f));
        mx().f9307o.setMaxAngle(Float.valueOf(3600000.0f));
        mx().f9307o.setOnAngleChangedListener(new Function1() { // from class: f0P.ouK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oC.fq(this.f66016n, ((Float) obj).floatValue());
            }
        });
        mx().KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.KW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.C7B(this.f64425n, view2);
            }
        });
        mx().KN.post(new Runnable() { // from class: f0P.fK4
            @Override // java.lang.Runnable
            public final void run() {
                oC.TVk(this.f65541n);
            }
        });
        mx().f9307o.setOnStartTrackingTouchListener(new Function0() { // from class: f0P.pyW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oC.lRt(this.f66056n);
            }
        });
        mx().f9307o.setOnStopTrackingTouchListener(new Function0() { // from class: f0P.EP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oC.n7u(this.f64171n);
            }
        });
        mx().f9307o.setShowKeypadListener(new Function0() { // from class: f0P.Fkb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oC.yA(this.f64213n);
            }
        });
        mx().te.setShowZeroLine(true);
        mx().iF.setShowZeroLine(true);
        mx().qie.setActivated(true);
        mx().HI.setActivated(false);
        mx().nY.setOnClickListener(new View.OnClickListener() { // from class: f0P.sMs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.gxH(this.f66171n, view2);
            }
        });
        mx().f9305g.setOnClickListener(new View.OnClickListener() { // from class: f0P.b4s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.YiW(this.f65370n, view2);
            }
        });
        mx().qie.setOnTouchListener(this.locationLabelTouchListener);
        mx().mUb.setOnClickListener(new View.OnClickListener() { // from class: f0P.ev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.c(this.f65527n, view2);
            }
        });
        mx().az.setOnClickListener(new View.OnClickListener() { // from class: f0P.Qx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.Sax(this.f64644n, view2);
            }
        });
        mx().HI.setOnTouchListener(this.locationLabelTouchListener);
        mx().HI.setOnClickListener(new View.OnClickListener() { // from class: f0P.yPZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.kQ(this.f66367n, view2);
            }
        });
        mx().xMQ.setOnClickListener(new View.OnClickListener() { // from class: f0P.cdL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.x(this.f65464n, d9m, view2);
            }
        });
        mx().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.kq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oC.XUb(this.f65742n, d9m, view2);
            }
        });
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        float f3;
        double d2;
        Intrinsics.checkNotNullParameter(el, "el");
        int iWPU = HW.C.WPU(this);
        float fFractionalTime = SceneElementKt.fractionalTime(el, iWPU);
        Transform transformValueAtTime = el.getTransform().valueAtTime(fFractionalTime);
        Scene sceneIF = HW.C.iF(this);
        if (sceneIF == null) {
            return;
        }
        mx().f9307o.setAngle(transformValueAtTime.getRotation());
        Vector3D location = transformValueAtTime.getLocation();
        TextView textView = mx().mUb;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(location.getX())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        TextView textView2 = mx().az;
        String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(location.getY())}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView2.setText(str2);
        TextView textView3 = mx().HI;
        String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(location.getZ())}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView3.setText(str3);
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(el, sceneIF, fFractionalTime, HW.C.ck(this), sceneIF.getFramesPerHundredSeconds());
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setGroupingUsed(false);
        mx().xMQ.setText(numberFormat.format(Float.valueOf(rectangleBoundsAtTime.getWidth())));
        mx().Uo.setText(numberFormat.format(Float.valueOf(rectangleBoundsAtTime.getHeight())));
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) rectangleBoundsAtTime.getWidth(), 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) rectangleBoundsAtTime.getHeight(), 0);
        TextView textView4 = mx().nY;
        String str4 = String.format("%.1fº", Arrays.copyOf(new Object[]{Double.valueOf((((double) transformValueAtTime.getSkew().getX()) * 360.0d) / 6.283185307179586d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView4.setText(str4);
        if (this.trackingTouch) {
            f3 = 0.0017453292f;
        } else {
            f3 = 0.0017453292f;
            mx().te.setValue(MathKt.roundToInt(transformValueAtTime.getSkew().getX() / 0.0017453292f));
        }
        TextView textView5 = mx().f9305g;
        String str5 = String.format("%.1fº", Arrays.copyOf(new Object[]{Double.valueOf((((double) transformValueAtTime.getSkew().getY()) * 360.0d) / 6.283185307179586d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        textView5.setText(str5);
        if (!this.trackingTouch) {
            mx().iF.setValue(MathKt.roundToInt(transformValueAtTime.getSkew().getY() / f3));
        }
        Ml.j jVar = this.undoBatch;
        if ((jVar == null || !jVar.rl()) && GeometryKt.isFinite(rectangleBoundsAtTime) && (rectangleBoundsAtTime.getLeft() < rectangleBoundsAtTime.getRight() || rectangleBoundsAtTime.getTop() < rectangleBoundsAtTime.getBottom())) {
            if (el.getType() == SceneElementType.Camera) {
                mx().f9300S.setSnapTicks(CollectionsKt.emptyList());
                mx().f9300S.setMinValue(0);
                mx().f9300S.setMaxValue(999999);
                mx().f9300S.setLimitRange(true);
                mx().f9300S.setValue(Math.max(iCoerceAtLeast, iCoerceAtLeast2));
            } else if (el.getTransform().getLockAspectRatio()) {
                ArrayList arrayList = new ArrayList();
                mx().f9300S.setMinValue(0);
                mx().f9300S.setMaxValue(999999);
                mx().f9300S.setLimitRange(true);
                if (rectangleBoundsAtTime.getWidth() > rectangleBoundsAtTime.getHeight()) {
                    for (SceneElement sceneElement : sceneIF.getElements()) {
                        if (sceneElement.getType().isRenderable() && sceneElement.getId() != el.getId() && iWPU >= sceneElement.getStartTime() && iWPU <= sceneElement.getEndTime() && SceneElementKt.boundsInScene(sceneElement, sceneIF).isNotEmpty()) {
                            Vector2D vector2DTimes = GeometryKt.times(SceneElementKt.boundsInScene(sceneElement, sceneIF).getSize(), (Vector2D) KeyableKt.valueAtTime(sceneElement.getTransform().getScale(), SceneElementKt.fractionalTime(sceneElement, iWPU)));
                            if (GeometryKt.isFinite(vector2DTimes)) {
                                float x2 = vector2DTimes.getX();
                                int i2 = (int) x2;
                                int y2 = (int) ((vector2DTimes.getY() * rectangleBoundsAtTime.getWidth()) / rectangleBoundsAtTime.getHeight());
                                if (i2 > 0) {
                                    d2 = 0.01d;
                                    if (Math.abs(i2 - x2) < 0.01d && !arrayList.contains(Integer.valueOf(i2))) {
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                } else {
                                    d2 = 0.01d;
                                }
                                if (y2 > 0 && Math.abs(y2 - r11) < d2 && !arrayList.contains(Integer.valueOf(y2))) {
                                    arrayList.add(Integer.valueOf(y2));
                                }
                            }
                        }
                    }
                } else {
                    for (SceneElement sceneElement2 : sceneIF.getElements()) {
                        if (sceneElement2.getType().isRenderable() && sceneElement2.getId() != el.getId() && iWPU >= sceneElement2.getStartTime() && iWPU <= sceneElement2.getEndTime() && SceneElementKt.boundsInScene(sceneElement2, sceneIF).isNotEmpty()) {
                            Vector2D vector2DTimes2 = GeometryKt.times(SceneElementKt.boundsInScene(sceneElement2, sceneIF).getSize(), (Vector2D) KeyableKt.valueAtTime(sceneElement2.getTransform().getScale(), SceneElementKt.fractionalTime(sceneElement2, iWPU)));
                            if (GeometryKt.isFinite(vector2DTimes2)) {
                                float x3 = (vector2DTimes2.getX() * rectangleBoundsAtTime.getHeight()) / rectangleBoundsAtTime.getWidth();
                                int i3 = (int) x3;
                                int y3 = (int) vector2DTimes2.getY();
                                if (i3 > 0 && Math.abs(i3 - x3) < 0.01d && !arrayList.contains(Integer.valueOf(i3))) {
                                    arrayList.add(Integer.valueOf(i3));
                                }
                                if (y3 > 0 && Math.abs(y3 - r9) < 0.01d && !arrayList.contains(Integer.valueOf(y3))) {
                                    arrayList.add(Integer.valueOf(y3));
                                }
                            }
                        }
                    }
                }
                mx().f9300S.setSnapTicks(arrayList);
                mx().f9300S.setValue(Math.max(iCoerceAtLeast, iCoerceAtLeast2));
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (SceneElement sceneElement3 : sceneIF.getElements()) {
                    if (sceneElement3.getType().isRenderable() && sceneElement3.getId() != el.getId() && iWPU >= sceneElement3.getStartTime() && iWPU <= sceneElement3.getEndTime() && SceneElementKt.boundsInScene(sceneElement3, sceneIF).isNotEmpty()) {
                        Vector2D vector2DTimes3 = GeometryKt.times(SceneElementKt.boundsInScene(sceneElement3, sceneIF).getSize(), (Vector2D) KeyableKt.valueAtTime(sceneElement3.getTransform().getScale(), SceneElementKt.fractionalTime(sceneElement3, iWPU)));
                        if (GeometryKt.isFinite(vector2DTimes3)) {
                            if (((int) vector2DTimes3.getX()) > 0) {
                                arrayList2.add(Integer.valueOf((int) vector2DTimes3.getX()));
                            }
                            if (((int) vector2DTimes3.getY()) > 0) {
                                arrayList3.add(Integer.valueOf((int) vector2DTimes3.getY()));
                            }
                        }
                    }
                }
                mx().aYN.setMinValue(0);
                mx().aYN.setMaxValue(999999);
                mx().aYN.setLimitRange(true);
                mx().aYN.setSnapTicks(arrayList2);
                mx().aYN.setValue(iCoerceAtLeast);
                mx().WPU.setMinValue(0);
                mx().WPU.setMaxValue(999999);
                mx().WPU.setLimitRange(true);
                mx().WPU.setSnapTicks(arrayList3);
                mx().WPU.setValue(iCoerceAtLeast2);
            }
        }
        JI();
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: v, reason: from getter */
    protected boolean getAutoTabSpacing() {
        return this.autoTabSpacing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float A(SceneElement sceneElement, oC oCVar, float f3, final float f4) {
        final float f5 = -((Vector3D) KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), HW.C.aYN(oCVar))).getZ();
        final float fCalcCameraLargeDimension = CameraElementKt.calcCameraLargeDimension(f4, f5);
        final float fCalcCameraFovForSize = CameraElementKt.calcCameraFovForSize(f5, f3 + fCalcCameraLargeDimension);
        XoT.C.Uo(oCVar, new Function0() { // from class: f0P.nO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oC.WH(f5, fCalcCameraLargeDimension, f4, fCalcCameraFovForSize);
            }
        });
        return fCalcCameraFovForSize;
    }

    private final List GRh(Scene scene, SceneElement originalElement) {
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null) {
            return CollectionsKt.emptyList();
        }
        float fFractionalTime = SceneElementKt.fractionalTime(originalElement, HW.C.WPU(this));
        SceneElement sceneElementApplyCameraAndParenting = CameraElementKt.applyCameraAndParenting(originalElement, scene, fFractionalTime, sceneHolderE.getUserPreviewMode());
        List<SceneElement> elements = scene.getElements();
        ArrayList<SceneElement> arrayList = new ArrayList();
        for (Object obj : elements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (HW.C.WPU(this) >= sceneElement.getStartTime() && HW.C.WPU(this) <= sceneElement.getEndTime() && sceneElement.getType().getHasTransform() && sceneElement.getId() != sceneElementApplyCameraAndParenting.getId() && !sceneElement.getHidden()) {
                arrayList.add(obj);
            }
        }
        Transform transformValueAtTime = sceneElementApplyCameraAndParenting.getTransform().valueAtTime(fFractionalTime);
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementApplyCameraAndParenting, scene, fFractionalTime, HW.C.ck(this), scene.getFramesPerHundredSeconds());
        ArrayList arrayList2 = new ArrayList();
        b1P.Wre wre = b1P.Wre.f43136O;
        UR(transformValueAtTime, arrayList2, scene.getWidth() / 2.0f, 0.0f, wre, 8, null);
        NC9(transformValueAtTime, arrayList2, scene.getHeight() / 2.0f, 0.0f, wre, 8, null);
        List<Keyframe<Vector3D>> keyframes = originalElement.getTransform().getLocation().getKeyframes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            arrayList3.add(Float.valueOf(((Keyframe) it.next()).getTime()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (TimeKt.frameNumberFromTime(SceneElementKt.sceneTime(sceneElementApplyCameraAndParenting, ((Number) obj2).floatValue()), scene.getFramesPerHundredSeconds()) != HW.C.ck(this)) {
                arrayList4.add(obj2);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(CameraElementKt.applyCameraAndParenting(originalElement, scene, fFloatValue, sceneHolderE.getUserPreviewMode()).getTransform().getLocation(), fFloatValue);
            UR(transformValueAtTime, arrayList2, vector3D.getX(), 0.0f, null, 24, null);
            NC9(transformValueAtTime, arrayList2, vector3D.getY(), 0.0f, null, 24, null);
        }
        for (SceneElement sceneElement2 : arrayList) {
            float fFractionalTime2 = SceneElementKt.fractionalTime(sceneElement2, HW.C.WPU(this));
            SceneElement sceneElementApplyCameraAndParenting2 = CameraElementKt.applyCameraAndParenting(sceneElement2, scene, fFractionalTime2, sceneHolderE.getUserPreviewMode());
            Rectangle rectangleBoundsAtTime2 = SceneElementKt.boundsAtTime(sceneElementApplyCameraAndParenting2, scene, fFractionalTime2);
            Transform transformValueAtTime2 = sceneElementApplyCameraAndParenting2.getTransform().valueAtTime(fFractionalTime2);
            UR(transformValueAtTime, arrayList2, transformValueAtTime2.getLocation().getX(), 0.0f, null, 24, null);
            NC9(transformValueAtTime, arrayList2, transformValueAtTime2.getLocation().getY(), 0.0f, null, 24, null);
            UR(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getLeft(), rectangleBoundsAtTime.getLeft(), null, 16, null);
            UR(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getRight(), rectangleBoundsAtTime.getRight(), null, 16, null);
            UR(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getLeft(), rectangleBoundsAtTime.getRight(), null, 16, null);
            UR(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getRight(), rectangleBoundsAtTime.getLeft(), null, 16, null);
            NC9(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getTop(), rectangleBoundsAtTime.getTop(), null, 16, null);
            NC9(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getBottom(), rectangleBoundsAtTime.getBottom(), null, 16, null);
            NC9(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getTop(), rectangleBoundsAtTime.getBottom(), null, 16, null);
            NC9(transformValueAtTime, arrayList2, rectangleBoundsAtTime2.getBottom(), rectangleBoundsAtTime.getTop(), null, 16, null);
        }
        return CollectionsKt.toList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sax(oC oCVar, View view) {
        if (oCVar.mx().qie.isActivated()) {
            oCVar.Of6(2);
            return;
        }
        oCVar.mx().qie.setActivated(true);
        oCVar.mx().HI.setActivated(false);
        oCVar.mx().f9302X.setVisibility(0);
        oCVar.mx().f9301T.setVisibility(4);
        oCVar.mx().f9298N.setVisibility(4);
        oCVar.mx().nHg.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WH(float f3, float f4, float f5, float f6) {
        return "cameraUpdate: zoom=" + f3 + " largeDim=" + f4 + " prevFov=" + f5 + " newFov=" + f6 + " newLargeDim=" + CameraElementKt.calcCameraLargeDimension(f6, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(oC oCVar, View view) {
        if (oCVar.mx().qie.isActivated()) {
            oCVar.Of6(1);
            return;
        }
        oCVar.mx().qie.setActivated(true);
        oCVar.mx().HI.setActivated(false);
        oCVar.mx().f9302X.setVisibility(0);
        oCVar.mx().f9301T.setVisibility(4);
        oCVar.mx().f9298N.setVisibility(4);
        oCVar.mx().nHg.setVisibility(4);
    }

    private final List ex(Scene scene, SceneElement originalElement) {
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null) {
            return CollectionsKt.emptyList();
        }
        SceneElement activeCameraAtTime = null;
        if (getContext() != null && !this.logAdjustZ) {
            jB().n(new j.fuX("adjust_z", null, 2, null));
            this.logAdjustZ = true;
        }
        float fFractionalTime = SceneElementKt.fractionalTime(originalElement, HW.C.WPU(this));
        SceneElement sceneElementApplyLayerParenting = LayerParentingKt.applyLayerParenting(originalElement, scene, fFractionalTime);
        List<SceneElement> elements = scene.getElements();
        ArrayList<SceneElement> arrayList = new ArrayList();
        for (Object obj : elements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (HW.C.WPU(this) >= sceneElement.getStartTime() && HW.C.WPU(this) <= sceneElement.getEndTime() && sceneElement.getType().getHasTransform() && sceneElement.getId() != sceneElementApplyLayerParenting.getId() && !sceneElement.getHidden()) {
                arrayList.add(obj);
            }
        }
        if (sceneHolderE.getUserPreviewMode().nr()) {
            activeCameraAtTime = CameraElementKt.getActiveCameraAtTime(scene, HW.C.WPU(this));
        }
        Transform transformValueAtTime = sceneElementApplyLayerParenting.getTransform().valueAtTime(fFractionalTime);
        ArrayList arrayList2 = new ArrayList();
        b1P.Wre wre = b1P.Wre.f43136O;
        W1c(transformValueAtTime, arrayList2, 0.0f, 0.0f, wre, 8, null);
        if (activeCameraAtTime != null && activeCameraAtTime.getCameraProperties().getFocusBlurEnabled()) {
            float fFractionalTime2 = SceneElementKt.fractionalTime(activeCameraAtTime, HW.C.WPU(this));
            W1c(transformValueAtTime, arrayList2, ((Vector3D) KeyableKt.valueAtTime(LayerParentingKt.applyLayerParenting(activeCameraAtTime, scene, fFractionalTime2).getTransform().getLocation(), fFractionalTime2)).getZ() + ((Number) KeyableKt.valueAtTime(activeCameraAtTime.getCameraProperties().getFocusDistance(), fFractionalTime2)).floatValue(), 0.0f, wre, 8, null);
        }
        for (SceneElement sceneElement2 : arrayList) {
            float fFractionalTime3 = SceneElementKt.fractionalTime(sceneElement2, HW.C.WPU(this));
            W1c(transformValueAtTime, arrayList2, LayerParentingKt.applyLayerParenting(sceneElement2, scene, fFractionalTime3).getTransform().valueAtTime(fFractionalTime3).getLocation().getZ(), 0.0f, null, 24, null);
        }
        return CollectionsKt.toList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fq(oC oCVar, float f3) {
        SceneElement sceneElementNHg = HW.C.nHg(oCVar);
        if (sceneElementNHg != null) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(oCVar));
            SceneHolder sceneHolderE = HW.C.e(oCVar);
            if (sceneHolderE != null) {
                KeyableTransform transform = sceneElementNHg.getTransform();
                Keyable<Float> rotation = sceneElementNHg.getTransform().getRotation();
                Scene sceneIF = HW.C.iF(oCVar);
                Intrinsics.checkNotNull(sceneIF);
                sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, null, null, null, KeyableKt.copyWithValueForTime(rotation, sceneIF, sceneElementNHg, fFractionalTime, Float.valueOf(f3)), 0.0f, 0.0f, null, null, false, 503, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
            }
            oCVar.s7N();
        }
        return Unit.INSTANCE;
    }

    private final UserParameter iV() {
        if (HW.C.iF(this) == null) {
            return null;
        }
        int currentTabId = getCurrentTabId();
        if (currentTabId != 2131363817) {
            if (currentTabId != 2131363822) {
                if (currentTabId != 2131363825) {
                    return null;
                }
                return new UserParameter.Point("skew", "", false, new Vector2D(-1.0f, -1.0f), new Vector2D(-1.0f, -1.0f), new Vector2D(0.0f, 0.0f), PointType.LAYER, 0.1f);
            }
            return new UserParameter.Angle("rotation", "", true, -3600000.0f, 3600000.0f, 0.0f);
        }
        return new UserParameter.XYZ("location", "", false, new Vector3D(-9999999.0f, -9999999.0f, -9999999.0f), new Vector3D(9999999.0f, 9999999.0f, 9999999.0f), new Vector3D(r0.getWidth() / 2.0f, r0.getHeight() / 2.0f, 0.0f, 4, null), XYZType.Translate3D);
    }

    private final void iu(boolean isWidth, D9M scaleSnapBuilder) {
        float height;
        int i2;
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
            Scene sceneIF = HW.C.iF(this);
            if (sceneIF == null) {
                return;
            }
            Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementNHg, sceneIF, fFractionalTime, HW.C.ck(this), sceneIF.getFramesPerHundredSeconds());
            Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(sceneElementNHg.getTransform().getScale(), fFractionalTime);
            float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getCameraProperties().getFov(), fFractionalTime)).floatValue();
            float fMin = Math.min(rectangleBoundsAtTime.getWidth(), rectangleBoundsAtTime.getHeight());
            float fMax = Math.max(rectangleBoundsAtTime.getWidth(), rectangleBoundsAtTime.getHeight());
            float f3 = 1.0f;
            if (!isWidth ? rectangleBoundsAtTime.getHeight() != fMax : rectangleBoundsAtTime.getWidth() != fMax) {
                f3 = fMax / fMin;
            }
            float f4 = f3;
            if (isWidth) {
                height = rectangleBoundsAtTime.getWidth();
            } else {
                height = rectangleBoundsAtTime.getHeight();
            }
            float f5 = height;
            Resources resources = getResources();
            if (isWidth) {
                i2 = 2132020445;
            } else {
                i2 = 2132019375;
            }
            String string = resources.getString(i2);
            Intrinsics.checkNotNull(string);
            List listListOf = CollectionsKt.listOf(new C2348n(f5, 1.0f, 0.0f, 999999.0f, string, true));
            Float fValueOf = Float.valueOf(f5);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            r.UGc uGc = new r.UGc();
            uGc.v(listListOf);
            uGc.bzg(new l3D(objectRef, uGc, fValueOf, null, this, fFloatValue, f5, f4, vector2D, isWidth, scaleSnapBuilder, sceneIF));
            uGc.rV9(new r.Ln(objectRef));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                surfaceView = (SurfaceView) activity.findViewById(2131363442);
            } else {
                surfaceView = null;
            }
            if (surfaceView != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                int[] iArr = new int[2];
                surfaceView.getLocationInWindow(iArr);
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                float dimensionPixelSize = iArr[1];
                if (identifier > 0) {
                    dimensionPixelSize -= resources2.getDimensionPixelSize(identifier);
                }
                uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(surfaceView.getHeight()))))));
            }
            getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
        }
    }

    private final void jX() {
        String label;
        String label2;
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(HW.C.aYN(this));
            UserParameter userParameterIV = iV();
            if (userParameterIV == null) {
                return;
            }
            float f3 = -transformValueAtTime.getRotation();
            Float fValueOf = Float.valueOf(f3);
            List listEmptyList = CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList();
            String str = "";
            if (userParameterIV instanceof UserParameter.FloatValue) {
                float value = ((UserParameter.FloatValue) userParameterIV).getValue();
                if (!listEmptyList.isEmpty()) {
                    str = (String) listEmptyList.get(0);
                }
                arrayList.add(new C2348n(f3, value, -1.0f, -1.0f, str, true));
            } else if (userParameterIV instanceof UserParameter.Angle) {
                UserParameter.Angle angle = (UserParameter.Angle) userParameterIV;
                float defaultValue = angle.getDefaultValue();
                float minValue = angle.getMinValue();
                float maxValue = angle.getMaxValue();
                if (!listEmptyList.isEmpty()) {
                    str = (String) listEmptyList.get(0);
                }
                arrayList.add(new C2348n(f3, defaultValue, minValue, maxValue, str, true));
            } else if (!(userParameterIV instanceof UserParameter.Point) && !(userParameterIV instanceof UserParameter.Orientation) && !(userParameterIV instanceof UserParameter.XYZ)) {
                if (userParameterIV instanceof UserParameter.Spinner) {
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameterIV;
                    float fFloatValue = fValueOf.floatValue() * spinner.getMultiplier();
                    SliderType sliderType = spinner.getSliderType();
                    float fCalcSliderTypeValueForViewing = UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue);
                    float fCalcSliderTypeValueForViewing2 = UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier());
                    float fCalcSliderTypeValueForViewing3 = UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier());
                    float fCalcSliderTypeValueForViewing4 = UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier());
                    if (listEmptyList.isEmpty()) {
                        label2 = spinner.getLabel();
                    } else {
                        label2 = (String) listEmptyList.get(0);
                    }
                    arrayList.add(new C2348n(fCalcSliderTypeValueForViewing, fCalcSliderTypeValueForViewing2, fCalcSliderTypeValueForViewing3, fCalcSliderTypeValueForViewing4, label2, true));
                } else if (userParameterIV instanceof UserParameter.Slider) {
                    UserParameter.Slider slider = (UserParameter.Slider) userParameterIV;
                    float fCalcSliderTypeValueForViewing5 = UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), fValueOf.floatValue());
                    float fCalcSliderTypeValueForViewing6 = UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue());
                    float fCalcSliderTypeValueForViewing7 = UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue());
                    float fCalcSliderTypeValueForViewing8 = UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue());
                    if (listEmptyList.isEmpty()) {
                        label = slider.getLabel();
                    } else {
                        label = (String) listEmptyList.get(0);
                    }
                    arrayList.add(new C2348n(fCalcSliderTypeValueForViewing5, fCalcSliderTypeValueForViewing6, fCalcSliderTypeValueForViewing7, fCalcSliderTypeValueForViewing8, label, true));
                }
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            r.UGc uGc = new r.UGc();
            uGc.v(arrayList);
            uGc.bzg(new QJ(objectRef, uGc, fValueOf, userParameterIV, this));
            uGc.rV9(new r.Ln(objectRef));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                surfaceView = (SurfaceView) activity.findViewById(2131363442);
            } else {
                surfaceView = null;
            }
            if (surfaceView != null) {
                Resources resources = getResources();
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
            getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kQ(oC oCVar, View view) {
        if (oCVar.mx().HI.isActivated()) {
            oCVar.Of6(3);
            return;
        }
        oCVar.mx().qie.setActivated(false);
        oCVar.mx().HI.setActivated(true);
        oCVar.mx().f9302X.setVisibility(4);
        oCVar.mx().f9301T.setVisibility(0);
        oCVar.mx().f9298N.setVisibility(0);
        oCVar.mx().nHg.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lRt(oC oCVar) {
        oCVar.undoBatch = HW.C.xMQ(oCVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List tdZ(Scene scene, SceneElement originalElement) {
        if (mx().HI.isActivated()) {
            return ex(scene, originalElement);
        }
        return GRh(scene, originalElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.S wKY(oC oCVar) {
        SJ0.S sN = SJ0.S.n(oCVar.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(sN, "bind(...)");
        return sN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit yA(oC oCVar) {
        oCVar.jX();
        return Unit.INSTANCE;
    }

    @Override // f0P.NO, f0P.Ny
    protected void a(int tabId) {
        if (!isAdded()) {
            return;
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(2131363817, CollectionsKt.listOf((Object[]) new View[]{mx().f9304e, mx().f9302X, mx().f9309t, mx().nr, mx().f9299O, mx().J2, mx().mUb, mx().az, mx().gh, mx().ty, mx().HI, mx().ck, mx().qie, mx().f9301T, mx().f9298N, mx().nHg})), TuplesKt.to(2131363819, CollectionsKt.listOf((Object[]) new View[]{mx().f9308r, mx().Ik, mx().f9309t, mx().nr, mx().f9299O, mx().J2})), TuplesKt.to(2131363822, CollectionsKt.listOf(mx().f9307o)), TuplesKt.to(2131363823, CollectionsKt.listOf((Object[]) new View[]{mx().f9300S, mx().xMQ, mx().Uo, mx().KN, mx().aYN, mx().WPU, mx().ViF, mx().XQ, mx().f9303Z})), TuplesKt.to(2131363825, CollectionsKt.listOf((Object[]) new View[]{mx().nY, mx().fD, mx().te, mx().f9305g, mx().E2, mx().iF})), TuplesKt.to(2131363818, CollectionsKt.emptyList()));
        Iterator it = CollectionsKt.flatten(mapMapOf.values()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        List list = (List) mapMapOf.get(Integer.valueOf(tabId));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(0);
            }
        }
        if (tabId == 2131363817) {
            if (mx().qie.isActivated()) {
                mx().f9302X.setVisibility(0);
                mx().f9301T.setVisibility(4);
                mx().f9298N.setVisibility(4);
                mx().nHg.setVisibility(4);
            } else if (mx().HI.isActivated()) {
                mx().f9302X.setVisibility(4);
                mx().f9301T.setVisibility(0);
                mx().f9298N.setVisibility(0);
                mx().nHg.setVisibility(0);
            }
        }
        super.a(tabId);
        W();
        JI();
    }

    @Override // yc.QhI
    public int t() {
        int currentTabId = getCurrentTabId();
        if (currentTabId != 2131363817) {
            if (currentTabId != 2131363819) {
                return 0;
            }
            return 2131362626;
        }
        return 2131362620;
    }
}
