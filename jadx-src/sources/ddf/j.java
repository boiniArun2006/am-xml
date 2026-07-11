package ddf;

import com.facebook.soloader.qz;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f63533n;
    private int rl;

    public synchronized boolean n(String str) {
        for (String str2 : this.f63533n) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        rl(sb);
        qz.Uo("SoLoader", sb.toString());
        String[] strArr = this.f63533n;
        int i2 = this.rl;
        strArr[i2 % strArr.length] = str;
        this.rl = i2 + 1;
        return true;
    }

    public synchronized void rl(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.rl);
            sb.append(" base apk paths.");
            if (this.rl > 0) {
                sb.append(" Most recent ones:");
            }
            int i2 = 0;
            while (true) {
                String[] strArr = this.f63533n;
                if (i2 < strArr.length) {
                    int i3 = (this.rl - i2) - 1;
                    if (i3 >= 0) {
                        String str = strArr[i3 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int t() {
        return this.rl;
    }

    public j(int i2) {
        if (i2 > 0) {
            this.f63533n = new String[i2];
            this.rl = 0;
            return;
        }
        throw new IllegalArgumentException();
    }
}
