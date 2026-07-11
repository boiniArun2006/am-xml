package com.google.android.gms.internal.ads;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhzs implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzhyj zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzhyq zzk;
    private String zzl;

    public final zzhzs zzc() throws IOException {
        zzl(1, 2, ']');
        return this;
    }

    public final zzhzs zze() throws IOException {
        zzl(3, 5, '}');
        return this;
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            zzb[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private final void zzm(int i2) {
        int i3 = this.zzf;
        int[] iArr = this.zze;
        if (i3 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i3 + i3);
        }
        int[] iArr2 = this.zze;
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        iArr2[i5] = i2;
    }

    private final int zzn() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return this.zze[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i2) {
        this.zze[this.zzf - 1] = i2;
    }

    private final void zzp() throws IOException {
        if (this.zzl != null) {
            int iZzn = zzn();
            if (iZzn == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzn != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq(String str) throws IOException {
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i3 < i2) {
                        writer.write(str, i3, i2 - i3);
                    }
                    writer.write(str2);
                    i3 = i5;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i3 < i2) {
                }
                writer.write(str2);
                i3 = i5;
            }
            i2 = i5;
        }
        if (i3 < length) {
            writer.write(str, i3, length - i3);
        }
        writer.write(34);
    }

    private final void zzr() throws IOException {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzhyj zzhyjVar = this.zzg;
        writer.write(zzhyjVar.zza());
        int i2 = this.zzf;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(zzhyjVar.zzb());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i2 = this.zzf;
        if (i2 > 1 || (i2 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final zzhzs zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzn = zzn();
        if (iZzn != 3 && iZzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzhzs zzg(String str) throws IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzhzs zzi(Number number) throws IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals(V8ValueDouble.INFINITY) || string.equals("NaN")) {
                if (this.zzk != zzhyq.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47 + string.length());
                sb.append("String created by ");
                sb.append(strValueOf);
                sb.append(" is not a valid JSON number: ");
                sb.append(string);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        zzs();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzhzs zzj() throws IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write(V8ValueNull.NULL);
        return this;
    }

    public zzhzs(Writer writer) {
        boolean z2 = false;
        zzm(6);
        this.zzk = zzhyq.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzhyj zzhyjVar = zzhyj.zza;
        Objects.requireNonNull(zzhyjVar);
        this.zzg = zzhyjVar;
        this.zzi = ",";
        if (zzhyjVar.zzc()) {
            this.zzh = ": ";
            if (zzhyjVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        if (zzhyjVar.zza().isEmpty() && zzhyjVar.zzb().isEmpty()) {
            z2 = true;
        }
        this.zzj = z2;
    }

    private final zzhzs zzk(int i2, char c2) throws IOException {
        zzs();
        zzm(i2);
        this.zzd.write(c2);
        return this;
    }

    private final zzhzs zzl(int i2, int i3, char c2) throws IOException {
        int iZzn = zzn();
        if (iZzn != i3 && iZzn != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str == null) {
            this.zzf--;
            if (iZzn == i3) {
                zzr();
            }
            this.zzd.write(c2);
            return this;
        }
        throw new IllegalStateException("Dangling name: ".concat(str));
    }

    private final void zzs() throws IOException {
        int iZzn = zzn();
        if (iZzn != 1) {
            if (iZzn != 2) {
                if (iZzn != 4) {
                    if (iZzn != 6) {
                        if (iZzn == 7) {
                            if (this.zzk != zzhyq.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    zzo(7);
                    return;
                }
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            this.zzd.append((CharSequence) this.zzi);
            zzr();
            return;
        }
        zzo(2);
        zzr();
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzk = zzhyqVar;
    }

    public final zzhzs zzb() throws IOException {
        zzp();
        zzk(1, '[');
        return this;
    }

    public final zzhzs zzd() throws IOException {
        zzp();
        zzk(3, '{');
        return this;
    }

    public final zzhzs zzh(boolean z2) throws IOException {
        String str;
        zzp();
        zzs();
        if (true != z2) {
            str = V8ValueBoolean.FALSE;
        } else {
            str = "true";
        }
        this.zzd.write(str);
        return this;
    }
}
