package androidx.view.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.view.NavHostController;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "it", "Landroidx/navigation/NavHostController;", c.f62177j, "(Landroid/os/Bundle;)Landroidx/navigation/NavHostController;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt$NavControllerSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
final class NavHostControllerKt$NavControllerSaver$2 extends Lambda implements Function1<Bundle, NavHostController> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Context f40240n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final NavHostController invoke(Bundle bundle) {
        NavHostController navHostControllerRl = NavHostControllerKt.rl(this.f40240n);
        navHostControllerRl.m(bundle);
        return navHostControllerRl;
    }
}
