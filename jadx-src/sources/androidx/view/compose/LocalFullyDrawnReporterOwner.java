package androidx.view.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.FullyDrawnReporterOwner;
import androidx.view.View;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalFullyDrawnReporterOwner;", "", "<init>", "()V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/FullyDrawnReporterOwner;", "rl", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFullyDrawnReporterOwner", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/FullyDrawnReporterOwner;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,153:1\n77#2:154\n77#2:155\n77#2:156\n23#3,8:157\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n96#1:154\n97#1:155\n98#1:156\n98#1:157,8\n*E\n"})
public final class LocalFullyDrawnReporterOwner {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LocalFullyDrawnReporterOwner f13284n = new LocalFullyDrawnReporterOwner();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ProvidableCompositionLocal LocalFullyDrawnReporterOwner = CompositionLocalKt.O(null, new Function0<FullyDrawnReporterOwner>() { // from class: androidx.activity.compose.LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FullyDrawnReporterOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalFullyDrawnReporterOwner() {
    }

    public final FullyDrawnReporterOwner n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(540186968, i2, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
        }
        FullyDrawnReporterOwner fullyDrawnReporterOwnerN = (FullyDrawnReporterOwner) composer.ty(LocalFullyDrawnReporterOwner);
        if (fullyDrawnReporterOwnerN == null) {
            composer.eF(-1738308180);
            fullyDrawnReporterOwnerN = View.n((android.view.View) composer.ty(AndroidCompositionLocals_androidKt.gh()));
            composer.Xw();
        } else {
            composer.eF(-1738310474);
            composer.Xw();
        }
        if (fullyDrawnReporterOwnerN == null) {
            composer.eF(-1738306337);
            Object baseContext = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof FullyDrawnReporterOwner) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            fullyDrawnReporterOwnerN = (FullyDrawnReporterOwner) baseContext;
            composer.Xw();
        } else {
            composer.eF(-1738310398);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fullyDrawnReporterOwnerN;
    }
}
