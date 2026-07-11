package ddf;

import android.content.Context;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.ci;
import com.facebook.soloader.qz;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class n implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f63534n;
    private final j rl;

    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        String str = this.f63534n.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            qz.Uo("soloader.recovery.CheckBaseApkExists", wDgKoYAES.SUkFbatWdy + str);
            return false;
        }
        StringBuilder sb = new StringBuilder("Base apk does not exist: ");
        sb.append(str);
        sb.append(". ");
        this.rl.rl(sb);
        throw new NoBaseApkException(sb.toString(), unsatisfiedLinkError);
    }

    public n(Context context, j jVar) {
        this.f63534n = context;
        this.rl = jVar;
    }
}
