package com.google.android.gms.internal.ads;

import androidx.content.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfzb implements Serializer {
    public static final zzfzb zza = new zzfzb();
    private static final zzfyy zzb;

    private zzfzb() {
    }

    @Override // androidx.content.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    static {
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        Intrinsics.checkNotNullExpressionValue(zzfyyVarZzd, "getDefaultInstance(...)");
        zzb = zzfyyVarZzd;
    }

    @Override // androidx.content.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzfyy) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }

    @Override // androidx.content.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzfyy zzfyyVarZzc = zzfyy.zzc(inputStream);
            Intrinsics.checkNotNull(zzfyyVarZzc);
            return zzfyyVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }
}
