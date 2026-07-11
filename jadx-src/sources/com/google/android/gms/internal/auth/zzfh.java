package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzfh extends zzfl {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ zzfh(zzfg zzfgVar) {
        super(null);
    }

    private zzfh() {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) zzhj.zzf(obj, j2);
        if (list instanceof zzff) {
            objUnmodifiableList = ((zzff) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzhj.zzp(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j2) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) zzhj.zzf(obj2, j2);
        int size = list3.size();
        List list4 = (List) zzhj.zzf(obj, j2);
        if (list4.isEmpty()) {
            if (list4 instanceof zzff) {
                listZzd = new zzfe(size);
            } else if ((list4 instanceof zzge) && (list4 instanceof zzez)) {
                listZzd = ((zzez) list4).zzd(size);
            } else {
                listZzd = new ArrayList(size);
            }
            zzhj.zzp(obj, j2, listZzd);
            list2 = listZzd;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzhj.zzp(obj, j2, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzhe) {
                zzfe zzfeVar = new zzfe(list4.size() + size);
                zzfeVar.addAll(zzfeVar.size(), (zzhe) list4);
                zzhj.zzp(obj, j2, zzfeVar);
                list = zzfeVar;
            } else {
                boolean z2 = list4 instanceof zzge;
                list2 = list4;
                if (z2) {
                    boolean z3 = list4 instanceof zzez;
                    list2 = list4;
                    if (z3) {
                        zzez zzezVar = (zzez) list4;
                        list2 = list4;
                        if (!zzezVar.zzc()) {
                            zzez zzezVarZzd = zzezVar.zzd(list4.size() + size);
                            zzhj.zzp(obj, j2, zzezVarZzd);
                            list2 = zzezVarZzd;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzhj.zzp(obj, j2, list3);
    }
}
