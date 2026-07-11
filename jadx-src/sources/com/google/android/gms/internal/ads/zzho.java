package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzho extends zzgt {

    @Nullable
    private RandomAccessFile zza;

    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzho() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhn {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e2) {
                throw new zzhn(e2, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws zzhn {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zzc;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfj.zza;
            int i5 = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (i5 > 0) {
                this.zzc -= (long) i5;
                zzh(i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new zzhn(e2, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhn {
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        zzf(zzhfVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j2 = zzhfVar.zze;
                randomAccessFile.seek(j2);
                long length = zzhfVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j2;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzhn(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhfVar);
                return this.zzc;
            } catch (IOException e2) {
                throw new zzhn(e2, 2000);
            }
        } catch (FileNotFoundException e3) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhn(e3, ((e3.getCause() instanceof ErrnoException) && ((ErrnoException) e3.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzhn(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e3, 1004);
        } catch (SecurityException e4) {
            throw new zzhn(e4, 2006);
        } catch (RuntimeException e5) {
            throw new zzhn(e5, 2000);
        }
    }
}
