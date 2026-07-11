package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f69197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalDateTime f69198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneOffset f69199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ZoneOffset f69200d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f69197a, ((b) obj).f69197a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f69197a = localDateTime.toEpochSecond(zoneOffset);
        this.f69198b = localDateTime;
        this.f69199c = zoneOffset;
        this.f69200d = zoneOffset2;
    }

    b(long j2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f69197a = j2;
        this.f69198b = LocalDateTime.ofEpochSecond(j2, 0, zoneOffset);
        this.f69199c = zoneOffset;
        this.f69200d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f69197a, objectOutput);
        a.d(this.f69199c, objectOutput);
        a.d(this.f69200d, objectOutput);
    }

    public final long T() {
        return this.f69197a;
    }

    public final LocalDateTime s() {
        return this.f69198b;
    }

    public final ZoneOffset X() {
        return this.f69199c;
    }

    public final ZoneOffset L() {
        return this.f69200d;
    }

    public final Duration C() {
        return Duration.C(this.f69200d.getTotalSeconds() - this.f69199c.getTotalSeconds());
    }

    public final LocalDateTime q() {
        return this.f69198b.i0(this.f69200d.getTotalSeconds() - this.f69199c.getTotalSeconds());
    }

    public final boolean a0() {
        return this.f69200d.getTotalSeconds() > this.f69199c.getTotalSeconds();
    }

    final List Y() {
        return a0() ? Collections.EMPTY_LIST : j$.time.c.c(new Object[]{this.f69199c, this.f69200d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f69197a == bVar.f69197a && this.f69199c.equals(bVar.f69199c) && this.f69200d.equals(bVar.f69200d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69198b.hashCode() ^ this.f69199c.hashCode()) ^ Integer.rotateLeft(this.f69200d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(a0() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f69198b);
        sb.append(this.f69199c);
        sb.append(" to ");
        sb.append(this.f69200d);
        sb.append(']');
        return sb.toString();
    }
}
