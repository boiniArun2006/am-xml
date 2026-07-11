package mV;

import B8M.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import gAe.z;
import java.io.IOException;
import uBO.C2401c;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences.Editor f70684n;
    private final String rl;

    @Override // gAe.z
    public void n(Z z2) throws IOException {
        if (!this.f70684n.putString(this.rl, C.rl(z2.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // gAe.z
    public void rl(C2401c c2401c) throws IOException {
        if (!this.f70684n.putString(this.rl, C.rl(c2401c.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public Ml(Context context, String str, String str2) {
        if (str != null) {
            this.rl = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f70684n = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f70684n = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
