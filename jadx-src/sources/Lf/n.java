package Lf;

import Lf.Dsr;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bitmap f6171n;
    private final FjR.C rl;

    public static final class j implements Dsr.j {
        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Bitmap bitmap, FjR.C c2, eQ.fuX fux) {
            return new n(bitmap, c2);
        }
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        return new CN3(new BitmapDrawable(this.rl.Uo().getResources(), this.f6171n), false, Be4.CN3.f520t);
    }

    public n(Bitmap bitmap, FjR.C c2) {
        this.f6171n = bitmap;
        this.rl = c2;
    }
}
