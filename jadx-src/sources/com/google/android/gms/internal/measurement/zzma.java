package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzma<MessageType extends zzme<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzkq<MessageType, BuilderType> {
    protected zzme zza;
    private final zzme zzb;

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* bridge */ /* synthetic */ zzkq zzaT(byte[] bArr, int i2, int i3, zzlq zzlqVar) throws zzmq {
        zzbe(bArr, 0, i3, zzlqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* bridge */ /* synthetic */ zznl zzcE() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* bridge */ /* synthetic */ zzkq zzaS(byte[] bArr, int i2, int i3) throws zzmq {
        int i5 = zzlq.zzb;
        int i7 = zznt.zza;
        zzbe(bArr, 0, i3, zzlq.zza);
        return this;
    }

    protected final void zzaX() {
        if (this.zza.zzcf()) {
            return;
        }
        zzaY();
    }

    protected void zzaY() {
        zzme zzmeVarZzch = this.zzb.zzch();
        zza(zzmeVarZzch, this.zza);
        this.zza = zzmeVarZzch;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    /* JADX INFO: renamed from: zzba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzma zzaR() {
        zzma zzmaVar = (zzma) this.zzb.zzl(5, null, null);
        zzmaVar.zza = zzbf();
        return zzmaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbf() {
        if (!this.zza.zzcf()) {
            return (MessageType) this.zza;
        }
        this.zza.zzcj();
        return (MessageType) this.zza;
    }

    public final zzma zzbd(zzme zzmeVar) {
        if (!this.zzb.equals(zzmeVar)) {
            if (!this.zza.zzcf()) {
                zzaY();
            }
            zza(this.zza, zzmeVar);
        }
        return this;
    }

    public final zzma zzbe(byte[] bArr, int i2, int i3, zzlq zzlqVar) throws zzmq {
        if (!this.zza.zzcf()) {
            zzaY();
        }
        try {
            zznt.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i3, new zzkv(zzlqVar));
            return this;
        } catch (zzmq e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzcD() {
        return zzme.zzd(this.zza, false);
    }

    protected zzma(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcf()) {
            this.zza = messagetype.zzch();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zznt.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    public final MessageType zzbc() {
        MessageType messagetype = (MessageType) zzbf();
        if (messagetype.zzcD()) {
            return messagetype;
        }
        throw new zzog(messagetype);
    }
}
