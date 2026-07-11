package com.alightcreative.app.motion.scene;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u001ad\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/content/Context;", "context", "LQmE/iF;", "eventLogger", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Ljava/io/File;", "exportPath", "Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "LcBL/j;", "watermarkOptions", "Lkotlin/Function2;", "Lcom/alightcreative/app/motion/scene/ExportProgress;", "Lkotlin/coroutines/Continuation;", "", "", "onProgress", "Lcom/alightcreative/app/motion/scene/ExportOutcome;", "exportScene", "(Landroid/content/Context;LQmE/iF;Lcom/alightcreative/app/motion/scene/Scene;Ljava/io/File;Lcom/alightcreative/app/motion/scene/ExportParams;LcBL/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getRemaining", "(Lcom/alightcreative/app/motion/scene/ExportProgress;)I", "remaining", "", "getPercentage", "(Lcom/alightcreative/app/motion/scene/ExportProgress;)D", "percentage", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SceneExporterSuspendKt {
    public static final double getPercentage(ExportProgress exportProgress) {
        Intrinsics.checkNotNullParameter(exportProgress, "<this>");
        return ((double) exportProgress.getCurrent()) / ((double) exportProgress.getMax());
    }

    public static final int getRemaining(ExportProgress exportProgress) {
        Intrinsics.checkNotNullParameter(exportProgress, "<this>");
        return exportProgress.getMax() - exportProgress.getCurrent();
    }

    public static final Object exportScene(Context context, QmE.iF iFVar, Scene scene, File file, ExportParams exportParams, cBL.j jVar, Function2<? super ExportProgress, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ExportOutcome> continuation) {
        return Lv.Wre.n(context, iFVar, scene, file, exportParams, jVar, function2, continuation);
    }
}
