package com.google.gson;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f60912n;

    public Dsr(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f60912n = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dsr.class != obj.getClass()) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        if (this.f60912n == null) {
            return dsr.f60912n == null;
        }
        if (ck(this) && ck(dsr)) {
            return az().longValue() == dsr.az().longValue();
        }
        Object obj2 = this.f60912n;
        if (!(obj2 instanceof Number) || !(dsr.f60912n instanceof Number)) {
            return obj2.equals(dsr.f60912n);
        }
        double dDoubleValue = az().doubleValue();
        double dDoubleValue2 = dsr.az().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    private static boolean ck(Dsr dsr) {
        Object obj = dsr.f60912n;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean HI() {
        return this.f60912n instanceof Boolean;
    }

    public boolean Ik() {
        return this.f60912n instanceof Number;
    }

    public Number az() {
        Object obj = this.f60912n;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new T6s.Wre((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f60912n == null) {
            return 31;
        }
        if (ck(this)) {
            jDoubleToLongBits = az().longValue();
        } else {
            Object obj = this.f60912n;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(az().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean r() {
        return this.f60912n instanceof String;
    }

    public String ty() {
        Object obj = this.f60912n;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (Ik()) {
            return az().toString();
        }
        if (HI()) {
            return ((Boolean) this.f60912n).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f60912n.getClass());
    }

    public Dsr(Number number) {
        Objects.requireNonNull(number);
        this.f60912n = number;
    }

    public int gh() {
        if (Ik()) {
            return az().intValue();
        }
        return Integer.parseInt(ty());
    }

    public double mUb() {
        if (Ik()) {
            return az().doubleValue();
        }
        return Double.parseDouble(ty());
    }

    public long qie() {
        if (Ik()) {
            return az().longValue();
        }
        return Long.parseLong(ty());
    }

    public boolean xMQ() {
        if (HI()) {
            return ((Boolean) this.f60912n).booleanValue();
        }
        return Boolean.parseBoolean(ty());
    }

    public Dsr(String str) {
        Objects.requireNonNull(str);
        this.f60912n = str;
    }
}
