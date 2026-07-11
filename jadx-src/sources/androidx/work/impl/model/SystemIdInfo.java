package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Entity
@RestrictTo
public class SystemIdInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f42939n;
    public final int rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.rl != systemIdInfo.rl) {
            return false;
        }
        return this.f42939n.equals(systemIdInfo.f42939n);
    }

    public int hashCode() {
        return (this.f42939n.hashCode() * 31) + this.rl;
    }

    public SystemIdInfo(String str, int i2) {
        this.f42939n = str;
        this.rl = i2;
    }
}
