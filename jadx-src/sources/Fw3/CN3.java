package Fw3;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class CN3 {

    static final class j extends Lambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f3223n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context) {
            super(2);
            this.f3223n = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n((Uri) obj, ((Number) obj2).intValue());
        }

        public final LQ.j n(Uri uri, int i2) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return w9.j.rl(w9.j.f74804n, this.f3223n, uri, i2, false, 8, null);
        }
    }

    public static final gB.CN3 n(Context context, Oe.w6 maxSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(maxSize, "maxSize");
        return new Wre(maxSize, new j(context), null, null, 12, null);
    }
}
