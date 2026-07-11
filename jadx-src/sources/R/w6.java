package R;

import Be4.C1309c;
import Be4.vd;
import android.content.Context;
import android.os.Build;
import coil.memory.MemoryCache;
import eQ.fuX;
import eQ.n;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r1.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f8628n = new w6();

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1.j O(Context context) {
        j.C1145j c1145j = new j.C1145j();
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return c1145j.rl(FilesKt.resolve(cacheDir, "image_cache")).nr(0.02d).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemoryCache nr(Context context) {
        return new MemoryCache.j(context).rl(0.25d).n();
    }

    public final fuX t(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        fuX.j jVar = new fuX.j(context);
        n.j jVar2 = new n.j();
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z2 = false;
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 28) {
            jVar2.n(new vd.j(z2, i2, defaultConstructorMarker));
        } else {
            jVar2.n(new C1309c.n(z2, i2, defaultConstructorMarker));
        }
        return jVar.KN(jVar2.O()).mUb(true).qie(new Function0() { // from class: R.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(context);
            }
        }).gh(new Function0() { // from class: R.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.O(context);
            }
        }).nr();
    }

    private w6() {
    }
}
