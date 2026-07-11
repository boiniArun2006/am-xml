package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzhg extends zzhp {
    private final zzcc zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd(ByteCompanionObject.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zzb;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd(ByteCompanionObject.MIN_VALUE) != zzhpVar.zza()) {
            return zzhp.zzd(ByteCompanionObject.MIN_VALUE) - zzhpVar.zza();
        }
        zzhg zzhgVar = (zzhg) zzhpVar;
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        zzcc zzccVar2 = zzhgVar.zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i2 = 0;
        while (true) {
            zzcc zzccVar3 = this.zza;
            if (i2 >= zzccVar3.size()) {
                return 0;
            }
            int iCompareTo = ((zzhp) zzccVar3.get(i2)).compareTo((zzhp) zzhgVar.zza.get(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.zza.equals(((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(ByteCompanionObject.MIN_VALUE)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((zzhp) zzccVar.get(i2)).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        zzbdVarZza.zzc(sb, arrayList.iterator());
        sb.append("\n]");
        return sb.toString();
    }

    zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.zza = zzccVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzcc zzccVar2 = this.zza;
            if (i2 >= zzccVar2.size()) {
                break;
            }
            int iZzb = ((zzhp) zzccVar2.get(i2)).zzb();
            if (i3 < iZzb) {
                i3 = iZzb;
            }
            i2++;
        }
        int i5 = i3 + 1;
        this.zzb = i5;
        if (i5 <= 8) {
        } else {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }
}
