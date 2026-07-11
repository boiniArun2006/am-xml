package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class a extends Clock implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a f68933b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZoneId f68934a;

    a(ZoneId zoneId) {
        this.f68934a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f68933b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.f68934a;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f68934a.equals(((a) obj).f68934a);
    }

    public final int hashCode() {
        return this.f68934a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f68934a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
