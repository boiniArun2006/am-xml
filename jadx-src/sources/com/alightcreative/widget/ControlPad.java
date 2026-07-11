package com.alightcreative.widget;

import LdY.Ml;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.snap.SnapGuide;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001~B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0002¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u0012*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010\"\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010D\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010)R\u0016\u0010K\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010)R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MRX\u0010[\u001a8\u0012\u0013\u0012\u00110P¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0013\u0012\u001105¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(T\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010)\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010g\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010F\u001a\u0004\bc\u0010d\"\u0004\be\u0010fRk\u0010p\u001aK\u0012\u0013\u0012\u00110P¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0013\u0012\u001105¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(T\u0012\u0013\u0012\u00110=¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(i\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010rR\u0014\u0010w\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010rR\u0014\u0010y\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010rR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/alightcreative/widget/ControlPad;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lb1P/n;", "KN", "(Ljava/util/List;)Ljava/util/List;", "", "qie", "()V", "", "dx", "dy", "", "dt", "Ik", "(FFD)V", "Landroid/view/MotionEvent;", a.f62811a, "mUb", "(Landroid/view/MotionEvent;)V", "Ljava/util/SortedSet;", "snaps", "Ljava/util/TreeMap;", "xMQ", "(Ljava/util/SortedSet;)Ljava/util/TreeMap;", "accum", "o", "(Ljava/util/TreeMap;F)F", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "F", "px", "t", "py", "", "O", "J", "pt", "LLdY/Ml$j;", "J2", "LLdY/Ml$j;", "undoBatch", "Lcom/alightcreative/app/motion/scene/SceneElement;", "r", "Lcom/alightcreative/app/motion/scene/SceneElement;", "initialElementState", "Ljava/util/TreeMap;", "snapX", "S", "snapY", "Lcom/alightcreative/app/motion/scene/Vector2D;", "g", "Lcom/alightcreative/app/motion/scene/Vector2D;", "E2", "prevSnapAccum", "e", "D", "dampPixelsPerSecond", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Z", "controlpadAccel", "N", "accumDx", "v", "accumDy", "Xw", "I", "prevEditMode", "Lkotlin/Function2;", "Lcom/alightcreative/app/motion/scene/Scene;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "scene", "el", "jB", "Lkotlin/jvm/functions/Function2;", "getSnapHandler", "()Lkotlin/jvm/functions/Function2;", "setSnapHandler", "(Lkotlin/jvm/functions/Function2;)V", "snapHandler", "U", "getSnapThreshold", "()F", "setSnapThreshold", "(F)V", "snapThreshold", "P5", "getCompensateForElementTransform", "()Z", "setCompensateForElementTransform", "(Z)V", "compensateForElementTransform", "Lkotlin/Function3;", "accumDist", "M7", "Lkotlin/jvm/functions/Function3;", "getMotionHandler", "()Lkotlin/jvm/functions/Function3;", "setMotionHandler", "(Lkotlin/jvm/functions/Function3;)V", "motionHandler", "p5", "Lb1P/n;", "SNAP_X_MIN", "eF", "SNAP_X_MAX", "E", "SNAP_Y_MIN", "M", "SNAP_Y_MAX", "Lcom/alightcreative/widget/ControlPad$j;", "FX", "Lcom/alightcreative/widget/ControlPad$j;", "pendingNudge", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nControlPad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlPad.kt\ncom/alightcreative/widget/ControlPad\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1734#2,3:239\n1485#2:242\n1510#2,3:243\n1513#2,3:253\n1368#2:259\n1454#2,5:260\n774#2:266\n865#2,2:267\n774#2:270\n865#2,2:271\n774#2:273\n865#2,2:274\n774#2:276\n865#2,2:277\n1368#2:279\n1454#2,5:280\n1755#2,2:285\n2632#2,3:287\n1757#2:290\n1782#2,4:291\n1755#2,3:295\n1567#2:298\n1598#2,4:299\n381#3,7:246\n126#4:256\n153#4,2:257\n155#4:265\n1#5:269\n*S KotlinDebug\n*F\n+ 1 ControlPad.kt\ncom/alightcreative/widget/ControlPad\n*L\n106#1:239,3\n107#1:242\n107#1:243,3\n107#1:253,3\n108#1:259\n108#1:260,5\n125#1:266\n125#1:267,2\n126#1:270\n126#1:271,2\n170#1:273\n170#1:274,2\n171#1:276\n171#1:277,2\n176#1:279\n176#1:280,5\n188#1:285,2\n188#1:287,3\n188#1:290\n222#1:291,4\n222#1:295,3\n224#1:298\n224#1:299,4\n107#1:246,7\n107#1:256\n107#1:257,2\n107#1:265\n*E\n"})
public final class ControlPad extends View {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final b1P.n SNAP_Y_MIN;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Vector2D prevSnapAccum;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private j pendingNudge;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final b1P.n SNAP_Y_MAX;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private Function3 motionHandler;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private float accumDx;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long pt;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean compensateForElementTransform;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private TreeMap snapY;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final boolean controlpadAccel;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float snapThreshold;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int prevEditMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double dampPixelsPerSecond;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final b1P.n SNAP_X_MAX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Vector2D accum;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function2 snapHandler;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float px;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TreeMap snapX;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final b1P.n SNAP_X_MIN;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SceneElement initialElementState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float py;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float accumDy;

    public static final class Ml implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Float.valueOf(((b1P.n) obj).rl()), Float.valueOf(((b1P.n) obj2).rl()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47046o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ j[] f47047r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f47045n = new j("LEFT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f47048t = new j("TOP", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f47044O = new j("RIGHT", 2);
        public static final j J2 = new j("BOTTOM", 3);

        private static final /* synthetic */ j[] n() {
            return new j[]{f47045n, f47048t, f47044O, J2};
        }

        static {
            j[] jVarArrN = n();
            f47047r = jVarArrN;
            f47046o = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f47047r.clone();
        }

        private j(String str, int i2) {
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f47045n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f47048t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f47044O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Float.valueOf(((b1P.n) obj).rl()), Float.valueOf(((b1P.n) obj2).rl()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlPad(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.undoBatch = LdY.Ml.Ik.n();
        this.snapX = new TreeMap();
        this.snapY = new TreeMap();
        this.accum = GeometryKt.Vector2D();
        this.prevSnapAccum = GeometryKt.Vector2D();
        this.controlpadAccel = com.alightcreative.app.motion.persist.j.INSTANCE.getControlpadAccel();
        this.snapHandler = new Function2() { // from class: com.alightcreative.widget.iF
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ControlPad.Z((Scene) obj, (SceneElement) obj2);
            }
        };
        this.snapThreshold = 25.0f;
        b1P.w6 w6Var = b1P.w6.f43148n;
        this.SNAP_X_MIN = b1P.I28.nr(w6Var, -100000.0f, 0.0f, null, 8, null);
        this.SNAP_X_MAX = b1P.I28.nr(w6Var, 100000.0f, 0.0f, null, 8, null);
        b1P.w6 w6Var2 = b1P.w6.f43149t;
        this.SNAP_Y_MIN = b1P.I28.nr(w6Var2, -100000.0f, 0.0f, null, 8, null);
        this.SNAP_Y_MAX = b1P.I28.nr(w6Var2, 100000.0f, 0.0f, null, 8, null);
    }

    private final TreeMap xMQ(SortedSet snaps) {
        int i2;
        float f3 = 0.0f;
        int i3 = 0;
        if (snaps == null || !snaps.isEmpty()) {
            Iterator it = snaps.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((b1P.n) it.next()).rl() < 0.0f && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i2 = 0;
        }
        float f4 = i2;
        if (snaps == null || !snaps.isEmpty()) {
            Iterator it2 = snaps.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((b1P.n) it2.next()).rl() == 0.0f) {
                    f3 = 0.5f;
                    break;
                }
            }
        }
        float f5 = f4 + f3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snaps, 10));
        for (Object obj : snaps) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            b1P.n nVar = (b1P.n) obj;
            arrayList.add(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(nVar.rl() + ((i3 - f5) * this.snapThreshold)), nVar), TuplesKt.to(Float.valueOf(nVar.rl() + ((i5 - f5) * this.snapThreshold)), nVar)}));
            i3 = i5;
        }
        return new TreeMap(MapsKt.toMap(CollectionsKt.flatten(arrayList)));
    }

    private final void Ik(float dx, float dy, double dt) {
        Scene sceneTe;
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        SceneHolder sceneHolderE2;
        this.accumDx += dx;
        this.accumDy += dy;
        SceneElement sceneElement = this.initialElementState;
        if (sceneElement == null || (sceneTe = HW.C.te(this)) == null) {
            return;
        }
        Vector2D vector2D = new Vector2D(dx, dy);
        SceneHolder sceneHolderE22 = HW.C.E2(this);
        if (sceneHolderE22 == null) {
            return;
        }
        double length = (this.dampPixelsPerSecond * 0.65d) + ((((double) GeometryKt.getLength(vector2D)) / dt) * 0.35d);
        this.dampPixelsPerSecond = length;
        double dCoerceIn = RangesKt.coerceIn(Math.pow(length / 600.0d, 1.1d), 0.5d, 2.5d);
        if (this.controlpadAccel) {
            vector2D = GeometryKt.times(vector2D, dCoerceIn);
        }
        final Vector2D vector2D2 = vector2D;
        Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElement, HW.C.S(this)));
        final Vector2D vector2DTimes = this.compensateForElementTransform ? GeometryKt.times(GeometryKt.rot(vector2D2, -transformValueAtTime.getRotation()), GeometryKt.recip(transformValueAtTime.getScale())) : vector2D2;
        this.accum = GeometryKt.plus(this.accum, vector2DTimes);
        final Vector2D vector2D3 = new Vector2D(o(this.snapX, this.accum.getX()), o(this.snapY, this.accum.getY()));
        final Vector2D vector2DMinus = GeometryKt.minus(vector2D3, this.prevSnapAccum);
        this.prevSnapAccum = vector2D3;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.pO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ControlPad.r(vector2D2, vector2DTimes, this, vector2D3, vector2DMinus);
            }
        });
        if (vector2DMinus.getX() == 0.0f) {
            Collection collectionValues = this.snapX.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            collectionEmptyList = new ArrayList();
            for (Object obj : collectionValues) {
                if (((b1P.n) obj).rl() == vector2D3.getX()) {
                    collectionEmptyList.add(obj);
                }
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        if (vector2DMinus.getY() == 0.0f) {
            Collection collectionValues2 = this.snapY.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
            collectionEmptyList2 = new ArrayList();
            for (Object obj2 : collectionValues2) {
                if (((b1P.n) obj2).rl() == vector2D3.getY()) {
                    collectionEmptyList2.add(obj2);
                }
            }
        } else {
            collectionEmptyList2 = CollectionsKt.emptyList();
        }
        List<SnapGuide> snapGuides = sceneHolderE22.getSelection().getSnapGuides();
        SceneSelection selection = sceneHolderE22.getSelection();
        List listPlus = CollectionsKt.plus(collectionEmptyList, (Iterable) collectionEmptyList2);
        ArrayList arrayList = new ArrayList();
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((b1P.n) it.next()).t());
        }
        sceneHolderE22.setSelection(SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, arrayList, null, null, 3583, null));
        if (!Intrinsics.areEqual(vector2DMinus, Vector2D.INSTANCE.getZERO())) {
            Function3 function3 = this.motionHandler;
            SceneElement sceneElement2 = function3 != null ? (SceneElement) function3.invoke(sceneTe, sceneElement, vector2D3) : null;
            if (sceneElement2 != null && sceneElement2 != sceneElement && (sceneHolderE2 = HW.C.E2(this)) != null) {
                sceneHolderE2.update(sceneElement2);
            }
        }
        List<SnapGuide> snapGuides2 = sceneHolderE22.getSelection().getSnapGuides();
        if (snapGuides2 == null || !snapGuides2.isEmpty()) {
            for (SnapGuide snapGuide : snapGuides2) {
                if (snapGuides == null || !snapGuides.isEmpty()) {
                    Iterator<T> it2 = snapGuides.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual((SnapGuide) it2.next(), snapGuide)) {
                            break;
                        }
                    }
                }
                LEl.rl(this).n();
                return;
            }
        }
    }

    private final List KN(List list) {
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((b1P.n) it.next()).n() != ((b1P.n) CollectionsKt.first(list)).n()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Float fValueOf = Float.valueOf(((b1P.n) obj).rl());
            Object arrayList = linkedHashMap.get(fValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list2 = (List) ((Map.Entry) it2.next()).getValue();
            b1P.w6 w6VarN = ((b1P.n) CollectionsKt.first(list2)).n();
            float fRl = ((b1P.n) CollectionsKt.first(list2)).rl();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList3, ((b1P.n) it3.next()).t());
            }
            arrayList2.add(new b1P.n(w6VarN, fRl, arrayList3));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Z(Scene scene, SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(sceneElement, "<unused var>");
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(List list) {
        return "onStartTrackpadMotion: snaps=" + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck() {
        return "onTouchEvent:ACTION_UP/ACTION_CANCEL";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh() {
        return "onEndTrackpadMotion";
    }

    private final void mUb(MotionEvent event) {
        SceneElement sceneElement;
        Scene sceneTe;
        Vector2D vector2D;
        SceneHolder sceneHolderE2;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ControlPad.gh();
            }
        });
        SceneHolder sceneHolderE22 = HW.C.E2(this);
        if (sceneHolderE22 == null || (sceneElement = this.initialElementState) == null || (sceneTe = HW.C.te(this)) == null) {
            return;
        }
        sceneHolderE22.setEditMode(this.prevEditMode);
        this.initialElementState = null;
        sceneHolderE22.setSelection(SceneSelection.copy$default(sceneHolderE22.getSelection(), null, null, null, null, null, null, null, null, false, CollectionsKt.emptyList(), null, null, 3583, null));
        if (this.pendingNudge == null || event.getEventTime() - event.getDownTime() >= ViewConfiguration.getTapTimeout() || this.accumDx >= 20.0f || this.accumDy >= 20.0f) {
            return;
        }
        j jVar = this.pendingNudge;
        Intrinsics.checkNotNull(jVar);
        int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            vector2D = new Vector2D(-1.0f, 0.0f);
        } else if (i2 == 2) {
            vector2D = new Vector2D(0.0f, -1.0f);
        } else if (i2 == 3) {
            vector2D = new Vector2D(1.0f, 0.0f);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vector2D = new Vector2D(0.0f, 1.0f);
        }
        Function3 function3 = this.motionHandler;
        SceneElement sceneElement2 = function3 != null ? (SceneElement) function3.invoke(sceneTe, sceneElement, vector2D) : null;
        if (sceneElement2 == null || sceneElement2 == sceneElement || (sceneHolderE2 = HW.C.E2(this)) == null) {
            return;
        }
        sceneHolderE2.update(sceneElement2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(Vector2D vector2D, Vector2D vector2D2, ControlPad controlPad, Vector2D vector2D3, Vector2D vector2D4) {
        return "onTrackpadMotion: motion=" + vector2D + " offsetUnsnapped=" + vector2D2 + " accum=" + controlPad.accum + " snapAccum=" + vector2D3 + " offset=" + vector2D4;
    }

    public final boolean getCompensateForElementTransform() {
        return this.compensateForElementTransform;
    }

    public final Function3<Scene, SceneElement, Vector2D, SceneElement> getMotionHandler() {
        return this.motionHandler;
    }

    public final Function2<Scene, SceneElement, List<b1P.n>> getSnapHandler() {
        return this.snapHandler;
    }

    public final float getSnapThreshold() {
        return this.snapThreshold;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Zs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ControlPad.ty(event);
                }
            });
            this.px = event.getX();
            this.py = event.getY();
            this.pt = System.nanoTime();
            this.undoBatch.n();
            this.undoBatch = HW.C.KN(this);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (event.getX() < getWidth() / 4) {
                linkedHashSet.add(j.f47045n);
            }
            if (event.getY() < getHeight() / 4) {
                linkedHashSet.add(j.f47048t);
            }
            if (event.getX() > (getWidth() * 3) / 4) {
                linkedHashSet.add(j.f47044O);
            }
            if (event.getY() > (getHeight() * 3) / 4) {
                linkedHashSet.add(j.J2);
            }
            this.pendingNudge = (j) CollectionsKt.singleOrNull(linkedHashSet);
            qie();
        } else if (actionMasked == 1) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ControlPad.ck();
                }
            });
            mUb(event);
            this.undoBatch.n();
        } else if (actionMasked == 2) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ControlPad.HI(event);
                }
            });
            long jNanoTime = System.nanoTime();
            float x2 = event.getX() - this.px;
            float y2 = event.getY() - this.py;
            long j2 = jNanoTime - this.pt;
            this.px = event.getX();
            this.py = event.getY();
            this.pt = jNanoTime;
            Ik(x2, y2, j2 * 1.0E-9d);
        } else if (actionMasked == 3) {
        }
        return true;
    }

    public final void setCompensateForElementTransform(boolean z2) {
        this.compensateForElementTransform = z2;
    }

    public final void setMotionHandler(Function3<? super Scene, ? super SceneElement, ? super Vector2D, SceneElement> function3) {
        this.motionHandler = function3;
    }

    public final void setSnapHandler(Function2<? super Scene, ? super SceneElement, ? extends List<b1P.n>> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.snapHandler = function2;
    }

    public final void setSnapThreshold(float f3) {
        this.snapThreshold = f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(MotionEvent motionEvent) {
        return "onTouchEvent:ACTION_MOVE: " + motionEvent.getX() + "," + motionEvent.getY();
    }

    private final float o(TreeMap treeMap, float f3) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Float.valueOf(f3));
        if (entryFloorEntry != null) {
            Float f4 = (Float) entryFloorEntry.getKey();
            b1P.n nVar = (b1P.n) entryFloorEntry.getValue();
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Float.valueOf(f3));
            if (entryCeilingEntry != null) {
                Float f5 = (Float) entryCeilingEntry.getKey();
                b1P.n nVar2 = (b1P.n) entryCeilingEntry.getValue();
                Intrinsics.checkNotNull(f4);
                return (((f3 - f4.floatValue()) / Math.max(1.0f, f5.floatValue() - f4.floatValue())) * (nVar2.rl() - nVar.rl())) + nVar.rl();
            }
        }
        return f3;
    }

    private final void qie() {
        SceneElement sceneElementN;
        Scene sceneTe;
        int i2;
        SceneHolder sceneHolderE2 = HW.C.E2(this);
        if (sceneHolderE2 == null || (sceneElementN = HW.C.N(this)) == null || (sceneTe = HW.C.te(this)) == null) {
            return;
        }
        int editMode = sceneHolderE2.getEditMode();
        this.prevEditMode = editMode;
        if (editMode != 2131362620) {
            if (editMode != 2131362626) {
                i2 = 2131362616;
            } else {
                i2 = 2131362627;
            }
        } else {
            i2 = 2131362621;
        }
        sceneHolderE2.setEditMode(i2);
        final List list = (List) this.snapHandler.invoke(sceneTe, sceneElementN);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((b1P.n) obj).n() == b1P.w6.f43148n) {
                arrayList.add(obj);
            }
        }
        SortedSet sortedSet = CollectionsKt.toSortedSet(KN(arrayList), new w6());
        sortedSet.add(this.SNAP_X_MIN);
        sortedSet.add(this.SNAP_X_MAX);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((b1P.n) obj2).n() == b1P.w6.f43149t) {
                arrayList2.add(obj2);
            }
        }
        SortedSet sortedSet2 = CollectionsKt.toSortedSet(KN(arrayList2), new Ml());
        sortedSet2.add(this.SNAP_Y_MIN);
        sortedSet2.add(this.SNAP_Y_MAX);
        this.snapX = xMQ(sortedSet);
        this.snapY = xMQ(sortedSet2);
        this.initialElementState = sceneElementN;
        Vector2D.Companion companion = Vector2D.INSTANCE;
        this.accum = companion.getZERO();
        this.prevSnapAccum = companion.getZERO();
        this.dampPixelsPerSecond = 0.0d;
        this.accumDx = 0.0f;
        this.accumDy = 0.0f;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Sis
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ControlPad.az(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty(MotionEvent motionEvent) {
        return "onTouchEvent:ACTION_DOWN: " + motionEvent.getX() + "," + motionEvent.getY();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControlPad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
