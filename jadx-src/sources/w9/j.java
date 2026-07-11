package w9;

import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f74804n = new j();

    public static /* synthetic */ LQ.j rl(j jVar, Context context, Uri uri, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        return jVar.n(context, uri, i2, z2);
    }

    public final LQ.j n(Context context, Uri uri, int i2, boolean z2) throws fuX.j {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        LQ.fuX fux = new LQ.fuX();
        try {
            Bitmap bitmapO = (Bitmap) fux.O(n.nr(context, uri, i2));
            if (z2) {
                LQ.j jVarT = n.t(context, uri);
                if (jVarT instanceof j.n) {
                    jVarT = new j.n(t2.n.n((t2.I28) ((j.n) jVarT).n()));
                } else if (!(jVarT instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                bitmapO = n.O(bitmapO, (ExifInterface) fux.O(jVarT));
            }
            return new j.w6(bitmapO);
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    private j() {
    }
}
