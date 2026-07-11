package WzY;

import WzY.yg;
import android.content.Context;
import android.graphics.Matrix;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.EdgeDecoration;
import com.alightcreative.app.motion.scene.EdgeDecorationDirection;
import com.alightcreative.app.motion.scene.EdgeDecorationType;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.UIColors;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yc.RP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Matrix f11610n = new Matrix();
    private static final SolidColor rl = new SolidColor(0.8f, 0.8f, 0.8f, 0.0f, 8, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SolidColor f11611t = new SolidColor(0.9f, 0.9f, 0.9f, 0.0f, 8, null);
    private static final yg nr = new yg();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final C1487z f11609O = new C1487z();

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EnumC1485c.values().length];
            try {
                iArr[EnumC1485c.f11625O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1485c.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1485c.f11634r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1485c.f11629Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1485c.f11633o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1485c.f11626S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1485c.f11631g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC1485c.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC1485c.f11628X.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC1485c.f11627T.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC1485c.f11630e.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC1485c.f11624N.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC1485c.f11635t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EdgeDecorationDirection.values().length];
            try {
                iArr2[EdgeDecorationDirection.INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EdgeDecorationDirection.OUTSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EdgeDecorationDirection.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EdgeDecorationType.values().length];
            try {
                iArr3[EdgeDecorationType.BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[EdgeDecorationType.SHADOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[EdgeDecorationType.GLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EdgeDecorationType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List HI(List list) {
        VisualEffectRef visualEffectRef;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        VisualEffectRef visualEffectRef2 = null;
        EdgeDecoration edgeDecoration = null;
        while (it.hasNext()) {
            EdgeDecoration edgeDecoration2 = (EdgeDecoration) it.next();
            int i2 = j.$EnumSwitchMapping$2[edgeDecoration2.getType().ordinal()];
            if (i2 == 1) {
                arrayList.add(edgeDecoration2);
            } else if (i2 != 2) {
                continue;
            } else {
                int i3 = j.$EnumSwitchMapping$1[edgeDecoration2.getDirection().ordinal()];
                if (i3 == 1) {
                    continue;
                } else if (i3 == 2) {
                    edgeDecoration = edgeDecoration2;
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if (arrayList.isEmpty()) {
            visualEffectRef = null;
        } else {
            EdgeDecoration edgeDecoration3 = (EdgeDecoration) CollectionsKt.singleOrNull((List) arrayList);
            if (edgeDecoration3 != null) {
                int i5 = j.$EnumSwitchMapping$1[edgeDecoration3.getDirection().ordinal()];
                if (i5 == 1) {
                    str = "com.alightcreative.internal.border-inside";
                } else if (i5 == 2) {
                    str = "com.alightcreative.internal.border-outside";
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "com.alightcreative.internal.border-center";
                }
                visualEffectRef = new VisualEffectRef(str, MapsKt.mapOf(TuplesKt.to("b0size", new UserParameterValue(edgeDecoration3.getSize())), TuplesKt.to("b0color", new UserParameterValue(edgeDecoration3.getColor()))), 0, SetsKt.emptySet());
            } else {
                Float fMaxOrNull = SequencesKt.maxOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(arrayList), new Function1() { // from class: WzY.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(SPz.ck((EdgeDecoration) obj));
                    }
                }));
                Intrinsics.checkNotNull(fMaxOrNull);
                float fFloatValue = fMaxOrNull.floatValue();
                Iterator it2 = SequencesKt.mapIndexed(CollectionsKt.asSequence(arrayList), new Function2() { // from class: WzY.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SPz.Ik(((Integer) obj).intValue(), (EdgeDecoration) obj2);
                    }
                }).iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty sequence can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = MapsKt.plus((Map) next, (Map) it2.next());
                }
                Map map = (Map) next;
                int size = arrayList.size();
                visualEffectRef = new VisualEffectRef(size != 2 ? size != 3 ? "com.alightcreative.internal.border" : "com.alightcreative.internal.border-three" : "com.alightcreative.internal.border-two", MapsKt.plus(map, TuplesKt.to("maxsize", new UserParameterValue(fFloatValue))), 0, SetsKt.emptySet());
            }
        }
        if (edgeDecoration != null) {
            Pair pair = TuplesKt.to("sigma", new UserParameterValue(edgeDecoration.getSize() * 1.0f));
            Pair pair2 = TuplesKt.to("alpha", new UserParameterValue(edgeDecoration.getAlpha()));
            SolidColor color = edgeDecoration.getColor();
            if (color == null) {
                color = SolidColor.INSTANCE.getBLACK();
            }
            Pair pair3 = TuplesKt.to(TtmlNode.ATTR_TTS_COLOR, new UserParameterValue(color));
            Vector2D offset = edgeDecoration.getOffset();
            Pair pair4 = TuplesKt.to("sdx", new UserParameterValue(offset != null ? offset.getX() : 0.0f));
            Vector2D offset2 = edgeDecoration.getOffset();
            visualEffectRef2 = new VisualEffectRef("com.alightcreative.internal.shadow", MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("sdy", new UserParameterValue(offset2 != null ? offset2.getY() : 0.0f))), 0, SetsKt.emptySet());
        }
        return (visualEffectRef == null || visualEffectRef2 == null) ? visualEffectRef != null ? CollectionsKt.listOf(visualEffectRef) : visualEffectRef2 != null ? CollectionsKt.listOf(visualEffectRef2) : CollectionsKt.emptyList() : CollectionsKt.listOf((Object[]) new VisualEffectRef[]{visualEffectRef, visualEffectRef2});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Ik(int i2, EdgeDecoration border) {
        Intrinsics.checkNotNullParameter(border, "border");
        Pair pair = TuplesKt.to("b" + i2 + "size", new UserParameterValue(border.getSize()));
        Pair pair2 = TuplesKt.to("b" + i2 + TtmlNode.ATTR_TTS_COLOR, new UserParameterValue(border.getColor()));
        String str = "b" + i2 + "direction";
        int i3 = j.$EnumSwitchMapping$1[border.getDirection().ordinal()];
        int i5 = 1;
        if (i3 == 1) {
            i5 = -1;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = 0;
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to(str, new UserParameterValue(i5)));
    }

    public static final void KN(s4 s4Var, Vector2D start, Vector2D end, yg paint) {
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(paint, "paint");
        s4Var.fD(start.getX(), start.getY(), end.getX(), end.getY(), paint);
    }

    public static final void az(s4 s4Var, Rectangle rect, EnumC1485c style) {
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(style, "style");
        C1487z c1487z = f11609O;
        c1487z.ijL();
        c1487z.WPU(rect);
        qie(s4Var, c1487z, style, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ck(EdgeDecoration it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSize();
    }

    public static final void gh(s4 s4Var, C1487z path, EnumC1485c style, List points, SolidColor solidColor) {
        s4 s4Var2 = s4Var;
        Intrinsics.checkNotNullParameter(s4Var2, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(points, "points");
        s4Var2.O();
        yg ygVar = nr;
        yg.w6 w6Var = yg.w6.f11694O;
        ygVar.ty(w6Var);
        s4Var2.xMQ(false);
        float optiRate = (1.0f / s4Var2.ck().getOptiRate()) / RP.KN(s4Var2.ck().getUserPreviewMode());
        UIColors uiColors = s4Var2.ck().getUiColors();
        switch (j.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                ygVar.az(ty(s4Var2, 2131166351) * optiRate);
                ygVar.gh(uiColors.getSingleSelectionBg());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * optiRate);
                ygVar.gh(uiColors.getSingleSelectionFg());
                s4Var2.te(path, ygVar);
                break;
            case 2:
                ygVar.az(ty(s4Var2, 2131166222) * optiRate);
                ygVar.gh(uiColors.getMultiSelectionShade());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166220) * optiRate);
                ygVar.gh(uiColors.getMultiSelectionBg());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166221) * optiRate);
                ygVar.gh(uiColors.getMultiSelectionFg());
                s4Var2.te(path, ygVar);
                break;
            case 3:
                ygVar.az(ty(s4Var2, 2131166351) * optiRate);
                ygVar.gh(uiColors.getSelectableHintBg());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * optiRate);
                ygVar.gh(uiColors.getSelectableHintFg());
                s4Var2.te(path, ygVar);
                break;
            case 4:
                ygVar.az(ty(s4Var2, 2131166351) * 0.75f * optiRate);
                ygVar.gh(uiColors.getSingleSelectionBg());
                ygVar.xMQ(0.2f);
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * 0.75f * optiRate);
                ygVar.gh(uiColors.getSingleSelectionFg());
                ygVar.xMQ(0.4f);
                s4Var2.te(path, ygVar);
                break;
            case 5:
                ygVar.az(ty(s4Var2, 2131166351) * 0.75f * optiRate);
                ygVar.gh(uiColors.getSingleSelectionBg());
                ygVar.xMQ(0.35f);
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * 0.75f * optiRate);
                ygVar.gh(uiColors.getSingleSelectionFg());
                ygVar.xMQ(0.6f);
                s4Var2.te(path, ygVar);
                break;
            case 6:
                ygVar.az(ty(s4Var2, 2131166351) * optiRate);
                ygVar.gh(uiColors.getOutlineEditBg());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * optiRate);
                ygVar.gh(uiColors.getOutlineEditFg());
                s4Var2.te(path, ygVar);
                break;
            case 7:
                ygVar.az(ty(s4Var2, 2131166351) * optiRate);
                ygVar.gh(uiColors.getDetailEditBg());
                s4Var2.te(path, ygVar);
                ygVar.az(ty(s4Var2, 2131166352) * optiRate);
                ygVar.gh(uiColors.getDetailEditFg());
                s4Var2.te(path, ygVar);
                break;
            case 8:
                ygVar.az(ty(s4Var2, 2131166020) * optiRate);
                ygVar.gh(uiColors.getMotionPathBg());
                s4Var2.te(path, ygVar);
                ygVar.ty(yg.w6.f11697t);
                Iterator it = points.iterator();
                while (it.hasNext()) {
                    l3D l3d = (l3D) it.next();
                    if (l3d.t()) {
                        yg ygVar2 = nr;
                        ygVar2.ty(yg.w6.f11694O);
                        float fTy = ty(s4Var2, 2131166018) * 2.0f * optiRate;
                        s4Var2.Z(l3d.rl().getX(), l3d.rl().getY(), fTy, ygVar2);
                        float f3 = fTy * 1.3f * optiRate;
                        s4Var2.fD(l3d.rl().getX() - f3, l3d.rl().getY(), l3d.rl().getX() + f3, l3d.rl().getY(), ygVar2);
                        s4Var2 = s4Var;
                        s4Var2.fD(l3d.rl().getX(), l3d.rl().getY() - f3, l3d.rl().getX(), l3d.rl().getY() + f3, ygVar2);
                        ygVar2.ty(yg.w6.f11697t);
                    } else {
                        s4Var2.Z(l3d.rl().getX(), l3d.rl().getY(), ty(s4Var2, 2131166018) * optiRate * (l3d.n() ? 1.5f : 1.0f), nr);
                    }
                }
                yg ygVar3 = nr;
                ygVar3.ty(yg.w6.f11694O);
                ygVar3.az(ty(s4Var2, 2131166021) * optiRate);
                ygVar3.gh(uiColors.getMotionPathFg());
                s4Var2.te(path, ygVar3);
                ygVar3.ty(yg.w6.f11697t);
                Iterator it2 = points.iterator();
                while (it2.hasNext()) {
                    l3D l3d2 = (l3D) it2.next();
                    yg ygVar4 = nr;
                    ygVar4.gh(l3d2.n() ? uiColors.getActivePointFg() : uiColors.getMotionPathFg());
                    if (l3d2.t()) {
                        ygVar4.ty(yg.w6.f11694O);
                        s4Var2.Z(l3d2.rl().getX(), l3d2.rl().getY(), ty(s4Var2, 2131166019) * 2.0f * optiRate, ygVar4);
                        ygVar4.ty(yg.w6.f11697t);
                    } else {
                        s4Var2.Z(l3d2.rl().getX(), l3d2.rl().getY(), ty(s4Var2, 2131166019) * optiRate * (l3d2.n() ? 1.5f : 1.0f), ygVar4);
                    }
                }
                break;
            case 9:
                ygVar.az(ty(s4Var2, 2131165419) * optiRate);
                ygVar.gh(uiColors.getOutlineEditBg());
                s4Var2.te(path, ygVar);
                ygVar.ty(yg.w6.f11697t);
                Iterator it3 = points.iterator();
                while (it3.hasNext()) {
                    l3D l3d3 = (l3D) it3.next();
                    s4Var2.Z(l3d3.rl().getX(), l3d3.rl().getY(), ty(s4Var2, 2131165417) * optiRate * (l3d3.n() ? 1.5f : 1.0f), nr);
                }
                yg ygVar5 = nr;
                ygVar5.ty(yg.w6.f11694O);
                ygVar5.az(ty(s4Var2, 2131165420) * optiRate);
                ygVar5.gh(uiColors.getOutlineEditFg());
                s4Var2.te(path, ygVar5);
                ygVar5.ty(yg.w6.f11697t);
                Iterator it4 = points.iterator();
                while (it4.hasNext()) {
                    l3D l3d4 = (l3D) it4.next();
                    yg ygVar6 = nr;
                    ygVar6.gh(l3d4.n() ? uiColors.getActivePointFg() : uiColors.getMotionPathFg());
                    s4Var2.Z(l3d4.rl().getX(), l3d4.rl().getY(), ty(s4Var2, 2131165418) * optiRate * (l3d4.n() ? 1.5f : 1.0f), ygVar6);
                }
                break;
            case 10:
                ygVar.az(ty(s4Var2, 2131165419) * 0.75f * optiRate);
                ygVar.gh(uiColors.getOutlineEditBg());
                s4Var2.te(path, ygVar);
                ygVar.ty(yg.w6.f11697t);
                Iterator it5 = points.iterator();
                while (it5.hasNext()) {
                    l3D l3d5 = (l3D) it5.next();
                    s4Var2.Z(l3d5.rl().getX(), l3d5.rl().getY(), ty(s4Var2, 2131165417) * 0.5f * optiRate, nr);
                }
                yg ygVar7 = nr;
                ygVar7.ty(yg.w6.f11694O);
                ygVar7.az(ty(s4Var2, 2131165420) * 0.75f * optiRate);
                ygVar7.gh(uiColors.getOutlineEditFg());
                s4Var2.te(path, ygVar7);
                ygVar7.ty(yg.w6.f11697t);
                Iterator it6 = points.iterator();
                while (it6.hasNext()) {
                    l3D l3d6 = (l3D) it6.next();
                    yg ygVar8 = nr;
                    ygVar8.gh(l3d6.n() ? uiColors.getActivePointFg() : uiColors.getMotionPathFg());
                    s4Var2.Z(l3d6.rl().getX(), l3d6.rl().getY(), ty(s4Var2, 2131165418) * 0.5f * optiRate, ygVar8);
                }
                break;
            case 11:
                ygVar.az((ty(s4Var2, 2131166020) / 2.0f) * optiRate);
                ygVar.gh(uiColors.getMotionPathBg());
                float f4 = 3;
                ygVar.xMQ(ygVar.t() / f4);
                s4Var2.te(path, ygVar);
                ygVar.ty(yg.w6.f11697t);
                Iterator it7 = points.iterator();
                while (it7.hasNext()) {
                    l3D l3d7 = (l3D) it7.next();
                    s4Var2.Z(l3d7.rl().getX(), l3d7.rl().getY(), ty(s4Var2, 2131166018) * 0.5f * optiRate, nr);
                }
                yg ygVar9 = nr;
                yg.w6 w6Var2 = yg.w6.f11694O;
                ygVar9.ty(w6Var2);
                ygVar9.az((ty(s4Var2, 2131166021) / 2.0f) * optiRate);
                ygVar9.gh(uiColors.getMotionPathFg());
                ygVar9.xMQ(ygVar9.t() / f4);
                s4Var2.te(path, ygVar9);
                ygVar9.ty(w6Var2);
                ygVar9.az((ty(s4Var2, 2131166021) / 2.0f) * optiRate);
                ygVar9.gh(uiColors.getMotionPathFg());
                ygVar9.xMQ(ygVar9.t() / f4);
                Iterator it8 = points.iterator();
                while (it8.hasNext()) {
                    l3D l3d8 = (l3D) it8.next();
                    s4Var2.Z(l3d8.rl().getX(), l3d8.rl().getY(), ty(s4Var2, 2131166019) * 0.5f * optiRate, nr);
                }
                break;
            case 12:
                ygVar.az(ty(s4Var2, 2131166020));
                ygVar.gh(uiColors.getMotionPathBg());
                ygVar.xMQ(ygVar.t() * 0.6f);
                s4Var2.te(path, ygVar);
                ygVar.ty(w6Var);
                ygVar.az(ty(s4Var2, 2131166021));
                ygVar.gh(solidColor == null ? uiColors.getMotionPathFg() : solidColor);
                ygVar.xMQ(ygVar.t() * 0.6f);
                s4Var2.te(path, ygVar);
                break;
            case 13:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        s4Var2.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D mUb(float f3, Vector2D vector2D, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.plus(GeometryKt.times(it, f3), vector2D);
    }

    public static /* synthetic */ void qie(s4 s4Var, C1487z c1487z, EnumC1485c enumC1485c, List list, SolidColor solidColor, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            enumC1485c = EnumC1485c.f11625O;
        }
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            solidColor = null;
        }
        gh(s4Var, c1487z, enumC1485c, list, solidColor);
    }

    public static final void r(C1487z c1487z, Transform transform) {
        Intrinsics.checkNotNullParameter(c1487z, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        c1487z.Mx(transform.getMatrix());
    }

    public static final float ty(s4 s4Var, int i2) {
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        Context contextRl = s4Var.ck().getContentResolver().rl();
        Intrinsics.checkNotNull(contextRl);
        return contextRl.getResources().getDimension(i2) * s4Var.Uo() * (com.alightcreative.app.motion.persist.j.INSTANCE.getLowQualityPreview() ? 0.5f : 1.0f);
    }

    public static final void xMQ(s4 s4Var, Sis path, final Vector2D position, final float f3, yg paint) {
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(paint, "paint");
        s4Var.te(OU.nr(path, new Function1() { // from class: WzY.UGc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SPz.mUb(f3, position, (Vector2D) obj);
            }
        }), paint);
    }
}
