package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class zzibl<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzv<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    @Override // com.google.android.gms.internal.ads.zzidd
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    protected /* bridge */ /* synthetic */ zzhzv zzaQ(zzhzw zzhzwVar) {
        zzbn((zzibr) zzhzwVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzibr.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidb
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    public BuilderType zzbq(byte[] bArr, int i2, int i3) throws zzicg {
        int i5 = zzibb.zzb;
        int i7 = zziaa.zza;
        zzbp(bArr, i2, i3, zzibb.zza);
        return this;
    }

    protected zzibl(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaX()) {
            this.zza = (MessageType) zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzidm.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhzv zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhzv zzaZ(byte[] bArr, int i2, int i3) throws zzicg {
        zzbq(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhzv zzaX(byte[] bArr, int i2, int i3, zzibb zzibbVar) throws zzicg {
        zzbp(bArr, i2, i3, zzibbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzaX(byte[] bArr, int i2, int i3, zzibb zzibbVar) throws zzicg {
        zzbp(bArr, i2, i3, zzibbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzaZ(byte[] bArr, int i2, int i3) throws zzicg {
        zzbq(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    public /* bridge */ /* synthetic */ zzidb zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    protected void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhzv
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzhzv.zzaR(messagetype);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i2, int i3, zzibb zzibbVar) throws zzicg {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i2, i2 + i3, new zziab(zzibbVar));
            return this;
        } catch (zzicg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzg(this.zza, zziar.zza(zziaqVar), zzibbVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    public /* bridge */ /* synthetic */ zzidb zzbv() {
        zzbj();
        return this;
    }
}
