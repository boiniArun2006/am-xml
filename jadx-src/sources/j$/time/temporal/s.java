package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f69178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f69179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f69180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69181d;

    public static s j(long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j2, j2, j3, j3);
    }

    public static s k(long j2, long j3, long j4) {
        if (j2 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j4) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j2, 1L, j3, j4);
    }

    private s(long j2, long j3, long j4, long j5) {
        this.f69178a = j2;
        this.f69179b = j3;
        this.f69180c = j4;
        this.f69181d = j5;
    }

    public final boolean g() {
        return this.f69178a == this.f69179b && this.f69180c == this.f69181d;
    }

    public final long e() {
        return this.f69178a;
    }

    public final long f() {
        return this.f69180c;
    }

    public final long d() {
        return this.f69181d;
    }

    public final boolean h() {
        return this.f69178a >= -2147483648L && this.f69181d <= 2147483647L;
    }

    public final boolean i(long j2) {
        return j2 >= this.f69178a && j2 <= this.f69181d;
    }

    public final int a(long j2, p pVar) {
        if (h() && i(j2)) {
            return (int) j2;
        }
        throw new DateTimeException(c(j2, pVar));
    }

    public final void b(long j2, p pVar) {
        if (!i(j2)) {
            throw new DateTimeException(c(j2, pVar));
        }
    }

    private String c(long j2, p pVar) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j2;
        }
        return "Invalid value (valid values " + this + "): " + j2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j2 = this.f69178a;
        long j3 = this.f69179b;
        if (j2 > j3) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j4 = this.f69180c;
        long j5 = this.f69181d;
        if (j4 > j5) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j3 > j5) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f69178a == sVar.f69178a && this.f69179b == sVar.f69179b && this.f69180c == sVar.f69180c && this.f69181d == sVar.f69181d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f69179b;
        long j3 = this.f69178a + (j2 << 16) + (j2 >> 48);
        long j4 = this.f69180c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f69181d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) ((j7 >>> 32) ^ j7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j2 = this.f69178a;
        sb.append(j2);
        long j3 = this.f69179b;
        if (j2 != j3) {
            sb.append('/');
            sb.append(j3);
        }
        sb.append(" - ");
        long j4 = this.f69180c;
        sb.append(j4);
        long j5 = this.f69181d;
        if (j4 != j5) {
            sb.append('/');
            sb.append(j5);
        }
        return sb.toString();
    }
}
