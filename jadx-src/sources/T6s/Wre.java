package T6s;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre extends Number {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10171n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        String str = this.f10171n;
        String str2 = ((Wre) obj).f10171n;
        return str == str2 || str.equals(str2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f10171n);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f10171n);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f10171n);
    }

    public int hashCode() {
        return this.f10171n.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f10171n);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f10171n);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f10171n).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f10171n);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f10171n).longValue();
        }
    }

    public String toString() {
        return this.f10171n;
    }

    public Wre(String str) {
        this.f10171n = str;
    }
}
