package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Entity
@RestrictTo
public class Preference {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42934n;
    public Long rl;

    public Preference(String str, boolean z2) {
        this(str, z2 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.f42934n.equals(preference.f42934n)) {
            return false;
        }
        Long l2 = this.rl;
        Long l5 = preference.rl;
        return l2 != null ? l2.equals(l5) : l5 == null;
    }

    public Preference(String str, long j2) {
        this.f42934n = str;
        this.rl = Long.valueOf(j2);
    }

    public int hashCode() {
        int iHashCode = this.f42934n.hashCode() * 31;
        Long l2 = this.rl;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
