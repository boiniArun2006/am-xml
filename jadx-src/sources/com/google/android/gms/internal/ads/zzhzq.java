package com.google.android.gms.internal.ads;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhzq implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhyq zzc = zzhyq.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzhyt.zza = new zzhzp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ed, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzo(char c2) throws IOException {
        int i2;
        StringBuilder sb = null;
        loop0: do {
            int i3 = this.zze;
            int i5 = this.zzf;
            int i7 = i3;
            while (true) {
                char[] cArr = this.zzd;
                if (i3 >= i5) {
                    break;
                }
                int i8 = i3 + 1;
                char c4 = cArr[i3];
                zzhyq zzhyqVar = this.zzc;
                zzhyq zzhyqVar2 = zzhyq.STRICT;
                if (zzhyqVar == zzhyqVar2 && c4 < ' ') {
                    throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if (c4 == c2) {
                    int i9 = (i8 - i7) - 1;
                    this.zze = i8;
                    if (sb == null) {
                        return new String(cArr, i7, i9);
                    }
                    sb.append(cArr, i7, i9);
                    return sb.toString();
                }
                char c5 = '\n';
                if (c4 == '\\') {
                    int i10 = i8 - i7;
                    int i11 = i10 - 1;
                    this.zze = i8;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i10 + i10, 16));
                    }
                    sb.append(cArr, i7, i11);
                    if (this.zze == this.zzf && !zzr(1)) {
                        throw zzv("Unterminated escape sequence");
                    }
                    int i12 = this.zze;
                    int i13 = i12 + 1;
                    this.zze = i13;
                    char c6 = cArr[i12];
                    if (c6 != '\n') {
                        if (c6 == '\"') {
                            c5 = c6;
                            sb.append(c5);
                            i7 = this.zze;
                            i5 = this.zzf;
                            i3 = i7;
                        } else {
                            if (c6 != '\'') {
                                if (c6 != '/' && c6 != '\\') {
                                    if (c6 == 'b') {
                                        c5 = '\b';
                                    } else if (c6 == 'f') {
                                        c5 = '\f';
                                    } else if (c6 != 'n') {
                                        if (c6 == 'r') {
                                            c5 = '\r';
                                        } else if (c6 == 't') {
                                            c5 = '\t';
                                        } else {
                                            if (c6 != 'u') {
                                                throw zzv("Invalid escape sequence");
                                            }
                                            if (i12 + 5 > this.zzf && !zzr(4)) {
                                                throw zzv("Unterminated escape sequence");
                                            }
                                            int i14 = this.zze;
                                            int i15 = i14 + 4;
                                            int i16 = 0;
                                            while (i14 < i15) {
                                                int i17 = i16 << 4;
                                                char c7 = cArr[i14];
                                                if (c7 >= '0' && c7 <= '9') {
                                                    i2 = c7 - '0';
                                                } else if (c7 >= 'a' && c7 <= 'f') {
                                                    i2 = c7 - 'W';
                                                } else {
                                                    if (c7 < 'A' || c7 > 'F') {
                                                        break loop0;
                                                    }
                                                    i2 = c7 - '7';
                                                }
                                                i16 = i17 + i2;
                                                i14++;
                                            }
                                            this.zze += 4;
                                            c5 = (char) i16;
                                        }
                                    }
                                }
                                sb.append(c5);
                                i7 = this.zze;
                                i5 = this.zzf;
                                i3 = i7;
                            }
                            c5 = c6;
                            sb.append(c5);
                            i7 = this.zze;
                            i5 = this.zzf;
                            i3 = i7;
                        }
                    } else {
                        if (this.zzc == zzhyqVar2) {
                            throw zzv("Cannot escape a newline character in strict mode");
                        }
                        this.zzg++;
                        this.zzh = i13;
                    }
                    if (this.zzc == zzhyqVar2) {
                        throw zzv("Invalid escaped character \"'\" in strict mode");
                    }
                    c5 = c6;
                    sb.append(c5);
                    i7 = this.zze;
                    i5 = this.zzf;
                    i3 = i7;
                } else {
                    if (c4 == '\n') {
                        this.zzg++;
                        this.zzh = i8;
                    }
                    i3 = i8;
                }
            }
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp() throws IOException {
        String string;
        int i2 = 0;
        StringBuilder sb = null;
        do {
            int i3 = 0;
            while (true) {
                int i5 = this.zze + i3;
                if (i5 < this.zzf) {
                    char c2 = this.zzd[i5];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i3 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(this.zzd, this.zze, i3);
                    this.zze += i3;
                } else if (zzr(i3 + 1)) {
                }
            }
            i2 = i3;
            if (sb != null) {
                string = new String(this.zzd, this.zze, i2);
            } else {
                sb.append(this.zzd, this.zze, i2);
                string = sb.toString();
            }
            this.zze += i2;
            return string;
        } while (zzr(1));
        if (sb != null) {
        }
        this.zze += i2;
        return string;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    private final boolean zzn(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    private final void zzq(int i2) throws zzhzt {
        int i3 = this.zzl;
        if (i3 - 1 >= 1280) {
            String strZzl = zzl();
            StringBuilder sb = new StringBuilder(strZzl.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(strZzl);
            throw new zzhzt(sb.toString());
        }
        int[] iArr = this.zzk;
        if (i3 == iArr.length) {
            int i5 = i3 + i3;
            this.zzk = Arrays.copyOf(iArr, i5);
            this.zzn = Arrays.copyOf(this.zzn, i5);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i5);
        }
        int[] iArr2 = this.zzk;
        int i7 = this.zzl;
        this.zzl = i7 + 1;
        iArr2[i7] = i2;
    }

    private final boolean zzr(int i2) throws IOException {
        int i3;
        int i5 = this.zzh;
        int i7 = this.zze;
        this.zzh = i5 - i7;
        char[] cArr = this.zzd;
        int i8 = this.zzf;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.zzf = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i10 = this.zzf;
            int i11 = reader.read(cArr, i10, 1024 - i10);
            if (i11 == -1) {
                return false;
            }
            i3 = this.zzf + i11;
            this.zzf = i3;
            if (this.zzg == 0 && this.zzh == 0 && i3 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private final int zzs(boolean z2) throws IOException {
        int i2;
        int i3 = this.zze;
        int i5 = this.zzf;
        while (true) {
            if (i3 == i5) {
                this.zze = i3;
                if (!zzr(1)) {
                    if (z2) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i3 = this.zze;
                i5 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i7 = i3 + 1;
            char c2 = cArr[i3];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i7;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.zze = i7;
                    if (i7 == i5) {
                        this.zze = i3;
                        boolean zZzr = zzr(2);
                        this.zze++;
                        if (!zZzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i8 = this.zze;
                    char c4 = cArr[i8];
                    if (c4 == '*') {
                        this.zze = i8 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i9 = this.zze;
                            if (cArr[i9] != '\n') {
                                while (i2 < 2) {
                                    i2 = cArr[this.zze + i2] == "*/".charAt(i2) ? i2 + 1 : 0;
                                }
                                i3 = this.zze + 2;
                                i5 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i9 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c4 != '/') {
                            return 47;
                        }
                        this.zze = i8 + 1;
                        zzu();
                        i3 = this.zze;
                        i5 = this.zzf;
                    }
                } else {
                    if (c2 != '#') {
                        this.zze = i7;
                        return c2;
                    }
                    this.zze = i7;
                    zzt();
                    zzu();
                    i3 = this.zze;
                    i5 = this.zzf;
                }
            }
            i3 = i7;
        }
    }

    private final void zzt() throws zzhzt {
        if (this.zzc != zzhyq.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c2;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private final zzhzt zzv(String str) throws zzhzt {
        String strZzl = zzl();
        StringBuilder sb = new StringBuilder(str.length() + strZzl.length() + 79);
        sb.append(str);
        sb.append(strZzl);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzhzt(sb.toString());
    }

    public final String toString() {
        return zzhzq.class.getSimpleName().concat(zzl());
    }

    public final void zzb() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i5 = i2 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        return (iZzg == 2 || iZzg == 4 || iZzg == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a2, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01de, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022c, code lost:
    
        if (zzn(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0247, code lost:
    
        if (r3 == 0) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzg() throws IOException {
        int i2;
        int i3;
        int iZzs;
        int iZzs2;
        int i5;
        int iZzs3;
        int i7;
        String str;
        String str2;
        int i8;
        char c2;
        char c4;
        long j2;
        char[] cArr;
        int i9;
        int i10;
        int i11;
        int[] iArr = this.zzk;
        int i12 = this.zzl - 1;
        int i13 = iArr[i12];
        int i14 = 3;
        int i15 = 1;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    i2 = 2;
                    i3 = 4;
                } else if (i13 == 5) {
                    i3 = 4;
                    i2 = 2;
                } else if (i13 == 4) {
                    iArr[i12] = 5;
                    int iZzs4 = zzs(true);
                    if (iZzs4 != 58) {
                        if (iZzs4 != 61) {
                            throw zzv("Expected ':'");
                        }
                        zzt();
                        if (this.zze < this.zzf || zzr(1)) {
                            char[] cArr2 = this.zzd;
                            int i16 = this.zze;
                            if (cArr2[i16] == '>') {
                                this.zze = i16 + 1;
                            }
                        }
                    }
                } else if (i13 == 6) {
                    if (this.zzc == zzhyq.LENIENT) {
                        zzs(true);
                        int i17 = this.zze;
                        this.zze = i17 - 1;
                        if (i17 + 4 <= this.zzf || zzr(5)) {
                            int i18 = this.zze;
                            char[] cArr3 = this.zzd;
                            if (cArr3[i18] == ')' && cArr3[i18 + 1] == ']' && cArr3[i18 + 2] == '}' && cArr3[i18 + 3] == '\'' && cArr3[i18 + 4] == '\n') {
                                this.zze = i18 + 5;
                            }
                        }
                    }
                    this.zzk[this.zzl - 1] = 7;
                } else if (i13 == 7) {
                    i5 = 0;
                    if (zzs(false) == -1) {
                        i14 = 17;
                        this.zza = i14;
                        return i14;
                    }
                    zzt();
                    this.zze--;
                } else {
                    i5 = 0;
                    if (i13 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iArr[i12] = i3;
                if (i13 != 5 || (iZzs2 = zzs(true)) == 44) {
                    iZzs = zzs(true);
                    if (iZzs != 34) {
                        i14 = 13;
                    } else {
                        if (iZzs == 39) {
                            zzt();
                            this.zza = 12;
                            return 12;
                        }
                        if (iZzs != 125) {
                            zzt();
                            this.zze--;
                            if (!zzn((char) iZzs)) {
                                throw zzv("Expected name");
                            }
                            i14 = 14;
                        } else {
                            if (i13 == 5) {
                                throw zzv("Expected name");
                            }
                            i14 = i2;
                        }
                    }
                } else if (iZzs2 != 59) {
                    if (iZzs2 != 125) {
                        throw zzv("Unterminated object");
                    }
                    i14 = i2;
                } else {
                    zzt();
                    iZzs = zzs(true);
                    if (iZzs != 34) {
                    }
                }
                this.zza = i14;
                return i14;
            }
            int iZzs5 = zzs(true);
            if (iZzs5 != 44) {
                if (iZzs5 != 59) {
                    if (iZzs5 != 93) {
                        throw zzv("Unterminated array");
                    }
                    i14 = 4;
                    this.zza = i14;
                    return i14;
                }
                zzt();
            }
            iZzs3 = zzs(true);
            if (iZzs3 == 34) {
                if (iZzs3 == 39) {
                    zzt();
                    this.zza = 8;
                    return 8;
                }
                if (iZzs3 == 44 || iZzs3 == 59) {
                    i7 = 1;
                } else if (iZzs3 != 91) {
                    if (iZzs3 == 93) {
                        i7 = 1;
                        if (i13 == 1) {
                            i14 = 4;
                        }
                    } else if (iZzs3 != 123) {
                        int i19 = this.zze - 1;
                        this.zze = i19;
                        char[] cArr4 = this.zzd;
                        char c5 = cArr4[i19];
                        if (c5 == 't' || c5 == 'T') {
                            str = "TRUE";
                            str2 = "true";
                            i8 = 5;
                        } else if (c5 == 'f' || c5 == 'F') {
                            str = "FALSE";
                            str2 = V8ValueBoolean.FALSE;
                            i8 = 6;
                        } else {
                            if (c5 == 'n' || c5 == 'N') {
                                str = "NULL";
                                str2 = V8ValueNull.NULL;
                                i8 = 7;
                            }
                            i8 = i5;
                            if (i8 == 0) {
                                return i8;
                            }
                            int i20 = this.zze;
                            int i21 = this.zzf;
                            int i22 = i5;
                            int i23 = i22;
                            int i24 = i23;
                            boolean z2 = true;
                            long j3 = 0;
                            while (true) {
                                if (i20 + i22 == i21) {
                                    if (i22 == 1024) {
                                        break;
                                    }
                                    if (!zzr(i22 + 1)) {
                                        cArr = cArr4;
                                        j2 = 0;
                                        break;
                                    }
                                    int i25 = this.zze;
                                    i21 = this.zzf;
                                    i20 = i25;
                                    c4 = cArr4[i20 + i22];
                                    j2 = 0;
                                    if (c4 != '+') {
                                    }
                                } else {
                                    c4 = cArr4[i20 + i22];
                                    j2 = 0;
                                    if (c4 != '+') {
                                        cArr = cArr4;
                                        i9 = 6;
                                        if (i23 != 5) {
                                            break;
                                        }
                                        i23 = i9;
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    } else if (c4 == 'E' || c4 == 'e') {
                                        cArr = cArr4;
                                        if (i23 != 2 && i23 != 4) {
                                            break;
                                        }
                                        i23 = 5;
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    } else if (c4 == '-') {
                                        cArr = cArr4;
                                        i9 = 6;
                                        if (i23 == 0) {
                                            i23 = 1;
                                            i24 = 1;
                                            i22++;
                                            cArr4 = cArr;
                                            i15 = 1;
                                        } else {
                                            if (i23 != 5) {
                                                break;
                                            }
                                            i23 = i9;
                                            i22++;
                                            cArr4 = cArr;
                                            i15 = 1;
                                        }
                                    } else if (c4 == '.') {
                                        cArr = cArr4;
                                        if (i23 != 2) {
                                            break;
                                        }
                                        i23 = 3;
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    } else {
                                        if (c4 < '0' || c4 > '9') {
                                            break;
                                        }
                                        if (i23 == i15 || i23 == 0) {
                                            cArr = cArr4;
                                            j3 = -(c4 - '0');
                                            i23 = 2;
                                        } else if (i23 != 2) {
                                            cArr = cArr4;
                                            if (i23 == 3) {
                                                i23 = 4;
                                            } else if (i23 == 5 || i23 == 6) {
                                                i23 = 7;
                                            }
                                        } else {
                                            if (j3 == 0) {
                                                break;
                                            }
                                            cArr = cArr4;
                                            long j4 = (10 * j3) - ((long) (c4 - '0'));
                                            z2 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                            j3 = j4;
                                        }
                                        i22++;
                                        cArr4 = cArr;
                                        i15 = 1;
                                    }
                                }
                                if (i10 == 0) {
                                    return i10;
                                }
                                if (!zzn(cArr[this.zze])) {
                                    throw zzv("Expected value");
                                }
                                zzt();
                                this.zza = 10;
                                return 10;
                            }
                            int i26 = 2;
                            if (i23 != 2) {
                                if (i23 != i26 || i23 == 4 || i23 == 7) {
                                    this.zzj = i22;
                                    i10 = 16;
                                    this.zza = i10;
                                }
                                i10 = 0;
                            } else {
                                if (z2) {
                                    if (j3 != Long.MIN_VALUE) {
                                        i11 = i24;
                                    } else if (i24 != 0) {
                                        i11 = 1;
                                    }
                                    if (j3 != j2) {
                                        if (i11 == 0) {
                                        }
                                        this.zzi = j3;
                                        this.zze += i22;
                                        i10 = 15;
                                        this.zza = i10;
                                    }
                                    j3 = -j3;
                                    this.zzi = j3;
                                    this.zze += i22;
                                    i10 = 15;
                                    this.zza = i10;
                                }
                                i26 = 2;
                                i23 = 2;
                                if (i23 != i26) {
                                }
                                this.zzj = i22;
                                i10 = 16;
                                this.zza = i10;
                            }
                            if (i10 == 0) {
                            }
                        }
                        zzhyq zzhyqVar = this.zzc;
                        zzhyq zzhyqVar2 = zzhyq.STRICT;
                        int i27 = i5;
                        while (true) {
                            int length = str2.length();
                            if (i27 < length) {
                                if ((this.zze + i27 >= this.zzf && !zzr(i27 + 1)) || ((c2 = cArr4[this.zze + i27]) != str2.charAt(i27) && (zzhyqVar == zzhyqVar2 || c2 != str.charAt(i27)))) {
                                    break;
                                }
                                i27++;
                            } else {
                                if ((this.zze + length < this.zzf || zzr(length + 1)) && zzn(cArr4[this.zze + length])) {
                                    break;
                                }
                                this.zze += length;
                                this.zza = i8;
                            }
                        }
                        i8 = i5;
                        if (i8 == 0) {
                        }
                    } else {
                        i14 = 1;
                    }
                }
                if (i13 != i7 && i13 != 2) {
                    throw zzv("Unexpected value");
                }
                zzt();
                this.zze--;
                this.zza = 7;
                return 7;
            }
            i14 = 9;
            this.zza = i14;
            return i14;
        }
        iArr[i12] = 2;
        i5 = 0;
        iZzs3 = zzs(true);
        if (iZzs3 == 34) {
        }
        this.zza = i14;
        return i14;
    }

    public final String zzh() throws IOException {
        String strZzo;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 14) {
            strZzo = zzp();
        } else if (iZzg == 12) {
            strZzo = zzo('\'');
        } else {
            if (iZzg != 13) {
                throw zzw("a name");
            }
            strZzo = zzo(Typography.quote);
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzo;
        return strZzo;
    }

    public final String zzi() throws IOException {
        String string;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 10) {
            string = zzp();
        } else if (iZzg == 8) {
            string = zzo('\'');
        } else if (iZzg == 9) {
            string = zzo(Typography.quote);
        } else if (iZzg == 11) {
            string = null;
        } else if (iZzg == 15) {
            string = Long.toString(this.zzi);
        } else {
            if (iZzg != 16) {
                throw zzw("a string");
            }
            String str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return string;
    }

    public final boolean zzj() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iZzg != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 7) {
            throw zzw(V8ValueNull.NULL);
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    final String zzl() {
        int i2 = this.zzg + 1;
        int i3 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        for (int i5 = 0; i5 < this.zzl; i5++) {
            int i7 = this.zzk[i5];
            switch (i7) {
                case 1:
                case 2:
                    int i8 = this.zzn[i5];
                    sb.append('[');
                    sb.append(i8);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i5];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i7);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i9 = i3 + 1;
        String string = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i9).length() + 6 + string.length());
        sb3.append(" at line ");
        sb3.append(i2);
        sb3.append(" column ");
        sb3.append(i9);
        sb3.append(" path ");
        sb3.append(string);
        return sb3.toString();
    }

    public final int zzm() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        switch (iZzg) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public zzhzq(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final IllegalStateException zzw(String str) throws IOException {
        String str2;
        int iZzm = zzm();
        String strZza = zzhzr.zza(zzm());
        String strZzl = zzl();
        int length = str.length() + 18 + strZza.length() + strZzl.length();
        if (iZzm == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2);
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strZza);
        sb.append(strZzl);
        sb.append("\nSee ");
        sb.append(strConcat);
        return new IllegalStateException(sb.toString());
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
    }
}
