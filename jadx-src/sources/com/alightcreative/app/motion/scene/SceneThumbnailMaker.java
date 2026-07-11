package com.alightcreative.app.motion.scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneRenderingKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import d.AbstractC1951j;
import java.nio.IntBuffer;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0017JA\u0010\u001e\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R#\u0010E\u001a\n -*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010IR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00120Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010S¨\u0006W"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "Lcom/alightcreative/mediacore/naxyasync/o;", "", "contextTag", "Landroid/content/Context;", "context", "", "width", "height", "<init>", "(Ljava/lang/String;Landroid/content/Context;II)V", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "elementId", "time", "", "opaque", "Landroid/graphics/Bitmap;", "makeThumbnailInternal", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/Long;Ljava/lang/Integer;Z)Landroid/graphics/Bitmap;", "", "onStart", "()V", "doWork", "onStop", "release", "releaseResources", "Lkotlin/Function1;", "completion", "makeThumbnailAsync", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/Long;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "makeThumbnail", "Ljava/lang/String;", "getContextTag", "()Ljava/lang/String;", "I", "getWidth", "()I", "getHeight", "LHI0/OU;", "rmgr", "LHI0/OU;", "AUTO_RELEASE_TIMEOUT", "J", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "LHI0/Q;", "contentResolver", "LHI0/Q;", "Lz/mz;", "gctx", "Lz/mz;", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "emptyBitmap$delegate", "LHI0/xZD;", "getEmptyBitmap", "()Landroid/graphics/Bitmap;", "emptyBitmap", "Lz/tI;", "textureCache", "Lz/tI;", "Ljava/nio/IntBuffer;", "pixels$delegate", "getPixels", "()Ljava/nio/IntBuffer;", "pixels", "", "pixelArray$delegate", "getPixelArray", "()[I", "pixelArray", "convertArray$delegate", "getConvertArray", "convertArray", "Ljava/lang/Runnable;", "releaseResourcesRunnable", "Ljava/lang/Runnable;", "Ljava/util/WeakHashMap;", "sceneThumbnailCache", "Ljava/util/WeakHashMap;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "elementThumbnailCache", "sceneOpaqueThumbnailCache", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneThumbnailMaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneThumbnailMaker.kt\ncom/alightcreative/app/motion/scene/SceneThumbnailMaker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
public final class SceneThumbnailMaker extends com.alightcreative.mediacore.naxyasync.o {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SceneThumbnailMaker.class, "emptyBitmap", "getEmptyBitmap()Landroid/graphics/Bitmap;", 0)), Reflection.property1(new PropertyReference1Impl(SceneThumbnailMaker.class, "pixels", "getPixels()Ljava/nio/IntBuffer;", 0)), Reflection.property1(new PropertyReference1Impl(SceneThumbnailMaker.class, "pixelArray", "getPixelArray()[I", 0)), Reflection.property1(new PropertyReference1Impl(SceneThumbnailMaker.class, "convertArray", "getConvertArray()[I", 0))};
    public static final int $stable = 8;
    private final long AUTO_RELEASE_TIMEOUT;
    private final Context appContext;
    private final HI0.Q contentResolver;
    private final String contextTag;

    /* JADX INFO: renamed from: convertArray$delegate, reason: from kotlin metadata */
    private final HI0.xZD convertArray;
    private final WeakHashMap<SceneElement, Bitmap> elementThumbnailCache;

    /* JADX INFO: renamed from: emptyBitmap$delegate, reason: from kotlin metadata */
    private final HI0.xZD emptyBitmap;
    private z.mz gctx;
    private final int height;

    /* JADX INFO: renamed from: pixelArray$delegate, reason: from kotlin metadata */
    private final HI0.xZD pixelArray;

    /* JADX INFO: renamed from: pixels$delegate, reason: from kotlin metadata */
    private final HI0.xZD pixels;
    private final Runnable releaseResourcesRunnable;
    private final HI0.OU rmgr;
    private final WeakHashMap<Scene, Bitmap> sceneOpaqueThumbnailCache;
    private final WeakHashMap<Scene, Bitmap> sceneThumbnailCache;
    private z.tI textureCache;
    private final Handler uiThreadHandler;
    private final int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneThumbnailMaker(String contextTag, Context context, int i2, int i3) {
        super(0L, false, 3, null);
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        Intrinsics.checkNotNullParameter(context, "context");
        this.contextTag = contextTag;
        this.width = i2;
        this.height = i3;
        HI0.OU ou2 = new HI0.OU();
        this.rmgr = ou2;
        this.AUTO_RELEASE_TIMEOUT = 2000L;
        this.appContext = context.getApplicationContext();
        this.contentResolver = new HI0.Q(context);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.emptyBitmap = new HI0.xZD(ou2, new Function0() { // from class: com.alightcreative.app.motion.scene.oXP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.emptyBitmap_delegate$lambda$0(this.f46157n);
            }
        });
        this.pixels = new HI0.xZD(ou2, new Function0() { // from class: com.alightcreative.app.motion.scene.U4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.pixels_delegate$lambda$1(this.f46038n);
            }
        });
        this.pixelArray = new HI0.xZD(ou2, new Function0() { // from class: com.alightcreative.app.motion.scene.h6y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.pixelArray_delegate$lambda$2(this.f46087n);
            }
        });
        this.convertArray = new HI0.xZD(ou2, new Function0() { // from class: com.alightcreative.app.motion.scene.lS
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.convertArray_delegate$lambda$3(this.f46100n);
            }
        });
        startWorker();
        this.releaseResourcesRunnable = new Runnable() { // from class: com.alightcreative.app.motion.scene.tI
            @Override // java.lang.Runnable
            public final void run() {
                this.f46336n.releaseResources();
            }
        };
        this.sceneThumbnailCache = new WeakHashMap<>();
        this.elementThumbnailCache = new WeakHashMap<>();
        this.sceneOpaqueThumbnailCache = new WeakHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] convertArray_delegate$lambda$3(SceneThumbnailMaker sceneThumbnailMaker) {
        return new int[sceneThumbnailMaker.width * sceneThumbnailMaker.height];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap emptyBitmap_delegate$lambda$0(SceneThumbnailMaker sceneThumbnailMaker) {
        return Bitmap.createBitmap(sceneThumbnailMaker.width, sceneThumbnailMaker.height, Bitmap.Config.ARGB_8888);
    }

    private final int[] getConvertArray() {
        return (int[]) this.convertArray.n(this, $$delegatedProperties[3]);
    }

    private final Bitmap getEmptyBitmap() {
        return (Bitmap) this.emptyBitmap.n(this, $$delegatedProperties[0]);
    }

    private final int[] getPixelArray() {
        return (int[]) this.pixelArray.n(this, $$delegatedProperties[2]);
    }

    private final IntBuffer getPixels() {
        return (IntBuffer) this.pixels.n(this, $$delegatedProperties[1]);
    }

    public static /* synthetic */ Bitmap makeThumbnail$default(SceneThumbnailMaker sceneThumbnailMaker, Scene scene, Long l2, Integer num, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return sceneThumbnailMaker.makeThumbnail(scene, l2, num, z2);
    }

    public static /* synthetic */ void makeThumbnailAsync$default(SceneThumbnailMaker sceneThumbnailMaker, Scene scene, Long l2, Integer num, Function1 function1, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            l2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        sceneThumbnailMaker.makeThumbnailAsync(scene, l2, num, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.graphics.Bitmap] */
    public static final Unit makeThumbnailAsync$lambda$22(final Ref.ObjectRef objectRef, SceneThumbnailMaker sceneThumbnailMaker, Scene scene, Long l2, Integer num, CountDownLatch countDownLatch, final AtomicBoolean atomicBoolean, final Function1 function1) {
        objectRef.element = makeThumbnailInternal$default(sceneThumbnailMaker, scene, l2, num, false, 8, null);
        sceneThumbnailMaker.uiThreadHandler.post(new Runnable() { // from class: com.alightcreative.app.motion.scene.Pp
            @Override // java.lang.Runnable
            public final void run() {
                SceneThumbnailMaker.makeThumbnailAsync$lambda$22$lambda$21(objectRef, atomicBoolean, function1);
            }
        });
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void makeThumbnailAsync$lambda$22$lambda$21(Ref.ObjectRef objectRef, AtomicBoolean atomicBoolean, Function1 function1) {
        Bitmap bitmap = (Bitmap) objectRef.element;
        if (bitmap == null || atomicBoolean.getAndSet(true)) {
            return;
        }
        function1.invoke(bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x016f A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018a A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198 A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a6 A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4 A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c2 A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cf A[Catch: all -> 0x0176, Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d9 A[Catch: all -> 0x0176, Exception -> 0x017a, TRY_LEAVE, TryCatch #12 {Exception -> 0x017a, blocks: (B:105:0x0169, B:107:0x016f, B:113:0x0182, B:115:0x018a, B:116:0x0190, B:118:0x0198, B:119:0x019e, B:121:0x01a6, B:122:0x01ac, B:124:0x01b4, B:125:0x01ba, B:127:0x01c2, B:129:0x01c9, B:131:0x01cf, B:133:0x01d9), top: B:224:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0257 A[Catch: all -> 0x0260, Exception -> 0x0263, TryCatch #18 {Exception -> 0x0263, all -> 0x0260, blocks: (B:141:0x0231, B:143:0x0257, B:153:0x0282, B:154:0x0299, B:155:0x029c, B:148:0x0266), top: B:229:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0266 A[Catch: all -> 0x0260, Exception -> 0x0263, TryCatch #18 {Exception -> 0x0263, all -> 0x0260, blocks: (B:141:0x0231, B:143:0x0257, B:153:0x0282, B:154:0x0299, B:155:0x029c, B:148:0x0266), top: B:229:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8 A[Catch: all -> 0x0095, Exception -> 0x0099, TryCatch #10 {all -> 0x0095, blocks: (B:47:0x0089, B:49:0x008e, B:55:0x009f, B:57:0x00ab, B:59:0x00af, B:60:0x00b5, B:62:0x00bd, B:65:0x00c3, B:67:0x00c9, B:69:0x00cd, B:70:0x00d3, B:72:0x00db, B:75:0x00e1, B:83:0x0104, B:85:0x010a, B:87:0x010e, B:89:0x0118, B:92:0x0125, B:99:0x0147, B:101:0x015c, B:94:0x012c, B:97:0x0141, B:78:0x00e8, B:80:0x00f4, B:81:0x00fa), top: B:220:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104 A[Catch: all -> 0x0095, Exception -> 0x0099, TryCatch #10 {all -> 0x0095, blocks: (B:47:0x0089, B:49:0x008e, B:55:0x009f, B:57:0x00ab, B:59:0x00af, B:60:0x00b5, B:62:0x00bd, B:65:0x00c3, B:67:0x00c9, B:69:0x00cd, B:70:0x00d3, B:72:0x00db, B:75:0x00e1, B:83:0x0104, B:85:0x010a, B:87:0x010e, B:89:0x0118, B:92:0x0125, B:99:0x0147, B:101:0x015c, B:94:0x012c, B:97:0x0141, B:78:0x00e8, B:80:0x00f4, B:81:0x00fa), top: B:220:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125 A[Catch: all -> 0x0095, Exception -> 0x0099, TryCatch #10 {all -> 0x0095, blocks: (B:47:0x0089, B:49:0x008e, B:55:0x009f, B:57:0x00ab, B:59:0x00af, B:60:0x00b5, B:62:0x00bd, B:65:0x00c3, B:67:0x00c9, B:69:0x00cd, B:70:0x00d3, B:72:0x00db, B:75:0x00e1, B:83:0x0104, B:85:0x010a, B:87:0x010e, B:89:0x0118, B:92:0x0125, B:99:0x0147, B:101:0x015c, B:94:0x012c, B:97:0x0141, B:78:0x00e8, B:80:0x00f4, B:81:0x00fa), top: B:220:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap makeThumbnailInternal(Scene scene, final Long elementId, final Integer time, boolean opaque) {
        SceneElement sceneElement;
        SceneThumbnailMaker sceneThumbnailMaker;
        Bitmap bitmapCreateBitmap;
        SceneElement sceneElement2;
        final int thumbnailTime;
        int iIntValue;
        z.mz mzVar;
        z.mz mzVar2;
        z.mz mzVar3;
        z.mz mzVar4;
        z.mz mzVar5;
        z.tI tIVar;
        int[] pixelArray;
        int i2;
        final Scene scene2 = scene;
        Pair pairUo = AbstractC1951j.Uo(scene2.getWidth(), scene2.getHeight(), this.width, this.height);
        final int iIntValue2 = ((Number) pairUo.component1()).intValue();
        final int iIntValue3 = ((Number) pairUo.component2()).intValue();
        final SceneElement sceneElementElementById = SceneKt.elementById(scene, elementId);
        if (sceneElementElementById == null && elementId != null) {
            return getEmptyBitmap();
        }
        if (iIntValue2 < 1 || iIntValue3 < 1) {
            return getEmptyBitmap();
        }
        if (sceneElementElementById != null) {
            if (opaque) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            synchronized (this.elementThumbnailCache) {
                Bitmap bitmap = this.elementThumbnailCache.get(sceneElementElementById);
                if (bitmap != null) {
                    return bitmap;
                }
                Unit unit = Unit.INSTANCE;
            }
        } else if (opaque) {
            synchronized (this.sceneOpaqueThumbnailCache) {
                Bitmap bitmap2 = this.sceneThumbnailCache.get(scene2);
                if (bitmap2 != null) {
                    return bitmap2;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            synchronized (this.sceneThumbnailCache) {
                Bitmap bitmap3 = this.sceneThumbnailCache.get(scene2);
                if (bitmap3 != null) {
                    return bitmap3;
                }
                Unit unit3 = Unit.INSTANCE;
            }
        }
        try {
            try {
                z.mz mzVar6 = this.gctx;
                z.tI tIVar2 = null;
                if (mzVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gctx");
                    mzVar6 = null;
                }
                if (Intrinsics.areEqual(mzVar6.ck(), z.l4Z.f76316n)) {
                    XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.Pmq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SceneThumbnailMaker.makeThumbnailInternal$lambda$10();
                        }
                    });
                    z.mz mzVar7 = this.gctx;
                    if (mzVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        mzVar7 = null;
                    }
                    mzVar7.ViF(new z.OU(iIntValue2, iIntValue3));
                    thumbnailTime = ((sceneElementElementById == null ? sceneElementElementById.getType() : null) == SceneElementType.Scene || sceneElementElementById.getNestedScene().getThumbnailTime() < 0) ? 0 : sceneElementElementById.getNestedScene().getThumbnailTime();
                    if (time == null) {
                        iIntValue = time.intValue();
                    } else {
                        Integer numValueOf = sceneElementElementById != null ? Integer.valueOf(sceneElementElementById.getStartTime() + (200000 / scene2.getFramesPerHundredSeconds())) : null;
                        iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    }
                    final int i3 = iIntValue + thumbnailTime;
                    final int iFrameNumberFromTime = TimeKt.frameNumberFromTime(i3, scene2.getFramesPerHundredSeconds());
                    try {
                        try {
                            try {
                                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.mrQ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SceneThumbnailMaker.makeThumbnailInternal$lambda$13(sceneElementElementById, time, thumbnailTime, i3, iFrameNumberFromTime, elementId, scene2, this, iIntValue2, iIntValue3);
                                    }
                                });
                                try {
                                    HI0.Q q2 = this.contentResolver;
                                    mzVar = this.gctx;
                                    if (mzVar == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                                        mzVar = null;
                                    }
                                    int iNr = mzVar.nr();
                                    mzVar2 = this.gctx;
                                    if (mzVar2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                                        mzVar2 = null;
                                    }
                                    int iO = mzVar2.O();
                                    mzVar3 = this.gctx;
                                    if (mzVar3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                                        mzVar3 = null;
                                    }
                                    int iNr2 = mzVar3.nr();
                                    mzVar4 = this.gctx;
                                    if (mzVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                                        mzVar4 = null;
                                    }
                                    int iO2 = mzVar4.O();
                                    mzVar5 = this.gctx;
                                    if (mzVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                                        mzVar5 = null;
                                    }
                                    z.KH khRl = mzVar5.rl();
                                    tIVar = this.textureCache;
                                    if (tIVar != null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("textureCache");
                                    } else {
                                        tIVar2 = tIVar;
                                    }
                                    try {
                                        try {
                                            sceneElement = sceneElementElementById;
                                            scene2 = scene;
                                            try {
                                                SceneRenderingKt.renderWithGpu(scene2, q2, iFrameNumberFromTime, iNr, iO, iNr2, iO2, khRl, tIVar2, (103217152 & 256) != 0 ? MapsKt.emptyMap() : MapsKt.emptyMap(), (103217152 & 512) != 0 ? RenderMode.PAUSE : elementId != null ? RenderMode.SCENE_THUMB : RenderMode.THUMB, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : SceneKt.getEMPTY_SCENE_SELECTION(), (103217152 & 2048) != 0 ? 0 : 0, (103217152 & 4096) != 0 ? 0 : 0, (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : null, (103217152 & 16384) != 0 ? false : opaque, (32768 & 103217152) != 0 ? null : elementId, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : false, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : null, new Rectangle(0.0f, 0.0f, scene.getWidth(), scene.getHeight()), (2097152 & 103217152) != 0 ? 1 : 0, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : null, null, new cBL.j(true, false), (33554432 & 103217152) != 0 ? false : false, (103217152 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : null);
                                                sceneThumbnailMaker = this;
                                            } catch (Exception e2) {
                                                e = e2;
                                                sceneThumbnailMaker = this;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            sceneThumbnailMaker = this;
                                            scene2 = scene;
                                            sceneElement = sceneElementElementById;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        sceneThumbnailMaker = this;
                                        sceneElement = sceneElementElementById;
                                        scene2 = scene;
                                        FirebaseCrashlytics.getInstance().recordException(e);
                                        bitmapCreateBitmap = Bitmap.createBitmap(sceneThumbnailMaker.width, sceneThumbnailMaker.height, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.eraseColor(-65536);
                                        Intrinsics.checkNotNull(bitmapCreateBitmap);
                                        sceneElement2 = sceneElement;
                                        if (sceneElement2 != null) {
                                        }
                                        return bitmapCreateBitmap;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    sceneThumbnailMaker = this;
                                    sceneElement = sceneElementElementById;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                sceneThumbnailMaker = this;
                                sceneElement = sceneElementElementById;
                            }
                        } finally {
                        }
                    } catch (Exception e7) {
                        e = e7;
                        sceneElement = sceneElementElementById;
                        scene2 = scene2;
                        sceneThumbnailMaker = this;
                        FirebaseCrashlytics.getInstance().recordException(e);
                        bitmapCreateBitmap = Bitmap.createBitmap(sceneThumbnailMaker.width, sceneThumbnailMaker.height, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(-65536);
                        Intrinsics.checkNotNull(bitmapCreateBitmap);
                        sceneElement2 = sceneElement;
                        if (sceneElement2 != null) {
                        }
                        return bitmapCreateBitmap;
                    }
                    try {
                        XoT.C.Uo(sceneThumbnailMaker, new Function0() { // from class: com.alightcreative.app.motion.scene.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SceneThumbnailMaker.makeThumbnailInternal$lambda$14();
                            }
                        });
                        sceneThumbnailMaker.getPixels().rewind();
                        GLES20.glReadPixels(0, 0, iIntValue2, iIntValue3, 6408, 5121, sceneThumbnailMaker.getPixels());
                        if (sceneThumbnailMaker.getPixels().hasArray()) {
                            sceneThumbnailMaker.getPixels().rewind();
                            sceneThumbnailMaker.getPixels().get(sceneThumbnailMaker.getPixelArray());
                            pixelArray = sceneThumbnailMaker.getPixelArray();
                        } else {
                            pixelArray = sceneThumbnailMaker.getPixels().array();
                        }
                        for (i2 = 0; i2 < iIntValue3; i2++) {
                            for (int i5 = 0; i5 < iIntValue2; i5++) {
                                sceneThumbnailMaker.getConvertArray()[(i2 * iIntValue2) + i5] = HI0.qf.n(pixelArray[(((iIntValue3 - 1) - i2) * iIntValue2) + i5]);
                            }
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(sceneThumbnailMaker.getConvertArray(), iIntValue2, iIntValue3, Bitmap.Config.ARGB_8888);
                    } catch (Exception e8) {
                        e = e8;
                        FirebaseCrashlytics.getInstance().recordException(e);
                        bitmapCreateBitmap = Bitmap.createBitmap(sceneThumbnailMaker.width, sceneThumbnailMaker.height, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(-65536);
                    } finally {
                    }
                } else {
                    z.mz mzVar8 = this.gctx;
                    if (mzVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        mzVar8 = null;
                    }
                    z.fg fgVarCk = mzVar8.ck();
                    z.OU ou2 = fgVarCk instanceof z.OU ? (z.OU) fgVarCk : null;
                    if (ou2 != null && ou2.rl() == iIntValue2) {
                        z.mz mzVar9 = this.gctx;
                        if (mzVar9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gctx");
                            mzVar9 = null;
                        }
                        z.fg fgVarCk2 = mzVar9.ck();
                        z.OU ou3 = fgVarCk2 instanceof z.OU ? (z.OU) fgVarCk2 : null;
                        if (ou3 == null || ou3.n() != iIntValue3) {
                        }
                        if ((sceneElementElementById == null ? sceneElementElementById.getType() : null) == SceneElementType.Scene) {
                            if (time == null) {
                            }
                            final int i32 = iIntValue + thumbnailTime;
                            final int iFrameNumberFromTime2 = TimeKt.frameNumberFromTime(i32, scene2.getFramesPerHundredSeconds());
                            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.mrQ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SceneThumbnailMaker.makeThumbnailInternal$lambda$13(sceneElementElementById, time, thumbnailTime, i32, iFrameNumberFromTime2, elementId, scene2, this, iIntValue2, iIntValue3);
                                }
                            });
                            HI0.Q q22 = this.contentResolver;
                            mzVar = this.gctx;
                            if (mzVar == null) {
                            }
                            int iNr3 = mzVar.nr();
                            mzVar2 = this.gctx;
                            if (mzVar2 == null) {
                            }
                            int iO3 = mzVar2.O();
                            mzVar3 = this.gctx;
                            if (mzVar3 == null) {
                            }
                            int iNr22 = mzVar3.nr();
                            mzVar4 = this.gctx;
                            if (mzVar4 == null) {
                            }
                            int iO22 = mzVar4.O();
                            mzVar5 = this.gctx;
                            if (mzVar5 == null) {
                            }
                            z.KH khRl2 = mzVar5.rl();
                            tIVar = this.textureCache;
                            if (tIVar != null) {
                            }
                            sceneElement = sceneElementElementById;
                            scene2 = scene;
                            SceneRenderingKt.renderWithGpu(scene2, q22, iFrameNumberFromTime2, iNr3, iO3, iNr22, iO22, khRl2, tIVar2, (103217152 & 256) != 0 ? MapsKt.emptyMap() : MapsKt.emptyMap(), (103217152 & 512) != 0 ? RenderMode.PAUSE : elementId != null ? RenderMode.SCENE_THUMB : RenderMode.THUMB, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : SceneKt.getEMPTY_SCENE_SELECTION(), (103217152 & 2048) != 0 ? 0 : 0, (103217152 & 4096) != 0 ? 0 : 0, (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : null, (103217152 & 16384) != 0 ? false : opaque, (32768 & 103217152) != 0 ? null : elementId, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : false, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : null, new Rectangle(0.0f, 0.0f, scene.getWidth(), scene.getHeight()), (2097152 & 103217152) != 0 ? 1 : 0, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : null, null, new cBL.j(true, false), (33554432 & 103217152) != 0 ? false : false, (103217152 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : null);
                            sceneThumbnailMaker = this;
                            XoT.C.Uo(sceneThumbnailMaker, new Function0() { // from class: com.alightcreative.app.motion.scene.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SceneThumbnailMaker.makeThumbnailInternal$lambda$14();
                                }
                            });
                            sceneThumbnailMaker.getPixels().rewind();
                            GLES20.glReadPixels(0, 0, iIntValue2, iIntValue3, 6408, 5121, sceneThumbnailMaker.getPixels());
                            if (sceneThumbnailMaker.getPixels().hasArray()) {
                            }
                            while (i2 < iIntValue3) {
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(sceneThumbnailMaker.getConvertArray(), iIntValue2, iIntValue3, Bitmap.Config.ARGB_8888);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            sceneElement = sceneElementElementById;
        }
        Intrinsics.checkNotNull(bitmapCreateBitmap);
        sceneElement2 = sceneElement;
        if (sceneElement2 != null) {
            synchronized (sceneThumbnailMaker.elementThumbnailCache) {
                sceneThumbnailMaker.elementThumbnailCache.put(sceneElement2, bitmapCreateBitmap);
            }
        } else if (opaque) {
            synchronized (sceneThumbnailMaker.sceneOpaqueThumbnailCache) {
                sceneThumbnailMaker.sceneOpaqueThumbnailCache.put(scene2, bitmapCreateBitmap);
            }
        } else {
            synchronized (sceneThumbnailMaker.sceneThumbnailCache) {
                sceneThumbnailMaker.sceneThumbnailCache.put(scene2, bitmapCreateBitmap);
            }
        }
        return bitmapCreateBitmap;
    }

    static /* synthetic */ Bitmap makeThumbnailInternal$default(SceneThumbnailMaker sceneThumbnailMaker, Scene scene, Long l2, Integer num, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return sceneThumbnailMaker.makeThumbnailInternal(scene, l2, num, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeThumbnailInternal$lambda$10() {
        return "SceneThumbnailMaker:recreateRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeThumbnailInternal$lambda$13(SceneElement sceneElement, Integer num, int i2, int i3, int i5, Long l2, Scene scene, SceneThumbnailMaker sceneThumbnailMaker, int i7, int i8) {
        z.mz mzVar = null;
        SceneElementType type = sceneElement != null ? sceneElement.getType() : null;
        int totalTime = scene.getTotalTime();
        String title = scene.getTitle();
        z.mz mzVar2 = sceneThumbnailMaker.gctx;
        if (mzVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar2 = null;
        }
        int iNr = mzVar2.nr();
        z.mz mzVar3 = sceneThumbnailMaker.gctx;
        if (mzVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
        } else {
            mzVar = mzVar3;
        }
        return "SceneThumbnailMaker:MAKE_THUMB type=" + type + " time=" + num + " offsetTime=" + i2 + " actualTime=" + i3 + " renderFrame=" + i5 + " elementId=" + l2 + " totalTime=" + totalTime + "  title=" + title + " gctx.w,h=" + iNr + "," + mzVar.O() + " actualW,H=" + i7 + "," + i8 + " e=" + CollectionsKt.joinToString$default(scene.getElements(), ",", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.scene.T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SceneThumbnailMaker.makeThumbnailInternal$lambda$13$lambda$12((SceneElement) obj);
            }
        }, 30, null) + " scene=" + scene.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence makeThumbnailInternal$lambda$13$lambda$12(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStartTime() + "-" + it.getEndTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeThumbnailInternal$lambda$14() {
        return "SceneThumbnailMaker:MAKE_THUMB DONE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] pixelArray_delegate$lambda$2(SceneThumbnailMaker sceneThumbnailMaker) {
        return new int[sceneThumbnailMaker.width * sceneThumbnailMaker.height];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntBuffer pixels_delegate$lambda$1(SceneThumbnailMaker sceneThumbnailMaker) {
        return IntBuffer.allocate(sceneThumbnailMaker.width * sceneThumbnailMaker.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit releaseResources$lambda$5(SceneThumbnailMaker sceneThumbnailMaker) {
        z.mz mzVar = sceneThumbnailMaker.gctx;
        z.tI tIVar = null;
        if (mzVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar = null;
        }
        mzVar.ViF(z.l4Z.f76316n);
        sceneThumbnailMaker.rmgr.rl();
        z.tI tIVar2 = sceneThumbnailMaker.textureCache;
        if (tIVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureCache");
        } else {
            tIVar = tIVar2;
        }
        tIVar.rl();
        XoT.C.Uo(sceneThumbnailMaker, new Function0() { // from class: com.alightcreative.app.motion.scene.crp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.releaseResources$lambda$5$lambda$4();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String releaseResources$lambda$5$lambda$4() {
        return "SceneThumbnailMaker:releaseResources";
    }

    public final String getContextTag() {
        return this.contextTag;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap makeThumbnail(final Scene scene, final Long elementId, final Integer time, final boolean opaque) throws InterruptedException {
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.uiThreadHandler.removeCallbacks(this.releaseResourcesRunnable);
        this.uiThreadHandler.postDelayed(this.releaseResourcesRunnable, this.AUTO_RELEASE_TIMEOUT);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        runInWorker(new Function0() { // from class: com.alightcreative.app.motion.scene.DC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.makeThumbnail$lambda$23(objectRef, this, scene, elementId, time, opaque, countDownLatch);
            }
        });
        countDownLatch.await();
        T t3 = objectRef.element;
        Intrinsics.checkNotNull(t3);
        return (Bitmap) t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void makeThumbnailAsync(final Scene scene, final Long elementId, final Integer time, final Function1<? super Bitmap, Unit> completion) throws Throwable {
        Throwable th;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(completion, "completion");
        this.uiThreadHandler.removeCallbacks(this.releaseResourcesRunnable);
        this.uiThreadHandler.postDelayed(this.releaseResourcesRunnable, this.AUTO_RELEASE_TIMEOUT);
        SceneElement sceneElementElementById = SceneKt.elementById(scene, elementId);
        if (sceneElementElementById == null && elementId != null) {
            completion.invoke(getEmptyBitmap());
            return;
        }
        if (sceneElementElementById == null) {
            synchronized (this.sceneThumbnailCache) {
                try {
                    Bitmap bitmap2 = this.sceneThumbnailCache.get(scene);
                    if (bitmap2 != null) {
                        try {
                            completion.invoke(bitmap2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                throw th;
            }
        }
        synchronized (this.elementThumbnailCache) {
            Bitmap bitmap3 = this.elementThumbnailCache.get(sceneElementElementById);
            if (bitmap3 != null) {
                completion.invoke(bitmap3);
                return;
            }
            Unit unit2 = Unit.INSTANCE;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        runInWorker(new Function0() { // from class: com.alightcreative.app.motion.scene.Ogx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.makeThumbnailAsync$lambda$22(objectRef, this, scene, elementId, time, countDownLatch, atomicBoolean, completion);
            }
        });
        if (!countDownLatch.await(3L, TimeUnit.MILLISECONDS) || (bitmap = (Bitmap) objectRef.element) == null || atomicBoolean.getAndSet(true)) {
            return;
        }
        completion.invoke(bitmap);
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void onStart() {
        z.mz mzVar;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        z.mz mzVarRl = IB.w6.rl(appContext, this.contextTag, false, null, 12, null);
        this.gctx = mzVarRl;
        z.mz mzVar2 = null;
        if (mzVarRl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVarRl = null;
        }
        mzVarRl.N();
        z.mz mzVar3 = this.gctx;
        if (mzVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar3 = null;
        }
        mzVar3.ViF(new z.OU(this.width, this.height));
        z.mz mzVar4 = this.gctx;
        if (mzVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar = null;
        } else {
            mzVar = mzVar4;
        }
        z.mz mzVar5 = this.gctx;
        if (mzVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar5 = null;
        }
        int iNr = mzVar5.nr();
        z.mz mzVar6 = this.gctx;
        if (mzVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
        } else {
            mzVar2 = mzVar6;
        }
        this.textureCache = new z.tI(mzVar, iNr, mzVar2.O(), this.width * this.height * 16, z.DC.f76234g, false);
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void onStop() {
        z.mz mzVar = this.gctx;
        if (mzVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gctx");
            mzVar = null;
        }
        mzVar.release();
    }

    public final void releaseResources() {
        runInWorker(new Function0() { // from class: com.alightcreative.app.motion.scene.V1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneThumbnailMaker.releaseResources$lambda$5(this.f46039n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.Bitmap] */
    public static final Unit makeThumbnail$lambda$23(Ref.ObjectRef objectRef, SceneThumbnailMaker sceneThumbnailMaker, Scene scene, Long l2, Integer num, boolean z2, CountDownLatch countDownLatch) {
        objectRef.element = sceneThumbnailMaker.makeThumbnailInternal(scene, l2, num, z2);
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void doWork() {
        allowSleepUntilCommand();
    }

    public final void release() {
        stopWorkerThread();
    }
}
