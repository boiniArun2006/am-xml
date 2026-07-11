package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgrr {
    private final zzgrq zza;

    private zzgrr(zzgrq zzgrqVar) {
        int i2 = zzgqp.zzb;
        this.zza = zzgrqVar;
    }

    public static zzgrr zza(final zzgqq zzgqqVar) {
        return new zzgrr(new zzgrq() { // from class: com.google.android.gms.internal.ads.zzgro
            @Override // com.google.android.gms.internal.ads.zzgrq
            public final /* synthetic */ Iterator zza(zzgrr zzgrrVar, CharSequence charSequence) {
                return new zzgri(zzgrrVar, charSequence, zzgqqVar);
            }
        });
    }

    public static zzgrr zzb(Pattern pattern) {
        final zzgqv zzgqvVar = new zzgqv(pattern);
        zzgrc.zzf(!((zzgqu) zzgqvVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgqvVar);
        return new zzgrr(new zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrm
            @Override // com.google.android.gms.internal.ads.zzgrq
            public final /* synthetic */ Iterator zza(zzgrr zzgrrVar, CharSequence charSequence) {
                return new zzgrj(zzgrrVar, charSequence, zzgqvVar.zza(charSequence));
            }
        });
    }

    public static zzgrr zzc(int i2) {
        final int i3 = Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        return new zzgrr(new zzgrq(i3) { // from class: com.google.android.gms.internal.ads.zzgrn
            @Override // com.google.android.gms.internal.ads.zzgrq
            public final /* synthetic */ Iterator zza(zzgrr zzgrrVar, CharSequence charSequence) {
                return new zzgrk(zzgrrVar, charSequence, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgrl(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzf.hasNext()) {
            arrayList.add((String) itZzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
