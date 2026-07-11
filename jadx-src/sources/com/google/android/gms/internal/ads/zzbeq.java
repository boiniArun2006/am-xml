package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbeq {
    private final zzbeg zza;
    private final int zzb;
    private final int zzc;

    public zzbeq(int i2, int i3, int i5) {
        this.zzb = i2;
        i3 = (i3 > 64 || i3 < 0) ? 64 : i3;
        if (i5 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i5;
        }
        this.zza = new zzbeo(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbep(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbef) arrayList2.get(i2)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i3 = 1;
                        boolean z2 = false;
                        while (true) {
                            int i5 = i3 + 2;
                            if (i5 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i3) == '\'') {
                                if (sb.charAt(i3 - 1) != ' ') {
                                    int i7 = i3 + 1;
                                    if ((sb.charAt(i7) == 's' || sb.charAt(i7) == 'S') && (i5 == sb.length() || sb.charAt(i5) == ' ')) {
                                        sb.insert(i3, ' ');
                                        i3 = i5;
                                    } else {
                                        sb.setCharAt(i3, ' ');
                                    }
                                    z2 = true;
                                }
                            }
                            i3++;
                        }
                        String string = z2 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzbek.zzb(str, true);
                    int length = strArrZzb.length;
                    int i8 = this.zzc;
                    if (length >= i8) {
                        for (int i9 = 0; i9 < strArrZzb.length; i9++) {
                            String strConcat = "";
                            for (int i10 = 0; i10 < i8; i10++) {
                                int i11 = i9 + i10;
                                if (i11 >= strArrZzb.length) {
                                    break;
                                }
                                if (i10 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i11]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbei zzbeiVar = new zzbei();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e2) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return zzbeiVar.toString();
    }
}
