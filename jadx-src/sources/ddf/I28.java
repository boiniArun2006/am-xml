package ddf;

import android.content.Context;
import com.facebook.soloader.QJ;
import com.facebook.soloader.ci;
import com.facebook.soloader.qz;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f63530n;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f63531t;

    /* JADX WARN: Multi-variable type inference failed */
    private void nr(ci[] ciVarArr) {
        for (int i2 = 0; i2 < ciVarArr.length; i2++) {
            Object[] objArr = ciVarArr[i2];
            if (objArr instanceof QJ) {
                ciVarArr[i2] = ((QJ) objArr).rl(this.f63530n);
            }
        }
    }

    private String t() {
        return this.f63530n.getApplicationInfo().sourceDir;
    }

    public I28(Context context, j jVar) {
        this.f63530n = context;
        this.rl = jVar;
        this.f63531t = jVar.t();
    }

    private boolean rl() {
        String strT = t();
        if (new File(strT).exists() && this.rl.n(strT)) {
            return true;
        }
        return false;
    }

    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        if (rl()) {
            nr(ciVarArr);
            return true;
        }
        if (this.f63531t != this.rl.t()) {
            qz.Uo("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
            return true;
        }
        return false;
    }
}
