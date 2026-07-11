package com.alightcreative.app.motion.scene.rendering;

import HI0.qf;
import WzY.P;
import WzY.yg;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yc.iwV;
import z.KH;
import z.Md;
import z.Mf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a«\u0002\u00109\u001a\u000208*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0003\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00102\u0006\u0010,\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\u00102\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\u001a2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00107\u001a\u000206¢\u0006\u0004\b9\u0010:\"\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=\"\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=\" \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010F\"\u0014\u0010H\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010F\"\u0016\u0010I\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J\"\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Landroid/net/Uri;", "uri", "", "ptsMicros", "getCachedVideoPtsLessOrEqual", "(Landroid/net/Uri;J)Ljava/lang/Long;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentImpl;", "getRenderEnvFromCache", "()Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentImpl;", "renderEnv", "", "returnRenderEnvToCache", "(Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentImpl;)Z", "Lcom/alightcreative/app/motion/scene/Scene;", "LHI0/Q;", "contentResolver", "", "frame", "viewWidth", "viewHeight", "fullViewWidth", "fullViewHeight", "Lz/KH;", "gctx", "Lz/cA;", "videoTextureCache", "", "Lz/Z;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "editingSerail", "editMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "opaque", "elementId", "testBg", "topLevel", "Lcom/alightcreative/app/motion/scene/Rectangle;", "cropRect", "rootFPHS", "viewportIn", "optiRate", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "LcBL/j;", "watermarkOptions", "drawSelection", "Lyc/nKE;", "userPreviewMode", "", "renderWithGpu", "(Lcom/alightcreative/app/motion/scene/Scene;LHI0/Q;IIIIILz/KH;Lz/cA;Ljava/util/Map;Lcom/alightcreative/app/motion/scene/rendering/RenderMode;Lcom/alightcreative/app/motion/scene/SceneSelection;IILcom/alightcreative/app/motion/scene/SpoidEnv;ZLjava/lang/Long;ZZLcom/alightcreative/app/motion/scene/Rectangle;Ljava/lang/Integer;Lcom/alightcreative/app/motion/scene/Rectangle;ILjava/util/Map;Lcom/alightcreative/app/motion/scene/ExportParams;LcBL/j;ZLyc/nKE;)V", "LWzY/yg;", "snapPaint", "LWzY/yg;", "lassoFillPaint", "lassoEdgePaint", "", "", "ptsCache", "Ljava/util/Map;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "CHECK_COLOR_DARK", "Lcom/alightcreative/app/motion/scene/SolidColor;", "CHECK_COLOR_LIGHT", "PREVIEW_BACKGROUND_MATTE_COLOR", "renderDepth", "I", "", "renderEnvCacheInternal", "Ljava/util/List;", "Ljava/util/WeakHashMap;", "LaO/Pl;", "videoThumbnailMakerCache", "Ljava/util/WeakHashMap;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneRendering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneRendering.kt\ncom/alightcreative/app/motion/scene/rendering/SceneRenderingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,877:1\n1#2:878\n1#2:906\n381#3,7:879\n1755#4,3:886\n774#4:889\n865#4:890\n1755#4,3:891\n866#4:894\n1863#4:895\n1611#4,9:896\n1863#4:905\n1864#4:907\n1620#4:908\n1864#4:909\n1755#4,2:910\n1755#4,3:914\n1757#4:918\n774#4:919\n865#4,2:920\n1755#4,3:924\n1755#4,3:933\n1557#4:937\n1628#4,3:938\n1053#4:941\n1628#4,3:942\n188#5,2:912\n190#5:917\n188#5,2:922\n190#5:927\n188#5,3:928\n188#5,2:931\n190#5:936\n*S KotlinDebug\n*F\n+ 1 SceneRendering.kt\ncom/alightcreative/app/motion/scene/rendering/SceneRenderingKt\n*L\n343#1:906\n309#1:879,7\n321#1:886,3\n332#1:889\n332#1:890\n335#1:891,3\n332#1:894\n342#1:895\n343#1:896,9\n343#1:905\n343#1:907\n343#1:908\n342#1:909\n476#1:910,2\n479#1:914,3\n476#1:918\n499#1:919\n499#1:920,2\n516#1:924,3\n540#1:933,3\n498#1:937\n498#1:938,3\n498#1:941\n498#1:942,3\n478#1:912,2\n478#1:917\n515#1:922,2\n515#1:927\n527#1:928,3\n539#1:931,2\n539#1:936\n*E\n"})
public final class SceneRenderingKt {
    private static final SolidColor CHECK_COLOR_DARK;
    private static final SolidColor CHECK_COLOR_LIGHT;
    private static final SolidColor PREVIEW_BACKGROUND_MATTE_COLOR;
    private static final yg lassoEdgePaint;
    private static final yg lassoFillPaint;
    private static final Map<Uri, Object> ptsCache;
    private static int renderDepth;
    private static final List<RenderEnvironmentImpl> renderEnvCacheInternal;
    private static final yg snapPaint;
    private static final WeakHashMap<HI0.Q, aO.Pl> videoThumbnailMakerCache;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[iwV.values().length];
            try {
                iArr[iwV.f76013n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iwV.f76015t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iwV.f76012O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final void renderWithGpu(com.alightcreative.app.motion.scene.Scene r90, HI0.Q r91, int r92, int r93, int r94, int r95, int r96, z.KH r97, z.cA r98, java.util.Map<java.lang.Long, ? extends z.Z> r99, com.alightcreative.app.motion.scene.rendering.RenderMode r100, com.alightcreative.app.motion.scene.SceneSelection r101, int r102, @androidx.annotation.IdRes int r103, com.alightcreative.app.motion.scene.SpoidEnv r104, boolean r105, java.lang.Long r106, boolean r107, boolean r108, com.alightcreative.app.motion.scene.Rectangle r109, java.lang.Integer r110, com.alightcreative.app.motion.scene.Rectangle r111, int r112, java.util.Map<java.lang.String, com.alightcreative.app.motion.scene.userparam.UserParameterValue> r113, com.alightcreative.app.motion.scene.ExportParams r114, cBL.j r115, boolean r116, yc.nKE r117) {
        /*
            Method dump skipped, instruction units count: 4862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.scene.rendering.SceneRenderingKt.renderWithGpu(com.alightcreative.app.motion.scene.Scene, HI0.Q, int, int, int, int, int, z.KH, z.cA, java.util.Map, com.alightcreative.app.motion.scene.rendering.RenderMode, com.alightcreative.app.motion.scene.SceneSelection, int, int, com.alightcreative.app.motion.scene.SpoidEnv, boolean, java.lang.Long, boolean, boolean, com.alightcreative.app.motion.scene.Rectangle, java.lang.Integer, com.alightcreative.app.motion.scene.Rectangle, int, java.util.Map, com.alightcreative.app.motion.scene.ExportParams, cBL.j, boolean, yc.nKE):void");
    }

    static {
        yg ygVar = new yg();
        yg.w6 w6Var = yg.w6.f11694O;
        ygVar.ty(w6Var);
        ygVar.gh(SolidColor.INSTANCE.getRED());
        ygVar.az(2.0f);
        snapPaint = ygVar;
        yg ygVar2 = new yg();
        ygVar2.ty(yg.w6.f11697t);
        ygVar2.gh(SolidColor.copy$default(qf.t(-16711768), 0.0f, 0.0f, 0.0f, 0.5f, 7, null));
        lassoFillPaint = ygVar2;
        yg ygVar3 = new yg();
        ygVar3.ty(w6Var);
        ygVar3.gh(qf.t(-16711768));
        ygVar3.az(2.0f);
        lassoEdgePaint = ygVar3;
        ptsCache = new LinkedHashMap();
        CHECK_COLOR_DARK = new SolidColor(0.8f, 0.8f, 0.8f, 0.0f, 8, null);
        CHECK_COLOR_LIGHT = new SolidColor(0.9f, 0.9f, 0.9f, 0.0f, 8, null);
        PREVIEW_BACKGROUND_MATTE_COLOR = qf.t(-15460832);
        renderEnvCacheInternal = new ArrayList();
        videoThumbnailMakerCache = new WeakHashMap<>();
    }

    public static final Long getCachedVideoPtsLessOrEqual(Uri uri, long j2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Map<Uri, Object> map = ptsCache;
        synchronized (map) {
            android.support.v4.media.j.n(map.get(uri));
        }
        return null;
    }

    private static final RenderEnvironmentImpl getRenderEnvFromCache() {
        RenderEnvironmentImpl renderEnvironmentImpl;
        List<RenderEnvironmentImpl> list = renderEnvCacheInternal;
        synchronized (list) {
            renderEnvironmentImpl = (RenderEnvironmentImpl) XoT.qz.nr(list);
        }
        return renderEnvironmentImpl;
    }

    private static final void renderWithGpu$lambda$40$clearBackground(boolean z2, boolean z3, Long l2, boolean z4, SolidColor solidColor, KH kh, Rectangle rectangle, float f3, float f4, iwV iwv, RenderMode renderMode, yg ygVar, P p2, Scene scene) {
        if (z2) {
            return;
        }
        if (z3) {
            GLES20.glClearColor(0.25f, 0.0f, 0.0f, 0.25f);
            GLES20.glClear(17408);
            return;
        }
        if (l2 != null) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(17408);
            return;
        }
        if (z4 && solidColor.getA() < 1.0f) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(17408);
            float fIk = kh.Ik() / rectangle.getWidth();
            float fHI = kh.HI() / rectangle.getHeight();
            if (f3 > f4) {
                fIk = fHI;
            }
            float f5 = 1.0f / fIk;
            Mf.n(kh).render(Md.nr.n(), CHECK_COLOR_DARK, CHECK_COLOR_LIGHT, 25.0f, new Vector4D(-(((-rectangle.getLeft()) / rectangle.getWidth()) * kh.Ik()), -(((-rectangle.getTop()) / rectangle.getHeight()) * kh.HI()), f5, f5), z.UGc.J2());
            return;
        }
        if (renderDepth > 1 || iwv == iwV.f76015t || renderMode == RenderMode.THUMB || renderMode == RenderMode.SCENE_THUMB) {
            GLES20.glClearColor(solidColor.getR(), solidColor.getG(), solidColor.getB(), solidColor.getA());
            GLES20.glClear(17408);
            return;
        }
        if (renderMode == RenderMode.EXPORT) {
            GLES20.glClearColor(solidColor.getR(), solidColor.getG(), solidColor.getB(), solidColor.getA());
            GLES20.glClear(17408);
        } else {
            renderWithGpu$lambda$40$clearToMatteColor();
        }
        ygVar.gh(solidColor);
        p2.gh(0.0f, 0.0f, scene.getWidth(), scene.getHeight(), ygVar);
    }

    private static final void renderWithGpu$lambda$40$clearBackgroundInTheBacking(boolean z2, boolean z3, Long l2, boolean z4, SolidColor solidColor, iwV iwv, RenderMode renderMode, yg ygVar, P p2, Scene scene) {
        if (z2) {
            return;
        }
        if (z3) {
            GLES20.glClearColor(0.25f, 0.0f, 0.0f, 0.25f);
            GLES20.glClear(17408);
            return;
        }
        if (l2 != null) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(17408);
            return;
        }
        if (!z4 || solidColor.getA() >= 1.0f) {
            if (renderDepth > 1 || iwv == iwV.f76015t || renderMode == RenderMode.THUMB || renderMode == RenderMode.SCENE_THUMB) {
                GLES20.glClearColor(solidColor.getR(), solidColor.getG(), solidColor.getB(), solidColor.getA());
                GLES20.glClear(17408);
                return;
            }
            if (renderMode == RenderMode.EXPORT) {
                GLES20.glClearColor(solidColor.getR(), solidColor.getG(), solidColor.getB(), solidColor.getA());
                GLES20.glClear(17408);
            } else {
                renderWithGpu$lambda$40$clearToMatteColor();
            }
            ygVar.gh(solidColor);
            p2.gh(0.0f, 0.0f, scene.getWidth(), scene.getHeight(), ygVar);
        }
    }

    private static final void renderWithGpu$lambda$40$clearToMatteColor() {
        SolidColor solidColor = PREVIEW_BACKGROUND_MATTE_COLOR;
        GLES20.glClearColor(solidColor.getR(), solidColor.getG(), solidColor.getB(), solidColor.getA());
        GLES20.glClear(17408);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$28(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3) {
        return "Cache Index frontEndDepth:" + intRef.element + ", minBackStartDepth:" + intRef2.element + ", backStartDepth:" + intRef3.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$29(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$30(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] SKIP Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$31(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$32(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] SKIP Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$33(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$34(SceneElement sceneElement, int i2, float f3) {
        return StringsKt.repeat(".   ", renderDepth) + "[renderWithGpu] SKIP Render Element type=" + sceneElement.getType() + " id=" + sceneElement.getId() + " label=" + sceneElement.getLabel() + " t=" + i2 + " st=" + sceneElement.getStartTime() + " e=" + sceneElement.getEndTime() + " p=" + f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$39(int i2, int i3, int i5, long j2) {
        return StringsKt.repeat(".   ", renderDepth - 1) + "[renderWithGpu] viewSize(" + i2 + "," + i3 + ") End frame " + i5 + " (depth=" + renderDepth + FijIa.ErqACCPURa + ((System.nanoTime() - j2) / ((long) 1000000)) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$7(int i2, RenderMode renderMode, boolean z2, Scene scene, int i3, int i5, int i7) {
        return StringsKt.repeat(".   ", renderDepth - 1) + "[renderWithGpu] Start frame " + i2 + " : depth=" + renderDepth + " renderMode=" + renderMode + " opaque=" + z2 + " needChecker=" + (z2 && scene.getBackground().getA() < 1.0f) + " viewSize=" + i3 + "," + i5 + " optiRate=" + i7;
    }

    private static final List<SceneElement> renderWithGpu$lambda$40$sortByZ(List<SceneElement> list, int i2, Scene scene) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SceneElement sceneElement : list) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElement, i2);
            Scene scene2 = scene;
            arrayList.add(TuplesKt.to(Float.valueOf(((Vector3D) KeyableKt.valueAtTime(ScriptExecutorKt.runScripts$default(LayerParentingKt.applyLayerParenting(sceneElement, scene, fFractionalTime), fFractionalTime, scene2, null, null, false, null, 60, null).getTransform().getLocation(), fFractionalTime)).getZ()), sceneElement));
            scene = scene2;
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.alightcreative.app.motion.scene.rendering.SceneRenderingKt$renderWithGpu$lambda$40$sortByZ$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t4) {
                return ComparisonsKt.compareValues(Float.valueOf(-((Number) ((Pair) t3).getFirst()).floatValue()), Float.valueOf(-((Number) ((Pair) t4).getFirst()).floatValue()));
            }
        });
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add((SceneElement) ((Pair) it.next()).getSecond());
        }
        return arrayList2;
    }

    private static final boolean returnRenderEnvToCache(RenderEnvironmentImpl renderEnvironmentImpl) {
        boolean zAdd;
        List<RenderEnvironmentImpl> list = renderEnvCacheInternal;
        synchronized (list) {
            zAdd = list.add(renderEnvironmentImpl);
        }
        return zAdd;
    }

    private static final void renderWithGpu$lambda$40$adjustMatrix(KH kh, float f3, float f4, P p2, Rectangle rectangle) {
        float f5;
        float fIk = kh.Ik() / rectangle.getWidth();
        float fHI = kh.HI() / rectangle.getHeight();
        if (f3 > f4) {
            f5 = fHI;
        } else {
            f5 = fIk;
        }
        p2.GD();
        Matrix matrix = new Matrix();
        if (renderDepth > 1) {
            matrix.postScale(fIk, fHI);
        } else {
            matrix.postScale(f5, f5);
        }
        matrix.postTranslate(((-rectangle.getLeft()) / rectangle.getWidth()) * kh.Ik(), ((-rectangle.getTop()) / rectangle.getHeight()) * kh.HI());
        p2.hRu(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$14(int i2, int i3, P p2, Long l2, RenderMode renderMode) {
        return "renderWithGpu viewSize=" + i2 + "x" + i3 + " logical=" + p2.ul() + "x" + p2.aYN() + " scale=" + p2.Uo() + " elementId=" + l2 + " renderMode=" + renderMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithGpu$lambda$40$lambda$37(KH kh, Scene scene, Vector2D vector2D, int i2) {
        int iIk = kh.Ik();
        int iHI = kh.HI();
        int width = scene.getWidth();
        int height = scene.getHeight();
        int x2 = (int) vector2D.getX();
        int y2 = (int) vector2D.getY();
        String str = String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return "SPOID gctxSize=(" + iIk + "," + iHI + ") scene=(" + width + "," + height + ") glReadPixels(" + x2 + ", " + y2 + " color=" + str + ")";
    }
}
