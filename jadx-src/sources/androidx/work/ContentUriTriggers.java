package androidx.work;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public final class ContentUriTriggers {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f42713n = new HashSet();

    public static final class Trigger {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f42714n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Trigger.class == obj.getClass()) {
                Trigger trigger = (Trigger) obj;
                if (this.rl == trigger.rl && this.f42714n.equals(trigger.f42714n)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f42714n.hashCode() * 31) + (this.rl ? 1 : 0);
        }

        public Uri n() {
            return this.f42714n;
        }

        public boolean rl() {
            return this.rl;
        }

        Trigger(Uri uri, boolean z2) {
            this.f42714n = uri;
            this.rl = z2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriTriggers.class != obj.getClass()) {
            return false;
        }
        return this.f42713n.equals(((ContentUriTriggers) obj).f42713n);
    }

    public int hashCode() {
        return this.f42713n.hashCode();
    }

    public void n(Uri uri, boolean z2) {
        this.f42713n.add(new Trigger(uri, z2));
    }

    public Set rl() {
        return this.f42713n;
    }

    public int t() {
        return this.f42713n.size();
    }
}
