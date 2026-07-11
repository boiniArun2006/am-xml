package com.google.android.gms.internal.measurement;

import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.fyber.inneractive.sdk.network.w6;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzah implements zzao {
    private final Double zza;

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        Double d2 = this.zza;
        if (Double.isNaN(d2.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d2.doubleValue())) {
            return d2.doubleValue() > 0.0d ? V8ValueDouble.INFINITY : "-Infinity";
        }
        BigDecimal bigDecimalN = w6.n(BigDecimal.valueOf(d2.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalN.scale() > 0 ? bigDecimalN.precision() : bigDecimalN.scale()) - 1);
        String str = decimalFormat.format(bigDecimalN);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i2 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i2 >= 0 || i2 <= -7) && (i2 < 0 || i2 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalN.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzas(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        Double d2 = this.zza;
        boolean z2 = false;
        if (!Double.isNaN(d2.doubleValue()) && d2.doubleValue() != 0.0d) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzah(this.zza);
    }

    public zzah(Double d2) {
        if (d2 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d2;
        }
    }

    public final String toString() {
        return zzc();
    }
}
